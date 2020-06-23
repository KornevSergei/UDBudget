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

public class MaterialWall {
    protected String nameMaterialWall;//Наименование
    protected boolean activePMaterialWall;//П
    protected boolean activeCMaterialWall;//С
    protected SimpleObjectProperty<UnitType> unitMaterialWall;//Ед. изм.
    protected double quantityMaterialWall;//Количество
    protected double ordinalPriceUnitMaterialWall;//Цена порядковая за ед.
    protected double priceCPUnitMaterialWall;//Цена по КП за ед.
    protected double priceCPKeyMaterialWall;//Цена по КП под ключ
    protected double costCPUnitMaterialWall;//Стоимость по КП за ед.
    protected double priceOrderMaterialWall;//Порядок цен
    protected double costCPMaterialWall;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeMaterialWall;//Срок доставки
    protected double actualCostMaterialWall;//Стоимость фактическая
    protected double actualDifferenceMaterialWall;//Разница фактическая
    protected double paidMaterialWall;//Оплачено
    protected double residueMaterialWall;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryMaterialWall;//Дата поставки
    protected String nameRoomMaterialWall;//Наименование помещения
    protected String plannedCPMaterialWall;//КП плановое
    protected String actualCPMaterialWall;//КП фактическое
    protected String accountMaterialWall;//счёт
    protected String contactsMaterialWall;//контакты
    protected String notesMaterialWall;//примечания
    protected String characteristicsMaterialWall;//характеристики


    public MaterialWall(String nameMaterialWall, boolean activePMaterialWall, boolean activeCMaterialWall, String unitMaterialWall, double quantityMaterialWall,
                        double ordinalPriceUnitMaterialWall, double priceCPUnitMaterialWall, double priceCPKeyMaterialWall, double costCPUnitMaterialWall,
                        double priceOrderMaterialWall, double costCPMaterialWall, String productionTimeMaterialWall, double actualCostMaterialWall,
                        double actualDifferenceMaterialWall, double paidMaterialWall, double residueMaterialWall, String dateOfDeliveryMaterialWall, String nameRoomMaterialWall,
                        String plannedCPMaterialWall, String actualCPMaterialWall, String accountMaterialWall, String contactsMaterialWall, String notesMaterialWall,
                        String characteristicsMaterialWall) {
        this.nameMaterialWall = nameMaterialWall;
        this.unitMaterialWall = new SimpleObjectProperty<>(UnitType.THING);
        this.activePMaterialWall = activePMaterialWall;
        this.activeCMaterialWall = activeCMaterialWall;
        this.quantityMaterialWall = quantityMaterialWall;
        this.ordinalPriceUnitMaterialWall = ordinalPriceUnitMaterialWall;
        this.priceCPUnitMaterialWall = priceCPUnitMaterialWall;
        this.priceCPKeyMaterialWall = priceCPKeyMaterialWall;
        this.costCPUnitMaterialWall = costCPUnitMaterialWall;
        this.priceOrderMaterialWall = priceOrderMaterialWall;
        this.costCPMaterialWall = costCPMaterialWall;
        this.productionTimeMaterialWall = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostMaterialWall = actualCostMaterialWall;
        this.actualDifferenceMaterialWall = actualDifferenceMaterialWall;
        this.paidMaterialWall = paidMaterialWall;
        this.residueMaterialWall = residueMaterialWall;
        this.dateOfDeliveryMaterialWall = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomMaterialWall = nameRoomMaterialWall;
        this.plannedCPMaterialWall = plannedCPMaterialWall;
        this.actualCPMaterialWall = actualCPMaterialWall;
        this.accountMaterialWall = accountMaterialWall;
        this.contactsMaterialWall = contactsMaterialWall;
        this.notesMaterialWall = notesMaterialWall;
        this.characteristicsMaterialWall = characteristicsMaterialWall;
    }

    public void CalculatePriceOrderMaterialWall() {
        priceOrderMaterialWall = quantityMaterialWall * ordinalPriceUnitMaterialWall;
    }

    public void CalculateСostCPUnitMaterialWall() {
        if (priceCPKeyMaterialWall > 0)
            costCPUnitMaterialWall = priceCPKeyMaterialWall / quantityMaterialWall;
        else costCPUnitMaterialWall = priceCPUnitMaterialWall;
    }

    public void CalculateCostCPMaterialWall() {
        if (priceCPKeyMaterialWall > 0)
            costCPMaterialWall = priceCPKeyMaterialWall;
        else costCPMaterialWall = priceCPUnitMaterialWall * quantityMaterialWall;
    }

    public void CalculateActualDifferenceMaterialWall() {
        actualDifferenceMaterialWall = costCPMaterialWall - actualCostMaterialWall;
    }

    public void CalculateResidueMaterialWall() {
        residueMaterialWall = actualCostMaterialWall - paidMaterialWall;
    }


    public String getNameMaterialWall() {
        return nameMaterialWall;
    }

    public void setNameMaterialWall(String nameMaterialWall) {
        this.nameMaterialWall = nameMaterialWall;
    }


    public UnitType getUnitMaterialWall() {
        return unitMaterialWall.get();
    }

    public void setUnitMaterialWall(UnitType unitMaterialWall) {
        this.unitMaterialWall.set(unitMaterialWall);
    }

    public boolean getActivePMaterialWall() {
        return activePMaterialWall;
    }

    public void setActivePMaterialWall(boolean activePMaterialWall) {
        this.activePMaterialWall = activePMaterialWall;
    }

    public void setActivePMaterialWall(String activePMaterialWall) {
        this.activePMaterialWall = Boolean.parseBoolean(activePMaterialWall);
    }

    public boolean getActiveCMaterialWall() {
        return activeCMaterialWall;
    }

    public void setActiveCMaterialWall(boolean activeCMaterialWall) {
        this.activeCMaterialWall = activeCMaterialWall;
    }

    public void setActiveCMaterialWall(String activeCMaterialWall) {
        this.activeCMaterialWall = Boolean.parseBoolean(activeCMaterialWall);
    }

    public String getQuantityMaterialWall() {
        return Double.toString(quantityMaterialWall);
    }

    public void setQuantityMaterialWall(double quantityMaterialWall) {
        this.quantityMaterialWall = quantityMaterialWall;
    }

    public void setQuantityMaterialWall(String quantityMaterialWall) {
        this.quantityMaterialWall = Double.parseDouble(quantityMaterialWall);
        CalculatePriceOrderMaterialWall();
        CalculateCostCPMaterialWall();
    }

    public String getOrdinalPriceUnitMaterialWall() {
        return Double.toString(ordinalPriceUnitMaterialWall);
    }

    public void setOrdinalPriceUnitMaterialWall(double ordinalPriceUnitMaterialWall) {
        this.ordinalPriceUnitMaterialWall = ordinalPriceUnitMaterialWall;
    }

    public void setOrdinalPriceUnitMaterialWall(String ordinalPriceUnitMaterialWall) {
        this.ordinalPriceUnitMaterialWall = Double.parseDouble(ordinalPriceUnitMaterialWall);
        CalculatePriceOrderMaterialWall();
    }

    public String getPriceCPUnitMaterialWall() {
        return Double.toString(priceCPUnitMaterialWall);
    }

    public void setPriceCPUnitMaterialWall(double priceCPUnitMaterialWall) {
        this.priceCPUnitMaterialWall = priceCPUnitMaterialWall;
    }

    public void setPriceCPUnitMaterialWall(String priceCPUnitMaterialWall) {
        this.priceCPUnitMaterialWall = Double.parseDouble(priceCPUnitMaterialWall);
        CalculateСostCPUnitMaterialWall();
        CalculateCostCPMaterialWall();
    }

    public String getPriceCPKeyMaterialWall() {
        return Double.toString(priceCPKeyMaterialWall);
    }

    public void setPriceCPKeyMaterialWall(double priceCPKeyMaterialWall) {
        this.priceCPKeyMaterialWall = priceCPKeyMaterialWall;
    }

    public void setPriceCPKeyMaterialWall(String priceCPKeyMaterialWall) {
        this.priceCPKeyMaterialWall = Double.parseDouble(priceCPKeyMaterialWall);
        CalculateСostCPUnitMaterialWall();
        CalculateCostCPMaterialWall();
    }

    public String getCostCPUnitMaterialWall() {
        return Double.toString(costCPUnitMaterialWall);
    }

    public void setCostCPUnitMaterialWall(double costCPUnitMaterialWall) {
        this.costCPUnitMaterialWall = costCPUnitMaterialWall;
    }

    public void setCostCPUnitMaterialWall(String costCPUnitMaterialWall) {
        this.costCPUnitMaterialWall = Double.parseDouble(costCPUnitMaterialWall);
    }

    public String getPriceOrderMaterialWall() {
        return Double.toString(priceOrderMaterialWall);
    }

    public void setPriceOrderMaterialWall(double priceOrderMaterialWall) {
        this.priceOrderMaterialWall = priceOrderMaterialWall;
    }

    public void setPriceOrderMaterialWall(String priceOrderMaterialWall) {
        this.priceOrderMaterialWall = Double.parseDouble(priceOrderMaterialWall);
    }

    public String getCostCPMaterialWall() {
        return Double.toString(costCPMaterialWall);
    }

    public void setCostCPMaterialWall(double costCPMaterialWall) {
        this.costCPMaterialWall = costCPMaterialWall;
    }

    public void setCostCPMaterialWall(String costCPMaterialWall) {
        this.costCPMaterialWall = Double.parseDouble(costCPMaterialWall);
        CalculateActualDifferenceMaterialWall();
    }


    public TimeProduction getProductionTimeMaterialWall() {
        return productionTimeMaterialWall.get();
    }

    public void setProductionTimeMaterialWall(TimeProduction productionTimeMaterialWall) {
        this.productionTimeMaterialWall.set(productionTimeMaterialWall);
    }

    public String getActualCostMaterialWall() {
        return Double.toString(actualCostMaterialWall);
    }

    public void setActualCostMaterialWall(double actualCostMaterialWall) {
        this.actualCostMaterialWall = actualCostMaterialWall;
    }

    public void setActualCostMaterialWall(String actualCostMaterialWall) {
        this.actualCostMaterialWall = Double.parseDouble(actualCostMaterialWall);
        CalculateActualDifferenceMaterialWall();
        CalculateResidueMaterialWall();

    }

    public String getActualDifferenceMaterialWall() {
        return Double.toString(actualDifferenceMaterialWall);
    }

    public void setActualDifferenceMaterialWall(double actualDifferenceMaterialWall) {
        this.actualDifferenceMaterialWall = actualDifferenceMaterialWall;
    }

    public void setActualDifferenceMaterialWall(String actualDifferenceMaterialWall) {
        this.actualDifferenceMaterialWall = Double.parseDouble(actualDifferenceMaterialWall);
    }

    public String getPaidMaterialWall() {
        return Double.toString(paidMaterialWall);
    }

    public void setPaidMaterialWall(double paidMaterialWall) {
        this.paidMaterialWall = paidMaterialWall;
    }

    public void setPaidMaterialWall(String paidMaterialWall) {
        this.paidMaterialWall = Double.parseDouble(paidMaterialWall);
        CalculateResidueMaterialWall();
    }

    public String getResidueMaterialWall() {
        return Double.toString(residueMaterialWall);
    }

    public void setResidueMaterialWall(double residueMaterialWall) {
        this.residueMaterialWall = residueMaterialWall;
    }

    public void setResidueMaterialWall(String residueMaterialWall) {
        this.residueMaterialWall = Double.parseDouble(residueMaterialWall);
    }

    public Date getDateOfDeliveryMaterialWall() {
        return dateOfDeliveryMaterialWall.get();
    }

    public void setDateOfDeliveryMaterialWall(Date dateOfDeliveryMaterialWall) {
        this.dateOfDeliveryMaterialWall.set(dateOfDeliveryMaterialWall);
    }


    public String getNameRoomMaterialWall() {
        return nameRoomMaterialWall;
    }

    public void setNameRoomMaterialWall(String nameRoomMaterialWall) {
        this.nameRoomMaterialWall = nameRoomMaterialWall;
    }

    public String getPlannedCPMaterialWall() {
        return plannedCPMaterialWall;
    }

    public void setPlannedCPMaterialWall(String plannedCPMaterialWall) {
        this.plannedCPMaterialWall = plannedCPMaterialWall;
    }

    public String getActualCPMaterialWall() {
        return actualCPMaterialWall;
    }

    public void setActualCPMaterialWall(String actualCPMaterialWall) {
        this.actualCPMaterialWall = actualCPMaterialWall;
    }

    public String getAccountMaterialWall() {
        return accountMaterialWall;
    }

    public void setAccountMaterialWall(String accountMaterialWall) {
        this.accountMaterialWall = accountMaterialWall;
    }

    public String getContactsMaterialWall() {
        return contactsMaterialWall;
    }

    public void setContactsMaterialWall(String contactsMaterialWall) {
        this.contactsMaterialWall = contactsMaterialWall;
    }

    public String getNotesMaterialWall() {
        return notesMaterialWall;
    }

    public void setNotesMaterialWall(String notesMaterialWall) {
        this.notesMaterialWall = notesMaterialWall;
    }

    public String getCharacteristicsMaterialWall() {
        return characteristicsMaterialWall;
    }

    public void setCharacteristicsMaterialWall(String characteristicsMaterialWall) {
        this.characteristicsMaterialWall = characteristicsMaterialWall;
    }




    public static class DatePickerCell<S, T> extends TableCell<MaterialWall, Date> {

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
                ((MaterialWall)getTableRow().getItem()).setDateOfDeliveryMaterialWall(cal.getTime());
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