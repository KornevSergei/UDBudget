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

public class MaterialSuddenly {
    protected String nameMaterialSuddenly;//Наименование
    protected boolean activePMaterialSuddenly;//П
    protected boolean activeCMaterialSuddenly;//С
    protected SimpleObjectProperty<UnitType> unitMaterialSuddenly;//Ед. изм.
    protected double quantityMaterialSuddenly;//Количество
    protected double ordinalPriceUnitMaterialSuddenly;//Цена порядковая за ед.
    protected double priceCPUnitMaterialSuddenly;//Цена по КП за ед.
    protected double priceCPKeyMaterialSuddenly;//Цена по КП под ключ
    protected double costCPUnitMaterialSuddenly;//Стоимость по КП за ед.
    protected double priceOrderMaterialSuddenly;//Порядок цен
    protected double costCPMaterialSuddenly;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeMaterialSuddenly;//Срок доставки
    protected double actualCostMaterialSuddenly;//Стоимость фактическая
    protected double actualDifferenceMaterialSuddenly;//Разница фактическая
    protected double paidMaterialSuddenly;//Оплачено
    protected double residueMaterialSuddenly;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryMaterialSuddenly;//Дата поставки
    protected String nameRoomMaterialSuddenly;//Наименование помещения
    protected String plannedCPMaterialSuddenly;//КП плановое
    protected String actualCPMaterialSuddenly;//КП фактическое
    protected String accountMaterialSuddenly;//счёт
    protected String contactsMaterialSuddenly;//контакты
    protected String notesMaterialSuddenly;//примечания
    protected String characteristicsMaterialSuddenly;//характеристики


    public MaterialSuddenly(String nameMaterialSuddenly, boolean activePMaterialSuddenly, boolean activeCMaterialSuddenly, String unitMaterialSuddenly, double quantityMaterialSuddenly,
                            double ordinalPriceUnitMaterialSuddenly, double priceCPUnitMaterialSuddenly, double priceCPKeyMaterialSuddenly, double costCPUnitMaterialSuddenly,
                            double priceOrderMaterialSuddenly, double costCPMaterialSuddenly, String productionTimeMaterialSuddenly, double actualCostMaterialSuddenly,
                            double actualDifferenceMaterialSuddenly, double paidMaterialSuddenly, double residueMaterialSuddenly, String dateOfDeliveryMaterialSuddenly, String nameRoomMaterialSuddenly,
                            String plannedCPMaterialSuddenly, String actualCPMaterialSuddenly, String accountMaterialSuddenly, String contactsMaterialSuddenly, String notesMaterialSuddenly,
                            String characteristicsMaterialSuddenly) {
        this.nameMaterialSuddenly = nameMaterialSuddenly;
        this.unitMaterialSuddenly = new SimpleObjectProperty<>(UnitType.THING);
        this.activePMaterialSuddenly = activePMaterialSuddenly;
        this.activeCMaterialSuddenly = activeCMaterialSuddenly;
        this.quantityMaterialSuddenly = quantityMaterialSuddenly;
        this.ordinalPriceUnitMaterialSuddenly = ordinalPriceUnitMaterialSuddenly;
        this.priceCPUnitMaterialSuddenly = priceCPUnitMaterialSuddenly;
        this.priceCPKeyMaterialSuddenly = priceCPKeyMaterialSuddenly;
        this.costCPUnitMaterialSuddenly = costCPUnitMaterialSuddenly;
        this.priceOrderMaterialSuddenly = priceOrderMaterialSuddenly;
        this.costCPMaterialSuddenly = costCPMaterialSuddenly;
        this.productionTimeMaterialSuddenly = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostMaterialSuddenly = actualCostMaterialSuddenly;
        this.actualDifferenceMaterialSuddenly = actualDifferenceMaterialSuddenly;
        this.paidMaterialSuddenly = paidMaterialSuddenly;
        this.residueMaterialSuddenly = residueMaterialSuddenly;
        this.dateOfDeliveryMaterialSuddenly = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomMaterialSuddenly = nameRoomMaterialSuddenly;
        this.plannedCPMaterialSuddenly = plannedCPMaterialSuddenly;
        this.actualCPMaterialSuddenly = actualCPMaterialSuddenly;
        this.accountMaterialSuddenly = accountMaterialSuddenly;
        this.contactsMaterialSuddenly = contactsMaterialSuddenly;
        this.notesMaterialSuddenly = notesMaterialSuddenly;
        this.characteristicsMaterialSuddenly = characteristicsMaterialSuddenly;
    }

    public void CalculatePriceOrderMaterialSuddenly() {
        priceOrderMaterialSuddenly = quantityMaterialSuddenly * ordinalPriceUnitMaterialSuddenly;
    }

    public void CalculateСostCPUnitMaterialSuddenly() {
        if (priceCPKeyMaterialSuddenly > 0)
            costCPUnitMaterialSuddenly = priceCPKeyMaterialSuddenly / quantityMaterialSuddenly;
        else costCPUnitMaterialSuddenly = priceCPUnitMaterialSuddenly;
    }

    public void CalculateCostCPMaterialSuddenly() {
        if (priceCPKeyMaterialSuddenly > 0)
            costCPMaterialSuddenly = priceCPKeyMaterialSuddenly;
        else costCPMaterialSuddenly = priceCPUnitMaterialSuddenly * quantityMaterialSuddenly;
    }

    public void CalculateActualDifferenceMaterialSuddenly() {
        actualDifferenceMaterialSuddenly = costCPMaterialSuddenly - actualCostMaterialSuddenly;
    }

    public void CalculateResidueMaterialSuddenly() {
        residueMaterialSuddenly = actualCostMaterialSuddenly - paidMaterialSuddenly;
    }


    public String getNameMaterialSuddenly() {
        return nameMaterialSuddenly;
    }

    public void setNameMaterialSuddenly(String nameMaterialSuddenly) {
        this.nameMaterialSuddenly = nameMaterialSuddenly;
    }


    public UnitType getUnitMaterialSuddenly() {
        return unitMaterialSuddenly.get();
    }

    public void setUnitMaterialSuddenly(UnitType unitMaterialSuddenly) {
        this.unitMaterialSuddenly.set(unitMaterialSuddenly);
    }

    public boolean getActivePMaterialSuddenly() {
        return activePMaterialSuddenly;
    }

    public void setActivePMaterialSuddenly(boolean activePMaterialSuddenly) {
        this.activePMaterialSuddenly = activePMaterialSuddenly;
    }

    public void setActivePMaterialSuddenly(String activePMaterialSuddenly) {
        this.activePMaterialSuddenly = Boolean.parseBoolean(activePMaterialSuddenly);
    }

    public boolean getActiveCMaterialSuddenly() {
        return activeCMaterialSuddenly;
    }

    public void setActiveCMaterialSuddenly(boolean activeCMaterialSuddenly) {
        this.activeCMaterialSuddenly = activeCMaterialSuddenly;
    }

    public void setActiveCMaterialSuddenly(String activeCMaterialSuddenly) {
        this.activeCMaterialSuddenly = Boolean.parseBoolean(activeCMaterialSuddenly);
    }

    public String getQuantityMaterialSuddenly() {
        return Double.toString(quantityMaterialSuddenly);
    }

    public void setQuantityMaterialSuddenly(double quantityMaterialSuddenly) {
        this.quantityMaterialSuddenly = quantityMaterialSuddenly;
    }

    public void setQuantityMaterialSuddenly(String quantityMaterialSuddenly) {
        this.quantityMaterialSuddenly = Double.parseDouble(quantityMaterialSuddenly);
        CalculatePriceOrderMaterialSuddenly();
        CalculateCostCPMaterialSuddenly();
    }

    public String getOrdinalPriceUnitMaterialSuddenly() {
        return Double.toString(ordinalPriceUnitMaterialSuddenly);
    }

    public void setOrdinalPriceUnitMaterialSuddenly(double ordinalPriceUnitMaterialSuddenly) {
        this.ordinalPriceUnitMaterialSuddenly = ordinalPriceUnitMaterialSuddenly;
    }

    public void setOrdinalPriceUnitMaterialSuddenly(String ordinalPriceUnitMaterialSuddenly) {
        this.ordinalPriceUnitMaterialSuddenly = Double.parseDouble(ordinalPriceUnitMaterialSuddenly);
        CalculatePriceOrderMaterialSuddenly();
    }

    public String getPriceCPUnitMaterialSuddenly() {
        return Double.toString(priceCPUnitMaterialSuddenly);
    }

    public void setPriceCPUnitMaterialSuddenly(double priceCPUnitMaterialSuddenly) {
        this.priceCPUnitMaterialSuddenly = priceCPUnitMaterialSuddenly;
    }

    public void setPriceCPUnitMaterialSuddenly(String priceCPUnitMaterialSuddenly) {
        this.priceCPUnitMaterialSuddenly = Double.parseDouble(priceCPUnitMaterialSuddenly);
        CalculateСostCPUnitMaterialSuddenly();
        CalculateCostCPMaterialSuddenly();
    }

    public String getPriceCPKeyMaterialSuddenly() {
        return Double.toString(priceCPKeyMaterialSuddenly);
    }

    public void setPriceCPKeyMaterialSuddenly(double priceCPKeyMaterialSuddenly) {
        this.priceCPKeyMaterialSuddenly = priceCPKeyMaterialSuddenly;
    }

    public void setPriceCPKeyMaterialSuddenly(String priceCPKeyMaterialSuddenly) {
        this.priceCPKeyMaterialSuddenly = Double.parseDouble(priceCPKeyMaterialSuddenly);
        CalculateСostCPUnitMaterialSuddenly();
        CalculateCostCPMaterialSuddenly();
    }

    public String getCostCPUnitMaterialSuddenly() {
        return Double.toString(costCPUnitMaterialSuddenly);
    }

    public void setCostCPUnitMaterialSuddenly(double costCPUnitMaterialSuddenly) {
        this.costCPUnitMaterialSuddenly = costCPUnitMaterialSuddenly;
    }

    public void setCostCPUnitMaterialSuddenly(String costCPUnitMaterialSuddenly) {
        this.costCPUnitMaterialSuddenly = Double.parseDouble(costCPUnitMaterialSuddenly);
    }

    public String getPriceOrderMaterialSuddenly() {
        return Double.toString(priceOrderMaterialSuddenly);
    }

    public void setPriceOrderMaterialSuddenly(double priceOrderMaterialSuddenly) {
        this.priceOrderMaterialSuddenly = priceOrderMaterialSuddenly;
    }

    public void setPriceOrderMaterialSuddenly(String priceOrderMaterialSuddenly) {
        this.priceOrderMaterialSuddenly = Double.parseDouble(priceOrderMaterialSuddenly);
    }

    public String getCostCPMaterialSuddenly() {
        return Double.toString(costCPMaterialSuddenly);
    }

    public void setCostCPMaterialSuddenly(double costCPMaterialSuddenly) {
        this.costCPMaterialSuddenly = costCPMaterialSuddenly;
    }

    public void setCostCPMaterialSuddenly(String costCPMaterialSuddenly) {
        this.costCPMaterialSuddenly = Double.parseDouble(costCPMaterialSuddenly);
        CalculateActualDifferenceMaterialSuddenly();
    }


    public TimeProduction getProductionTimeMaterialSuddenly() {
        return productionTimeMaterialSuddenly.get();
    }

    public void setProductionTimeMaterialSuddenly(TimeProduction productionTimeMaterialSuddenly) {
        this.productionTimeMaterialSuddenly.set(productionTimeMaterialSuddenly);
    }

    public String getActualCostMaterialSuddenly() {
        return Double.toString(actualCostMaterialSuddenly);
    }

    public void setActualCostMaterialSuddenly(double actualCostMaterialSuddenly) {
        this.actualCostMaterialSuddenly = actualCostMaterialSuddenly;
    }

    public void setActualCostMaterialSuddenly(String actualCostMaterialSuddenly) {
        this.actualCostMaterialSuddenly = Double.parseDouble(actualCostMaterialSuddenly);
        CalculateActualDifferenceMaterialSuddenly();
        CalculateResidueMaterialSuddenly();

    }

    public String getActualDifferenceMaterialSuddenly() {
        return Double.toString(actualDifferenceMaterialSuddenly);
    }

    public void setActualDifferenceMaterialSuddenly(double actualDifferenceMaterialSuddenly) {
        this.actualDifferenceMaterialSuddenly = actualDifferenceMaterialSuddenly;
    }

    public void setActualDifferenceMaterialSuddenly(String actualDifferenceMaterialSuddenly) {
        this.actualDifferenceMaterialSuddenly = Double.parseDouble(actualDifferenceMaterialSuddenly);
    }

    public String getPaidMaterialSuddenly() {
        return Double.toString(paidMaterialSuddenly);
    }

    public void setPaidMaterialSuddenly(double paidMaterialSuddenly) {
        this.paidMaterialSuddenly = paidMaterialSuddenly;
    }

    public void setPaidMaterialSuddenly(String paidMaterialSuddenly) {
        this.paidMaterialSuddenly = Double.parseDouble(paidMaterialSuddenly);
        CalculateResidueMaterialSuddenly();
    }

    public String getResidueMaterialSuddenly() {
        return Double.toString(residueMaterialSuddenly);
    }

    public void setResidueMaterialSuddenly(double residueMaterialSuddenly) {
        this.residueMaterialSuddenly = residueMaterialSuddenly;
    }

    public void setResidueMaterialSuddenly(String residueMaterialSuddenly) {
        this.residueMaterialSuddenly = Double.parseDouble(residueMaterialSuddenly);
    }

    public Date getDateOfDeliveryMaterialSuddenly() {
        return dateOfDeliveryMaterialSuddenly.get();
    }

    public void setDateOfDeliveryMaterialSuddenly(Date dateOfDeliveryMaterialSuddenly) {
        this.dateOfDeliveryMaterialSuddenly.set(dateOfDeliveryMaterialSuddenly);
    }


    public String getNameRoomMaterialSuddenly() {
        return nameRoomMaterialSuddenly;
    }

    public void setNameRoomMaterialSuddenly(String nameRoomMaterialSuddenly) {
        this.nameRoomMaterialSuddenly = nameRoomMaterialSuddenly;
    }

    public String getPlannedCPMaterialSuddenly() {
        return plannedCPMaterialSuddenly;
    }

    public void setPlannedCPMaterialSuddenly(String plannedCPMaterialSuddenly) {
        this.plannedCPMaterialSuddenly = plannedCPMaterialSuddenly;
    }

    public String getActualCPMaterialSuddenly() {
        return actualCPMaterialSuddenly;
    }

    public void setActualCPMaterialSuddenly(String actualCPMaterialSuddenly) {
        this.actualCPMaterialSuddenly = actualCPMaterialSuddenly;
    }

    public String getAccountMaterialSuddenly() {
        return accountMaterialSuddenly;
    }

    public void setAccountMaterialSuddenly(String accountMaterialSuddenly) {
        this.accountMaterialSuddenly = accountMaterialSuddenly;
    }

    public String getContactsMaterialSuddenly() {
        return contactsMaterialSuddenly;
    }

    public void setContactsMaterialSuddenly(String contactsMaterialSuddenly) {
        this.contactsMaterialSuddenly = contactsMaterialSuddenly;
    }

    public String getNotesMaterialSuddenly() {
        return notesMaterialSuddenly;
    }

    public void setNotesMaterialSuddenly(String notesMaterialSuddenly) {
        this.notesMaterialSuddenly = notesMaterialSuddenly;
    }

    public String getCharacteristicsMaterialSuddenly() {
        return characteristicsMaterialSuddenly;
    }

    public void setCharacteristicsMaterialSuddenly(String characteristicsMaterialSuddenly) {
        this.characteristicsMaterialSuddenly = characteristicsMaterialSuddenly;
    }




    public static class DatePickerCell<S, T> extends TableCell<MaterialSuddenly, Date> {

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
                ((MaterialSuddenly)getTableRow().getItem()).setDateOfDeliveryMaterialSuddenly(cal.getTime());
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
