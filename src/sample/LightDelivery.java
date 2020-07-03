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

public class LightDelivery {
    protected String nameLightDelivery;//Наименование
    protected boolean activePLightDelivery;//П
    protected boolean activeCLightDelivery;//С
    protected SimpleObjectProperty<UnitType> unitLightDelivery;//Ед. изм.
    protected double quantityLightDelivery;//Количество
    protected double ordinalPriceUnitLightDelivery;//Цена порядковая за ед.
    protected double priceCPUnitLightDelivery;//Цена по КП за ед.
    protected double priceCPKeyLightDelivery;//Цена по КП под ключ
    protected double costCPUnitLightDelivery;//Стоимость по КП за ед.
    protected double priceOrderLightDelivery;//Порядок цен
    protected double costCPLightDelivery;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeLightDelivery;//Срок доставки
    protected double actualCostLightDelivery;//Стоимость фактическая
    protected double actualDifferenceLightDelivery;//Разница фактическая
    protected double paidLightDelivery;//Оплачено
    protected double residueLightDelivery;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryLightDelivery;//Дата поставки
    protected String nameRoomLightDelivery;//Наименование помещения
    protected String plannedCPLightDelivery;//КП плановое
    protected String actualCPLightDelivery;//КП фактическое
    protected String accountLightDelivery;//счёт
    protected String contactsLightDelivery;//контакты
    protected String notesLightDelivery;//примечания
    protected String characteristicsLightDelivery;//характеристики


    public LightDelivery(String nameLightDelivery, boolean activePLightDelivery, boolean activeCLightDelivery, String unitLightDelivery, double quantityLightDelivery,
                         double ordinalPriceUnitLightDelivery, double priceCPUnitLightDelivery, double priceCPKeyLightDelivery, double costCPUnitLightDelivery,
                         double priceOrderLightDelivery, double costCPLightDelivery, String productionTimeLightDelivery, double actualCostLightDelivery,
                         double actualDifferenceLightDelivery, double paidLightDelivery, double residueLightDelivery, String dateOfDeliveryLightDelivery, String nameRoomLightDelivery,
                         String plannedCPLightDelivery, String actualCPLightDelivery, String accountLightDelivery, String contactsLightDelivery, String notesLightDelivery,
                         String characteristicsLightDelivery) {
        this.nameLightDelivery = nameLightDelivery;
        this.unitLightDelivery = new SimpleObjectProperty<>(UnitType.THING);
        this.activePLightDelivery = activePLightDelivery;
        this.activeCLightDelivery = activeCLightDelivery;
        this.quantityLightDelivery = quantityLightDelivery;
        this.ordinalPriceUnitLightDelivery = ordinalPriceUnitLightDelivery;
        this.priceCPUnitLightDelivery = priceCPUnitLightDelivery;
        this.priceCPKeyLightDelivery = priceCPKeyLightDelivery;
        this.costCPUnitLightDelivery = costCPUnitLightDelivery;
        this.priceOrderLightDelivery = priceOrderLightDelivery;
        this.costCPLightDelivery = costCPLightDelivery;
        this.productionTimeLightDelivery = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostLightDelivery = actualCostLightDelivery;
        this.actualDifferenceLightDelivery = actualDifferenceLightDelivery;
        this.paidLightDelivery = paidLightDelivery;
        this.residueLightDelivery = residueLightDelivery;
        this.dateOfDeliveryLightDelivery = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomLightDelivery = nameRoomLightDelivery;
        this.plannedCPLightDelivery = plannedCPLightDelivery;
        this.actualCPLightDelivery = actualCPLightDelivery;
        this.accountLightDelivery = accountLightDelivery;
        this.contactsLightDelivery = contactsLightDelivery;
        this.notesLightDelivery = notesLightDelivery;
        this.characteristicsLightDelivery = characteristicsLightDelivery;
    }

    public void CalculatePriceOrderLightDelivery() {
        priceOrderLightDelivery = quantityLightDelivery * ordinalPriceUnitLightDelivery;
    }

    public void CalculateСostCPUnitLightDelivery() {
        if (priceCPKeyLightDelivery > 0)
            costCPUnitLightDelivery = priceCPKeyLightDelivery / quantityLightDelivery;
        else costCPUnitLightDelivery = priceCPUnitLightDelivery;
    }

    public void CalculateCostCPLightDelivery() {
        if (priceCPKeyLightDelivery > 0)
            costCPLightDelivery = priceCPKeyLightDelivery;
        else costCPLightDelivery = priceCPUnitLightDelivery * quantityLightDelivery;
    }

    public void CalculateActualDifferenceLightDelivery() {
        actualDifferenceLightDelivery = costCPLightDelivery - actualCostLightDelivery;
    }

    public void CalculateResidueLightDelivery() {
        residueLightDelivery = actualCostLightDelivery - paidLightDelivery;
    }


    public String getNameLightDelivery() {
        return nameLightDelivery;
    }

    public void setNameLightDelivery(String nameLightDelivery) {
        this.nameLightDelivery = nameLightDelivery;
    }


    public UnitType getUnitLightDelivery() {
        return unitLightDelivery.get();
    }

    public void setUnitLightDelivery(UnitType unitLightDelivery) {
        this.unitLightDelivery.set(unitLightDelivery);
    }

    public boolean getActivePLightDelivery() {
        return activePLightDelivery;
    }

    public void setActivePLightDelivery(boolean activePLightDelivery) {
        this.activePLightDelivery = activePLightDelivery;
    }

    public void setActivePLightDelivery(String activePLightDelivery) {
        this.activePLightDelivery = Boolean.parseBoolean(activePLightDelivery);
    }

    public boolean getActiveCLightDelivery() {
        return activeCLightDelivery;
    }

    public void setActiveCLightDelivery(boolean activeCLightDelivery) {
        this.activeCLightDelivery = activeCLightDelivery;
    }

    public void setActiveCLightDelivery(String activeCLightDelivery) {
        this.activeCLightDelivery = Boolean.parseBoolean(activeCLightDelivery);
    }

    public String getQuantityLightDelivery() {
        return Double.toString(quantityLightDelivery);
    }

    public void setQuantityLightDelivery(double quantityLightDelivery) {
        this.quantityLightDelivery = quantityLightDelivery;
    }

    public void setQuantityLightDelivery(String quantityLightDelivery) {
        this.quantityLightDelivery = Double.parseDouble(quantityLightDelivery);
        CalculatePriceOrderLightDelivery();
        CalculateCostCPLightDelivery();
    }

    public String getOrdinalPriceUnitLightDelivery() {
        return Double.toString(ordinalPriceUnitLightDelivery);
    }

    public void setOrdinalPriceUnitLightDelivery(double ordinalPriceUnitLightDelivery) {
        this.ordinalPriceUnitLightDelivery = ordinalPriceUnitLightDelivery;
    }

    public void setOrdinalPriceUnitLightDelivery(String ordinalPriceUnitLightDelivery) {
        this.ordinalPriceUnitLightDelivery = Double.parseDouble(ordinalPriceUnitLightDelivery);
        CalculatePriceOrderLightDelivery();
    }

    public String getPriceCPUnitLightDelivery() {
        return Double.toString(priceCPUnitLightDelivery);
    }

    public void setPriceCPUnitLightDelivery(double priceCPUnitLightDelivery) {
        this.priceCPUnitLightDelivery = priceCPUnitLightDelivery;
    }

    public void setPriceCPUnitLightDelivery(String priceCPUnitLightDelivery) {
        this.priceCPUnitLightDelivery = Double.parseDouble(priceCPUnitLightDelivery);
        CalculateСostCPUnitLightDelivery();
        CalculateCostCPLightDelivery();
    }

    public String getPriceCPKeyLightDelivery() {
        return Double.toString(priceCPKeyLightDelivery);
    }

    public void setPriceCPKeyLightDelivery(double priceCPKeyLightDelivery) {
        this.priceCPKeyLightDelivery = priceCPKeyLightDelivery;
    }

    public void setPriceCPKeyLightDelivery(String priceCPKeyLightDelivery) {
        this.priceCPKeyLightDelivery = Double.parseDouble(priceCPKeyLightDelivery);
        CalculateСostCPUnitLightDelivery();
        CalculateCostCPLightDelivery();
    }

    public String getCostCPUnitLightDelivery() {
        return Double.toString(costCPUnitLightDelivery);
    }

    public void setCostCPUnitLightDelivery(double costCPUnitLightDelivery) {
        this.costCPUnitLightDelivery = costCPUnitLightDelivery;
    }

    public void setCostCPUnitLightDelivery(String costCPUnitLightDelivery) {
        this.costCPUnitLightDelivery = Double.parseDouble(costCPUnitLightDelivery);
    }

    public String getPriceOrderLightDelivery() {
        return Double.toString(priceOrderLightDelivery);
    }

    public void setPriceOrderLightDelivery(double priceOrderLightDelivery) {
        this.priceOrderLightDelivery = priceOrderLightDelivery;
    }

    public void setPriceOrderLightDelivery(String priceOrderLightDelivery) {
        this.priceOrderLightDelivery = Double.parseDouble(priceOrderLightDelivery);
    }

    public String getCostCPLightDelivery() {
        return Double.toString(costCPLightDelivery);
    }

    public void setCostCPLightDelivery(double costCPLightDelivery) {
        this.costCPLightDelivery = costCPLightDelivery;
    }

    public void setCostCPLightDelivery(String costCPLightDelivery) {
        this.costCPLightDelivery = Double.parseDouble(costCPLightDelivery);
        CalculateActualDifferenceLightDelivery();
    }


    public TimeProduction getProductionTimeLightDelivery() {
        return productionTimeLightDelivery.get();
    }

    public void setProductionTimeLightDelivery(TimeProduction productionTimeLightDelivery) {
        this.productionTimeLightDelivery.set(productionTimeLightDelivery);
    }

    public String getActualCostLightDelivery() {
        return Double.toString(actualCostLightDelivery);
    }

    public void setActualCostLightDelivery(double actualCostLightDelivery) {
        this.actualCostLightDelivery = actualCostLightDelivery;
    }

    public void setActualCostLightDelivery(String actualCostLightDelivery) {
        this.actualCostLightDelivery = Double.parseDouble(actualCostLightDelivery);
        CalculateActualDifferenceLightDelivery();
        CalculateResidueLightDelivery();

    }

    public String getActualDifferenceLightDelivery() {
        return Double.toString(actualDifferenceLightDelivery);
    }

    public void setActualDifferenceLightDelivery(double actualDifferenceLightDelivery) {
        this.actualDifferenceLightDelivery = actualDifferenceLightDelivery;
    }

    public void setActualDifferenceLightDelivery(String actualDifferenceLightDelivery) {
        this.actualDifferenceLightDelivery = Double.parseDouble(actualDifferenceLightDelivery);
    }

    public String getPaidLightDelivery() {
        return Double.toString(paidLightDelivery);
    }

    public void setPaidLightDelivery(double paidLightDelivery) {
        this.paidLightDelivery = paidLightDelivery;
    }

    public void setPaidLightDelivery(String paidLightDelivery) {
        this.paidLightDelivery = Double.parseDouble(paidLightDelivery);
        CalculateResidueLightDelivery();
    }

    public String getResidueLightDelivery() {
        return Double.toString(residueLightDelivery);
    }

    public void setResidueLightDelivery(double residueLightDelivery) {
        this.residueLightDelivery = residueLightDelivery;
    }

    public void setResidueLightDelivery(String residueLightDelivery) {
        this.residueLightDelivery = Double.parseDouble(residueLightDelivery);
    }

    public Date getDateOfDeliveryLightDelivery() {
        return dateOfDeliveryLightDelivery.get();
    }

    public void setDateOfDeliveryLightDelivery(Date dateOfDeliveryLightDelivery) {
        this.dateOfDeliveryLightDelivery.set(dateOfDeliveryLightDelivery);
    }


    public String getNameRoomLightDelivery() {
        return nameRoomLightDelivery;
    }

    public void setNameRoomLightDelivery(String nameRoomLightDelivery) {
        this.nameRoomLightDelivery = nameRoomLightDelivery;
    }

    public String getPlannedCPLightDelivery() {
        return plannedCPLightDelivery;
    }

    public void setPlannedCPLightDelivery(String plannedCPLightDelivery) {
        this.plannedCPLightDelivery = plannedCPLightDelivery;
    }

    public String getActualCPLightDelivery() {
        return actualCPLightDelivery;
    }

    public void setActualCPLightDelivery(String actualCPLightDelivery) {
        this.actualCPLightDelivery = actualCPLightDelivery;
    }

    public String getAccountLightDelivery() {
        return accountLightDelivery;
    }

    public void setAccountLightDelivery(String accountLightDelivery) {
        this.accountLightDelivery = accountLightDelivery;
    }

    public String getContactsLightDelivery() {
        return contactsLightDelivery;
    }

    public void setContactsLightDelivery(String contactsLightDelivery) {
        this.contactsLightDelivery = contactsLightDelivery;
    }

    public String getNotesLightDelivery() {
        return notesLightDelivery;
    }

    public void setNotesLightDelivery(String notesLightDelivery) {
        this.notesLightDelivery = notesLightDelivery;
    }

    public String getCharacteristicsLightDelivery() {
        return characteristicsLightDelivery;
    }

    public void setCharacteristicsLightDelivery(String characteristicsLightDelivery) {
        this.characteristicsLightDelivery = characteristicsLightDelivery;
    }




    public static class DatePickerCell<S, T> extends TableCell<LightDelivery, Date> {

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
                ((LightDelivery)getTableRow().getItem()).setDateOfDeliveryLightDelivery(cal.getTime());
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

