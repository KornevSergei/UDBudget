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

public class AppliancesSuddenly {
    protected String nameAppliancesSuddenly;//Наименование
    protected boolean activePAppliancesSuddenly;//П
    protected boolean activeCAppliancesSuddenly;//С
    protected SimpleObjectProperty<UnitType> unitAppliancesSuddenly;//Ед. изм.
    protected double quantityAppliancesSuddenly;//Количество
    protected double ordinalPriceUnitAppliancesSuddenly;//Цена порядковая за ед.
    protected double priceCPUnitAppliancesSuddenly;//Цена по КП за ед.
    protected double priceCPKeyAppliancesSuddenly;//Цена по КП под ключ
    protected double costCPUnitAppliancesSuddenly;//Стоимость по КП за ед.
    protected double priceOrderAppliancesSuddenly;//Порядок цен
    protected double costCPAppliancesSuddenly;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeAppliancesSuddenly;//Срок доставки
    protected double actualCostAppliancesSuddenly;//Стоимость фактическая
    protected double actualDifferenceAppliancesSuddenly;//Разница фактическая
    protected double paidAppliancesSuddenly;//Оплачено
    protected double residueAppliancesSuddenly;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryAppliancesSuddenly;//Дата поставки
    protected String nameRoomAppliancesSuddenly;//Наименование помещения
    protected String plannedCPAppliancesSuddenly;//КП плановое
    protected String actualCPAppliancesSuddenly;//КП фактическое
    protected String accountAppliancesSuddenly;//счёт
    protected String contactsAppliancesSuddenly;//контакты
    protected String notesAppliancesSuddenly;//примечания
    protected String characteristicsAppliancesSuddenly;//характеристики


    public AppliancesSuddenly(String nameAppliancesSuddenly, boolean activePAppliancesSuddenly, boolean activeCAppliancesSuddenly, String unitAppliancesSuddenly, double quantityAppliancesSuddenly,
                              double ordinalPriceUnitAppliancesSuddenly, double priceCPUnitAppliancesSuddenly, double priceCPKeyAppliancesSuddenly, double costCPUnitAppliancesSuddenly,
                              double priceOrderAppliancesSuddenly, double costCPAppliancesSuddenly, String productionTimeAppliancesSuddenly, double actualCostAppliancesSuddenly,
                              double actualDifferenceAppliancesSuddenly, double paidAppliancesSuddenly, double residueAppliancesSuddenly, String dateOfDeliveryAppliancesSuddenly, String nameRoomAppliancesSuddenly,
                              String plannedCPAppliancesSuddenly, String actualCPAppliancesSuddenly, String accountAppliancesSuddenly, String contactsAppliancesSuddenly, String notesAppliancesSuddenly,
                              String characteristicsAppliancesSuddenly) {
        this.nameAppliancesSuddenly = nameAppliancesSuddenly;
        this.unitAppliancesSuddenly = new SimpleObjectProperty<>(UnitType.THING);
        this.activePAppliancesSuddenly = activePAppliancesSuddenly;
        this.activeCAppliancesSuddenly = activeCAppliancesSuddenly;
        this.quantityAppliancesSuddenly = quantityAppliancesSuddenly;
        this.ordinalPriceUnitAppliancesSuddenly = ordinalPriceUnitAppliancesSuddenly;
        this.priceCPUnitAppliancesSuddenly = priceCPUnitAppliancesSuddenly;
        this.priceCPKeyAppliancesSuddenly = priceCPKeyAppliancesSuddenly;
        this.costCPUnitAppliancesSuddenly = costCPUnitAppliancesSuddenly;
        this.priceOrderAppliancesSuddenly = priceOrderAppliancesSuddenly;
        this.costCPAppliancesSuddenly = costCPAppliancesSuddenly;
        this.productionTimeAppliancesSuddenly = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostAppliancesSuddenly = actualCostAppliancesSuddenly;
        this.actualDifferenceAppliancesSuddenly = actualDifferenceAppliancesSuddenly;
        this.paidAppliancesSuddenly = paidAppliancesSuddenly;
        this.residueAppliancesSuddenly = residueAppliancesSuddenly;
        this.dateOfDeliveryAppliancesSuddenly = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomAppliancesSuddenly = nameRoomAppliancesSuddenly;
        this.plannedCPAppliancesSuddenly = plannedCPAppliancesSuddenly;
        this.actualCPAppliancesSuddenly = actualCPAppliancesSuddenly;
        this.accountAppliancesSuddenly = accountAppliancesSuddenly;
        this.contactsAppliancesSuddenly = contactsAppliancesSuddenly;
        this.notesAppliancesSuddenly = notesAppliancesSuddenly;
        this.characteristicsAppliancesSuddenly = characteristicsAppliancesSuddenly;
    }

    public void CalculatePriceOrderAppliancesSuddenly() {
        priceOrderAppliancesSuddenly = quantityAppliancesSuddenly * ordinalPriceUnitAppliancesSuddenly;
    }

    public void CalculateСostCPUnitAppliancesSuddenly() {
        if (priceCPKeyAppliancesSuddenly > 0)
            costCPUnitAppliancesSuddenly = priceCPKeyAppliancesSuddenly / quantityAppliancesSuddenly;
        else costCPUnitAppliancesSuddenly = priceCPUnitAppliancesSuddenly;
    }

    public void CalculateCostCPAppliancesSuddenly() {
        if (priceCPKeyAppliancesSuddenly > 0)
            costCPAppliancesSuddenly = priceCPKeyAppliancesSuddenly;
        else costCPAppliancesSuddenly = priceCPUnitAppliancesSuddenly * quantityAppliancesSuddenly;
    }

    public void CalculateActualDifferenceAppliancesSuddenly() {
        actualDifferenceAppliancesSuddenly = costCPAppliancesSuddenly - actualCostAppliancesSuddenly;
    }

    public void CalculateResidueAppliancesSuddenly() {
        residueAppliancesSuddenly = actualCostAppliancesSuddenly - paidAppliancesSuddenly;
    }


    public String getNameAppliancesSuddenly() {
        return nameAppliancesSuddenly;
    }

    public void setNameAppliancesSuddenly(String nameAppliancesSuddenly) {
        this.nameAppliancesSuddenly = nameAppliancesSuddenly;
    }


    public UnitType getUnitAppliancesSuddenly() {
        return unitAppliancesSuddenly.get();
    }

    public void setUnitAppliancesSuddenly(UnitType unitAppliancesSuddenly) {
        this.unitAppliancesSuddenly.set(unitAppliancesSuddenly);
    }

    public boolean getActivePAppliancesSuddenly() {
        return activePAppliancesSuddenly;
    }

    public void setActivePAppliancesSuddenly(boolean activePAppliancesSuddenly) {
        this.activePAppliancesSuddenly = activePAppliancesSuddenly;
    }

    public void setActivePAppliancesSuddenly(String activePAppliancesSuddenly) {
        this.activePAppliancesSuddenly = Boolean.parseBoolean(activePAppliancesSuddenly);
    }

    public boolean getActiveCAppliancesSuddenly() {
        return activeCAppliancesSuddenly;
    }

    public void setActiveCAppliancesSuddenly(boolean activeCAppliancesSuddenly) {
        this.activeCAppliancesSuddenly = activeCAppliancesSuddenly;
    }

    public void setActiveCAppliancesSuddenly(String activeCAppliancesSuddenly) {
        this.activeCAppliancesSuddenly = Boolean.parseBoolean(activeCAppliancesSuddenly);
    }

    public String getQuantityAppliancesSuddenly() {
        return Double.toString(quantityAppliancesSuddenly);
    }

    public void setQuantityAppliancesSuddenly(double quantityAppliancesSuddenly) {
        this.quantityAppliancesSuddenly = quantityAppliancesSuddenly;
    }

    public void setQuantityAppliancesSuddenly(String quantityAppliancesSuddenly) {
        this.quantityAppliancesSuddenly = Double.parseDouble(quantityAppliancesSuddenly);
        CalculatePriceOrderAppliancesSuddenly();
        CalculateCostCPAppliancesSuddenly();
    }

    public String getOrdinalPriceUnitAppliancesSuddenly() {
        return Double.toString(ordinalPriceUnitAppliancesSuddenly);
    }

    public void setOrdinalPriceUnitAppliancesSuddenly(double ordinalPriceUnitAppliancesSuddenly) {
        this.ordinalPriceUnitAppliancesSuddenly = ordinalPriceUnitAppliancesSuddenly;
    }

    public void setOrdinalPriceUnitAppliancesSuddenly(String ordinalPriceUnitAppliancesSuddenly) {
        this.ordinalPriceUnitAppliancesSuddenly = Double.parseDouble(ordinalPriceUnitAppliancesSuddenly);
        CalculatePriceOrderAppliancesSuddenly();
    }

    public String getPriceCPUnitAppliancesSuddenly() {
        return Double.toString(priceCPUnitAppliancesSuddenly);
    }

    public void setPriceCPUnitAppliancesSuddenly(double priceCPUnitAppliancesSuddenly) {
        this.priceCPUnitAppliancesSuddenly = priceCPUnitAppliancesSuddenly;
    }

    public void setPriceCPUnitAppliancesSuddenly(String priceCPUnitAppliancesSuddenly) {
        this.priceCPUnitAppliancesSuddenly = Double.parseDouble(priceCPUnitAppliancesSuddenly);
        CalculateСostCPUnitAppliancesSuddenly();
        CalculateCostCPAppliancesSuddenly();
    }

    public String getPriceCPKeyAppliancesSuddenly() {
        return Double.toString(priceCPKeyAppliancesSuddenly);
    }

    public void setPriceCPKeyAppliancesSuddenly(double priceCPKeyAppliancesSuddenly) {
        this.priceCPKeyAppliancesSuddenly = priceCPKeyAppliancesSuddenly;
    }

    public void setPriceCPKeyAppliancesSuddenly(String priceCPKeyAppliancesSuddenly) {
        this.priceCPKeyAppliancesSuddenly = Double.parseDouble(priceCPKeyAppliancesSuddenly);
        CalculateСostCPUnitAppliancesSuddenly();
        CalculateCostCPAppliancesSuddenly();
    }

    public String getCostCPUnitAppliancesSuddenly() {
        return Double.toString(costCPUnitAppliancesSuddenly);
    }

    public void setCostCPUnitAppliancesSuddenly(double costCPUnitAppliancesSuddenly) {
        this.costCPUnitAppliancesSuddenly = costCPUnitAppliancesSuddenly;
    }

    public void setCostCPUnitAppliancesSuddenly(String costCPUnitAppliancesSuddenly) {
        this.costCPUnitAppliancesSuddenly = Double.parseDouble(costCPUnitAppliancesSuddenly);
    }

    public String getPriceOrderAppliancesSuddenly() {
        return Double.toString(priceOrderAppliancesSuddenly);
    }

    public void setPriceOrderAppliancesSuddenly(double priceOrderAppliancesSuddenly) {
        this.priceOrderAppliancesSuddenly = priceOrderAppliancesSuddenly;
    }

    public void setPriceOrderAppliancesSuddenly(String priceOrderAppliancesSuddenly) {
        this.priceOrderAppliancesSuddenly = Double.parseDouble(priceOrderAppliancesSuddenly);
    }

    public String getCostCPAppliancesSuddenly() {
        return Double.toString(costCPAppliancesSuddenly);
    }

    public void setCostCPAppliancesSuddenly(double costCPAppliancesSuddenly) {
        this.costCPAppliancesSuddenly = costCPAppliancesSuddenly;
    }

    public void setCostCPAppliancesSuddenly(String costCPAppliancesSuddenly) {
        this.costCPAppliancesSuddenly = Double.parseDouble(costCPAppliancesSuddenly);
        CalculateActualDifferenceAppliancesSuddenly();
    }


    public TimeProduction getProductionTimeAppliancesSuddenly() {
        return productionTimeAppliancesSuddenly.get();
    }

    public void setProductionTimeAppliancesSuddenly(TimeProduction productionTimeAppliancesSuddenly) {
        this.productionTimeAppliancesSuddenly.set(productionTimeAppliancesSuddenly);
    }

    public String getActualCostAppliancesSuddenly() {
        return Double.toString(actualCostAppliancesSuddenly);
    }

    public void setActualCostAppliancesSuddenly(double actualCostAppliancesSuddenly) {
        this.actualCostAppliancesSuddenly = actualCostAppliancesSuddenly;
    }

    public void setActualCostAppliancesSuddenly(String actualCostAppliancesSuddenly) {
        this.actualCostAppliancesSuddenly = Double.parseDouble(actualCostAppliancesSuddenly);
        CalculateActualDifferenceAppliancesSuddenly();
        CalculateResidueAppliancesSuddenly();

    }

    public String getActualDifferenceAppliancesSuddenly() {
        return Double.toString(actualDifferenceAppliancesSuddenly);
    }

    public void setActualDifferenceAppliancesSuddenly(double actualDifferenceAppliancesSuddenly) {
        this.actualDifferenceAppliancesSuddenly = actualDifferenceAppliancesSuddenly;
    }

    public void setActualDifferenceAppliancesSuddenly(String actualDifferenceAppliancesSuddenly) {
        this.actualDifferenceAppliancesSuddenly = Double.parseDouble(actualDifferenceAppliancesSuddenly);
    }

    public String getPaidAppliancesSuddenly() {
        return Double.toString(paidAppliancesSuddenly);
    }

    public void setPaidAppliancesSuddenly(double paidAppliancesSuddenly) {
        this.paidAppliancesSuddenly = paidAppliancesSuddenly;
    }

    public void setPaidAppliancesSuddenly(String paidAppliancesSuddenly) {
        this.paidAppliancesSuddenly = Double.parseDouble(paidAppliancesSuddenly);
        CalculateResidueAppliancesSuddenly();
    }

    public String getResidueAppliancesSuddenly() {
        return Double.toString(residueAppliancesSuddenly);
    }

    public void setResidueAppliancesSuddenly(double residueAppliancesSuddenly) {
        this.residueAppliancesSuddenly = residueAppliancesSuddenly;
    }

    public void setResidueAppliancesSuddenly(String residueAppliancesSuddenly) {
        this.residueAppliancesSuddenly = Double.parseDouble(residueAppliancesSuddenly);
    }

    public Date getDateOfDeliveryAppliancesSuddenly() {
        return dateOfDeliveryAppliancesSuddenly.get();
    }

    public void setDateOfDeliveryAppliancesSuddenly(Date dateOfDeliveryAppliancesSuddenly) {
        this.dateOfDeliveryAppliancesSuddenly.set(dateOfDeliveryAppliancesSuddenly);
    }


    public String getNameRoomAppliancesSuddenly() {
        return nameRoomAppliancesSuddenly;
    }

    public void setNameRoomAppliancesSuddenly(String nameRoomAppliancesSuddenly) {
        this.nameRoomAppliancesSuddenly = nameRoomAppliancesSuddenly;
    }

    public String getPlannedCPAppliancesSuddenly() {
        return plannedCPAppliancesSuddenly;
    }

    public void setPlannedCPAppliancesSuddenly(String plannedCPAppliancesSuddenly) {
        this.plannedCPAppliancesSuddenly = plannedCPAppliancesSuddenly;
    }

    public String getActualCPAppliancesSuddenly() {
        return actualCPAppliancesSuddenly;
    }

    public void setActualCPAppliancesSuddenly(String actualCPAppliancesSuddenly) {
        this.actualCPAppliancesSuddenly = actualCPAppliancesSuddenly;
    }

    public String getAccountAppliancesSuddenly() {
        return accountAppliancesSuddenly;
    }

    public void setAccountAppliancesSuddenly(String accountAppliancesSuddenly) {
        this.accountAppliancesSuddenly = accountAppliancesSuddenly;
    }

    public String getContactsAppliancesSuddenly() {
        return contactsAppliancesSuddenly;
    }

    public void setContactsAppliancesSuddenly(String contactsAppliancesSuddenly) {
        this.contactsAppliancesSuddenly = contactsAppliancesSuddenly;
    }

    public String getNotesAppliancesSuddenly() {
        return notesAppliancesSuddenly;
    }

    public void setNotesAppliancesSuddenly(String notesAppliancesSuddenly) {
        this.notesAppliancesSuddenly = notesAppliancesSuddenly;
    }

    public String getCharacteristicsAppliancesSuddenly() {
        return characteristicsAppliancesSuddenly;
    }

    public void setCharacteristicsAppliancesSuddenly(String characteristicsAppliancesSuddenly) {
        this.characteristicsAppliancesSuddenly = characteristicsAppliancesSuddenly;
    }




    public static class DatePickerCell<S, T> extends TableCell<AppliancesSuddenly, Date> {

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
                ((AppliancesSuddenly)getTableRow().getItem()).setDateOfDeliveryAppliancesSuddenly(cal.getTime());
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

