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

public class FurnitureDelivery {
    protected String nameFurnitureDelivery;//Наименование
    protected boolean activePFurnitureDelivery;//П
    protected boolean activeCFurnitureDelivery;//С
    protected SimpleObjectProperty<UnitType> unitFurnitureDelivery;//Ед. изм.
    protected double quantityFurnitureDelivery;//Количество
    protected double ordinalPriceUnitFurnitureDelivery;//Цена порядковая за ед.
    protected double priceCPUnitFurnitureDelivery;//Цена по КП за ед.
    protected double priceCPKeyFurnitureDelivery;//Цена по КП под ключ
    protected double costCPUnitFurnitureDelivery;//Стоимость по КП за ед.
    protected double priceOrderFurnitureDelivery;//Порядок цен
    protected double costCPFurnitureDelivery;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeFurnitureDelivery;//Срок доставки
    protected double actualCostFurnitureDelivery;//Стоимость фактическая
    protected double actualDifferenceFurnitureDelivery;//Разница фактическая
    protected double paidFurnitureDelivery;//Оплачено
    protected double residueFurnitureDelivery;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryFurnitureDelivery;//Дата поставки
    protected String nameRoomFurnitureDelivery;//Наименование помещения
    protected String plannedCPFurnitureDelivery;//КП плановое
    protected String actualCPFurnitureDelivery;//КП фактическое
    protected String accountFurnitureDelivery;//счёт
    protected String contactsFurnitureDelivery;//контакты
    protected String notesFurnitureDelivery;//примечания
    protected String characteristicsFurnitureDelivery;//характеристики


    public FurnitureDelivery(String nameFurnitureDelivery, boolean activePFurnitureDelivery, boolean activeCFurnitureDelivery, String unitFurnitureDelivery, double quantityFurnitureDelivery,
                             double ordinalPriceUnitFurnitureDelivery, double priceCPUnitFurnitureDelivery, double priceCPKeyFurnitureDelivery, double costCPUnitFurnitureDelivery,
                             double priceOrderFurnitureDelivery, double costCPFurnitureDelivery, String productionTimeFurnitureDelivery, double actualCostFurnitureDelivery,
                             double actualDifferenceFurnitureDelivery, double paidFurnitureDelivery, double residueFurnitureDelivery, String dateOfDeliveryFurnitureDelivery, String nameRoomFurnitureDelivery,
                             String plannedCPFurnitureDelivery, String actualCPFurnitureDelivery, String accountFurnitureDelivery, String contactsFurnitureDelivery, String notesFurnitureDelivery,
                             String characteristicsFurnitureDelivery) {
        this.nameFurnitureDelivery = nameFurnitureDelivery;
        this.unitFurnitureDelivery = new SimpleObjectProperty<>(UnitType.THING);
        this.activePFurnitureDelivery = activePFurnitureDelivery;
        this.activeCFurnitureDelivery = activeCFurnitureDelivery;
        this.quantityFurnitureDelivery = quantityFurnitureDelivery;
        this.ordinalPriceUnitFurnitureDelivery = ordinalPriceUnitFurnitureDelivery;
        this.priceCPUnitFurnitureDelivery = priceCPUnitFurnitureDelivery;
        this.priceCPKeyFurnitureDelivery = priceCPKeyFurnitureDelivery;
        this.costCPUnitFurnitureDelivery = costCPUnitFurnitureDelivery;
        this.priceOrderFurnitureDelivery = priceOrderFurnitureDelivery;
        this.costCPFurnitureDelivery = costCPFurnitureDelivery;
        this.productionTimeFurnitureDelivery = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostFurnitureDelivery = actualCostFurnitureDelivery;
        this.actualDifferenceFurnitureDelivery = actualDifferenceFurnitureDelivery;
        this.paidFurnitureDelivery = paidFurnitureDelivery;
        this.residueFurnitureDelivery = residueFurnitureDelivery;
        this.dateOfDeliveryFurnitureDelivery = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomFurnitureDelivery = nameRoomFurnitureDelivery;
        this.plannedCPFurnitureDelivery = plannedCPFurnitureDelivery;
        this.actualCPFurnitureDelivery = actualCPFurnitureDelivery;
        this.accountFurnitureDelivery = accountFurnitureDelivery;
        this.contactsFurnitureDelivery = contactsFurnitureDelivery;
        this.notesFurnitureDelivery = notesFurnitureDelivery;
        this.characteristicsFurnitureDelivery = characteristicsFurnitureDelivery;
    }

    public void CalculatePriceOrderFurnitureDelivery() {
        priceOrderFurnitureDelivery = quantityFurnitureDelivery * ordinalPriceUnitFurnitureDelivery;
    }

    public void CalculateСostCPUnitFurnitureDelivery() {
        if (priceCPKeyFurnitureDelivery > 0)
            costCPUnitFurnitureDelivery = priceCPKeyFurnitureDelivery / quantityFurnitureDelivery;
        else costCPUnitFurnitureDelivery = priceCPUnitFurnitureDelivery;
    }

    public void CalculateCostCPFurnitureDelivery() {
        if (priceCPKeyFurnitureDelivery > 0)
            costCPFurnitureDelivery = priceCPKeyFurnitureDelivery;
        else costCPFurnitureDelivery = priceCPUnitFurnitureDelivery * quantityFurnitureDelivery;
    }

    public void CalculateActualDifferenceFurnitureDelivery() {
        actualDifferenceFurnitureDelivery = costCPFurnitureDelivery - actualCostFurnitureDelivery;
    }

    public void CalculateResidueFurnitureDelivery() {
        residueFurnitureDelivery = actualCostFurnitureDelivery - paidFurnitureDelivery;
    }


    public String getNameFurnitureDelivery() {
        return nameFurnitureDelivery;
    }

    public void setNameFurnitureDelivery(String nameFurnitureDelivery) {
        this.nameFurnitureDelivery = nameFurnitureDelivery;
    }


    public UnitType getUnitFurnitureDelivery() {
        return unitFurnitureDelivery.get();
    }

    public void setUnitFurnitureDelivery(UnitType unitFurnitureDelivery) {
        this.unitFurnitureDelivery.set(unitFurnitureDelivery);
    }

    public boolean getActivePFurnitureDelivery() {
        return activePFurnitureDelivery;
    }

    public void setActivePFurnitureDelivery(boolean activePFurnitureDelivery) {
        this.activePFurnitureDelivery = activePFurnitureDelivery;
    }

    public void setActivePFurnitureDelivery(String activePFurnitureDelivery) {
        this.activePFurnitureDelivery = Boolean.parseBoolean(activePFurnitureDelivery);
    }

    public boolean getActiveCFurnitureDelivery() {
        return activeCFurnitureDelivery;
    }

    public void setActiveCFurnitureDelivery(boolean activeCFurnitureDelivery) {
        this.activeCFurnitureDelivery = activeCFurnitureDelivery;
    }

    public void setActiveCFurnitureDelivery(String activeCFurnitureDelivery) {
        this.activeCFurnitureDelivery = Boolean.parseBoolean(activeCFurnitureDelivery);
    }

    public String getQuantityFurnitureDelivery() {
        return Double.toString(quantityFurnitureDelivery);
    }

    public void setQuantityFurnitureDelivery(double quantityFurnitureDelivery) {
        this.quantityFurnitureDelivery = quantityFurnitureDelivery;
    }

    public void setQuantityFurnitureDelivery(String quantityFurnitureDelivery) {
        this.quantityFurnitureDelivery = Double.parseDouble(quantityFurnitureDelivery);
        CalculatePriceOrderFurnitureDelivery();
        CalculateCostCPFurnitureDelivery();
    }

    public String getOrdinalPriceUnitFurnitureDelivery() {
        return Double.toString(ordinalPriceUnitFurnitureDelivery);
    }

    public void setOrdinalPriceUnitFurnitureDelivery(double ordinalPriceUnitFurnitureDelivery) {
        this.ordinalPriceUnitFurnitureDelivery = ordinalPriceUnitFurnitureDelivery;
    }

    public void setOrdinalPriceUnitFurnitureDelivery(String ordinalPriceUnitFurnitureDelivery) {
        this.ordinalPriceUnitFurnitureDelivery = Double.parseDouble(ordinalPriceUnitFurnitureDelivery);
        CalculatePriceOrderFurnitureDelivery();
    }

    public String getPriceCPUnitFurnitureDelivery() {
        return Double.toString(priceCPUnitFurnitureDelivery);
    }

    public void setPriceCPUnitFurnitureDelivery(double priceCPUnitFurnitureDelivery) {
        this.priceCPUnitFurnitureDelivery = priceCPUnitFurnitureDelivery;
    }

    public void setPriceCPUnitFurnitureDelivery(String priceCPUnitFurnitureDelivery) {
        this.priceCPUnitFurnitureDelivery = Double.parseDouble(priceCPUnitFurnitureDelivery);
        CalculateСostCPUnitFurnitureDelivery();
        CalculateCostCPFurnitureDelivery();
    }

    public String getPriceCPKeyFurnitureDelivery() {
        return Double.toString(priceCPKeyFurnitureDelivery);
    }

    public void setPriceCPKeyFurnitureDelivery(double priceCPKeyFurnitureDelivery) {
        this.priceCPKeyFurnitureDelivery = priceCPKeyFurnitureDelivery;
    }

    public void setPriceCPKeyFurnitureDelivery(String priceCPKeyFurnitureDelivery) {
        this.priceCPKeyFurnitureDelivery = Double.parseDouble(priceCPKeyFurnitureDelivery);
        CalculateСostCPUnitFurnitureDelivery();
        CalculateCostCPFurnitureDelivery();
    }

    public String getCostCPUnitFurnitureDelivery() {
        return Double.toString(costCPUnitFurnitureDelivery);
    }

    public void setCostCPUnitFurnitureDelivery(double costCPUnitFurnitureDelivery) {
        this.costCPUnitFurnitureDelivery = costCPUnitFurnitureDelivery;
    }

    public void setCostCPUnitFurnitureDelivery(String costCPUnitFurnitureDelivery) {
        this.costCPUnitFurnitureDelivery = Double.parseDouble(costCPUnitFurnitureDelivery);
    }

    public String getPriceOrderFurnitureDelivery() {
        return Double.toString(priceOrderFurnitureDelivery);
    }

    public void setPriceOrderFurnitureDelivery(double priceOrderFurnitureDelivery) {
        this.priceOrderFurnitureDelivery = priceOrderFurnitureDelivery;
    }

    public void setPriceOrderFurnitureDelivery(String priceOrderFurnitureDelivery) {
        this.priceOrderFurnitureDelivery = Double.parseDouble(priceOrderFurnitureDelivery);
    }

    public String getCostCPFurnitureDelivery() {
        return Double.toString(costCPFurnitureDelivery);
    }

    public void setCostCPFurnitureDelivery(double costCPFurnitureDelivery) {
        this.costCPFurnitureDelivery = costCPFurnitureDelivery;
    }

    public void setCostCPFurnitureDelivery(String costCPFurnitureDelivery) {
        this.costCPFurnitureDelivery = Double.parseDouble(costCPFurnitureDelivery);
        CalculateActualDifferenceFurnitureDelivery();
    }


    public TimeProduction getProductionTimeFurnitureDelivery() {
        return productionTimeFurnitureDelivery.get();
    }

    public void setProductionTimeFurnitureDelivery(TimeProduction productionTimeFurnitureDelivery) {
        this.productionTimeFurnitureDelivery.set(productionTimeFurnitureDelivery);
    }

    public String getActualCostFurnitureDelivery() {
        return Double.toString(actualCostFurnitureDelivery);
    }

    public void setActualCostFurnitureDelivery(double actualCostFurnitureDelivery) {
        this.actualCostFurnitureDelivery = actualCostFurnitureDelivery;
    }

    public void setActualCostFurnitureDelivery(String actualCostFurnitureDelivery) {
        this.actualCostFurnitureDelivery = Double.parseDouble(actualCostFurnitureDelivery);
        CalculateActualDifferenceFurnitureDelivery();
        CalculateResidueFurnitureDelivery();

    }

    public String getActualDifferenceFurnitureDelivery() {
        return Double.toString(actualDifferenceFurnitureDelivery);
    }

    public void setActualDifferenceFurnitureDelivery(double actualDifferenceFurnitureDelivery) {
        this.actualDifferenceFurnitureDelivery = actualDifferenceFurnitureDelivery;
    }

    public void setActualDifferenceFurnitureDelivery(String actualDifferenceFurnitureDelivery) {
        this.actualDifferenceFurnitureDelivery = Double.parseDouble(actualDifferenceFurnitureDelivery);
    }

    public String getPaidFurnitureDelivery() {
        return Double.toString(paidFurnitureDelivery);
    }

    public void setPaidFurnitureDelivery(double paidFurnitureDelivery) {
        this.paidFurnitureDelivery = paidFurnitureDelivery;
    }

    public void setPaidFurnitureDelivery(String paidFurnitureDelivery) {
        this.paidFurnitureDelivery = Double.parseDouble(paidFurnitureDelivery);
        CalculateResidueFurnitureDelivery();
    }

    public String getResidueFurnitureDelivery() {
        return Double.toString(residueFurnitureDelivery);
    }

    public void setResidueFurnitureDelivery(double residueFurnitureDelivery) {
        this.residueFurnitureDelivery = residueFurnitureDelivery;
    }

    public void setResidueFurnitureDelivery(String residueFurnitureDelivery) {
        this.residueFurnitureDelivery = Double.parseDouble(residueFurnitureDelivery);
    }

    public Date getDateOfDeliveryFurnitureDelivery() {
        return dateOfDeliveryFurnitureDelivery.get();
    }

    public void setDateOfDeliveryFurnitureDelivery(Date dateOfDeliveryFurnitureDelivery) {
        this.dateOfDeliveryFurnitureDelivery.set(dateOfDeliveryFurnitureDelivery);
    }


    public String getNameRoomFurnitureDelivery() {
        return nameRoomFurnitureDelivery;
    }

    public void setNameRoomFurnitureDelivery(String nameRoomFurnitureDelivery) {
        this.nameRoomFurnitureDelivery = nameRoomFurnitureDelivery;
    }

    public String getPlannedCPFurnitureDelivery() {
        return plannedCPFurnitureDelivery;
    }

    public void setPlannedCPFurnitureDelivery(String plannedCPFurnitureDelivery) {
        this.plannedCPFurnitureDelivery = plannedCPFurnitureDelivery;
    }

    public String getActualCPFurnitureDelivery() {
        return actualCPFurnitureDelivery;
    }

    public void setActualCPFurnitureDelivery(String actualCPFurnitureDelivery) {
        this.actualCPFurnitureDelivery = actualCPFurnitureDelivery;
    }

    public String getAccountFurnitureDelivery() {
        return accountFurnitureDelivery;
    }

    public void setAccountFurnitureDelivery(String accountFurnitureDelivery) {
        this.accountFurnitureDelivery = accountFurnitureDelivery;
    }

    public String getContactsFurnitureDelivery() {
        return contactsFurnitureDelivery;
    }

    public void setContactsFurnitureDelivery(String contactsFurnitureDelivery) {
        this.contactsFurnitureDelivery = contactsFurnitureDelivery;
    }

    public String getNotesFurnitureDelivery() {
        return notesFurnitureDelivery;
    }

    public void setNotesFurnitureDelivery(String notesFurnitureDelivery) {
        this.notesFurnitureDelivery = notesFurnitureDelivery;
    }

    public String getCharacteristicsFurnitureDelivery() {
        return characteristicsFurnitureDelivery;
    }

    public void setCharacteristicsFurnitureDelivery(String characteristicsFurnitureDelivery) {
        this.characteristicsFurnitureDelivery = characteristicsFurnitureDelivery;
    }




    public static class DatePickerCell<S, T> extends TableCell<FurnitureDelivery, Date> {

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
                ((FurnitureDelivery)getTableRow().getItem()).setDateOfDeliveryFurnitureDelivery(cal.getTime());
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

