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

public class MaterialCeiling {
    protected String nameMaterialCeiling;//Наименование
    protected boolean activePMaterialCeiling;//П
    protected boolean activeCMaterialCeiling;//С
    protected SimpleObjectProperty<UnitType> unitMaterialCeiling;//Ед. изм.
    protected double quantityMaterialCeiling;//Количество
    protected double ordinalPriceUnitMaterialCeiling;//Цена порядковая за ед.
    protected double priceCPUnitMaterialCeiling;//Цена по КП за ед.
    protected double priceCPKeyMaterialCeiling;//Цена по КП под ключ
    protected double costCPUnitMaterialCeiling;//Стоимость по КП за ед.
    protected double priceOrderMaterialCeiling;//Порядок цен
    protected double costCPMaterialCeiling;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeMaterialCeiling;//Срок доставки
    protected double actualCostMaterialCeiling;//Стоимость фактическая
    protected double actualDifferenceMaterialCeiling;//Разница фактическая
    protected double paidMaterialCeiling;//Оплачено
    protected double residueMaterialCeiling;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryMaterialCeiling;//Дата поставки
    protected String nameRoomMaterialCeiling;//Наименование помещения
    protected String plannedCPMaterialCeiling;//КП плановое
    protected String actualCPMaterialCeiling;//КП фактическое
    protected String accountMaterialCeiling;//счёт
    protected String contactsMaterialCeiling;//контакты
    protected String notesMaterialCeiling;//примечания
    protected String characteristicsMaterialCeiling;//характеристики


    public MaterialCeiling(String nameMaterialCeiling, boolean activePMaterialCeiling, boolean activeCMaterialCeiling, String unitMaterialCeiling, double quantityMaterialCeiling,
                           double ordinalPriceUnitMaterialCeiling, double priceCPUnitMaterialCeiling, double priceCPKeyMaterialCeiling, double costCPUnitMaterialCeiling,
                           double priceOrderMaterialCeiling, double costCPMaterialCeiling, String productionTimeMaterialCeiling, double actualCostMaterialCeiling,
                           double actualDifferenceMaterialCeiling, double paidMaterialCeiling, double residueMaterialCeiling, String dateOfDeliveryMaterialCeiling, String nameRoomMaterialCeiling,
                           String plannedCPMaterialCeiling, String actualCPMaterialCeiling, String accountMaterialCeiling, String contactsMaterialCeiling, String notesMaterialCeiling,
                           String characteristicsMaterialCeiling) {
        this.nameMaterialCeiling = nameMaterialCeiling;
        this.unitMaterialCeiling = new SimpleObjectProperty<>(UnitType.THING);
        this.activePMaterialCeiling = activePMaterialCeiling;
        this.activeCMaterialCeiling = activeCMaterialCeiling;
        this.quantityMaterialCeiling = quantityMaterialCeiling;
        this.ordinalPriceUnitMaterialCeiling = ordinalPriceUnitMaterialCeiling;
        this.priceCPUnitMaterialCeiling = priceCPUnitMaterialCeiling;
        this.priceCPKeyMaterialCeiling = priceCPKeyMaterialCeiling;
        this.costCPUnitMaterialCeiling = costCPUnitMaterialCeiling;
        this.priceOrderMaterialCeiling = priceOrderMaterialCeiling;
        this.costCPMaterialCeiling = costCPMaterialCeiling;
        this.productionTimeMaterialCeiling = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostMaterialCeiling = actualCostMaterialCeiling;
        this.actualDifferenceMaterialCeiling = actualDifferenceMaterialCeiling;
        this.paidMaterialCeiling = paidMaterialCeiling;
        this.residueMaterialCeiling = residueMaterialCeiling;
        this.dateOfDeliveryMaterialCeiling = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomMaterialCeiling = nameRoomMaterialCeiling;
        this.plannedCPMaterialCeiling = plannedCPMaterialCeiling;
        this.actualCPMaterialCeiling = actualCPMaterialCeiling;
        this.accountMaterialCeiling = accountMaterialCeiling;
        this.contactsMaterialCeiling = contactsMaterialCeiling;
        this.notesMaterialCeiling = notesMaterialCeiling;
        this.characteristicsMaterialCeiling = characteristicsMaterialCeiling;
    }

    public void CalculatePriceOrderMaterialCeiling() {
        priceOrderMaterialCeiling = quantityMaterialCeiling * ordinalPriceUnitMaterialCeiling;
    }

    public void CalculateСostCPUnitMaterialCeiling() {
        if (priceCPKeyMaterialCeiling > 0)
            costCPUnitMaterialCeiling = priceCPKeyMaterialCeiling / quantityMaterialCeiling;
        else costCPUnitMaterialCeiling = priceCPUnitMaterialCeiling;
    }

    public void CalculateCostCPMaterialCeiling() {
        if (priceCPKeyMaterialCeiling > 0)
            costCPMaterialCeiling = priceCPKeyMaterialCeiling;
        else costCPMaterialCeiling = priceCPUnitMaterialCeiling * quantityMaterialCeiling;
    }

    public void CalculateActualDifferenceMaterialCeiling() {
        actualDifferenceMaterialCeiling = costCPMaterialCeiling - actualCostMaterialCeiling;
    }

    public void CalculateResidueMaterialCeiling() {
        residueMaterialCeiling = actualCostMaterialCeiling - paidMaterialCeiling;
    }


    public String getNameMaterialCeiling() {
        return nameMaterialCeiling;
    }

    public void setNameMaterialCeiling(String nameMaterialCeiling) {
        this.nameMaterialCeiling = nameMaterialCeiling;
    }


    public UnitType getUnitMaterialCeiling() {
        return unitMaterialCeiling.get();
    }

    public void setUnitMaterialCeiling(UnitType unitMaterialCeiling) {
        this.unitMaterialCeiling.set(unitMaterialCeiling);
    }

    public boolean getActivePMaterialCeiling() {
        return activePMaterialCeiling;
    }

    public void setActivePMaterialCeiling(boolean activePMaterialCeiling) {
        this.activePMaterialCeiling = activePMaterialCeiling;
    }

    public void setActivePMaterialCeiling(String activePMaterialCeiling) {
        this.activePMaterialCeiling = Boolean.parseBoolean(activePMaterialCeiling);
    }

    public boolean getActiveCMaterialCeiling() {
        return activeCMaterialCeiling;
    }

    public void setActiveCMaterialCeiling(boolean activeCMaterialCeiling) {
        this.activeCMaterialCeiling = activeCMaterialCeiling;
    }

    public void setActiveCMaterialCeiling(String activeCMaterialCeiling) {
        this.activeCMaterialCeiling = Boolean.parseBoolean(activeCMaterialCeiling);
    }

    public String getQuantityMaterialCeiling() {
        return Double.toString(quantityMaterialCeiling);
    }

    public void setQuantityMaterialCeiling(double quantityMaterialCeiling) {
        this.quantityMaterialCeiling = quantityMaterialCeiling;
    }

    public void setQuantityMaterialCeiling(String quantityMaterialCeiling) {
        this.quantityMaterialCeiling = Double.parseDouble(quantityMaterialCeiling);
        CalculatePriceOrderMaterialCeiling();
        CalculateCostCPMaterialCeiling();
    }

    public String getOrdinalPriceUnitMaterialCeiling() {
        return Double.toString(ordinalPriceUnitMaterialCeiling);
    }

    public void setOrdinalPriceUnitMaterialCeiling(double ordinalPriceUnitMaterialCeiling) {
        this.ordinalPriceUnitMaterialCeiling = ordinalPriceUnitMaterialCeiling;
    }

    public void setOrdinalPriceUnitMaterialCeiling(String ordinalPriceUnitMaterialCeiling) {
        this.ordinalPriceUnitMaterialCeiling = Double.parseDouble(ordinalPriceUnitMaterialCeiling);
        CalculatePriceOrderMaterialCeiling();
    }

    public String getPriceCPUnitMaterialCeiling() {
        return Double.toString(priceCPUnitMaterialCeiling);
    }

    public void setPriceCPUnitMaterialCeiling(double priceCPUnitMaterialCeiling) {
        this.priceCPUnitMaterialCeiling = priceCPUnitMaterialCeiling;
    }

    public void setPriceCPUnitMaterialCeiling(String priceCPUnitMaterialCeiling) {
        this.priceCPUnitMaterialCeiling = Double.parseDouble(priceCPUnitMaterialCeiling);
        CalculateСostCPUnitMaterialCeiling();
        CalculateCostCPMaterialCeiling();
    }

    public String getPriceCPKeyMaterialCeiling() {
        return Double.toString(priceCPKeyMaterialCeiling);
    }

    public void setPriceCPKeyMaterialCeiling(double priceCPKeyMaterialCeiling) {
        this.priceCPKeyMaterialCeiling = priceCPKeyMaterialCeiling;
    }

    public void setPriceCPKeyMaterialCeiling(String priceCPKeyMaterialCeiling) {
        this.priceCPKeyMaterialCeiling = Double.parseDouble(priceCPKeyMaterialCeiling);
        CalculateСostCPUnitMaterialCeiling();
        CalculateCostCPMaterialCeiling();
    }

    public String getCostCPUnitMaterialCeiling() {
        return Double.toString(costCPUnitMaterialCeiling);
    }

    public void setCostCPUnitMaterialCeiling(double costCPUnitMaterialCeiling) {
        this.costCPUnitMaterialCeiling = costCPUnitMaterialCeiling;
    }

    public void setCostCPUnitMaterialCeiling(String costCPUnitMaterialCeiling) {
        this.costCPUnitMaterialCeiling = Double.parseDouble(costCPUnitMaterialCeiling);
    }

    public String getPriceOrderMaterialCeiling() {
        return Double.toString(priceOrderMaterialCeiling);
    }

    public void setPriceOrderMaterialCeiling(double priceOrderMaterialCeiling) {
        this.priceOrderMaterialCeiling = priceOrderMaterialCeiling;
    }

    public void setPriceOrderMaterialCeiling(String priceOrderMaterialCeiling) {
        this.priceOrderMaterialCeiling = Double.parseDouble(priceOrderMaterialCeiling);
    }

    public String getCostCPMaterialCeiling() {
        return Double.toString(costCPMaterialCeiling);
    }

    public void setCostCPMaterialCeiling(double costCPMaterialCeiling) {
        this.costCPMaterialCeiling = costCPMaterialCeiling;
    }

    public void setCostCPMaterialCeiling(String costCPMaterialCeiling) {
        this.costCPMaterialCeiling = Double.parseDouble(costCPMaterialCeiling);
        CalculateActualDifferenceMaterialCeiling();
    }


    public TimeProduction getProductionTimeMaterialCeiling() {
        return productionTimeMaterialCeiling.get();
    }

    public void setProductionTimeMaterialCeiling(TimeProduction productionTimeMaterialCeiling) {
        this.productionTimeMaterialCeiling.set(productionTimeMaterialCeiling);
    }

    public String getActualCostMaterialCeiling() {
        return Double.toString(actualCostMaterialCeiling);
    }

    public void setActualCostMaterialCeiling(double actualCostMaterialCeiling) {
        this.actualCostMaterialCeiling = actualCostMaterialCeiling;
    }

    public void setActualCostMaterialCeiling(String actualCostMaterialCeiling) {
        this.actualCostMaterialCeiling = Double.parseDouble(actualCostMaterialCeiling);
        CalculateActualDifferenceMaterialCeiling();
        CalculateResidueMaterialCeiling();

    }

    public String getActualDifferenceMaterialCeiling() {
        return Double.toString(actualDifferenceMaterialCeiling);
    }

    public void setActualDifferenceMaterialCeiling(double actualDifferenceMaterialCeiling) {
        this.actualDifferenceMaterialCeiling = actualDifferenceMaterialCeiling;
    }

    public void setActualDifferenceMaterialCeiling(String actualDifferenceMaterialCeiling) {
        this.actualDifferenceMaterialCeiling = Double.parseDouble(actualDifferenceMaterialCeiling);
    }

    public String getPaidMaterialCeiling() {
        return Double.toString(paidMaterialCeiling);
    }

    public void setPaidMaterialCeiling(double paidMaterialCeiling) {
        this.paidMaterialCeiling = paidMaterialCeiling;
    }

    public void setPaidMaterialCeiling(String paidMaterialCeiling) {
        this.paidMaterialCeiling = Double.parseDouble(paidMaterialCeiling);
        CalculateResidueMaterialCeiling();
    }

    public String getResidueMaterialCeiling() {
        return Double.toString(residueMaterialCeiling);
    }

    public void setResidueMaterialCeiling(double residueMaterialCeiling) {
        this.residueMaterialCeiling = residueMaterialCeiling;
    }

    public void setResidueMaterialCeiling(String residueMaterialCeiling) {
        this.residueMaterialCeiling = Double.parseDouble(residueMaterialCeiling);
    }

    public Date getDateOfDeliveryMaterialCeiling() {
        return dateOfDeliveryMaterialCeiling.get();
    }

    public void setDateOfDeliveryMaterialCeiling(Date dateOfDeliveryMaterialCeiling) {
        this.dateOfDeliveryMaterialCeiling.set(dateOfDeliveryMaterialCeiling);
    }


    public String getNameRoomMaterialCeiling() {
        return nameRoomMaterialCeiling;
    }

    public void setNameRoomMaterialCeiling(String nameRoomMaterialCeiling) {
        this.nameRoomMaterialCeiling = nameRoomMaterialCeiling;
    }

    public String getPlannedCPMaterialCeiling() {
        return plannedCPMaterialCeiling;
    }

    public void setPlannedCPMaterialCeiling(String plannedCPMaterialCeiling) {
        this.plannedCPMaterialCeiling = plannedCPMaterialCeiling;
    }

    public String getActualCPMaterialCeiling() {
        return actualCPMaterialCeiling;
    }

    public void setActualCPMaterialCeiling(String actualCPMaterialCeiling) {
        this.actualCPMaterialCeiling = actualCPMaterialCeiling;
    }

    public String getAccountMaterialCeiling() {
        return accountMaterialCeiling;
    }

    public void setAccountMaterialCeiling(String accountMaterialCeiling) {
        this.accountMaterialCeiling = accountMaterialCeiling;
    }

    public String getContactsMaterialCeiling() {
        return contactsMaterialCeiling;
    }

    public void setContactsMaterialCeiling(String contactsMaterialCeiling) {
        this.contactsMaterialCeiling = contactsMaterialCeiling;
    }

    public String getNotesMaterialCeiling() {
        return notesMaterialCeiling;
    }

    public void setNotesMaterialCeiling(String notesMaterialCeiling) {
        this.notesMaterialCeiling = notesMaterialCeiling;
    }

    public String getCharacteristicsMaterialCeiling() {
        return characteristicsMaterialCeiling;
    }

    public void setCharacteristicsMaterialCeiling(String characteristicsMaterialCeiling) {
        this.characteristicsMaterialCeiling = characteristicsMaterialCeiling;
    }




    public static class DatePickerCell<S, T> extends TableCell<MaterialCeiling, Date> {

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
                ((MaterialCeiling)getTableRow().getItem()).setDateOfDeliveryMaterialCeiling(cal.getTime());
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

