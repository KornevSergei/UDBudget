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

public class AppliancesOther {
    protected String nameAppliancesOther;//Наименование
    protected boolean activePAppliancesOther;//П
    protected boolean activeCAppliancesOther;//С
    protected SimpleObjectProperty<UnitType> unitAppliancesOther;//Ед. изм.
    protected double quantityAppliancesOther;//Количество
    protected double ordinalPriceUnitAppliancesOther;//Цена порядковая за ед.
    protected double priceCPUnitAppliancesOther;//Цена по КП за ед.
    protected double priceCPKeyAppliancesOther;//Цена по КП под ключ
    protected double costCPUnitAppliancesOther;//Стоимость по КП за ед.
    protected double priceOrderAppliancesOther;//Порядок цен
    protected double costCPAppliancesOther;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeAppliancesOther;//Срок доставки
    protected double actualCostAppliancesOther;//Стоимость фактическая
    protected double actualDifferenceAppliancesOther;//Разница фактическая
    protected double paidAppliancesOther;//Оплачено
    protected double residueAppliancesOther;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryAppliancesOther;//Дата поставки
    protected String nameRoomAppliancesOther;//Наименование помещения
    protected String plannedCPAppliancesOther;//КП плановое
    protected String actualCPAppliancesOther;//КП фактическое
    protected String accountAppliancesOther;//счёт
    protected String contactsAppliancesOther;//контакты
    protected String notesAppliancesOther;//примечания
    protected String characteristicsAppliancesOther;//характеристики


    public AppliancesOther(String nameAppliancesOther, boolean activePAppliancesOther, boolean activeCAppliancesOther, String unitAppliancesOther, double quantityAppliancesOther,
                           double ordinalPriceUnitAppliancesOther, double priceCPUnitAppliancesOther, double priceCPKeyAppliancesOther, double costCPUnitAppliancesOther,
                           double priceOrderAppliancesOther, double costCPAppliancesOther, String productionTimeAppliancesOther, double actualCostAppliancesOther,
                           double actualDifferenceAppliancesOther, double paidAppliancesOther, double residueAppliancesOther, String dateOfDeliveryAppliancesOther, String nameRoomAppliancesOther,
                           String plannedCPAppliancesOther, String actualCPAppliancesOther, String accountAppliancesOther, String contactsAppliancesOther, String notesAppliancesOther,
                           String characteristicsAppliancesOther) {
        this.nameAppliancesOther = nameAppliancesOther;
        this.unitAppliancesOther = new SimpleObjectProperty<>(UnitType.THING);
        this.activePAppliancesOther = activePAppliancesOther;
        this.activeCAppliancesOther = activeCAppliancesOther;
        this.quantityAppliancesOther = quantityAppliancesOther;
        this.ordinalPriceUnitAppliancesOther = ordinalPriceUnitAppliancesOther;
        this.priceCPUnitAppliancesOther = priceCPUnitAppliancesOther;
        this.priceCPKeyAppliancesOther = priceCPKeyAppliancesOther;
        this.costCPUnitAppliancesOther = costCPUnitAppliancesOther;
        this.priceOrderAppliancesOther = priceOrderAppliancesOther;
        this.costCPAppliancesOther = costCPAppliancesOther;
        this.productionTimeAppliancesOther = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostAppliancesOther = actualCostAppliancesOther;
        this.actualDifferenceAppliancesOther = actualDifferenceAppliancesOther;
        this.paidAppliancesOther = paidAppliancesOther;
        this.residueAppliancesOther = residueAppliancesOther;
        this.dateOfDeliveryAppliancesOther = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomAppliancesOther = nameRoomAppliancesOther;
        this.plannedCPAppliancesOther = plannedCPAppliancesOther;
        this.actualCPAppliancesOther = actualCPAppliancesOther;
        this.accountAppliancesOther = accountAppliancesOther;
        this.contactsAppliancesOther = contactsAppliancesOther;
        this.notesAppliancesOther = notesAppliancesOther;
        this.characteristicsAppliancesOther = characteristicsAppliancesOther;
    }

    public void CalculatePriceOrderAppliancesOther() {
        priceOrderAppliancesOther = quantityAppliancesOther * ordinalPriceUnitAppliancesOther;
    }

    public void CalculateСostCPUnitAppliancesOther() {
        if (priceCPKeyAppliancesOther > 0)
            costCPUnitAppliancesOther = priceCPKeyAppliancesOther / quantityAppliancesOther;
        else costCPUnitAppliancesOther = priceCPUnitAppliancesOther;
    }

    public void CalculateCostCPAppliancesOther() {
        if (priceCPKeyAppliancesOther > 0)
            costCPAppliancesOther = priceCPKeyAppliancesOther;
        else costCPAppliancesOther = priceCPUnitAppliancesOther * quantityAppliancesOther;
    }

    public void CalculateActualDifferenceAppliancesOther() {
        actualDifferenceAppliancesOther = costCPAppliancesOther - actualCostAppliancesOther;
    }

    public void CalculateResidueAppliancesOther() {
        residueAppliancesOther = actualCostAppliancesOther - paidAppliancesOther;
    }


    public String getNameAppliancesOther() {
        return nameAppliancesOther;
    }

    public void setNameAppliancesOther(String nameAppliancesOther) {
        this.nameAppliancesOther = nameAppliancesOther;
    }


    public UnitType getUnitAppliancesOther() {
        return unitAppliancesOther.get();
    }

    public void setUnitAppliancesOther(UnitType unitAppliancesOther) {
        this.unitAppliancesOther.set(unitAppliancesOther);
    }

    public boolean getActivePAppliancesOther() {
        return activePAppliancesOther;
    }

    public void setActivePAppliancesOther(boolean activePAppliancesOther) {
        this.activePAppliancesOther = activePAppliancesOther;
    }

    public void setActivePAppliancesOther(String activePAppliancesOther) {
        this.activePAppliancesOther = Boolean.parseBoolean(activePAppliancesOther);
    }

    public boolean getActiveCAppliancesOther() {
        return activeCAppliancesOther;
    }

    public void setActiveCAppliancesOther(boolean activeCAppliancesOther) {
        this.activeCAppliancesOther = activeCAppliancesOther;
    }

    public void setActiveCAppliancesOther(String activeCAppliancesOther) {
        this.activeCAppliancesOther = Boolean.parseBoolean(activeCAppliancesOther);
    }

    public String getQuantityAppliancesOther() {
        return Double.toString(quantityAppliancesOther);
    }

    public void setQuantityAppliancesOther(double quantityAppliancesOther) {
        this.quantityAppliancesOther = quantityAppliancesOther;
    }

    public void setQuantityAppliancesOther(String quantityAppliancesOther) {
        this.quantityAppliancesOther = Double.parseDouble(quantityAppliancesOther);
        CalculatePriceOrderAppliancesOther();
        CalculateCostCPAppliancesOther();
    }

    public String getOrdinalPriceUnitAppliancesOther() {
        return Double.toString(ordinalPriceUnitAppliancesOther);
    }

    public void setOrdinalPriceUnitAppliancesOther(double ordinalPriceUnitAppliancesOther) {
        this.ordinalPriceUnitAppliancesOther = ordinalPriceUnitAppliancesOther;
    }

    public void setOrdinalPriceUnitAppliancesOther(String ordinalPriceUnitAppliancesOther) {
        this.ordinalPriceUnitAppliancesOther = Double.parseDouble(ordinalPriceUnitAppliancesOther);
        CalculatePriceOrderAppliancesOther();
    }

    public String getPriceCPUnitAppliancesOther() {
        return Double.toString(priceCPUnitAppliancesOther);
    }

    public void setPriceCPUnitAppliancesOther(double priceCPUnitAppliancesOther) {
        this.priceCPUnitAppliancesOther = priceCPUnitAppliancesOther;
    }

    public void setPriceCPUnitAppliancesOther(String priceCPUnitAppliancesOther) {
        this.priceCPUnitAppliancesOther = Double.parseDouble(priceCPUnitAppliancesOther);
        CalculateСostCPUnitAppliancesOther();
        CalculateCostCPAppliancesOther();
    }

    public String getPriceCPKeyAppliancesOther() {
        return Double.toString(priceCPKeyAppliancesOther);
    }

    public void setPriceCPKeyAppliancesOther(double priceCPKeyAppliancesOther) {
        this.priceCPKeyAppliancesOther = priceCPKeyAppliancesOther;
    }

    public void setPriceCPKeyAppliancesOther(String priceCPKeyAppliancesOther) {
        this.priceCPKeyAppliancesOther = Double.parseDouble(priceCPKeyAppliancesOther);
        CalculateСostCPUnitAppliancesOther();
        CalculateCostCPAppliancesOther();
    }

    public String getCostCPUnitAppliancesOther() {
        return Double.toString(costCPUnitAppliancesOther);
    }

    public void setCostCPUnitAppliancesOther(double costCPUnitAppliancesOther) {
        this.costCPUnitAppliancesOther = costCPUnitAppliancesOther;
    }

    public void setCostCPUnitAppliancesOther(String costCPUnitAppliancesOther) {
        this.costCPUnitAppliancesOther = Double.parseDouble(costCPUnitAppliancesOther);
    }

    public String getPriceOrderAppliancesOther() {
        return Double.toString(priceOrderAppliancesOther);
    }

    public void setPriceOrderAppliancesOther(double priceOrderAppliancesOther) {
        this.priceOrderAppliancesOther = priceOrderAppliancesOther;
    }

    public void setPriceOrderAppliancesOther(String priceOrderAppliancesOther) {
        this.priceOrderAppliancesOther = Double.parseDouble(priceOrderAppliancesOther);
    }

    public String getCostCPAppliancesOther() {
        return Double.toString(costCPAppliancesOther);
    }

    public void setCostCPAppliancesOther(double costCPAppliancesOther) {
        this.costCPAppliancesOther = costCPAppliancesOther;
    }

    public void setCostCPAppliancesOther(String costCPAppliancesOther) {
        this.costCPAppliancesOther = Double.parseDouble(costCPAppliancesOther);
        CalculateActualDifferenceAppliancesOther();
    }


    public TimeProduction getProductionTimeAppliancesOther() {
        return productionTimeAppliancesOther.get();
    }

    public void setProductionTimeAppliancesOther(TimeProduction productionTimeAppliancesOther) {
        this.productionTimeAppliancesOther.set(productionTimeAppliancesOther);
    }

    public String getActualCostAppliancesOther() {
        return Double.toString(actualCostAppliancesOther);
    }

    public void setActualCostAppliancesOther(double actualCostAppliancesOther) {
        this.actualCostAppliancesOther = actualCostAppliancesOther;
    }

    public void setActualCostAppliancesOther(String actualCostAppliancesOther) {
        this.actualCostAppliancesOther = Double.parseDouble(actualCostAppliancesOther);
        CalculateActualDifferenceAppliancesOther();
        CalculateResidueAppliancesOther();

    }

    public String getActualDifferenceAppliancesOther() {
        return Double.toString(actualDifferenceAppliancesOther);
    }

    public void setActualDifferenceAppliancesOther(double actualDifferenceAppliancesOther) {
        this.actualDifferenceAppliancesOther = actualDifferenceAppliancesOther;
    }

    public void setActualDifferenceAppliancesOther(String actualDifferenceAppliancesOther) {
        this.actualDifferenceAppliancesOther = Double.parseDouble(actualDifferenceAppliancesOther);
    }

    public String getPaidAppliancesOther() {
        return Double.toString(paidAppliancesOther);
    }

    public void setPaidAppliancesOther(double paidAppliancesOther) {
        this.paidAppliancesOther = paidAppliancesOther;
    }

    public void setPaidAppliancesOther(String paidAppliancesOther) {
        this.paidAppliancesOther = Double.parseDouble(paidAppliancesOther);
        CalculateResidueAppliancesOther();
    }

    public String getResidueAppliancesOther() {
        return Double.toString(residueAppliancesOther);
    }

    public void setResidueAppliancesOther(double residueAppliancesOther) {
        this.residueAppliancesOther = residueAppliancesOther;
    }

    public void setResidueAppliancesOther(String residueAppliancesOther) {
        this.residueAppliancesOther = Double.parseDouble(residueAppliancesOther);
    }

    public Date getDateOfDeliveryAppliancesOther() {
        return dateOfDeliveryAppliancesOther.get();
    }

    public void setDateOfDeliveryAppliancesOther(Date dateOfDeliveryAppliancesOther) {
        this.dateOfDeliveryAppliancesOther.set(dateOfDeliveryAppliancesOther);
    }


    public String getNameRoomAppliancesOther() {
        return nameRoomAppliancesOther;
    }

    public void setNameRoomAppliancesOther(String nameRoomAppliancesOther) {
        this.nameRoomAppliancesOther = nameRoomAppliancesOther;
    }

    public String getPlannedCPAppliancesOther() {
        return plannedCPAppliancesOther;
    }

    public void setPlannedCPAppliancesOther(String plannedCPAppliancesOther) {
        this.plannedCPAppliancesOther = plannedCPAppliancesOther;
    }

    public String getActualCPAppliancesOther() {
        return actualCPAppliancesOther;
    }

    public void setActualCPAppliancesOther(String actualCPAppliancesOther) {
        this.actualCPAppliancesOther = actualCPAppliancesOther;
    }

    public String getAccountAppliancesOther() {
        return accountAppliancesOther;
    }

    public void setAccountAppliancesOther(String accountAppliancesOther) {
        this.accountAppliancesOther = accountAppliancesOther;
    }

    public String getContactsAppliancesOther() {
        return contactsAppliancesOther;
    }

    public void setContactsAppliancesOther(String contactsAppliancesOther) {
        this.contactsAppliancesOther = contactsAppliancesOther;
    }

    public String getNotesAppliancesOther() {
        return notesAppliancesOther;
    }

    public void setNotesAppliancesOther(String notesAppliancesOther) {
        this.notesAppliancesOther = notesAppliancesOther;
    }

    public String getCharacteristicsAppliancesOther() {
        return characteristicsAppliancesOther;
    }

    public void setCharacteristicsAppliancesOther(String characteristicsAppliancesOther) {
        this.characteristicsAppliancesOther = characteristicsAppliancesOther;
    }




    public static class DatePickerCell<S, T> extends TableCell<AppliancesOther, Date> {

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
                ((AppliancesOther)getTableRow().getItem()).setDateOfDeliveryAppliancesOther(cal.getTime());
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

