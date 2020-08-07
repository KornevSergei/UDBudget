package tables;

import javafx.application.Platform;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class BuildersStage {
    public SimpleObjectProperty<Date> dateBuildersStage;
    public double paymentWorkBuildersStage;
    public double paymentDraftMaterialBuildersStage;
    public String noteBuildersStage;

    public BuildersStage(String dateBuildersStage, double paymentWorkBuildersStage, double paymentDraftMaterialBuildersStage, String noteBuildersStage) {
        this.dateBuildersStage = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.paymentWorkBuildersStage = paymentWorkBuildersStage;
        this.paymentDraftMaterialBuildersStage = paymentDraftMaterialBuildersStage;
        this.noteBuildersStage = noteBuildersStage;
    }

    public Date getDateBuildersStage() {
        return dateBuildersStage.get();
    }

    public void setDateBuildersStage(Date dateBuildersStage) {
        this.dateBuildersStage.set(dateBuildersStage);
    }



    public String getPaymentWorkBuildersStage() {
        return Double.toString(paymentWorkBuildersStage);
    }

    public void setPaymentWorkBuildersStage(double paymentWorkBuildersStage) {
        this.paymentWorkBuildersStage = paymentWorkBuildersStage;
    }

    public void setPaymentWorkBuildersStage(String paymentWorkBuildersStage) {
        this.paymentWorkBuildersStage = Double.parseDouble(paymentWorkBuildersStage);
    }



    public String getPaymentDraftMaterialBuildersStage() {
        return Double.toString(paymentDraftMaterialBuildersStage);
    }

    public void setPaymentDraftMaterialBuildersStage(double paymentDraftMaterialBuildersStage) {
        this.paymentDraftMaterialBuildersStage = paymentDraftMaterialBuildersStage;
    }
    public void setPaymentDraftMaterialBuildersStage(String paymentDraftMaterialBuildersStage) {
        this.paymentDraftMaterialBuildersStage = Double.parseDouble(paymentDraftMaterialBuildersStage);
    }


    public String getNoteBuildersStage() {
        return noteBuildersStage;
    }

    public void setNoteBuildersStage(String noteBuildersStage) {
        this.noteBuildersStage = noteBuildersStage;
    }



    public static class DatePickerCell<S, T> extends TableCell<BuildersStage, Date> {

        private DatePicker datePicker;
        private S editedItem;

        public DatePickerCell() {
            super();

            if (datePicker == null) {
                createDatePicker();
            }
            setGraphic(datePicker);
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);

            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    datePicker.requestFocus();
                }
            });
        }

        @Override
        public void updateItem(Date item, boolean empty) {

            super.updateItem(item, empty);

            SimpleDateFormat smp = new SimpleDateFormat("dd/MM/yyyy");

            if (null == this.datePicker) {
                System.out.println("datePicker is NULL");
            }

            if (empty) {
                setText(null);
                setGraphic(null);
            } else {

                if (isEditing()) {
                    setContentDisplay(ContentDisplay.TEXT_ONLY);

                } else {
                    setDatepikerDate(smp.format(item));
                    setText(smp.format(item));
                    setGraphic(this.datePicker);
                    setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
                }
            }
        }

        private void setDatepikerDate(String dateAsStr) {

            LocalDate ld = null;
            int jour, mois, annee;

            jour = mois = annee = 0;
            try {
                jour = Integer.parseInt(dateAsStr.substring(0, 2));
                mois = Integer.parseInt(dateAsStr.substring(3, 5));
                annee = Integer.parseInt(dateAsStr.substring(6, dateAsStr.length()));
            } catch (NumberFormatException e) {
                System.out.println("setDatepikerDate / unexpected error " + e);
            }

            ld = LocalDate.of(annee, mois, jour);
            datePicker.setValue(ld);
        }

        private void createDatePicker() {
            this.datePicker = new DatePicker();
            datePicker.setPromptText("jj/mm/aaaa");
            datePicker.setEditable(true);

            datePicker.setOnAction((EventHandler) t -> {
                LocalDate date = datePicker.getValue();

                SimpleDateFormat smp = new SimpleDateFormat("dd/MM/yyyy");
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.DAY_OF_MONTH, date.getDayOfMonth());
                cal.set(Calendar.MONTH, date.getMonthValue() - 1);
                cal.set(Calendar.YEAR, date.getYear());

                setText(smp.format(cal.getTime()));
                ((BuildersStage)getTableRow().getItem()).setDateBuildersStage(cal.getTime());
                commitEdit(cal.getTime());
            });

            setAlignment(Pos.CENTER);
        }

        @Override
        public void startEdit() {
            super.startEdit();
        }

        @Override
        public void cancelEdit() {
            super.cancelEdit();
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        }

        public DatePicker getDatePicker() {
            return datePicker;
        }

        public void setDatePicker(DatePicker datePicker) {
            this.datePicker = datePicker;
        }

    }

}
