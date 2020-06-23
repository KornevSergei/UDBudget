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

public class MaterialOther {
    protected String nameMaterialOther;//Наименование
    protected boolean activePMaterialOther;//П
    protected boolean activeCMaterialOther;//С
    protected SimpleObjectProperty<UnitType> unitMaterialOther;//Ед. изм.
    protected double quantityMaterialOther;//Количество
    protected double ordinalPriceUnitMaterialOther;//Цена порядковая за ед.
    protected double priceCPUnitMaterialOther;//Цена по КП за ед.
    protected double priceCPKeyMaterialOther;//Цена по КП под ключ
    protected double costCPUnitMaterialOther;//Стоимость по КП за ед.
    protected double priceOrderMaterialOther;//Порядок цен
    protected double costCPMaterialOther;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeMaterialOther;//Срок доставки
    protected double actualCostMaterialOther;//Стоимость фактическая
    protected double actualDifferenceMaterialOther;//Разница фактическая
    protected double paidMaterialOther;//Оплачено
    protected double residueMaterialOther;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryMaterialOther;//Дата поставки
    protected String nameRoomMaterialOther;//Наименование помещения
    protected String plannedCPMaterialOther;//КП плановое
    protected String actualCPMaterialOther;//КП фактическое
    protected String accountMaterialOther;//счёт
    protected String contactsMaterialOther;//контакты
    protected String notesMaterialOther;//примечания
    protected String characteristicsMaterialOther;//характеристики


    public MaterialOther(String nameMaterialOther, boolean activePMaterialOther, boolean activeCMaterialOther, String unitMaterialOther, double quantityMaterialOther,
                         double ordinalPriceUnitMaterialOther, double priceCPUnitMaterialOther, double priceCPKeyMaterialOther, double costCPUnitMaterialOther,
                         double priceOrderMaterialOther, double costCPMaterialOther, String productionTimeMaterialOther, double actualCostMaterialOther,
                         double actualDifferenceMaterialOther, double paidMaterialOther, double residueMaterialOther, String dateOfDeliveryMaterialOther, String nameRoomMaterialOther,
                         String plannedCPMaterialOther, String actualCPMaterialOther, String accountMaterialOther, String contactsMaterialOther, String notesMaterialOther,
                         String characteristicsMaterialOther) {
        this.nameMaterialOther = nameMaterialOther;
        this.unitMaterialOther = new SimpleObjectProperty<>(UnitType.THING);
        this.activePMaterialOther = activePMaterialOther;
        this.activeCMaterialOther = activeCMaterialOther;
        this.quantityMaterialOther = quantityMaterialOther;
        this.ordinalPriceUnitMaterialOther = ordinalPriceUnitMaterialOther;
        this.priceCPUnitMaterialOther = priceCPUnitMaterialOther;
        this.priceCPKeyMaterialOther = priceCPKeyMaterialOther;
        this.costCPUnitMaterialOther = costCPUnitMaterialOther;
        this.priceOrderMaterialOther = priceOrderMaterialOther;
        this.costCPMaterialOther = costCPMaterialOther;
        this.productionTimeMaterialOther = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostMaterialOther = actualCostMaterialOther;
        this.actualDifferenceMaterialOther = actualDifferenceMaterialOther;
        this.paidMaterialOther = paidMaterialOther;
        this.residueMaterialOther = residueMaterialOther;
        this.dateOfDeliveryMaterialOther = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomMaterialOther = nameRoomMaterialOther;
        this.plannedCPMaterialOther = plannedCPMaterialOther;
        this.actualCPMaterialOther = actualCPMaterialOther;
        this.accountMaterialOther = accountMaterialOther;
        this.contactsMaterialOther = contactsMaterialOther;
        this.notesMaterialOther = notesMaterialOther;
        this.characteristicsMaterialOther = characteristicsMaterialOther;
    }

    public void CalculatePriceOrderMaterialOther() {
        priceOrderMaterialOther = quantityMaterialOther * ordinalPriceUnitMaterialOther;
    }

    public void CalculateСostCPUnitMaterialOther() {
        if (priceCPKeyMaterialOther > 0)
            costCPUnitMaterialOther = priceCPKeyMaterialOther / quantityMaterialOther;
        else costCPUnitMaterialOther = priceCPUnitMaterialOther;
    }

    public void CalculateCostCPMaterialOther() {
        if (priceCPKeyMaterialOther > 0)
            costCPMaterialOther = priceCPKeyMaterialOther;
        else costCPMaterialOther = priceCPUnitMaterialOther * quantityMaterialOther;
    }

    public void CalculateActualDifferenceMaterialOther() {
        actualDifferenceMaterialOther = costCPMaterialOther - actualCostMaterialOther;
    }

    public void CalculateResidueMaterialOther() {
        residueMaterialOther = actualCostMaterialOther - paidMaterialOther;
    }


    public String getNameMaterialOther() {
        return nameMaterialOther;
    }

    public void setNameMaterialOther(String nameMaterialOther) {
        this.nameMaterialOther = nameMaterialOther;
    }


    public UnitType getUnitMaterialOther() {
        return unitMaterialOther.get();
    }

    public void setUnitMaterialOther(UnitType unitMaterialOther) {
        this.unitMaterialOther.set(unitMaterialOther);
    }

    public boolean getActivePMaterialOther() {
        return activePMaterialOther;
    }

    public void setActivePMaterialOther(boolean activePMaterialOther) {
        this.activePMaterialOther = activePMaterialOther;
    }

    public void setActivePMaterialOther(String activePMaterialOther) {
        this.activePMaterialOther = Boolean.parseBoolean(activePMaterialOther);
    }

    public boolean getActiveCMaterialOther() {
        return activeCMaterialOther;
    }

    public void setActiveCMaterialOther(boolean activeCMaterialOther) {
        this.activeCMaterialOther = activeCMaterialOther;
    }

    public void setActiveCMaterialOther(String activeCMaterialOther) {
        this.activeCMaterialOther = Boolean.parseBoolean(activeCMaterialOther);
    }

    public String getQuantityMaterialOther() {
        return Double.toString(quantityMaterialOther);
    }

    public void setQuantityMaterialOther(double quantityMaterialOther) {
        this.quantityMaterialOther = quantityMaterialOther;
    }

    public void setQuantityMaterialOther(String quantityMaterialOther) {
        this.quantityMaterialOther = Double.parseDouble(quantityMaterialOther);
        CalculatePriceOrderMaterialOther();
        CalculateCostCPMaterialOther();
    }

    public String getOrdinalPriceUnitMaterialOther() {
        return Double.toString(ordinalPriceUnitMaterialOther);
    }

    public void setOrdinalPriceUnitMaterialOther(double ordinalPriceUnitMaterialOther) {
        this.ordinalPriceUnitMaterialOther = ordinalPriceUnitMaterialOther;
    }

    public void setOrdinalPriceUnitMaterialOther(String ordinalPriceUnitMaterialOther) {
        this.ordinalPriceUnitMaterialOther = Double.parseDouble(ordinalPriceUnitMaterialOther);
        CalculatePriceOrderMaterialOther();
    }

    public String getPriceCPUnitMaterialOther() {
        return Double.toString(priceCPUnitMaterialOther);
    }

    public void setPriceCPUnitMaterialOther(double priceCPUnitMaterialOther) {
        this.priceCPUnitMaterialOther = priceCPUnitMaterialOther;
    }

    public void setPriceCPUnitMaterialOther(String priceCPUnitMaterialOther) {
        this.priceCPUnitMaterialOther = Double.parseDouble(priceCPUnitMaterialOther);
        CalculateСostCPUnitMaterialOther();
        CalculateCostCPMaterialOther();
    }

    public String getPriceCPKeyMaterialOther() {
        return Double.toString(priceCPKeyMaterialOther);
    }

    public void setPriceCPKeyMaterialOther(double priceCPKeyMaterialOther) {
        this.priceCPKeyMaterialOther = priceCPKeyMaterialOther;
    }

    public void setPriceCPKeyMaterialOther(String priceCPKeyMaterialOther) {
        this.priceCPKeyMaterialOther = Double.parseDouble(priceCPKeyMaterialOther);
        CalculateСostCPUnitMaterialOther();
        CalculateCostCPMaterialOther();
    }

    public String getCostCPUnitMaterialOther() {
        return Double.toString(costCPUnitMaterialOther);
    }

    public void setCostCPUnitMaterialOther(double costCPUnitMaterialOther) {
        this.costCPUnitMaterialOther = costCPUnitMaterialOther;
    }

    public void setCostCPUnitMaterialOther(String costCPUnitMaterialOther) {
        this.costCPUnitMaterialOther = Double.parseDouble(costCPUnitMaterialOther);
    }

    public String getPriceOrderMaterialOther() {
        return Double.toString(priceOrderMaterialOther);
    }

    public void setPriceOrderMaterialOther(double priceOrderMaterialOther) {
        this.priceOrderMaterialOther = priceOrderMaterialOther;
    }

    public void setPriceOrderMaterialOther(String priceOrderMaterialOther) {
        this.priceOrderMaterialOther = Double.parseDouble(priceOrderMaterialOther);
    }

    public String getCostCPMaterialOther() {
        return Double.toString(costCPMaterialOther);
    }

    public void setCostCPMaterialOther(double costCPMaterialOther) {
        this.costCPMaterialOther = costCPMaterialOther;
    }

    public void setCostCPMaterialOther(String costCPMaterialOther) {
        this.costCPMaterialOther = Double.parseDouble(costCPMaterialOther);
        CalculateActualDifferenceMaterialOther();
    }


    public TimeProduction getProductionTimeMaterialOther() {
        return productionTimeMaterialOther.get();
    }

    public void setProductionTimeMaterialOther(TimeProduction productionTimeMaterialOther) {
        this.productionTimeMaterialOther.set(productionTimeMaterialOther);
    }

    public String getActualCostMaterialOther() {
        return Double.toString(actualCostMaterialOther);
    }

    public void setActualCostMaterialOther(double actualCostMaterialOther) {
        this.actualCostMaterialOther = actualCostMaterialOther;
    }

    public void setActualCostMaterialOther(String actualCostMaterialOther) {
        this.actualCostMaterialOther = Double.parseDouble(actualCostMaterialOther);
        CalculateActualDifferenceMaterialOther();
        CalculateResidueMaterialOther();

    }

    public String getActualDifferenceMaterialOther() {
        return Double.toString(actualDifferenceMaterialOther);
    }

    public void setActualDifferenceMaterialOther(double actualDifferenceMaterialOther) {
        this.actualDifferenceMaterialOther = actualDifferenceMaterialOther;
    }

    public void setActualDifferenceMaterialOther(String actualDifferenceMaterialOther) {
        this.actualDifferenceMaterialOther = Double.parseDouble(actualDifferenceMaterialOther);
    }

    public String getPaidMaterialOther() {
        return Double.toString(paidMaterialOther);
    }

    public void setPaidMaterialOther(double paidMaterialOther) {
        this.paidMaterialOther = paidMaterialOther;
    }

    public void setPaidMaterialOther(String paidMaterialOther) {
        this.paidMaterialOther = Double.parseDouble(paidMaterialOther);
        CalculateResidueMaterialOther();
    }

    public String getResidueMaterialOther() {
        return Double.toString(residueMaterialOther);
    }

    public void setResidueMaterialOther(double residueMaterialOther) {
        this.residueMaterialOther = residueMaterialOther;
    }

    public void setResidueMaterialOther(String residueMaterialOther) {
        this.residueMaterialOther = Double.parseDouble(residueMaterialOther);
    }

    public Date getDateOfDeliveryMaterialOther() {
        return dateOfDeliveryMaterialOther.get();
    }

    public void setDateOfDeliveryMaterialOther(Date dateOfDeliveryMaterialOther) {
        this.dateOfDeliveryMaterialOther.set(dateOfDeliveryMaterialOther);
    }


    public String getNameRoomMaterialOther() {
        return nameRoomMaterialOther;
    }

    public void setNameRoomMaterialOther(String nameRoomMaterialOther) {
        this.nameRoomMaterialOther = nameRoomMaterialOther;
    }

    public String getPlannedCPMaterialOther() {
        return plannedCPMaterialOther;
    }

    public void setPlannedCPMaterialOther(String plannedCPMaterialOther) {
        this.plannedCPMaterialOther = plannedCPMaterialOther;
    }

    public String getActualCPMaterialOther() {
        return actualCPMaterialOther;
    }

    public void setActualCPMaterialOther(String actualCPMaterialOther) {
        this.actualCPMaterialOther = actualCPMaterialOther;
    }

    public String getAccountMaterialOther() {
        return accountMaterialOther;
    }

    public void setAccountMaterialOther(String accountMaterialOther) {
        this.accountMaterialOther = accountMaterialOther;
    }

    public String getContactsMaterialOther() {
        return contactsMaterialOther;
    }

    public void setContactsMaterialOther(String contactsMaterialOther) {
        this.contactsMaterialOther = contactsMaterialOther;
    }

    public String getNotesMaterialOther() {
        return notesMaterialOther;
    }

    public void setNotesMaterialOther(String notesMaterialOther) {
        this.notesMaterialOther = notesMaterialOther;
    }

    public String getCharacteristicsMaterialOther() {
        return characteristicsMaterialOther;
    }

    public void setCharacteristicsMaterialOther(String characteristicsMaterialOther) {
        this.characteristicsMaterialOther = characteristicsMaterialOther;
    }




    public static class DatePickerCell<S, T> extends TableCell<MaterialOther, Date> {

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
                ((MaterialOther)getTableRow().getItem()).setDateOfDeliveryMaterialOther(cal.getTime());
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
