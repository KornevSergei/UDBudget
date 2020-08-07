package components;

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
