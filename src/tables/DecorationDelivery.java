package tables;

import javafx.application.Platform;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;
import components.TimeProduction;
import components.UnitType;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DecorationDelivery {
    protected String nameDecorationDelivery;//Наименование
    protected boolean activePDecorationDelivery;//П
    protected boolean activeCDecorationDelivery;//С
    protected SimpleObjectProperty<UnitType> unitDecorationDelivery;//Ед. изм.
    protected double quantityDecorationDelivery;//Количество
    protected double ordinalPriceUnitDecorationDelivery;//Цена порядковая за ед.
    protected double priceCPUnitDecorationDelivery;//Цена по КП за ед.
    protected double priceCPKeyDecorationDelivery;//Цена по КП под ключ
    protected double costCPUnitDecorationDelivery;//Стоимость по КП за ед.
    protected double priceOrderDecorationDelivery;//Порядок цен
    protected double costCPDecorationDelivery;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeDecorationDelivery;//Срок доставки
    protected double actualCostDecorationDelivery;//Стоимость фактическая
    protected double actualDifferenceDecorationDelivery;//Разница фактическая
    protected double paidDecorationDelivery;//Оплачено
    protected double residueDecorationDelivery;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryDecorationDelivery;//Дата поставки
    protected String nameRoomDecorationDelivery;//Наименование помещения
    protected String plannedCPDecorationDelivery;//КП плановое
    protected String actualCPDecorationDelivery;//КП фактическое
    protected String accountDecorationDelivery;//счёт
    protected String contactsDecorationDelivery;//контакты
    protected String notesDecorationDelivery;//примечания
    protected String characteristicsDecorationDelivery;//характеристики


    public DecorationDelivery(String nameDecorationDelivery, boolean activePDecorationDelivery, boolean activeCDecorationDelivery, String unitDecorationDelivery, double quantityDecorationDelivery,
                              double ordinalPriceUnitDecorationDelivery, double priceCPUnitDecorationDelivery, double priceCPKeyDecorationDelivery, double costCPUnitDecorationDelivery,
                              double priceOrderDecorationDelivery, double costCPDecorationDelivery, String productionTimeDecorationDelivery, double actualCostDecorationDelivery,
                              double actualDifferenceDecorationDelivery, double paidDecorationDelivery, double residueDecorationDelivery, String dateOfDeliveryDecorationDelivery, String nameRoomDecorationDelivery,
                              String plannedCPDecorationDelivery, String actualCPDecorationDelivery, String accountDecorationDelivery, String contactsDecorationDelivery, String notesDecorationDelivery,
                              String characteristicsDecorationDelivery) {
        this.nameDecorationDelivery = nameDecorationDelivery;
        this.unitDecorationDelivery = new SimpleObjectProperty<>(UnitType.THING);
        this.activePDecorationDelivery = activePDecorationDelivery;
        this.activeCDecorationDelivery = activeCDecorationDelivery;
        this.quantityDecorationDelivery = quantityDecorationDelivery;
        this.ordinalPriceUnitDecorationDelivery = ordinalPriceUnitDecorationDelivery;
        this.priceCPUnitDecorationDelivery = priceCPUnitDecorationDelivery;
        this.priceCPKeyDecorationDelivery = priceCPKeyDecorationDelivery;
        this.costCPUnitDecorationDelivery = costCPUnitDecorationDelivery;
        this.priceOrderDecorationDelivery = priceOrderDecorationDelivery;
        this.costCPDecorationDelivery = costCPDecorationDelivery;
        this.productionTimeDecorationDelivery = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostDecorationDelivery = actualCostDecorationDelivery;
        this.actualDifferenceDecorationDelivery = actualDifferenceDecorationDelivery;
        this.paidDecorationDelivery = paidDecorationDelivery;
        this.residueDecorationDelivery = residueDecorationDelivery;
        this.dateOfDeliveryDecorationDelivery = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomDecorationDelivery = nameRoomDecorationDelivery;
        this.plannedCPDecorationDelivery = plannedCPDecorationDelivery;
        this.actualCPDecorationDelivery = actualCPDecorationDelivery;
        this.accountDecorationDelivery = accountDecorationDelivery;
        this.contactsDecorationDelivery = contactsDecorationDelivery;
        this.notesDecorationDelivery = notesDecorationDelivery;
        this.characteristicsDecorationDelivery = characteristicsDecorationDelivery;
    }

    public void CalculatePriceOrderDecorationDelivery() {
        priceOrderDecorationDelivery = quantityDecorationDelivery * ordinalPriceUnitDecorationDelivery;
    }

    public void CalculateСostCPUnitDecorationDelivery() {
        if (priceCPKeyDecorationDelivery > 0)
            costCPUnitDecorationDelivery = priceCPKeyDecorationDelivery / quantityDecorationDelivery;
        else costCPUnitDecorationDelivery = priceCPUnitDecorationDelivery;
    }

    public void CalculateCostCPDecorationDelivery() {
        if (priceCPKeyDecorationDelivery > 0)
            costCPDecorationDelivery = priceCPKeyDecorationDelivery;
        else costCPDecorationDelivery = priceCPUnitDecorationDelivery * quantityDecorationDelivery;
    }

    public void CalculateActualDifferenceDecorationDelivery() {
        actualDifferenceDecorationDelivery = costCPDecorationDelivery - actualCostDecorationDelivery;
    }

    public void CalculateResidueDecorationDelivery() {
        residueDecorationDelivery = actualCostDecorationDelivery - paidDecorationDelivery;
    }


    public String getNameDecorationDelivery() {
        return nameDecorationDelivery;
    }

    public void setNameDecorationDelivery(String nameDecorationDelivery) {
        this.nameDecorationDelivery = nameDecorationDelivery;
    }


    public UnitType getUnitDecorationDelivery() {
        return unitDecorationDelivery.get();
    }

    public void setUnitDecorationDelivery(UnitType unitDecorationDelivery) {
        this.unitDecorationDelivery.set(unitDecorationDelivery);
    }

    public boolean getActivePDecorationDelivery() {
        return activePDecorationDelivery;
    }

    public void setActivePDecorationDelivery(boolean activePDecorationDelivery) {
        this.activePDecorationDelivery = activePDecorationDelivery;
    }

    public void setActivePDecorationDelivery(String activePDecorationDelivery) {
        this.activePDecorationDelivery = Boolean.parseBoolean(activePDecorationDelivery);
    }

    public boolean getActiveCDecorationDelivery() {
        return activeCDecorationDelivery;
    }

    public void setActiveCDecorationDelivery(boolean activeCDecorationDelivery) {
        this.activeCDecorationDelivery = activeCDecorationDelivery;
    }

    public void setActiveCDecorationDelivery(String activeCDecorationDelivery) {
        this.activeCDecorationDelivery = Boolean.parseBoolean(activeCDecorationDelivery);
    }

    public String getQuantityDecorationDelivery() {
        return Double.toString(quantityDecorationDelivery);
    }

    public void setQuantityDecorationDelivery(double quantityDecorationDelivery) {
        this.quantityDecorationDelivery = quantityDecorationDelivery;
    }

    public void setQuantityDecorationDelivery(String quantityDecorationDelivery) {
        this.quantityDecorationDelivery = Double.parseDouble(quantityDecorationDelivery);
        CalculatePriceOrderDecorationDelivery();
        CalculateCostCPDecorationDelivery();
    }

    public String getOrdinalPriceUnitDecorationDelivery() {
        return Double.toString(ordinalPriceUnitDecorationDelivery);
    }

    public void setOrdinalPriceUnitDecorationDelivery(double ordinalPriceUnitDecorationDelivery) {
        this.ordinalPriceUnitDecorationDelivery = ordinalPriceUnitDecorationDelivery;
    }

    public void setOrdinalPriceUnitDecorationDelivery(String ordinalPriceUnitDecorationDelivery) {
        this.ordinalPriceUnitDecorationDelivery = Double.parseDouble(ordinalPriceUnitDecorationDelivery);
        CalculatePriceOrderDecorationDelivery();
    }

    public String getPriceCPUnitDecorationDelivery() {
        return Double.toString(priceCPUnitDecorationDelivery);
    }

    public void setPriceCPUnitDecorationDelivery(double priceCPUnitDecorationDelivery) {
        this.priceCPUnitDecorationDelivery = priceCPUnitDecorationDelivery;
    }

    public void setPriceCPUnitDecorationDelivery(String priceCPUnitDecorationDelivery) {
        this.priceCPUnitDecorationDelivery = Double.parseDouble(priceCPUnitDecorationDelivery);
        CalculateСostCPUnitDecorationDelivery();
        CalculateCostCPDecorationDelivery();
    }

    public String getPriceCPKeyDecorationDelivery() {
        return Double.toString(priceCPKeyDecorationDelivery);
    }

    public void setPriceCPKeyDecorationDelivery(double priceCPKeyDecorationDelivery) {
        this.priceCPKeyDecorationDelivery = priceCPKeyDecorationDelivery;
    }

    public void setPriceCPKeyDecorationDelivery(String priceCPKeyDecorationDelivery) {
        this.priceCPKeyDecorationDelivery = Double.parseDouble(priceCPKeyDecorationDelivery);
        CalculateСostCPUnitDecorationDelivery();
        CalculateCostCPDecorationDelivery();
    }

    public String getCostCPUnitDecorationDelivery() {
        return Double.toString(costCPUnitDecorationDelivery);
    }

    public void setCostCPUnitDecorationDelivery(double costCPUnitDecorationDelivery) {
        this.costCPUnitDecorationDelivery = costCPUnitDecorationDelivery;
    }

    public void setCostCPUnitDecorationDelivery(String costCPUnitDecorationDelivery) {
        this.costCPUnitDecorationDelivery = Double.parseDouble(costCPUnitDecorationDelivery);
    }

    public String getPriceOrderDecorationDelivery() {
        return Double.toString(priceOrderDecorationDelivery);
    }

    public void setPriceOrderDecorationDelivery(double priceOrderDecorationDelivery) {
        this.priceOrderDecorationDelivery = priceOrderDecorationDelivery;
    }

    public void setPriceOrderDecorationDelivery(String priceOrderDecorationDelivery) {
        this.priceOrderDecorationDelivery = Double.parseDouble(priceOrderDecorationDelivery);
    }

    public String getCostCPDecorationDelivery() {
        return Double.toString(costCPDecorationDelivery);
    }

    public void setCostCPDecorationDelivery(double costCPDecorationDelivery) {
        this.costCPDecorationDelivery = costCPDecorationDelivery;
    }

    public void setCostCPDecorationDelivery(String costCPDecorationDelivery) {
        this.costCPDecorationDelivery = Double.parseDouble(costCPDecorationDelivery);
        CalculateActualDifferenceDecorationDelivery();
    }


    public TimeProduction getProductionTimeDecorationDelivery() {
        return productionTimeDecorationDelivery.get();
    }

    public void setProductionTimeDecorationDelivery(TimeProduction productionTimeDecorationDelivery) {
        this.productionTimeDecorationDelivery.set(productionTimeDecorationDelivery);
    }

    public String getActualCostDecorationDelivery() {
        return Double.toString(actualCostDecorationDelivery);
    }

    public void setActualCostDecorationDelivery(double actualCostDecorationDelivery) {
        this.actualCostDecorationDelivery = actualCostDecorationDelivery;
    }

    public void setActualCostDecorationDelivery(String actualCostDecorationDelivery) {
        this.actualCostDecorationDelivery = Double.parseDouble(actualCostDecorationDelivery);
        CalculateActualDifferenceDecorationDelivery();
        CalculateResidueDecorationDelivery();

    }

    public String getActualDifferenceDecorationDelivery() {
        return Double.toString(actualDifferenceDecorationDelivery);
    }

    public void setActualDifferenceDecorationDelivery(double actualDifferenceDecorationDelivery) {
        this.actualDifferenceDecorationDelivery = actualDifferenceDecorationDelivery;
    }

    public void setActualDifferenceDecorationDelivery(String actualDifferenceDecorationDelivery) {
        this.actualDifferenceDecorationDelivery = Double.parseDouble(actualDifferenceDecorationDelivery);
    }

    public String getPaidDecorationDelivery() {
        return Double.toString(paidDecorationDelivery);
    }

    public void setPaidDecorationDelivery(double paidDecorationDelivery) {
        this.paidDecorationDelivery = paidDecorationDelivery;
    }

    public void setPaidDecorationDelivery(String paidDecorationDelivery) {
        this.paidDecorationDelivery = Double.parseDouble(paidDecorationDelivery);
        CalculateResidueDecorationDelivery();
    }

    public String getResidueDecorationDelivery() {
        return Double.toString(residueDecorationDelivery);
    }

    public void setResidueDecorationDelivery(double residueDecorationDelivery) {
        this.residueDecorationDelivery = residueDecorationDelivery;
    }

    public void setResidueDecorationDelivery(String residueDecorationDelivery) {
        this.residueDecorationDelivery = Double.parseDouble(residueDecorationDelivery);
    }

    public Date getDateOfDeliveryDecorationDelivery() {
        return dateOfDeliveryDecorationDelivery.get();
    }

    public void setDateOfDeliveryDecorationDelivery(Date dateOfDeliveryDecorationDelivery) {
        this.dateOfDeliveryDecorationDelivery.set(dateOfDeliveryDecorationDelivery);
    }


    public String getNameRoomDecorationDelivery() {
        return nameRoomDecorationDelivery;
    }

    public void setNameRoomDecorationDelivery(String nameRoomDecorationDelivery) {
        this.nameRoomDecorationDelivery = nameRoomDecorationDelivery;
    }

    public String getPlannedCPDecorationDelivery() {
        return plannedCPDecorationDelivery;
    }

    public void setPlannedCPDecorationDelivery(String plannedCPDecorationDelivery) {
        this.plannedCPDecorationDelivery = plannedCPDecorationDelivery;
    }

    public String getActualCPDecorationDelivery() {
        return actualCPDecorationDelivery;
    }

    public void setActualCPDecorationDelivery(String actualCPDecorationDelivery) {
        this.actualCPDecorationDelivery = actualCPDecorationDelivery;
    }

    public String getAccountDecorationDelivery() {
        return accountDecorationDelivery;
    }

    public void setAccountDecorationDelivery(String accountDecorationDelivery) {
        this.accountDecorationDelivery = accountDecorationDelivery;
    }

    public String getContactsDecorationDelivery() {
        return contactsDecorationDelivery;
    }

    public void setContactsDecorationDelivery(String contactsDecorationDelivery) {
        this.contactsDecorationDelivery = contactsDecorationDelivery;
    }

    public String getNotesDecorationDelivery() {
        return notesDecorationDelivery;
    }

    public void setNotesDecorationDelivery(String notesDecorationDelivery) {
        this.notesDecorationDelivery = notesDecorationDelivery;
    }

    public String getCharacteristicsDecorationDelivery() {
        return characteristicsDecorationDelivery;
    }

    public void setCharacteristicsDecorationDelivery(String characteristicsDecorationDelivery) {
        this.characteristicsDecorationDelivery = characteristicsDecorationDelivery;
    }




    public static class DatePickerCell<S, T> extends TableCell<DecorationDelivery, Date> {

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
                ((DecorationDelivery)getTableRow().getItem()).setDateOfDeliveryDecorationDelivery(cal.getTime());
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
