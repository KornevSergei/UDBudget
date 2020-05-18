package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableCell;

// Обработчик для ячеек (колонок), которые надо обрабатывать как булевую переменную (CheckBox, флажок)
public class EditingCellCheckBox extends TableCell<Object, Boolean> {
    private CheckBox checkBox;

    // Конструктор по умолчанию
    public EditingCellCheckBox() {
        // Сразу создается флажок для отображения с обработчиком на событие смены значения.
        checkBox = new CheckBox();
        // Устанавливается блокировка
        checkBox.setDisable(true);

        checkBox.selectedProperty().addListener(new ChangeListener<Boolean> () {
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                // При смене значения, если работает режим редактирования - значение из таблицы сразу сохраняется в данные
                if(isEditing())
                    commitEdit(newValue == null ? false : newValue);
            }
        });

        // Установка графического отображения - флажок
        this.setGraphic(checkBox);
        this.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        this.setEditable(true);
    }

    // Обработчик для события начала обработки ячейки
    @Override
    public void startEdit() {
        super.startEdit();
        if (isEmpty()) {
            return;
        }

        // Снимается блокировка
        checkBox.setDisable(false);
        checkBox.requestFocus();
    }

    // Обработчик для события отмены обработки ячейки
    @Override
    public void cancelEdit() {
        super.cancelEdit();
        // Устанавливается блокировка
        checkBox.setDisable(true);
    }

    // Обработчик для события применения обработки ячейки
    public void commitEdit(Boolean value) {
        super.commitEdit(value);
        // Устанавливается блокировка
        checkBox.setDisable(true);
    }

    // Обработчик для события обновления отображения ячейки
    @Override
    public void updateItem(Boolean item, boolean empty) {
        super.updateItem(item, empty);
        if (!isEmpty()) {
            checkBox.setSelected(item);
        }
    }
}


/*
private CheckBox checkBox;

    public EditingCellCheckBox() {
        if (checkBox == null) {
            createCheckBox();
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            updateItem("false",false);
        }

    }

    @Override
    public void startEdit() {
        super.startEdit();


        setGraphic(checkBox);
        //checkBox.selectAll();
    }

    @Override
    public void cancelEdit() {
        super.cancelEdit();

        setText(String.valueOf(getItem()));
        setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
    }

    @Override
    public void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);

        if (empty) {
            setText("false");
            setGraphic(checkBox);
        } else {
            if (isEditing()) {
                if (checkBox != null) {
                    checkBox.setSelected(Boolean.parseBoolean(getString()));
                }
                setGraphic(checkBox);
                setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            } else {
                setText(getString());
                setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            }
        }
    }

    private void createCheckBox() {
        checkBox = new CheckBox(getString());
        checkBox.setMinWidth(this.getWidth() - this.getGraphicTextGap() * 2);
        checkBox.setOnMouseClicked(t -> commitEdit(Boolean.toString(checkBox.isSelected())));
        setContentDisplay(ContentDisplay.GRAPHIC_ONLY);

    }

    private String getString() {
        return getItem() == null ? "" : getItem();
    }
 */