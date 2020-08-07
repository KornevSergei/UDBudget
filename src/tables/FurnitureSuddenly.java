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

public class FurnitureSuddenly {
    protected String nameFurnitureSuddenly;//Наименование
    protected boolean activePFurnitureSuddenly;//П
    protected boolean activeCFurnitureSuddenly;//С
    protected SimpleObjectProperty<UnitType> unitFurnitureSuddenly;//Ед. изм.
    protected double quantityFurnitureSuddenly;//Количество
    protected double ordinalPriceUnitFurnitureSuddenly;//Цена порядковая за ед.
    protected double priceCPUnitFurnitureSuddenly;//Цена по КП за ед.
    protected double priceCPKeyFurnitureSuddenly;//Цена по КП под ключ
    protected double costCPUnitFurnitureSuddenly;//Стоимость по КП за ед.
    protected double priceOrderFurnitureSuddenly;//Порядок цен
    protected double costCPFurnitureSuddenly;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeFurnitureSuddenly;//Срок доставки
    protected double actualCostFurnitureSuddenly;//Стоимость фактическая
    protected double actualDifferenceFurnitureSuddenly;//Разница фактическая
    protected double paidFurnitureSuddenly;//Оплачено
    protected double residueFurnitureSuddenly;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryFurnitureSuddenly;//Дата поставки
    protected String nameRoomFurnitureSuddenly;//Наименование помещения
    protected String plannedCPFurnitureSuddenly;//КП плановое
    protected String actualCPFurnitureSuddenly;//КП фактическое
    protected String accountFurnitureSuddenly;//счёт
    protected String contactsFurnitureSuddenly;//контакты
    protected String notesFurnitureSuddenly;//примечания
    protected String characteristicsFurnitureSuddenly;//характеристики


    public FurnitureSuddenly(String nameFurnitureSuddenly, boolean activePFurnitureSuddenly, boolean activeCFurnitureSuddenly, String unitFurnitureSuddenly, double quantityFurnitureSuddenly,
                             double ordinalPriceUnitFurnitureSuddenly, double priceCPUnitFurnitureSuddenly, double priceCPKeyFurnitureSuddenly, double costCPUnitFurnitureSuddenly,
                             double priceOrderFurnitureSuddenly, double costCPFurnitureSuddenly, String productionTimeFurnitureSuddenly, double actualCostFurnitureSuddenly,
                             double actualDifferenceFurnitureSuddenly, double paidFurnitureSuddenly, double residueFurnitureSuddenly, String dateOfDeliveryFurnitureSuddenly, String nameRoomFurnitureSuddenly,
                             String plannedCPFurnitureSuddenly, String actualCPFurnitureSuddenly, String accountFurnitureSuddenly, String contactsFurnitureSuddenly, String notesFurnitureSuddenly,
                             String characteristicsFurnitureSuddenly) {
        this.nameFurnitureSuddenly = nameFurnitureSuddenly;
        this.unitFurnitureSuddenly = new SimpleObjectProperty<>(UnitType.THING);
        this.activePFurnitureSuddenly = activePFurnitureSuddenly;
        this.activeCFurnitureSuddenly = activeCFurnitureSuddenly;
        this.quantityFurnitureSuddenly = quantityFurnitureSuddenly;
        this.ordinalPriceUnitFurnitureSuddenly = ordinalPriceUnitFurnitureSuddenly;
        this.priceCPUnitFurnitureSuddenly = priceCPUnitFurnitureSuddenly;
        this.priceCPKeyFurnitureSuddenly = priceCPKeyFurnitureSuddenly;
        this.costCPUnitFurnitureSuddenly = costCPUnitFurnitureSuddenly;
        this.priceOrderFurnitureSuddenly = priceOrderFurnitureSuddenly;
        this.costCPFurnitureSuddenly = costCPFurnitureSuddenly;
        this.productionTimeFurnitureSuddenly = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostFurnitureSuddenly = actualCostFurnitureSuddenly;
        this.actualDifferenceFurnitureSuddenly = actualDifferenceFurnitureSuddenly;
        this.paidFurnitureSuddenly = paidFurnitureSuddenly;
        this.residueFurnitureSuddenly = residueFurnitureSuddenly;
        this.dateOfDeliveryFurnitureSuddenly = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomFurnitureSuddenly = nameRoomFurnitureSuddenly;
        this.plannedCPFurnitureSuddenly = plannedCPFurnitureSuddenly;
        this.actualCPFurnitureSuddenly = actualCPFurnitureSuddenly;
        this.accountFurnitureSuddenly = accountFurnitureSuddenly;
        this.contactsFurnitureSuddenly = contactsFurnitureSuddenly;
        this.notesFurnitureSuddenly = notesFurnitureSuddenly;
        this.characteristicsFurnitureSuddenly = characteristicsFurnitureSuddenly;
    }

    public void CalculatePriceOrderFurnitureSuddenly() {
        priceOrderFurnitureSuddenly = quantityFurnitureSuddenly * ordinalPriceUnitFurnitureSuddenly;
    }

    public void CalculateСostCPUnitFurnitureSuddenly() {
        if (priceCPKeyFurnitureSuddenly > 0)
            costCPUnitFurnitureSuddenly = priceCPKeyFurnitureSuddenly / quantityFurnitureSuddenly;
        else costCPUnitFurnitureSuddenly = priceCPUnitFurnitureSuddenly;
    }

    public void CalculateCostCPFurnitureSuddenly() {
        if (priceCPKeyFurnitureSuddenly > 0)
            costCPFurnitureSuddenly = priceCPKeyFurnitureSuddenly;
        else costCPFurnitureSuddenly = priceCPUnitFurnitureSuddenly * quantityFurnitureSuddenly;
    }

    public void CalculateActualDifferenceFurnitureSuddenly() {
        actualDifferenceFurnitureSuddenly = costCPFurnitureSuddenly - actualCostFurnitureSuddenly;
    }

    public void CalculateResidueFurnitureSuddenly() {
        residueFurnitureSuddenly = actualCostFurnitureSuddenly - paidFurnitureSuddenly;
    }


    public String getNameFurnitureSuddenly() {
        return nameFurnitureSuddenly;
    }

    public void setNameFurnitureSuddenly(String nameFurnitureSuddenly) {
        this.nameFurnitureSuddenly = nameFurnitureSuddenly;
    }


    public UnitType getUnitFurnitureSuddenly() {
        return unitFurnitureSuddenly.get();
    }

    public void setUnitFurnitureSuddenly(UnitType unitFurnitureSuddenly) {
        this.unitFurnitureSuddenly.set(unitFurnitureSuddenly);
    }

    public boolean getActivePFurnitureSuddenly() {
        return activePFurnitureSuddenly;
    }

    public void setActivePFurnitureSuddenly(boolean activePFurnitureSuddenly) {
        this.activePFurnitureSuddenly = activePFurnitureSuddenly;
    }

    public void setActivePFurnitureSuddenly(String activePFurnitureSuddenly) {
        this.activePFurnitureSuddenly = Boolean.parseBoolean(activePFurnitureSuddenly);
    }

    public boolean getActiveCFurnitureSuddenly() {
        return activeCFurnitureSuddenly;
    }

    public void setActiveCFurnitureSuddenly(boolean activeCFurnitureSuddenly) {
        this.activeCFurnitureSuddenly = activeCFurnitureSuddenly;
    }

    public void setActiveCFurnitureSuddenly(String activeCFurnitureSuddenly) {
        this.activeCFurnitureSuddenly = Boolean.parseBoolean(activeCFurnitureSuddenly);
    }

    public String getQuantityFurnitureSuddenly() {
        return Double.toString(quantityFurnitureSuddenly);
    }

    public void setQuantityFurnitureSuddenly(double quantityFurnitureSuddenly) {
        this.quantityFurnitureSuddenly = quantityFurnitureSuddenly;
    }

    public void setQuantityFurnitureSuddenly(String quantityFurnitureSuddenly) {
        this.quantityFurnitureSuddenly = Double.parseDouble(quantityFurnitureSuddenly);
        CalculatePriceOrderFurnitureSuddenly();
        CalculateCostCPFurnitureSuddenly();
    }

    public String getOrdinalPriceUnitFurnitureSuddenly() {
        return Double.toString(ordinalPriceUnitFurnitureSuddenly);
    }

    public void setOrdinalPriceUnitFurnitureSuddenly(double ordinalPriceUnitFurnitureSuddenly) {
        this.ordinalPriceUnitFurnitureSuddenly = ordinalPriceUnitFurnitureSuddenly;
    }

    public void setOrdinalPriceUnitFurnitureSuddenly(String ordinalPriceUnitFurnitureSuddenly) {
        this.ordinalPriceUnitFurnitureSuddenly = Double.parseDouble(ordinalPriceUnitFurnitureSuddenly);
        CalculatePriceOrderFurnitureSuddenly();
    }

    public String getPriceCPUnitFurnitureSuddenly() {
        return Double.toString(priceCPUnitFurnitureSuddenly);
    }

    public void setPriceCPUnitFurnitureSuddenly(double priceCPUnitFurnitureSuddenly) {
        this.priceCPUnitFurnitureSuddenly = priceCPUnitFurnitureSuddenly;
    }

    public void setPriceCPUnitFurnitureSuddenly(String priceCPUnitFurnitureSuddenly) {
        this.priceCPUnitFurnitureSuddenly = Double.parseDouble(priceCPUnitFurnitureSuddenly);
        CalculateСostCPUnitFurnitureSuddenly();
        CalculateCostCPFurnitureSuddenly();
    }

    public String getPriceCPKeyFurnitureSuddenly() {
        return Double.toString(priceCPKeyFurnitureSuddenly);
    }

    public void setPriceCPKeyFurnitureSuddenly(double priceCPKeyFurnitureSuddenly) {
        this.priceCPKeyFurnitureSuddenly = priceCPKeyFurnitureSuddenly;
    }

    public void setPriceCPKeyFurnitureSuddenly(String priceCPKeyFurnitureSuddenly) {
        this.priceCPKeyFurnitureSuddenly = Double.parseDouble(priceCPKeyFurnitureSuddenly);
        CalculateСostCPUnitFurnitureSuddenly();
        CalculateCostCPFurnitureSuddenly();
    }

    public String getCostCPUnitFurnitureSuddenly() {
        return Double.toString(costCPUnitFurnitureSuddenly);
    }

    public void setCostCPUnitFurnitureSuddenly(double costCPUnitFurnitureSuddenly) {
        this.costCPUnitFurnitureSuddenly = costCPUnitFurnitureSuddenly;
    }

    public void setCostCPUnitFurnitureSuddenly(String costCPUnitFurnitureSuddenly) {
        this.costCPUnitFurnitureSuddenly = Double.parseDouble(costCPUnitFurnitureSuddenly);
    }

    public String getPriceOrderFurnitureSuddenly() {
        return Double.toString(priceOrderFurnitureSuddenly);
    }

    public void setPriceOrderFurnitureSuddenly(double priceOrderFurnitureSuddenly) {
        this.priceOrderFurnitureSuddenly = priceOrderFurnitureSuddenly;
    }

    public void setPriceOrderFurnitureSuddenly(String priceOrderFurnitureSuddenly) {
        this.priceOrderFurnitureSuddenly = Double.parseDouble(priceOrderFurnitureSuddenly);
    }

    public String getCostCPFurnitureSuddenly() {
        return Double.toString(costCPFurnitureSuddenly);
    }

    public void setCostCPFurnitureSuddenly(double costCPFurnitureSuddenly) {
        this.costCPFurnitureSuddenly = costCPFurnitureSuddenly;
    }

    public void setCostCPFurnitureSuddenly(String costCPFurnitureSuddenly) {
        this.costCPFurnitureSuddenly = Double.parseDouble(costCPFurnitureSuddenly);
        CalculateActualDifferenceFurnitureSuddenly();
    }


    public TimeProduction getProductionTimeFurnitureSuddenly() {
        return productionTimeFurnitureSuddenly.get();
    }

    public void setProductionTimeFurnitureSuddenly(TimeProduction productionTimeFurnitureSuddenly) {
        this.productionTimeFurnitureSuddenly.set(productionTimeFurnitureSuddenly);
    }

    public String getActualCostFurnitureSuddenly() {
        return Double.toString(actualCostFurnitureSuddenly);
    }

    public void setActualCostFurnitureSuddenly(double actualCostFurnitureSuddenly) {
        this.actualCostFurnitureSuddenly = actualCostFurnitureSuddenly;
    }

    public void setActualCostFurnitureSuddenly(String actualCostFurnitureSuddenly) {
        this.actualCostFurnitureSuddenly = Double.parseDouble(actualCostFurnitureSuddenly);
        CalculateActualDifferenceFurnitureSuddenly();
        CalculateResidueFurnitureSuddenly();

    }

    public String getActualDifferenceFurnitureSuddenly() {
        return Double.toString(actualDifferenceFurnitureSuddenly);
    }

    public void setActualDifferenceFurnitureSuddenly(double actualDifferenceFurnitureSuddenly) {
        this.actualDifferenceFurnitureSuddenly = actualDifferenceFurnitureSuddenly;
    }

    public void setActualDifferenceFurnitureSuddenly(String actualDifferenceFurnitureSuddenly) {
        this.actualDifferenceFurnitureSuddenly = Double.parseDouble(actualDifferenceFurnitureSuddenly);
    }

    public String getPaidFurnitureSuddenly() {
        return Double.toString(paidFurnitureSuddenly);
    }

    public void setPaidFurnitureSuddenly(double paidFurnitureSuddenly) {
        this.paidFurnitureSuddenly = paidFurnitureSuddenly;
    }

    public void setPaidFurnitureSuddenly(String paidFurnitureSuddenly) {
        this.paidFurnitureSuddenly = Double.parseDouble(paidFurnitureSuddenly);
        CalculateResidueFurnitureSuddenly();
    }

    public String getResidueFurnitureSuddenly() {
        return Double.toString(residueFurnitureSuddenly);
    }

    public void setResidueFurnitureSuddenly(double residueFurnitureSuddenly) {
        this.residueFurnitureSuddenly = residueFurnitureSuddenly;
    }

    public void setResidueFurnitureSuddenly(String residueFurnitureSuddenly) {
        this.residueFurnitureSuddenly = Double.parseDouble(residueFurnitureSuddenly);
    }

    public Date getDateOfDeliveryFurnitureSuddenly() {
        return dateOfDeliveryFurnitureSuddenly.get();
    }

    public void setDateOfDeliveryFurnitureSuddenly(Date dateOfDeliveryFurnitureSuddenly) {
        this.dateOfDeliveryFurnitureSuddenly.set(dateOfDeliveryFurnitureSuddenly);
    }


    public String getNameRoomFurnitureSuddenly() {
        return nameRoomFurnitureSuddenly;
    }

    public void setNameRoomFurnitureSuddenly(String nameRoomFurnitureSuddenly) {
        this.nameRoomFurnitureSuddenly = nameRoomFurnitureSuddenly;
    }

    public String getPlannedCPFurnitureSuddenly() {
        return plannedCPFurnitureSuddenly;
    }

    public void setPlannedCPFurnitureSuddenly(String plannedCPFurnitureSuddenly) {
        this.plannedCPFurnitureSuddenly = plannedCPFurnitureSuddenly;
    }

    public String getActualCPFurnitureSuddenly() {
        return actualCPFurnitureSuddenly;
    }

    public void setActualCPFurnitureSuddenly(String actualCPFurnitureSuddenly) {
        this.actualCPFurnitureSuddenly = actualCPFurnitureSuddenly;
    }

    public String getAccountFurnitureSuddenly() {
        return accountFurnitureSuddenly;
    }

    public void setAccountFurnitureSuddenly(String accountFurnitureSuddenly) {
        this.accountFurnitureSuddenly = accountFurnitureSuddenly;
    }

    public String getContactsFurnitureSuddenly() {
        return contactsFurnitureSuddenly;
    }

    public void setContactsFurnitureSuddenly(String contactsFurnitureSuddenly) {
        this.contactsFurnitureSuddenly = contactsFurnitureSuddenly;
    }

    public String getNotesFurnitureSuddenly() {
        return notesFurnitureSuddenly;
    }

    public void setNotesFurnitureSuddenly(String notesFurnitureSuddenly) {
        this.notesFurnitureSuddenly = notesFurnitureSuddenly;
    }

    public String getCharacteristicsFurnitureSuddenly() {
        return characteristicsFurnitureSuddenly;
    }

    public void setCharacteristicsFurnitureSuddenly(String characteristicsFurnitureSuddenly) {
        this.characteristicsFurnitureSuddenly = characteristicsFurnitureSuddenly;
    }




    public static class DatePickerCell<S, T> extends TableCell<FurnitureSuddenly, Date> {

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
                ((FurnitureSuddenly)getTableRow().getItem()).setDateOfDeliveryFurnitureSuddenly(cal.getTime());
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

