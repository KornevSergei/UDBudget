package sample;

import com.sun.javafx.css.StyleCacheEntry;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;


// Обработчик для ячеек (колонок), которые надо обрабатывать как текст
public class EditingCellTextBox extends TableCell<Object, String> {
    private TextField textField;
    private String formatter;

    // Конструктор по умолчанию
    public EditingCellTextBox() {
        createTextField();

    }

    // Конструктор для установки формата текста (авто-валидации) в соответствии с регулярными выражениями
    // * Нужно для третьей сцены
    public EditingCellTextBox(String formatter) {
        this();
        this.formatter = formatter;
        createTextField();

    }

    // Обработчик для события начала обработки ячейки
    @Override
    public void startEdit() {
        super.startEdit();

        // Установка отображения - текстового поля
        setGraphic(textField);
        setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        textField.selectAll();
    }

    // Обработчик для события отмены обработки ячейки
    @Override
    public void cancelEdit() {
        super.cancelEdit();

        // Устанавливается текст для отображения
        setText(String.valueOf(getItem()));
        setContentDisplay(ContentDisplay.TEXT_ONLY);
    }

    // Обработчик для события обновления отображения ячейки
    @Override
    public void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);


        if (empty) {
            // Если ячейка пустая - будет отображен текст
            setText("");
            setGraphic(textField);
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        } else {
            if (isEditing()) {
                // Если над ячейкой началось редактирование
                if (textField != null) {
                    // В текстовое поле заносится актуальный текст значения
                    textField.setText(getString());
                }
                // Отображается текстовое поле
                setGraphic(textField);
                setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            } else {
                // Если редактирование завершено - в ячейке отображается текст по текущему значению
                setText(getString());
                setContentDisplay(ContentDisplay.TEXT_ONLY);
                commitEdit(textField.getText());
            }
        }
    }

    // Метод по созданию текстового поля
    private void createTextField() {
        textField = new TextField(getString());

        // Если установлено форматирование
        if (formatter != null && !"".equals(formatter)) {
            // Устанавливается обработчик на событие изменения текстового поля
            textField.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue,
                                    String newValue) {
                    // Если результат введенного текста не соответствует формату - всё несоответствие удаляется
                    if (!newValue.matches(formatter)) {
                        textField.setText(newValue.replaceAll(String.format("[^%s]", formatter), ""));

                    }
                }
            });
        }

        // Устанавливается ширина
        textField.setMinWidth(this.getWidth() - this.getGraphicTextGap() * 2);

        // Добавляются обработчики клавиш
        textField.setOnKeyReleased(t -> {
//        textField.setOnMouseReleased(t -> {
//        textField.setOnMouseEntered(t -> {

            // При нажатии ENTER введенное значение сохраняется
            if (t.getCode() == KeyCode.ENTER)
//            if (t.getCode() == KeyCode.ENTER)
//            if (t.isDragDetect() == true)
//            if (t.isShiftDown() == true)
                commitEdit(textField.getText());
                // При нажатии ESCAPE - сбрасывается
            else if (t.getCode() == KeyCode.ESCAPE)
                cancelEdit();
        });

    }

    private String getString() {
        return getItem() == null ? "" : getItem();
    }


}
