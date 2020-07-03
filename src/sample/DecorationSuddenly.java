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

public class DecorationSuddenly {
    protected String nameDecorationSuddenly;//Наименование
    protected boolean activePDecorationSuddenly;//П
    protected boolean activeCDecorationSuddenly;//С
    protected SimpleObjectProperty<UnitType> unitDecorationSuddenly;//Ед. изм.
    protected double quantityDecorationSuddenly;//Количество
    protected double ordinalPriceUnitDecorationSuddenly;//Цена порядковая за ед.
    protected double priceCPUnitDecorationSuddenly;//Цена по КП за ед.
    protected double priceCPKeyDecorationSuddenly;//Цена по КП под ключ
    protected double costCPUnitDecorationSuddenly;//Стоимость по КП за ед.
    protected double priceOrderDecorationSuddenly;//Порядок цен
    protected double costCPDecorationSuddenly;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeDecorationSuddenly;//Срок доставки
    protected double actualCostDecorationSuddenly;//Стоимость фактическая
    protected double actualDifferenceDecorationSuddenly;//Разница фактическая
    protected double paidDecorationSuddenly;//Оплачено
    protected double residueDecorationSuddenly;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryDecorationSuddenly;//Дата поставки
    protected String nameRoomDecorationSuddenly;//Наименование помещения
    protected String plannedCPDecorationSuddenly;//КП плановое
    protected String actualCPDecorationSuddenly;//КП фактическое
    protected String accountDecorationSuddenly;//счёт
    protected String contactsDecorationSuddenly;//контакты
    protected String notesDecorationSuddenly;//примечания
    protected String characteristicsDecorationSuddenly;//характеристики


    public DecorationSuddenly(String nameDecorationSuddenly, boolean activePDecorationSuddenly, boolean activeCDecorationSuddenly, String unitDecorationSuddenly, double quantityDecorationSuddenly,
                              double ordinalPriceUnitDecorationSuddenly, double priceCPUnitDecorationSuddenly, double priceCPKeyDecorationSuddenly, double costCPUnitDecorationSuddenly,
                              double priceOrderDecorationSuddenly, double costCPDecorationSuddenly, String productionTimeDecorationSuddenly, double actualCostDecorationSuddenly,
                              double actualDifferenceDecorationSuddenly, double paidDecorationSuddenly, double residueDecorationSuddenly, String dateOfDeliveryDecorationSuddenly, String nameRoomDecorationSuddenly,
                              String plannedCPDecorationSuddenly, String actualCPDecorationSuddenly, String accountDecorationSuddenly, String contactsDecorationSuddenly, String notesDecorationSuddenly,
                              String characteristicsDecorationSuddenly) {
        this.nameDecorationSuddenly = nameDecorationSuddenly;
        this.unitDecorationSuddenly = new SimpleObjectProperty<>(UnitType.THING);
        this.activePDecorationSuddenly = activePDecorationSuddenly;
        this.activeCDecorationSuddenly = activeCDecorationSuddenly;
        this.quantityDecorationSuddenly = quantityDecorationSuddenly;
        this.ordinalPriceUnitDecorationSuddenly = ordinalPriceUnitDecorationSuddenly;
        this.priceCPUnitDecorationSuddenly = priceCPUnitDecorationSuddenly;
        this.priceCPKeyDecorationSuddenly = priceCPKeyDecorationSuddenly;
        this.costCPUnitDecorationSuddenly = costCPUnitDecorationSuddenly;
        this.priceOrderDecorationSuddenly = priceOrderDecorationSuddenly;
        this.costCPDecorationSuddenly = costCPDecorationSuddenly;
        this.productionTimeDecorationSuddenly = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostDecorationSuddenly = actualCostDecorationSuddenly;
        this.actualDifferenceDecorationSuddenly = actualDifferenceDecorationSuddenly;
        this.paidDecorationSuddenly = paidDecorationSuddenly;
        this.residueDecorationSuddenly = residueDecorationSuddenly;
        this.dateOfDeliveryDecorationSuddenly = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomDecorationSuddenly = nameRoomDecorationSuddenly;
        this.plannedCPDecorationSuddenly = plannedCPDecorationSuddenly;
        this.actualCPDecorationSuddenly = actualCPDecorationSuddenly;
        this.accountDecorationSuddenly = accountDecorationSuddenly;
        this.contactsDecorationSuddenly = contactsDecorationSuddenly;
        this.notesDecorationSuddenly = notesDecorationSuddenly;
        this.characteristicsDecorationSuddenly = characteristicsDecorationSuddenly;
    }

    public void CalculatePriceOrderDecorationSuddenly() {
        priceOrderDecorationSuddenly = quantityDecorationSuddenly * ordinalPriceUnitDecorationSuddenly;
    }

    public void CalculateСostCPUnitDecorationSuddenly() {
        if (priceCPKeyDecorationSuddenly > 0)
            costCPUnitDecorationSuddenly = priceCPKeyDecorationSuddenly / quantityDecorationSuddenly;
        else costCPUnitDecorationSuddenly = priceCPUnitDecorationSuddenly;
    }

    public void CalculateCostCPDecorationSuddenly() {
        if (priceCPKeyDecorationSuddenly > 0)
            costCPDecorationSuddenly = priceCPKeyDecorationSuddenly;
        else costCPDecorationSuddenly = priceCPUnitDecorationSuddenly * quantityDecorationSuddenly;
    }

    public void CalculateActualDifferenceDecorationSuddenly() {
        actualDifferenceDecorationSuddenly = costCPDecorationSuddenly - actualCostDecorationSuddenly;
    }

    public void CalculateResidueDecorationSuddenly() {
        residueDecorationSuddenly = actualCostDecorationSuddenly - paidDecorationSuddenly;
    }


    public String getNameDecorationSuddenly() {
        return nameDecorationSuddenly;
    }

    public void setNameDecorationSuddenly(String nameDecorationSuddenly) {
        this.nameDecorationSuddenly = nameDecorationSuddenly;
    }


    public UnitType getUnitDecorationSuddenly() {
        return unitDecorationSuddenly.get();
    }

    public void setUnitDecorationSuddenly(UnitType unitDecorationSuddenly) {
        this.unitDecorationSuddenly.set(unitDecorationSuddenly);
    }

    public boolean getActivePDecorationSuddenly() {
        return activePDecorationSuddenly;
    }

    public void setActivePDecorationSuddenly(boolean activePDecorationSuddenly) {
        this.activePDecorationSuddenly = activePDecorationSuddenly;
    }

    public void setActivePDecorationSuddenly(String activePDecorationSuddenly) {
        this.activePDecorationSuddenly = Boolean.parseBoolean(activePDecorationSuddenly);
    }

    public boolean getActiveCDecorationSuddenly() {
        return activeCDecorationSuddenly;
    }

    public void setActiveCDecorationSuddenly(boolean activeCDecorationSuddenly) {
        this.activeCDecorationSuddenly = activeCDecorationSuddenly;
    }

    public void setActiveCDecorationSuddenly(String activeCDecorationSuddenly) {
        this.activeCDecorationSuddenly = Boolean.parseBoolean(activeCDecorationSuddenly);
    }

    public String getQuantityDecorationSuddenly() {
        return Double.toString(quantityDecorationSuddenly);
    }

    public void setQuantityDecorationSuddenly(double quantityDecorationSuddenly) {
        this.quantityDecorationSuddenly = quantityDecorationSuddenly;
    }

    public void setQuantityDecorationSuddenly(String quantityDecorationSuddenly) {
        this.quantityDecorationSuddenly = Double.parseDouble(quantityDecorationSuddenly);
        CalculatePriceOrderDecorationSuddenly();
        CalculateCostCPDecorationSuddenly();
    }

    public String getOrdinalPriceUnitDecorationSuddenly() {
        return Double.toString(ordinalPriceUnitDecorationSuddenly);
    }

    public void setOrdinalPriceUnitDecorationSuddenly(double ordinalPriceUnitDecorationSuddenly) {
        this.ordinalPriceUnitDecorationSuddenly = ordinalPriceUnitDecorationSuddenly;
    }

    public void setOrdinalPriceUnitDecorationSuddenly(String ordinalPriceUnitDecorationSuddenly) {
        this.ordinalPriceUnitDecorationSuddenly = Double.parseDouble(ordinalPriceUnitDecorationSuddenly);
        CalculatePriceOrderDecorationSuddenly();
    }

    public String getPriceCPUnitDecorationSuddenly() {
        return Double.toString(priceCPUnitDecorationSuddenly);
    }

    public void setPriceCPUnitDecorationSuddenly(double priceCPUnitDecorationSuddenly) {
        this.priceCPUnitDecorationSuddenly = priceCPUnitDecorationSuddenly;
    }

    public void setPriceCPUnitDecorationSuddenly(String priceCPUnitDecorationSuddenly) {
        this.priceCPUnitDecorationSuddenly = Double.parseDouble(priceCPUnitDecorationSuddenly);
        CalculateСostCPUnitDecorationSuddenly();
        CalculateCostCPDecorationSuddenly();
    }

    public String getPriceCPKeyDecorationSuddenly() {
        return Double.toString(priceCPKeyDecorationSuddenly);
    }

    public void setPriceCPKeyDecorationSuddenly(double priceCPKeyDecorationSuddenly) {
        this.priceCPKeyDecorationSuddenly = priceCPKeyDecorationSuddenly;
    }

    public void setPriceCPKeyDecorationSuddenly(String priceCPKeyDecorationSuddenly) {
        this.priceCPKeyDecorationSuddenly = Double.parseDouble(priceCPKeyDecorationSuddenly);
        CalculateСostCPUnitDecorationSuddenly();
        CalculateCostCPDecorationSuddenly();
    }

    public String getCostCPUnitDecorationSuddenly() {
        return Double.toString(costCPUnitDecorationSuddenly);
    }

    public void setCostCPUnitDecorationSuddenly(double costCPUnitDecorationSuddenly) {
        this.costCPUnitDecorationSuddenly = costCPUnitDecorationSuddenly;
    }

    public void setCostCPUnitDecorationSuddenly(String costCPUnitDecorationSuddenly) {
        this.costCPUnitDecorationSuddenly = Double.parseDouble(costCPUnitDecorationSuddenly);
    }

    public String getPriceOrderDecorationSuddenly() {
        return Double.toString(priceOrderDecorationSuddenly);
    }

    public void setPriceOrderDecorationSuddenly(double priceOrderDecorationSuddenly) {
        this.priceOrderDecorationSuddenly = priceOrderDecorationSuddenly;
    }

    public void setPriceOrderDecorationSuddenly(String priceOrderDecorationSuddenly) {
        this.priceOrderDecorationSuddenly = Double.parseDouble(priceOrderDecorationSuddenly);
    }

    public String getCostCPDecorationSuddenly() {
        return Double.toString(costCPDecorationSuddenly);
    }

    public void setCostCPDecorationSuddenly(double costCPDecorationSuddenly) {
        this.costCPDecorationSuddenly = costCPDecorationSuddenly;
    }

    public void setCostCPDecorationSuddenly(String costCPDecorationSuddenly) {
        this.costCPDecorationSuddenly = Double.parseDouble(costCPDecorationSuddenly);
        CalculateActualDifferenceDecorationSuddenly();
    }


    public TimeProduction getProductionTimeDecorationSuddenly() {
        return productionTimeDecorationSuddenly.get();
    }

    public void setProductionTimeDecorationSuddenly(TimeProduction productionTimeDecorationSuddenly) {
        this.productionTimeDecorationSuddenly.set(productionTimeDecorationSuddenly);
    }

    public String getActualCostDecorationSuddenly() {
        return Double.toString(actualCostDecorationSuddenly);
    }

    public void setActualCostDecorationSuddenly(double actualCostDecorationSuddenly) {
        this.actualCostDecorationSuddenly = actualCostDecorationSuddenly;
    }

    public void setActualCostDecorationSuddenly(String actualCostDecorationSuddenly) {
        this.actualCostDecorationSuddenly = Double.parseDouble(actualCostDecorationSuddenly);
        CalculateActualDifferenceDecorationSuddenly();
        CalculateResidueDecorationSuddenly();

    }

    public String getActualDifferenceDecorationSuddenly() {
        return Double.toString(actualDifferenceDecorationSuddenly);
    }

    public void setActualDifferenceDecorationSuddenly(double actualDifferenceDecorationSuddenly) {
        this.actualDifferenceDecorationSuddenly = actualDifferenceDecorationSuddenly;
    }

    public void setActualDifferenceDecorationSuddenly(String actualDifferenceDecorationSuddenly) {
        this.actualDifferenceDecorationSuddenly = Double.parseDouble(actualDifferenceDecorationSuddenly);
    }

    public String getPaidDecorationSuddenly() {
        return Double.toString(paidDecorationSuddenly);
    }

    public void setPaidDecorationSuddenly(double paidDecorationSuddenly) {
        this.paidDecorationSuddenly = paidDecorationSuddenly;
    }

    public void setPaidDecorationSuddenly(String paidDecorationSuddenly) {
        this.paidDecorationSuddenly = Double.parseDouble(paidDecorationSuddenly);
        CalculateResidueDecorationSuddenly();
    }

    public String getResidueDecorationSuddenly() {
        return Double.toString(residueDecorationSuddenly);
    }

    public void setResidueDecorationSuddenly(double residueDecorationSuddenly) {
        this.residueDecorationSuddenly = residueDecorationSuddenly;
    }

    public void setResidueDecorationSuddenly(String residueDecorationSuddenly) {
        this.residueDecorationSuddenly = Double.parseDouble(residueDecorationSuddenly);
    }

    public Date getDateOfDeliveryDecorationSuddenly() {
        return dateOfDeliveryDecorationSuddenly.get();
    }

    public void setDateOfDeliveryDecorationSuddenly(Date dateOfDeliveryDecorationSuddenly) {
        this.dateOfDeliveryDecorationSuddenly.set(dateOfDeliveryDecorationSuddenly);
    }


    public String getNameRoomDecorationSuddenly() {
        return nameRoomDecorationSuddenly;
    }

    public void setNameRoomDecorationSuddenly(String nameRoomDecorationSuddenly) {
        this.nameRoomDecorationSuddenly = nameRoomDecorationSuddenly;
    }

    public String getPlannedCPDecorationSuddenly() {
        return plannedCPDecorationSuddenly;
    }

    public void setPlannedCPDecorationSuddenly(String plannedCPDecorationSuddenly) {
        this.plannedCPDecorationSuddenly = plannedCPDecorationSuddenly;
    }

    public String getActualCPDecorationSuddenly() {
        return actualCPDecorationSuddenly;
    }

    public void setActualCPDecorationSuddenly(String actualCPDecorationSuddenly) {
        this.actualCPDecorationSuddenly = actualCPDecorationSuddenly;
    }

    public String getAccountDecorationSuddenly() {
        return accountDecorationSuddenly;
    }

    public void setAccountDecorationSuddenly(String accountDecorationSuddenly) {
        this.accountDecorationSuddenly = accountDecorationSuddenly;
    }

    public String getContactsDecorationSuddenly() {
        return contactsDecorationSuddenly;
    }

    public void setContactsDecorationSuddenly(String contactsDecorationSuddenly) {
        this.contactsDecorationSuddenly = contactsDecorationSuddenly;
    }

    public String getNotesDecorationSuddenly() {
        return notesDecorationSuddenly;
    }

    public void setNotesDecorationSuddenly(String notesDecorationSuddenly) {
        this.notesDecorationSuddenly = notesDecorationSuddenly;
    }

    public String getCharacteristicsDecorationSuddenly() {
        return characteristicsDecorationSuddenly;
    }

    public void setCharacteristicsDecorationSuddenly(String characteristicsDecorationSuddenly) {
        this.characteristicsDecorationSuddenly = characteristicsDecorationSuddenly;
    }




    public static class DatePickerCell<S, T> extends TableCell<DecorationSuddenly, Date> {

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
                ((DecorationSuddenly)getTableRow().getItem()).setDateOfDeliveryDecorationSuddenly(cal.getTime());
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
