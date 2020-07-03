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

public class LightSuddenly {
    protected String nameLightSuddenly;//Наименование
    protected boolean activePLightSuddenly;//П
    protected boolean activeCLightSuddenly;//С
    protected SimpleObjectProperty<UnitType> unitLightSuddenly;//Ед. изм.
    protected double quantityLightSuddenly;//Количество
    protected double ordinalPriceUnitLightSuddenly;//Цена порядковая за ед.
    protected double priceCPUnitLightSuddenly;//Цена по КП за ед.
    protected double priceCPKeyLightSuddenly;//Цена по КП под ключ
    protected double costCPUnitLightSuddenly;//Стоимость по КП за ед.
    protected double priceOrderLightSuddenly;//Порядок цен
    protected double costCPLightSuddenly;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeLightSuddenly;//Срок доставки
    protected double actualCostLightSuddenly;//Стоимость фактическая
    protected double actualDifferenceLightSuddenly;//Разница фактическая
    protected double paidLightSuddenly;//Оплачено
    protected double residueLightSuddenly;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryLightSuddenly;//Дата поставки
    protected String nameRoomLightSuddenly;//Наименование помещения
    protected String plannedCPLightSuddenly;//КП плановое
    protected String actualCPLightSuddenly;//КП фактическое
    protected String accountLightSuddenly;//счёт
    protected String contactsLightSuddenly;//контакты
    protected String notesLightSuddenly;//примечания
    protected String characteristicsLightSuddenly;//характеристики


    public LightSuddenly(String nameLightSuddenly, boolean activePLightSuddenly, boolean activeCLightSuddenly, String unitLightSuddenly, double quantityLightSuddenly,
                         double ordinalPriceUnitLightSuddenly, double priceCPUnitLightSuddenly, double priceCPKeyLightSuddenly, double costCPUnitLightSuddenly,
                         double priceOrderLightSuddenly, double costCPLightSuddenly, String productionTimeLightSuddenly, double actualCostLightSuddenly,
                         double actualDifferenceLightSuddenly, double paidLightSuddenly, double residueLightSuddenly, String dateOfDeliveryLightSuddenly, String nameRoomLightSuddenly,
                         String plannedCPLightSuddenly, String actualCPLightSuddenly, String accountLightSuddenly, String contactsLightSuddenly, String notesLightSuddenly,
                         String characteristicsLightSuddenly) {
        this.nameLightSuddenly = nameLightSuddenly;
        this.unitLightSuddenly = new SimpleObjectProperty<>(UnitType.THING);
        this.activePLightSuddenly = activePLightSuddenly;
        this.activeCLightSuddenly = activeCLightSuddenly;
        this.quantityLightSuddenly = quantityLightSuddenly;
        this.ordinalPriceUnitLightSuddenly = ordinalPriceUnitLightSuddenly;
        this.priceCPUnitLightSuddenly = priceCPUnitLightSuddenly;
        this.priceCPKeyLightSuddenly = priceCPKeyLightSuddenly;
        this.costCPUnitLightSuddenly = costCPUnitLightSuddenly;
        this.priceOrderLightSuddenly = priceOrderLightSuddenly;
        this.costCPLightSuddenly = costCPLightSuddenly;
        this.productionTimeLightSuddenly = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostLightSuddenly = actualCostLightSuddenly;
        this.actualDifferenceLightSuddenly = actualDifferenceLightSuddenly;
        this.paidLightSuddenly = paidLightSuddenly;
        this.residueLightSuddenly = residueLightSuddenly;
        this.dateOfDeliveryLightSuddenly = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomLightSuddenly = nameRoomLightSuddenly;
        this.plannedCPLightSuddenly = plannedCPLightSuddenly;
        this.actualCPLightSuddenly = actualCPLightSuddenly;
        this.accountLightSuddenly = accountLightSuddenly;
        this.contactsLightSuddenly = contactsLightSuddenly;
        this.notesLightSuddenly = notesLightSuddenly;
        this.characteristicsLightSuddenly = characteristicsLightSuddenly;
    }

    public void CalculatePriceOrderLightSuddenly() {
        priceOrderLightSuddenly = quantityLightSuddenly * ordinalPriceUnitLightSuddenly;
    }

    public void CalculateСostCPUnitLightSuddenly() {
        if (priceCPKeyLightSuddenly > 0)
            costCPUnitLightSuddenly = priceCPKeyLightSuddenly / quantityLightSuddenly;
        else costCPUnitLightSuddenly = priceCPUnitLightSuddenly;
    }

    public void CalculateCostCPLightSuddenly() {
        if (priceCPKeyLightSuddenly > 0)
            costCPLightSuddenly = priceCPKeyLightSuddenly;
        else costCPLightSuddenly = priceCPUnitLightSuddenly * quantityLightSuddenly;
    }

    public void CalculateActualDifferenceLightSuddenly() {
        actualDifferenceLightSuddenly = costCPLightSuddenly - actualCostLightSuddenly;
    }

    public void CalculateResidueLightSuddenly() {
        residueLightSuddenly = actualCostLightSuddenly - paidLightSuddenly;
    }


    public String getNameLightSuddenly() {
        return nameLightSuddenly;
    }

    public void setNameLightSuddenly(String nameLightSuddenly) {
        this.nameLightSuddenly = nameLightSuddenly;
    }


    public UnitType getUnitLightSuddenly() {
        return unitLightSuddenly.get();
    }

    public void setUnitLightSuddenly(UnitType unitLightSuddenly) {
        this.unitLightSuddenly.set(unitLightSuddenly);
    }

    public boolean getActivePLightSuddenly() {
        return activePLightSuddenly;
    }

    public void setActivePLightSuddenly(boolean activePLightSuddenly) {
        this.activePLightSuddenly = activePLightSuddenly;
    }

    public void setActivePLightSuddenly(String activePLightSuddenly) {
        this.activePLightSuddenly = Boolean.parseBoolean(activePLightSuddenly);
    }

    public boolean getActiveCLightSuddenly() {
        return activeCLightSuddenly;
    }

    public void setActiveCLightSuddenly(boolean activeCLightSuddenly) {
        this.activeCLightSuddenly = activeCLightSuddenly;
    }

    public void setActiveCLightSuddenly(String activeCLightSuddenly) {
        this.activeCLightSuddenly = Boolean.parseBoolean(activeCLightSuddenly);
    }

    public String getQuantityLightSuddenly() {
        return Double.toString(quantityLightSuddenly);
    }

    public void setQuantityLightSuddenly(double quantityLightSuddenly) {
        this.quantityLightSuddenly = quantityLightSuddenly;
    }

    public void setQuantityLightSuddenly(String quantityLightSuddenly) {
        this.quantityLightSuddenly = Double.parseDouble(quantityLightSuddenly);
        CalculatePriceOrderLightSuddenly();
        CalculateCostCPLightSuddenly();
    }

    public String getOrdinalPriceUnitLightSuddenly() {
        return Double.toString(ordinalPriceUnitLightSuddenly);
    }

    public void setOrdinalPriceUnitLightSuddenly(double ordinalPriceUnitLightSuddenly) {
        this.ordinalPriceUnitLightSuddenly = ordinalPriceUnitLightSuddenly;
    }

    public void setOrdinalPriceUnitLightSuddenly(String ordinalPriceUnitLightSuddenly) {
        this.ordinalPriceUnitLightSuddenly = Double.parseDouble(ordinalPriceUnitLightSuddenly);
        CalculatePriceOrderLightSuddenly();
    }

    public String getPriceCPUnitLightSuddenly() {
        return Double.toString(priceCPUnitLightSuddenly);
    }

    public void setPriceCPUnitLightSuddenly(double priceCPUnitLightSuddenly) {
        this.priceCPUnitLightSuddenly = priceCPUnitLightSuddenly;
    }

    public void setPriceCPUnitLightSuddenly(String priceCPUnitLightSuddenly) {
        this.priceCPUnitLightSuddenly = Double.parseDouble(priceCPUnitLightSuddenly);
        CalculateСostCPUnitLightSuddenly();
        CalculateCostCPLightSuddenly();
    }

    public String getPriceCPKeyLightSuddenly() {
        return Double.toString(priceCPKeyLightSuddenly);
    }

    public void setPriceCPKeyLightSuddenly(double priceCPKeyLightSuddenly) {
        this.priceCPKeyLightSuddenly = priceCPKeyLightSuddenly;
    }

    public void setPriceCPKeyLightSuddenly(String priceCPKeyLightSuddenly) {
        this.priceCPKeyLightSuddenly = Double.parseDouble(priceCPKeyLightSuddenly);
        CalculateСostCPUnitLightSuddenly();
        CalculateCostCPLightSuddenly();
    }

    public String getCostCPUnitLightSuddenly() {
        return Double.toString(costCPUnitLightSuddenly);
    }

    public void setCostCPUnitLightSuddenly(double costCPUnitLightSuddenly) {
        this.costCPUnitLightSuddenly = costCPUnitLightSuddenly;
    }

    public void setCostCPUnitLightSuddenly(String costCPUnitLightSuddenly) {
        this.costCPUnitLightSuddenly = Double.parseDouble(costCPUnitLightSuddenly);
    }

    public String getPriceOrderLightSuddenly() {
        return Double.toString(priceOrderLightSuddenly);
    }

    public void setPriceOrderLightSuddenly(double priceOrderLightSuddenly) {
        this.priceOrderLightSuddenly = priceOrderLightSuddenly;
    }

    public void setPriceOrderLightSuddenly(String priceOrderLightSuddenly) {
        this.priceOrderLightSuddenly = Double.parseDouble(priceOrderLightSuddenly);
    }

    public String getCostCPLightSuddenly() {
        return Double.toString(costCPLightSuddenly);
    }

    public void setCostCPLightSuddenly(double costCPLightSuddenly) {
        this.costCPLightSuddenly = costCPLightSuddenly;
    }

    public void setCostCPLightSuddenly(String costCPLightSuddenly) {
        this.costCPLightSuddenly = Double.parseDouble(costCPLightSuddenly);
        CalculateActualDifferenceLightSuddenly();
    }


    public TimeProduction getProductionTimeLightSuddenly() {
        return productionTimeLightSuddenly.get();
    }

    public void setProductionTimeLightSuddenly(TimeProduction productionTimeLightSuddenly) {
        this.productionTimeLightSuddenly.set(productionTimeLightSuddenly);
    }

    public String getActualCostLightSuddenly() {
        return Double.toString(actualCostLightSuddenly);
    }

    public void setActualCostLightSuddenly(double actualCostLightSuddenly) {
        this.actualCostLightSuddenly = actualCostLightSuddenly;
    }

    public void setActualCostLightSuddenly(String actualCostLightSuddenly) {
        this.actualCostLightSuddenly = Double.parseDouble(actualCostLightSuddenly);
        CalculateActualDifferenceLightSuddenly();
        CalculateResidueLightSuddenly();

    }

    public String getActualDifferenceLightSuddenly() {
        return Double.toString(actualDifferenceLightSuddenly);
    }

    public void setActualDifferenceLightSuddenly(double actualDifferenceLightSuddenly) {
        this.actualDifferenceLightSuddenly = actualDifferenceLightSuddenly;
    }

    public void setActualDifferenceLightSuddenly(String actualDifferenceLightSuddenly) {
        this.actualDifferenceLightSuddenly = Double.parseDouble(actualDifferenceLightSuddenly);
    }

    public String getPaidLightSuddenly() {
        return Double.toString(paidLightSuddenly);
    }

    public void setPaidLightSuddenly(double paidLightSuddenly) {
        this.paidLightSuddenly = paidLightSuddenly;
    }

    public void setPaidLightSuddenly(String paidLightSuddenly) {
        this.paidLightSuddenly = Double.parseDouble(paidLightSuddenly);
        CalculateResidueLightSuddenly();
    }

    public String getResidueLightSuddenly() {
        return Double.toString(residueLightSuddenly);
    }

    public void setResidueLightSuddenly(double residueLightSuddenly) {
        this.residueLightSuddenly = residueLightSuddenly;
    }

    public void setResidueLightSuddenly(String residueLightSuddenly) {
        this.residueLightSuddenly = Double.parseDouble(residueLightSuddenly);
    }

    public Date getDateOfDeliveryLightSuddenly() {
        return dateOfDeliveryLightSuddenly.get();
    }

    public void setDateOfDeliveryLightSuddenly(Date dateOfDeliveryLightSuddenly) {
        this.dateOfDeliveryLightSuddenly.set(dateOfDeliveryLightSuddenly);
    }


    public String getNameRoomLightSuddenly() {
        return nameRoomLightSuddenly;
    }

    public void setNameRoomLightSuddenly(String nameRoomLightSuddenly) {
        this.nameRoomLightSuddenly = nameRoomLightSuddenly;
    }

    public String getPlannedCPLightSuddenly() {
        return plannedCPLightSuddenly;
    }

    public void setPlannedCPLightSuddenly(String plannedCPLightSuddenly) {
        this.plannedCPLightSuddenly = plannedCPLightSuddenly;
    }

    public String getActualCPLightSuddenly() {
        return actualCPLightSuddenly;
    }

    public void setActualCPLightSuddenly(String actualCPLightSuddenly) {
        this.actualCPLightSuddenly = actualCPLightSuddenly;
    }

    public String getAccountLightSuddenly() {
        return accountLightSuddenly;
    }

    public void setAccountLightSuddenly(String accountLightSuddenly) {
        this.accountLightSuddenly = accountLightSuddenly;
    }

    public String getContactsLightSuddenly() {
        return contactsLightSuddenly;
    }

    public void setContactsLightSuddenly(String contactsLightSuddenly) {
        this.contactsLightSuddenly = contactsLightSuddenly;
    }

    public String getNotesLightSuddenly() {
        return notesLightSuddenly;
    }

    public void setNotesLightSuddenly(String notesLightSuddenly) {
        this.notesLightSuddenly = notesLightSuddenly;
    }

    public String getCharacteristicsLightSuddenly() {
        return characteristicsLightSuddenly;
    }

    public void setCharacteristicsLightSuddenly(String characteristicsLightSuddenly) {
        this.characteristicsLightSuddenly = characteristicsLightSuddenly;
    }




    public static class DatePickerCell<S, T> extends TableCell<LightSuddenly, Date> {

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
                ((LightSuddenly)getTableRow().getItem()).setDateOfDeliveryLightSuddenly(cal.getTime());
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
