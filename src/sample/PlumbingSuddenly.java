package sample;

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

public class PlumbingSuddenly {
    protected String namePlumbingSuddenly;//Наименование
    protected boolean activePPlumbingSuddenly;//П
    protected boolean activeCPlumbingSuddenly;//С
    protected SimpleObjectProperty<UnitType> unitPlumbingSuddenly;//Ед. изм.
    protected double quantityPlumbingSuddenly;//Количество
    protected double ordinalPriceUnitPlumbingSuddenly;//Цена порядковая за ед.
    protected double priceCPUnitPlumbingSuddenly;//Цена по КП за ед.
    protected double priceCPKeyPlumbingSuddenly;//Цена по КП под ключ
    protected double costCPUnitPlumbingSuddenly;//Стоимость по КП за ед.
    protected double priceOrderPlumbingSuddenly;//Порядок цен
    protected double costCPPlumbingSuddenly;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimePlumbingSuddenly;//Срок доставки
    protected double actualCostPlumbingSuddenly;//Стоимость фактическая
    protected double actualDifferencePlumbingSuddenly;//Разница фактическая
    protected double paidPlumbingSuddenly;//Оплачено
    protected double residuePlumbingSuddenly;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryPlumbingSuddenly;//Дата поставки
    protected String nameRoomPlumbingSuddenly;//Наименование помещения
    protected String plannedCPPlumbingSuddenly;//КП плановое
    protected String actualCPPlumbingSuddenly;//КП фактическое
    protected String accountPlumbingSuddenly;//счёт
    protected String contactsPlumbingSuddenly;//контакты
    protected String notesPlumbingSuddenly;//примечания
    protected String characteristicsPlumbingSuddenly;//характеристики


    public PlumbingSuddenly(String namePlumbingSuddenly, boolean activePPlumbingSuddenly, boolean activeCPlumbingSuddenly, String unitPlumbingSuddenly, double quantityPlumbingSuddenly,
                            double ordinalPriceUnitPlumbingSuddenly, double priceCPUnitPlumbingSuddenly, double priceCPKeyPlumbingSuddenly, double costCPUnitPlumbingSuddenly,
                            double priceOrderPlumbingSuddenly, double costCPPlumbingSuddenly, String productionTimePlumbingSuddenly, double actualCostPlumbingSuddenly,
                            double actualDifferencePlumbingSuddenly, double paidPlumbingSuddenly, double residuePlumbingSuddenly, String dateOfDeliveryPlumbingSuddenly, String nameRoomPlumbingSuddenly,
                            String plannedCPPlumbingSuddenly, String actualCPPlumbingSuddenly, String accountPlumbingSuddenly, String contactsPlumbingSuddenly, String notesPlumbingSuddenly,
                            String characteristicsPlumbingSuddenly) {
        this.namePlumbingSuddenly = namePlumbingSuddenly;
        this.unitPlumbingSuddenly = new SimpleObjectProperty<>(UnitType.THING);
        this.activePPlumbingSuddenly = activePPlumbingSuddenly;
        this.activeCPlumbingSuddenly = activeCPlumbingSuddenly;
        this.quantityPlumbingSuddenly = quantityPlumbingSuddenly;
        this.ordinalPriceUnitPlumbingSuddenly = ordinalPriceUnitPlumbingSuddenly;
        this.priceCPUnitPlumbingSuddenly = priceCPUnitPlumbingSuddenly;
        this.priceCPKeyPlumbingSuddenly = priceCPKeyPlumbingSuddenly;
        this.costCPUnitPlumbingSuddenly = costCPUnitPlumbingSuddenly;
        this.priceOrderPlumbingSuddenly = priceOrderPlumbingSuddenly;
        this.costCPPlumbingSuddenly = costCPPlumbingSuddenly;
        this.productionTimePlumbingSuddenly = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostPlumbingSuddenly = actualCostPlumbingSuddenly;
        this.actualDifferencePlumbingSuddenly = actualDifferencePlumbingSuddenly;
        this.paidPlumbingSuddenly = paidPlumbingSuddenly;
        this.residuePlumbingSuddenly = residuePlumbingSuddenly;
        this.dateOfDeliveryPlumbingSuddenly = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomPlumbingSuddenly = nameRoomPlumbingSuddenly;
        this.plannedCPPlumbingSuddenly = plannedCPPlumbingSuddenly;
        this.actualCPPlumbingSuddenly = actualCPPlumbingSuddenly;
        this.accountPlumbingSuddenly = accountPlumbingSuddenly;
        this.contactsPlumbingSuddenly = contactsPlumbingSuddenly;
        this.notesPlumbingSuddenly = notesPlumbingSuddenly;
        this.characteristicsPlumbingSuddenly = characteristicsPlumbingSuddenly;
    }

    public void CalculatePriceOrderPlumbingSuddenly() {
        priceOrderPlumbingSuddenly = quantityPlumbingSuddenly * ordinalPriceUnitPlumbingSuddenly;
    }

    public void CalculateСostCPUnitPlumbingSuddenly() {
        if (priceCPKeyPlumbingSuddenly > 0)
            costCPUnitPlumbingSuddenly = priceCPKeyPlumbingSuddenly / quantityPlumbingSuddenly;
        else costCPUnitPlumbingSuddenly = priceCPUnitPlumbingSuddenly;
    }

    public void CalculateCostCPPlumbingSuddenly() {
        if (priceCPKeyPlumbingSuddenly > 0)
            costCPPlumbingSuddenly = priceCPKeyPlumbingSuddenly;
        else costCPPlumbingSuddenly = priceCPUnitPlumbingSuddenly * quantityPlumbingSuddenly;
    }

    public void CalculateActualDifferencePlumbingSuddenly() {
        actualDifferencePlumbingSuddenly = costCPPlumbingSuddenly - actualCostPlumbingSuddenly;
    }

    public void CalculateResiduePlumbingSuddenly() {
        residuePlumbingSuddenly = actualCostPlumbingSuddenly - paidPlumbingSuddenly;
    }


    public String getNamePlumbingSuddenly() {
        return namePlumbingSuddenly;
    }

    public void setNamePlumbingSuddenly(String namePlumbingSuddenly) {
        this.namePlumbingSuddenly = namePlumbingSuddenly;
    }


    public UnitType getUnitPlumbingSuddenly() {
        return unitPlumbingSuddenly.get();
    }

    public void setUnitPlumbingSuddenly(UnitType unitPlumbingSuddenly) {
        this.unitPlumbingSuddenly.set(unitPlumbingSuddenly);
    }

    public boolean getActivePPlumbingSuddenly() {
        return activePPlumbingSuddenly;
    }

    public void setActivePPlumbingSuddenly(boolean activePPlumbingSuddenly) {
        this.activePPlumbingSuddenly = activePPlumbingSuddenly;
    }

    public void setActivePPlumbingSuddenly(String activePPlumbingSuddenly) {
        this.activePPlumbingSuddenly = Boolean.parseBoolean(activePPlumbingSuddenly);
    }

    public boolean getActiveCPlumbingSuddenly() {
        return activeCPlumbingSuddenly;
    }

    public void setActiveCPlumbingSuddenly(boolean activeCPlumbingSuddenly) {
        this.activeCPlumbingSuddenly = activeCPlumbingSuddenly;
    }

    public void setActiveCPlumbingSuddenly(String activeCPlumbingSuddenly) {
        this.activeCPlumbingSuddenly = Boolean.parseBoolean(activeCPlumbingSuddenly);
    }

    public String getQuantityPlumbingSuddenly() {
        return Double.toString(quantityPlumbingSuddenly);
    }

    public void setQuantityPlumbingSuddenly(double quantityPlumbingSuddenly) {
        this.quantityPlumbingSuddenly = quantityPlumbingSuddenly;
    }

    public void setQuantityPlumbingSuddenly(String quantityPlumbingSuddenly) {
        this.quantityPlumbingSuddenly = Double.parseDouble(quantityPlumbingSuddenly);
        CalculatePriceOrderPlumbingSuddenly();
        CalculateCostCPPlumbingSuddenly();
    }

    public String getOrdinalPriceUnitPlumbingSuddenly() {
        return Double.toString(ordinalPriceUnitPlumbingSuddenly);
    }

    public void setOrdinalPriceUnitPlumbingSuddenly(double ordinalPriceUnitPlumbingSuddenly) {
        this.ordinalPriceUnitPlumbingSuddenly = ordinalPriceUnitPlumbingSuddenly;
    }

    public void setOrdinalPriceUnitPlumbingSuddenly(String ordinalPriceUnitPlumbingSuddenly) {
        this.ordinalPriceUnitPlumbingSuddenly = Double.parseDouble(ordinalPriceUnitPlumbingSuddenly);
        CalculatePriceOrderPlumbingSuddenly();
    }

    public String getPriceCPUnitPlumbingSuddenly() {
        return Double.toString(priceCPUnitPlumbingSuddenly);
    }

    public void setPriceCPUnitPlumbingSuddenly(double priceCPUnitPlumbingSuddenly) {
        this.priceCPUnitPlumbingSuddenly = priceCPUnitPlumbingSuddenly;
    }

    public void setPriceCPUnitPlumbingSuddenly(String priceCPUnitPlumbingSuddenly) {
        this.priceCPUnitPlumbingSuddenly = Double.parseDouble(priceCPUnitPlumbingSuddenly);
        CalculateСostCPUnitPlumbingSuddenly();
        CalculateCostCPPlumbingSuddenly();
    }

    public String getPriceCPKeyPlumbingSuddenly() {
        return Double.toString(priceCPKeyPlumbingSuddenly);
    }

    public void setPriceCPKeyPlumbingSuddenly(double priceCPKeyPlumbingSuddenly) {
        this.priceCPKeyPlumbingSuddenly = priceCPKeyPlumbingSuddenly;
    }

    public void setPriceCPKeyPlumbingSuddenly(String priceCPKeyPlumbingSuddenly) {
        this.priceCPKeyPlumbingSuddenly = Double.parseDouble(priceCPKeyPlumbingSuddenly);
        CalculateСostCPUnitPlumbingSuddenly();
        CalculateCostCPPlumbingSuddenly();
    }

    public String getCostCPUnitPlumbingSuddenly() {
        return Double.toString(costCPUnitPlumbingSuddenly);
    }

    public void setCostCPUnitPlumbingSuddenly(double costCPUnitPlumbingSuddenly) {
        this.costCPUnitPlumbingSuddenly = costCPUnitPlumbingSuddenly;
    }

    public void setCostCPUnitPlumbingSuddenly(String costCPUnitPlumbingSuddenly) {
        this.costCPUnitPlumbingSuddenly = Double.parseDouble(costCPUnitPlumbingSuddenly);
    }

    public String getPriceOrderPlumbingSuddenly() {
        return Double.toString(priceOrderPlumbingSuddenly);
    }

    public void setPriceOrderPlumbingSuddenly(double priceOrderPlumbingSuddenly) {
        this.priceOrderPlumbingSuddenly = priceOrderPlumbingSuddenly;
    }

    public void setPriceOrderPlumbingSuddenly(String priceOrderPlumbingSuddenly) {
        this.priceOrderPlumbingSuddenly = Double.parseDouble(priceOrderPlumbingSuddenly);
    }

    public String getCostCPPlumbingSuddenly() {
        return Double.toString(costCPPlumbingSuddenly);
    }

    public void setCostCPPlumbingSuddenly(double costCPPlumbingSuddenly) {
        this.costCPPlumbingSuddenly = costCPPlumbingSuddenly;
    }

    public void setCostCPPlumbingSuddenly(String costCPPlumbingSuddenly) {
        this.costCPPlumbingSuddenly = Double.parseDouble(costCPPlumbingSuddenly);
        CalculateActualDifferencePlumbingSuddenly();
    }


    public TimeProduction getProductionTimePlumbingSuddenly() {
        return productionTimePlumbingSuddenly.get();
    }

    public void setProductionTimePlumbingSuddenly(TimeProduction productionTimePlumbingSuddenly) {
        this.productionTimePlumbingSuddenly.set(productionTimePlumbingSuddenly);
    }

    public String getActualCostPlumbingSuddenly() {
        return Double.toString(actualCostPlumbingSuddenly);
    }

    public void setActualCostPlumbingSuddenly(double actualCostPlumbingSuddenly) {
        this.actualCostPlumbingSuddenly = actualCostPlumbingSuddenly;
    }

    public void setActualCostPlumbingSuddenly(String actualCostPlumbingSuddenly) {
        this.actualCostPlumbingSuddenly = Double.parseDouble(actualCostPlumbingSuddenly);
        CalculateActualDifferencePlumbingSuddenly();
        CalculateResiduePlumbingSuddenly();

    }

    public String getActualDifferencePlumbingSuddenly() {
        return Double.toString(actualDifferencePlumbingSuddenly);
    }

    public void setActualDifferencePlumbingSuddenly(double actualDifferencePlumbingSuddenly) {
        this.actualDifferencePlumbingSuddenly = actualDifferencePlumbingSuddenly;
    }

    public void setActualDifferencePlumbingSuddenly(String actualDifferencePlumbingSuddenly) {
        this.actualDifferencePlumbingSuddenly = Double.parseDouble(actualDifferencePlumbingSuddenly);
    }

    public String getPaidPlumbingSuddenly() {
        return Double.toString(paidPlumbingSuddenly);
    }

    public void setPaidPlumbingSuddenly(double paidPlumbingSuddenly) {
        this.paidPlumbingSuddenly = paidPlumbingSuddenly;
    }

    public void setPaidPlumbingSuddenly(String paidPlumbingSuddenly) {
        this.paidPlumbingSuddenly = Double.parseDouble(paidPlumbingSuddenly);
        CalculateResiduePlumbingSuddenly();
    }

    public String getResiduePlumbingSuddenly() {
        return Double.toString(residuePlumbingSuddenly);
    }

    public void setResiduePlumbingSuddenly(double residuePlumbingSuddenly) {
        this.residuePlumbingSuddenly = residuePlumbingSuddenly;
    }

    public void setResiduePlumbingSuddenly(String residuePlumbingSuddenly) {
        this.residuePlumbingSuddenly = Double.parseDouble(residuePlumbingSuddenly);
    }

    public Date getDateOfDeliveryPlumbingSuddenly() {
        return dateOfDeliveryPlumbingSuddenly.get();
    }

    public void setDateOfDeliveryPlumbingSuddenly(Date dateOfDeliveryPlumbingSuddenly) {
        this.dateOfDeliveryPlumbingSuddenly.set(dateOfDeliveryPlumbingSuddenly);
    }

    public String getNameRoomPlumbingSuddenly() {
        return nameRoomPlumbingSuddenly;
    }

    public void setNameRoomPlumbingSuddenly(String nameRoomPlumbingSuddenly) {
        this.nameRoomPlumbingSuddenly = nameRoomPlumbingSuddenly;
    }

    public String getPlannedCPPlumbingSuddenly() {
        return plannedCPPlumbingSuddenly;
    }

    public void setPlannedCPPlumbingSuddenly(String plannedCPPlumbingSuddenly) {
        this.plannedCPPlumbingSuddenly = plannedCPPlumbingSuddenly;
    }

    public String getActualCPPlumbingSuddenly() {
        return actualCPPlumbingSuddenly;
    }

    public void setActualCPPlumbingSuddenly(String actualCPPlumbingSuddenly) {
        this.actualCPPlumbingSuddenly = actualCPPlumbingSuddenly;
    }

    public String getAccountPlumbingSuddenly() {
        return accountPlumbingSuddenly;
    }

    public void setAccountPlumbingSuddenly(String accountPlumbingSuddenly) {
        this.accountPlumbingSuddenly = accountPlumbingSuddenly;
    }

    public String getContactsPlumbingSuddenly() {
        return contactsPlumbingSuddenly;
    }

    public void setContactsPlumbingSuddenly(String contactsPlumbingSuddenly) {
        this.contactsPlumbingSuddenly = contactsPlumbingSuddenly;
    }

    public String getNotesPlumbingSuddenly() {
        return notesPlumbingSuddenly;
    }

    public void setNotesPlumbingSuddenly(String notesPlumbingSuddenly) {
        this.notesPlumbingSuddenly = notesPlumbingSuddenly;
    }

    public String getCharacteristicsPlumbingSuddenly() {
        return characteristicsPlumbingSuddenly;
    }

    public void setCharacteristicsPlumbingSuddenly(String characteristicsPlumbingSuddenly) {
        this.characteristicsPlumbingSuddenly = characteristicsPlumbingSuddenly;
    }




    public static class DatePickerCell<S, T> extends TableCell<PlumbingSuddenly, Date> {

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
                ((PlumbingSuddenly)getTableRow().getItem()).setDateOfDeliveryPlumbingSuddenly(cal.getTime());
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
