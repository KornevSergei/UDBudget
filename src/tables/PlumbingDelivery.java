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

public class PlumbingDelivery {
    protected String namePlumbingDelivery;//Наименование
    protected boolean activePPlumbingDelivery;//П
    protected boolean activeCPlumbingDelivery;//С
    protected SimpleObjectProperty<UnitType> unitPlumbingDelivery;//Ед. изм.
    protected double quantityPlumbingDelivery;//Количество
    protected double ordinalPriceUnitPlumbingDelivery;//Цена порядковая за ед.
    protected double priceCPUnitPlumbingDelivery;//Цена по КП за ед.
    protected double priceCPKeyPlumbingDelivery;//Цена по КП под ключ
    protected double costCPUnitPlumbingDelivery;//Стоимость по КП за ед.
    protected double priceOrderPlumbingDelivery;//Порядок цен
    protected double costCPPlumbingDelivery;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimePlumbingDelivery;//Срок доставки
    protected double actualCostPlumbingDelivery;//Стоимость фактическая
    protected double actualDifferencePlumbingDelivery;//Разница фактическая
    protected double paidPlumbingDelivery;//Оплачено
    protected double residuePlumbingDelivery;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryPlumbingDelivery;//Дата поставки
    protected String nameRoomPlumbingDelivery;//Наименование помещения
    protected String plannedCPPlumbingDelivery;//КП плановое
    protected String actualCPPlumbingDelivery;//КП фактическое
    protected String accountPlumbingDelivery;//счёт
    protected String contactsPlumbingDelivery;//контакты
    protected String notesPlumbingDelivery;//примечания
    protected String characteristicsPlumbingDelivery;//характеристики


    public PlumbingDelivery(String namePlumbingDelivery, boolean activePPlumbingDelivery, boolean activeCPlumbingDelivery, String unitPlumbingDelivery, double quantityPlumbingDelivery,
                            double ordinalPriceUnitPlumbingDelivery, double priceCPUnitPlumbingDelivery, double priceCPKeyPlumbingDelivery, double costCPUnitPlumbingDelivery,
                            double priceOrderPlumbingDelivery, double costCPPlumbingDelivery, String productionTimePlumbingDelivery, double actualCostPlumbingDelivery,
                            double actualDifferencePlumbingDelivery, double paidPlumbingDelivery, double residuePlumbingDelivery, String dateOfDeliveryPlumbingDelivery, String nameRoomPlumbingDelivery,
                            String plannedCPPlumbingDelivery, String actualCPPlumbingDelivery, String accountPlumbingDelivery, String contactsPlumbingDelivery, String notesPlumbingDelivery,
                            String characteristicsPlumbingDelivery) {
        this.namePlumbingDelivery = namePlumbingDelivery;
        this.unitPlumbingDelivery = new SimpleObjectProperty<>(UnitType.THING);
        this.activePPlumbingDelivery = activePPlumbingDelivery;
        this.activeCPlumbingDelivery = activeCPlumbingDelivery;
        this.quantityPlumbingDelivery = quantityPlumbingDelivery;
        this.ordinalPriceUnitPlumbingDelivery = ordinalPriceUnitPlumbingDelivery;
        this.priceCPUnitPlumbingDelivery = priceCPUnitPlumbingDelivery;
        this.priceCPKeyPlumbingDelivery = priceCPKeyPlumbingDelivery;
        this.costCPUnitPlumbingDelivery = costCPUnitPlumbingDelivery;
        this.priceOrderPlumbingDelivery = priceOrderPlumbingDelivery;
        this.costCPPlumbingDelivery = costCPPlumbingDelivery;
        this.productionTimePlumbingDelivery = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostPlumbingDelivery = actualCostPlumbingDelivery;
        this.actualDifferencePlumbingDelivery = actualDifferencePlumbingDelivery;
        this.paidPlumbingDelivery = paidPlumbingDelivery;
        this.residuePlumbingDelivery = residuePlumbingDelivery;
        this.dateOfDeliveryPlumbingDelivery = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomPlumbingDelivery = nameRoomPlumbingDelivery;
        this.plannedCPPlumbingDelivery = plannedCPPlumbingDelivery;
        this.actualCPPlumbingDelivery = actualCPPlumbingDelivery;
        this.accountPlumbingDelivery = accountPlumbingDelivery;
        this.contactsPlumbingDelivery = contactsPlumbingDelivery;
        this.notesPlumbingDelivery = notesPlumbingDelivery;
        this.characteristicsPlumbingDelivery = characteristicsPlumbingDelivery;
    }

    public void CalculatePriceOrderPlumbingDelivery() {
        priceOrderPlumbingDelivery = quantityPlumbingDelivery * ordinalPriceUnitPlumbingDelivery;
    }

    public void CalculateСostCPUnitPlumbingDelivery() {
        if (priceCPKeyPlumbingDelivery > 0)
            costCPUnitPlumbingDelivery = priceCPKeyPlumbingDelivery / quantityPlumbingDelivery;
        else costCPUnitPlumbingDelivery = priceCPUnitPlumbingDelivery;
    }

    public void CalculateCostCPPlumbingDelivery() {
        if (priceCPKeyPlumbingDelivery > 0)
            costCPPlumbingDelivery = priceCPKeyPlumbingDelivery;
        else costCPPlumbingDelivery = priceCPUnitPlumbingDelivery * quantityPlumbingDelivery;
    }

    public void CalculateActualDifferencePlumbingDelivery() {
        actualDifferencePlumbingDelivery = costCPPlumbingDelivery - actualCostPlumbingDelivery;
    }

    public void CalculateResiduePlumbingDelivery() {
        residuePlumbingDelivery = actualCostPlumbingDelivery - paidPlumbingDelivery;
    }


    public String getNamePlumbingDelivery() {
        return namePlumbingDelivery;
    }

    public void setNamePlumbingDelivery(String namePlumbingDelivery) {
        this.namePlumbingDelivery = namePlumbingDelivery;
    }


    public UnitType getUnitPlumbingDelivery() {
        return unitPlumbingDelivery.get();
    }

    public void setUnitPlumbingDelivery(UnitType unitPlumbingDelivery) {
        this.unitPlumbingDelivery.set(unitPlumbingDelivery);
    }

    public boolean getActivePPlumbingDelivery() {
        return activePPlumbingDelivery;
    }

    public void setActivePPlumbingDelivery(boolean activePPlumbingDelivery) {
        this.activePPlumbingDelivery = activePPlumbingDelivery;
    }

    public void setActivePPlumbingDelivery(String activePPlumbingDelivery) {
        this.activePPlumbingDelivery = Boolean.parseBoolean(activePPlumbingDelivery);
    }

    public boolean getActiveCPlumbingDelivery() {
        return activeCPlumbingDelivery;
    }

    public void setActiveCPlumbingDelivery(boolean activeCPlumbingDelivery) {
        this.activeCPlumbingDelivery = activeCPlumbingDelivery;
    }

    public void setActiveCPlumbingDelivery(String activeCPlumbingDelivery) {
        this.activeCPlumbingDelivery = Boolean.parseBoolean(activeCPlumbingDelivery);
    }

    public String getQuantityPlumbingDelivery() {
        return Double.toString(quantityPlumbingDelivery);
    }

    public void setQuantityPlumbingDelivery(double quantityPlumbingDelivery) {
        this.quantityPlumbingDelivery = quantityPlumbingDelivery;
    }

    public void setQuantityPlumbingDelivery(String quantityPlumbingDelivery) {
        this.quantityPlumbingDelivery = Double.parseDouble(quantityPlumbingDelivery);
        CalculatePriceOrderPlumbingDelivery();
        CalculateCostCPPlumbingDelivery();
    }

    public String getOrdinalPriceUnitPlumbingDelivery() {
        return Double.toString(ordinalPriceUnitPlumbingDelivery);
    }

    public void setOrdinalPriceUnitPlumbingDelivery(double ordinalPriceUnitPlumbingDelivery) {
        this.ordinalPriceUnitPlumbingDelivery = ordinalPriceUnitPlumbingDelivery;
    }

    public void setOrdinalPriceUnitPlumbingDelivery(String ordinalPriceUnitPlumbingDelivery) {
        this.ordinalPriceUnitPlumbingDelivery = Double.parseDouble(ordinalPriceUnitPlumbingDelivery);
        CalculatePriceOrderPlumbingDelivery();
    }

    public String getPriceCPUnitPlumbingDelivery() {
        return Double.toString(priceCPUnitPlumbingDelivery);
    }

    public void setPriceCPUnitPlumbingDelivery(double priceCPUnitPlumbingDelivery) {
        this.priceCPUnitPlumbingDelivery = priceCPUnitPlumbingDelivery;
    }

    public void setPriceCPUnitPlumbingDelivery(String priceCPUnitPlumbingDelivery) {
        this.priceCPUnitPlumbingDelivery = Double.parseDouble(priceCPUnitPlumbingDelivery);
        CalculateСostCPUnitPlumbingDelivery();
        CalculateCostCPPlumbingDelivery();
    }

    public String getPriceCPKeyPlumbingDelivery() {
        return Double.toString(priceCPKeyPlumbingDelivery);
    }

    public void setPriceCPKeyPlumbingDelivery(double priceCPKeyPlumbingDelivery) {
        this.priceCPKeyPlumbingDelivery = priceCPKeyPlumbingDelivery;
    }

    public void setPriceCPKeyPlumbingDelivery(String priceCPKeyPlumbingDelivery) {
        this.priceCPKeyPlumbingDelivery = Double.parseDouble(priceCPKeyPlumbingDelivery);
        CalculateСostCPUnitPlumbingDelivery();
        CalculateCostCPPlumbingDelivery();
    }

    public String getCostCPUnitPlumbingDelivery() {
        return Double.toString(costCPUnitPlumbingDelivery);
    }

    public void setCostCPUnitPlumbingDelivery(double costCPUnitPlumbingDelivery) {
        this.costCPUnitPlumbingDelivery = costCPUnitPlumbingDelivery;
    }

    public void setCostCPUnitPlumbingDelivery(String costCPUnitPlumbingDelivery) {
        this.costCPUnitPlumbingDelivery = Double.parseDouble(costCPUnitPlumbingDelivery);
    }

    public String getPriceOrderPlumbingDelivery() {
        return Double.toString(priceOrderPlumbingDelivery);
    }

    public void setPriceOrderPlumbingDelivery(double priceOrderPlumbingDelivery) {
        this.priceOrderPlumbingDelivery = priceOrderPlumbingDelivery;
    }

    public void setPriceOrderPlumbingDelivery(String priceOrderPlumbingDelivery) {
        this.priceOrderPlumbingDelivery = Double.parseDouble(priceOrderPlumbingDelivery);
    }

    public String getCostCPPlumbingDelivery() {
        return Double.toString(costCPPlumbingDelivery);
    }

    public void setCostCPPlumbingDelivery(double costCPPlumbingDelivery) {
        this.costCPPlumbingDelivery = costCPPlumbingDelivery;
    }

    public void setCostCPPlumbingDelivery(String costCPPlumbingDelivery) {
        this.costCPPlumbingDelivery = Double.parseDouble(costCPPlumbingDelivery);
        CalculateActualDifferencePlumbingDelivery();
    }


    public TimeProduction getProductionTimePlumbingDelivery() {
        return productionTimePlumbingDelivery.get();
    }

    public void setProductionTimePlumbingDelivery(TimeProduction productionTimePlumbingDelivery) {
        this.productionTimePlumbingDelivery.set(productionTimePlumbingDelivery);
    }

    public String getActualCostPlumbingDelivery() {
        return Double.toString(actualCostPlumbingDelivery);
    }

    public void setActualCostPlumbingDelivery(double actualCostPlumbingDelivery) {
        this.actualCostPlumbingDelivery = actualCostPlumbingDelivery;
    }

    public void setActualCostPlumbingDelivery(String actualCostPlumbingDelivery) {
        this.actualCostPlumbingDelivery = Double.parseDouble(actualCostPlumbingDelivery);
        CalculateActualDifferencePlumbingDelivery();
        CalculateResiduePlumbingDelivery();

    }

    public String getActualDifferencePlumbingDelivery() {
        return Double.toString(actualDifferencePlumbingDelivery);
    }

    public void setActualDifferencePlumbingDelivery(double actualDifferencePlumbingDelivery) {
        this.actualDifferencePlumbingDelivery = actualDifferencePlumbingDelivery;
    }

    public void setActualDifferencePlumbingDelivery(String actualDifferencePlumbingDelivery) {
        this.actualDifferencePlumbingDelivery = Double.parseDouble(actualDifferencePlumbingDelivery);
    }

    public String getPaidPlumbingDelivery() {
        return Double.toString(paidPlumbingDelivery);
    }

    public void setPaidPlumbingDelivery(double paidPlumbingDelivery) {
        this.paidPlumbingDelivery = paidPlumbingDelivery;
    }

    public void setPaidPlumbingDelivery(String paidPlumbingDelivery) {
        this.paidPlumbingDelivery = Double.parseDouble(paidPlumbingDelivery);
        CalculateResiduePlumbingDelivery();
    }

    public String getResiduePlumbingDelivery() {
        return Double.toString(residuePlumbingDelivery);
    }

    public void setResiduePlumbingDelivery(double residuePlumbingDelivery) {
        this.residuePlumbingDelivery = residuePlumbingDelivery;
    }

    public void setResiduePlumbingDelivery(String residuePlumbingDelivery) {
        this.residuePlumbingDelivery = Double.parseDouble(residuePlumbingDelivery);
    }

    public Date getDateOfDeliveryPlumbingDelivery() {
        return dateOfDeliveryPlumbingDelivery.get();
    }

    public void setDateOfDeliveryPlumbingDelivery(Date dateOfDeliveryPlumbingDelivery) {
        this.dateOfDeliveryPlumbingDelivery.set(dateOfDeliveryPlumbingDelivery);
    }


    public String getNameRoomPlumbingDelivery() {
        return nameRoomPlumbingDelivery;
    }

    public void setNameRoomPlumbingDelivery(String nameRoomPlumbingDelivery) {
        this.nameRoomPlumbingDelivery = nameRoomPlumbingDelivery;
    }

    public String getPlannedCPPlumbingDelivery() {
        return plannedCPPlumbingDelivery;
    }

    public void setPlannedCPPlumbingDelivery(String plannedCPPlumbingDelivery) {
        this.plannedCPPlumbingDelivery = plannedCPPlumbingDelivery;
    }

    public String getActualCPPlumbingDelivery() {
        return actualCPPlumbingDelivery;
    }

    public void setActualCPPlumbingDelivery(String actualCPPlumbingDelivery) {
        this.actualCPPlumbingDelivery = actualCPPlumbingDelivery;
    }

    public String getAccountPlumbingDelivery() {
        return accountPlumbingDelivery;
    }

    public void setAccountPlumbingDelivery(String accountPlumbingDelivery) {
        this.accountPlumbingDelivery = accountPlumbingDelivery;
    }

    public String getContactsPlumbingDelivery() {
        return contactsPlumbingDelivery;
    }

    public void setContactsPlumbingDelivery(String contactsPlumbingDelivery) {
        this.contactsPlumbingDelivery = contactsPlumbingDelivery;
    }

    public String getNotesPlumbingDelivery() {
        return notesPlumbingDelivery;
    }

    public void setNotesPlumbingDelivery(String notesPlumbingDelivery) {
        this.notesPlumbingDelivery = notesPlumbingDelivery;
    }

    public String getCharacteristicsPlumbingDelivery() {
        return characteristicsPlumbingDelivery;
    }

    public void setCharacteristicsPlumbingDelivery(String characteristicsPlumbingDelivery) {
        this.characteristicsPlumbingDelivery = characteristicsPlumbingDelivery;
    }




    public static class DatePickerCell<S, T> extends TableCell<PlumbingDelivery, Date> {

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
                ((PlumbingDelivery)getTableRow().getItem()).setDateOfDeliveryPlumbingDelivery(cal.getTime());
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

