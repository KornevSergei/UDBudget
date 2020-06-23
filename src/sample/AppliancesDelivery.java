package sample;

import javafx.application.Platform;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class AppliancesDelivery {
    protected String nameAppliancesDelivery;//Наименование
    protected boolean activePAppliancesDelivery;//П
    protected boolean activeCAppliancesDelivery;//С
    protected SimpleObjectProperty<UnitType> unitAppliancesDelivery;//Ед. изм.
    protected double quantityAppliancesDelivery;//Количество
    protected double ordinalPriceUnitAppliancesDelivery;//Цена порядковая за ед.
    protected double priceCPUnitAppliancesDelivery;//Цена по КП за ед.
    protected double priceCPKeyAppliancesDelivery;//Цена по КП под ключ
    protected double costCPUnitAppliancesDelivery;//Стоимость по КП за ед.
    protected double priceOrderAppliancesDelivery;//Порядок цен
    protected double costCPAppliancesDelivery;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeAppliancesDelivery;//Срок доставки
    protected double actualCostAppliancesDelivery;//Стоимость фактическая
    protected double actualDifferenceAppliancesDelivery;//Разница фактическая
    protected double paidAppliancesDelivery;//Оплачено
    protected double residueAppliancesDelivery;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryAppliancesDelivery;//Дата поставки
    protected String nameRoomAppliancesDelivery;//Наименование помещения
    protected String plannedCPAppliancesDelivery;//КП плановое
    protected String actualCPAppliancesDelivery;//КП фактическое
    protected String accountAppliancesDelivery;//счёт
    protected String contactsAppliancesDelivery;//контакты
    protected String notesAppliancesDelivery;//примечания
    protected String characteristicsAppliancesDelivery;//характеристики


    public AppliancesDelivery(String nameAppliancesDelivery, boolean activePAppliancesDelivery, boolean activeCAppliancesDelivery, String unitAppliancesDelivery, double quantityAppliancesDelivery,
                              double ordinalPriceUnitAppliancesDelivery, double priceCPUnitAppliancesDelivery, double priceCPKeyAppliancesDelivery, double costCPUnitAppliancesDelivery,
                              double priceOrderAppliancesDelivery, double costCPAppliancesDelivery, String productionTimeAppliancesDelivery, double actualCostAppliancesDelivery,
                              double actualDifferenceAppliancesDelivery, double paidAppliancesDelivery, double residueAppliancesDelivery, String dateOfDeliveryAppliancesDelivery, String nameRoomAppliancesDelivery,
                              String plannedCPAppliancesDelivery, String actualCPAppliancesDelivery, String accountAppliancesDelivery, String contactsAppliancesDelivery, String notesAppliancesDelivery,
                              String characteristicsAppliancesDelivery) {
        this.nameAppliancesDelivery = nameAppliancesDelivery;
        this.unitAppliancesDelivery = new SimpleObjectProperty<>(UnitType.THING);
        this.activePAppliancesDelivery = activePAppliancesDelivery;
        this.activeCAppliancesDelivery = activeCAppliancesDelivery;
        this.quantityAppliancesDelivery = quantityAppliancesDelivery;
        this.ordinalPriceUnitAppliancesDelivery = ordinalPriceUnitAppliancesDelivery;
        this.priceCPUnitAppliancesDelivery = priceCPUnitAppliancesDelivery;
        this.priceCPKeyAppliancesDelivery = priceCPKeyAppliancesDelivery;
        this.costCPUnitAppliancesDelivery = costCPUnitAppliancesDelivery;
        this.priceOrderAppliancesDelivery = priceOrderAppliancesDelivery;
        this.costCPAppliancesDelivery = costCPAppliancesDelivery;
        this.productionTimeAppliancesDelivery = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostAppliancesDelivery = actualCostAppliancesDelivery;
        this.actualDifferenceAppliancesDelivery = actualDifferenceAppliancesDelivery;
        this.paidAppliancesDelivery = paidAppliancesDelivery;
        this.residueAppliancesDelivery = residueAppliancesDelivery;
        this.dateOfDeliveryAppliancesDelivery = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomAppliancesDelivery = nameRoomAppliancesDelivery;
        this.plannedCPAppliancesDelivery = plannedCPAppliancesDelivery;
        this.actualCPAppliancesDelivery = actualCPAppliancesDelivery;
        this.accountAppliancesDelivery = accountAppliancesDelivery;
        this.contactsAppliancesDelivery = contactsAppliancesDelivery;
        this.notesAppliancesDelivery = notesAppliancesDelivery;
        this.characteristicsAppliancesDelivery = characteristicsAppliancesDelivery;
    }

    public void CalculatePriceOrderAppliancesDelivery() {
        priceOrderAppliancesDelivery = quantityAppliancesDelivery * ordinalPriceUnitAppliancesDelivery;
    }

    public void CalculateСostCPUnitAppliancesDelivery() {
        if (priceCPKeyAppliancesDelivery > 0)
            costCPUnitAppliancesDelivery = priceCPKeyAppliancesDelivery / quantityAppliancesDelivery;
        else costCPUnitAppliancesDelivery = priceCPUnitAppliancesDelivery;
    }

    public void CalculateCostCPAppliancesDelivery() {
        if (priceCPKeyAppliancesDelivery > 0)
            costCPAppliancesDelivery = priceCPKeyAppliancesDelivery;
        else costCPAppliancesDelivery = priceCPUnitAppliancesDelivery * quantityAppliancesDelivery;
    }

    public void CalculateActualDifferenceAppliancesDelivery() {
        actualDifferenceAppliancesDelivery = costCPAppliancesDelivery - actualCostAppliancesDelivery;
    }

    public void CalculateResidueAppliancesDelivery() {
        residueAppliancesDelivery = actualCostAppliancesDelivery - paidAppliancesDelivery;
    }


    public String getNameAppliancesDelivery() {
        return nameAppliancesDelivery;
    }

    public void setNameAppliancesDelivery(String nameAppliancesDelivery) {
        this.nameAppliancesDelivery = nameAppliancesDelivery;
    }


    public UnitType getUnitAppliancesDelivery() {
        return unitAppliancesDelivery.get();
    }

    public void setUnitAppliancesDelivery(UnitType unitAppliancesDelivery) {
        this.unitAppliancesDelivery.set(unitAppliancesDelivery);
    }

    public boolean getActivePAppliancesDelivery() {
        return activePAppliancesDelivery;
    }

    public void setActivePAppliancesDelivery(boolean activePAppliancesDelivery) {
        this.activePAppliancesDelivery = activePAppliancesDelivery;
    }

    public void setActivePAppliancesDelivery(String activePAppliancesDelivery) {
        this.activePAppliancesDelivery = Boolean.parseBoolean(activePAppliancesDelivery);
    }

    public boolean getActiveCAppliancesDelivery() {
        return activeCAppliancesDelivery;
    }

    public void setActiveCAppliancesDelivery(boolean activeCAppliancesDelivery) {
        this.activeCAppliancesDelivery = activeCAppliancesDelivery;
    }

    public void setActiveCAppliancesDelivery(String activeCAppliancesDelivery) {
        this.activeCAppliancesDelivery = Boolean.parseBoolean(activeCAppliancesDelivery);
    }

    public String getQuantityAppliancesDelivery() {
        return Double.toString(quantityAppliancesDelivery);
    }

    public void setQuantityAppliancesDelivery(double quantityAppliancesDelivery) {
        this.quantityAppliancesDelivery = quantityAppliancesDelivery;
    }

    public void setQuantityAppliancesDelivery(String quantityAppliancesDelivery) {
        this.quantityAppliancesDelivery = Double.parseDouble(quantityAppliancesDelivery);
        CalculatePriceOrderAppliancesDelivery();
        CalculateCostCPAppliancesDelivery();
    }

    public String getOrdinalPriceUnitAppliancesDelivery() {
        return Double.toString(ordinalPriceUnitAppliancesDelivery);
    }

    public void setOrdinalPriceUnitAppliancesDelivery(double ordinalPriceUnitAppliancesDelivery) {
        this.ordinalPriceUnitAppliancesDelivery = ordinalPriceUnitAppliancesDelivery;
    }

    public void setOrdinalPriceUnitAppliancesDelivery(String ordinalPriceUnitAppliancesDelivery) {
        this.ordinalPriceUnitAppliancesDelivery = Double.parseDouble(ordinalPriceUnitAppliancesDelivery);
        CalculatePriceOrderAppliancesDelivery();
    }

    public String getPriceCPUnitAppliancesDelivery() {
        return Double.toString(priceCPUnitAppliancesDelivery);
    }

    public void setPriceCPUnitAppliancesDelivery(double priceCPUnitAppliancesDelivery) {
        this.priceCPUnitAppliancesDelivery = priceCPUnitAppliancesDelivery;
    }

    public void setPriceCPUnitAppliancesDelivery(String priceCPUnitAppliancesDelivery) {
        this.priceCPUnitAppliancesDelivery = Double.parseDouble(priceCPUnitAppliancesDelivery);
        CalculateСostCPUnitAppliancesDelivery();
        CalculateCostCPAppliancesDelivery();
    }

    public String getPriceCPKeyAppliancesDelivery() {
        return Double.toString(priceCPKeyAppliancesDelivery);
    }

    public void setPriceCPKeyAppliancesDelivery(double priceCPKeyAppliancesDelivery) {
        this.priceCPKeyAppliancesDelivery = priceCPKeyAppliancesDelivery;
    }

    public void setPriceCPKeyAppliancesDelivery(String priceCPKeyAppliancesDelivery) {
        this.priceCPKeyAppliancesDelivery = Double.parseDouble(priceCPKeyAppliancesDelivery);
        CalculateСostCPUnitAppliancesDelivery();
        CalculateCostCPAppliancesDelivery();
    }

    public String getCostCPUnitAppliancesDelivery() {
        return Double.toString(costCPUnitAppliancesDelivery);
    }

    public void setCostCPUnitAppliancesDelivery(double costCPUnitAppliancesDelivery) {
        this.costCPUnitAppliancesDelivery = costCPUnitAppliancesDelivery;
    }

    public void setCostCPUnitAppliancesDelivery(String costCPUnitAppliancesDelivery) {
        this.costCPUnitAppliancesDelivery = Double.parseDouble(costCPUnitAppliancesDelivery);
    }

    public String getPriceOrderAppliancesDelivery() {
        return Double.toString(priceOrderAppliancesDelivery);
    }

    public void setPriceOrderAppliancesDelivery(double priceOrderAppliancesDelivery) {
        this.priceOrderAppliancesDelivery = priceOrderAppliancesDelivery;
    }

    public void setPriceOrderAppliancesDelivery(String priceOrderAppliancesDelivery) {
        this.priceOrderAppliancesDelivery = Double.parseDouble(priceOrderAppliancesDelivery);
    }

    public String getCostCPAppliancesDelivery() {
        return Double.toString(costCPAppliancesDelivery);
    }

    public void setCostCPAppliancesDelivery(double costCPAppliancesDelivery) {
        this.costCPAppliancesDelivery = costCPAppliancesDelivery;
    }

    public void setCostCPAppliancesDelivery(String costCPAppliancesDelivery) {
        this.costCPAppliancesDelivery = Double.parseDouble(costCPAppliancesDelivery);
        CalculateActualDifferenceAppliancesDelivery();
    }


    public TimeProduction getProductionTimeAppliancesDelivery() {
        return productionTimeAppliancesDelivery.get();
    }

    public void setProductionTimeAppliancesDelivery(TimeProduction productionTimeAppliancesDelivery) {
        this.productionTimeAppliancesDelivery.set(productionTimeAppliancesDelivery);
    }

    public String getActualCostAppliancesDelivery() {
        return Double.toString(actualCostAppliancesDelivery);
    }

    public void setActualCostAppliancesDelivery(double actualCostAppliancesDelivery) {
        this.actualCostAppliancesDelivery = actualCostAppliancesDelivery;
    }

    public void setActualCostAppliancesDelivery(String actualCostAppliancesDelivery) {
        this.actualCostAppliancesDelivery = Double.parseDouble(actualCostAppliancesDelivery);
        CalculateActualDifferenceAppliancesDelivery();
        CalculateResidueAppliancesDelivery();

    }

    public String getActualDifferenceAppliancesDelivery() {
        return Double.toString(actualDifferenceAppliancesDelivery);
    }

    public void setActualDifferenceAppliancesDelivery(double actualDifferenceAppliancesDelivery) {
        this.actualDifferenceAppliancesDelivery = actualDifferenceAppliancesDelivery;
    }

    public void setActualDifferenceAppliancesDelivery(String actualDifferenceAppliancesDelivery) {
        this.actualDifferenceAppliancesDelivery = Double.parseDouble(actualDifferenceAppliancesDelivery);
    }

    public String getPaidAppliancesDelivery() {
        return Double.toString(paidAppliancesDelivery);
    }

    public void setPaidAppliancesDelivery(double paidAppliancesDelivery) {
        this.paidAppliancesDelivery = paidAppliancesDelivery;
    }

    public void setPaidAppliancesDelivery(String paidAppliancesDelivery) {
        this.paidAppliancesDelivery = Double.parseDouble(paidAppliancesDelivery);
        CalculateResidueAppliancesDelivery();
    }

    public String getResidueAppliancesDelivery() {
        return Double.toString(residueAppliancesDelivery);
    }

    public void setResidueAppliancesDelivery(double residueAppliancesDelivery) {
        this.residueAppliancesDelivery = residueAppliancesDelivery;
    }

    public void setResidueAppliancesDelivery(String residueAppliancesDelivery) {
        this.residueAppliancesDelivery = Double.parseDouble(residueAppliancesDelivery);
    }

    public Date getDateOfDeliveryAppliancesDelivery() {
        return dateOfDeliveryAppliancesDelivery.get();
    }

    public void setDateOfDeliveryAppliancesDelivery(Date dateOfDeliveryAppliancesDelivery) {
        this.dateOfDeliveryAppliancesDelivery.set(dateOfDeliveryAppliancesDelivery);
    }


    public String getNameRoomAppliancesDelivery() {
        return nameRoomAppliancesDelivery;
    }

    public void setNameRoomAppliancesDelivery(String nameRoomAppliancesDelivery) {
        this.nameRoomAppliancesDelivery = nameRoomAppliancesDelivery;
    }

    public String getPlannedCPAppliancesDelivery() {
        return plannedCPAppliancesDelivery;
    }

    public void setPlannedCPAppliancesDelivery(String plannedCPAppliancesDelivery) {
        this.plannedCPAppliancesDelivery = plannedCPAppliancesDelivery;
    }

    public String getActualCPAppliancesDelivery() {
        return actualCPAppliancesDelivery;
    }

    public void setActualCPAppliancesDelivery(String actualCPAppliancesDelivery) {
        this.actualCPAppliancesDelivery = actualCPAppliancesDelivery;
    }

    public String getAccountAppliancesDelivery() {
        return accountAppliancesDelivery;
    }

    public void setAccountAppliancesDelivery(String accountAppliancesDelivery) {
        this.accountAppliancesDelivery = accountAppliancesDelivery;
    }

    public String getContactsAppliancesDelivery() {
        return contactsAppliancesDelivery;
    }

    public void setContactsAppliancesDelivery(String contactsAppliancesDelivery) {
        this.contactsAppliancesDelivery = contactsAppliancesDelivery;
    }

    public String getNotesAppliancesDelivery() {
        return notesAppliancesDelivery;
    }

    public void setNotesAppliancesDelivery(String notesAppliancesDelivery) {
        this.notesAppliancesDelivery = notesAppliancesDelivery;
    }

    public String getCharacteristicsAppliancesDelivery() {
        return characteristicsAppliancesDelivery;
    }

    public void setCharacteristicsAppliancesDelivery(String characteristicsAppliancesDelivery) {
        this.characteristicsAppliancesDelivery = characteristicsAppliancesDelivery;
    }




    public static class DatePickerCell<S, T> extends TableCell<AppliancesDelivery, Date> {

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
                ((AppliancesDelivery)getTableRow().getItem()).setDateOfDeliveryAppliancesDelivery(cal.getTime());
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


