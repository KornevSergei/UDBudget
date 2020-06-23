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

public class MaterialFloor {
    protected String nameMaterialFloor;//Наименование
    protected boolean activePMaterialFloor;//П
    protected boolean activeCMaterialFloor;//С
    protected SimpleObjectProperty<UnitType> unitMaterialFloor;//Ед. изм.
    protected double quantityMaterialFloor;//Количество
    protected double ordinalPriceUnitMaterialFloor;//Цена порядковая за ед.
    protected double priceCPUnitMaterialFloor;//Цена по КП за ед.
    protected double priceCPKeyMaterialFloor;//Цена по КП под ключ
    protected double costCPUnitMaterialFloor;//Стоимость по КП за ед.
    protected double priceOrderMaterialFloor;//Порядок цен
    protected double costCPMaterialFloor;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeMaterialFloor;//Срок доставки
    protected double actualCostMaterialFloor;//Стоимость фактическая
    protected double actualDifferenceMaterialFloor;//Разница фактическая
    protected double paidMaterialFloor;//Оплачено
    protected double residueMaterialFloor;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryMaterialFloor;//Дата поставки
    protected String nameRoomMaterialFloor;//Наименование помещения
    protected String plannedCPMaterialFloor;//КП плановое
    protected String actualCPMaterialFloor;//КП фактическое
    protected String accountMaterialFloor;//счёт
    protected String contactsMaterialFloor;//контакты
    protected String notesMaterialFloor;//примечания
    protected String characteristicsMaterialFloor;//характеристики


    public MaterialFloor(String nameMaterialFloor, boolean activePMaterialFloor, boolean activeCMaterialFloor, String unitMaterialFloor, double quantityMaterialFloor,
                         double ordinalPriceUnitMaterialFloor, double priceCPUnitMaterialFloor, double priceCPKeyMaterialFloor, double costCPUnitMaterialFloor,
                         double priceOrderMaterialFloor, double costCPMaterialFloor, String productionTimeMaterialFloor, double actualCostMaterialFloor,
                         double actualDifferenceMaterialFloor, double paidMaterialFloor, double residueMaterialFloor, String dateOfDeliveryMaterialFloor, String nameRoomMaterialFloor,
                         String plannedCPMaterialFloor, String actualCPMaterialFloor, String accountMaterialFloor, String contactsMaterialFloor, String notesMaterialFloor,
                         String characteristicsMaterialFloor) {
        this.nameMaterialFloor = nameMaterialFloor;
        this.unitMaterialFloor = new SimpleObjectProperty<>(UnitType.THING);
        this.activePMaterialFloor = activePMaterialFloor;
        this.activeCMaterialFloor = activeCMaterialFloor;
        this.quantityMaterialFloor = quantityMaterialFloor;
        this.ordinalPriceUnitMaterialFloor = ordinalPriceUnitMaterialFloor;
        this.priceCPUnitMaterialFloor = priceCPUnitMaterialFloor;
        this.priceCPKeyMaterialFloor = priceCPKeyMaterialFloor;
        this.costCPUnitMaterialFloor = costCPUnitMaterialFloor;
        this.priceOrderMaterialFloor = priceOrderMaterialFloor;
        this.costCPMaterialFloor = costCPMaterialFloor;
        this.productionTimeMaterialFloor = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostMaterialFloor = actualCostMaterialFloor;
        this.actualDifferenceMaterialFloor = actualDifferenceMaterialFloor;
        this.paidMaterialFloor = paidMaterialFloor;
        this.residueMaterialFloor = residueMaterialFloor;
        this.dateOfDeliveryMaterialFloor = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomMaterialFloor = nameRoomMaterialFloor;
        this.plannedCPMaterialFloor = plannedCPMaterialFloor;
        this.actualCPMaterialFloor = actualCPMaterialFloor;
        this.accountMaterialFloor = accountMaterialFloor;
        this.contactsMaterialFloor = contactsMaterialFloor;
        this.notesMaterialFloor = notesMaterialFloor;
        this.characteristicsMaterialFloor = characteristicsMaterialFloor;
    }

    public void CalculatePriceOrderMaterialFloor() {
        priceOrderMaterialFloor = quantityMaterialFloor * ordinalPriceUnitMaterialFloor;
    }

    public void CalculateСostCPUnitMaterialFloor() {
        if (priceCPKeyMaterialFloor > 0)
            costCPUnitMaterialFloor = priceCPKeyMaterialFloor / quantityMaterialFloor;
        else costCPUnitMaterialFloor = priceCPUnitMaterialFloor;
    }

    public void CalculateCostCPMaterialFloor() {
        if (priceCPKeyMaterialFloor > 0)
            costCPMaterialFloor = priceCPKeyMaterialFloor;
        else costCPMaterialFloor = priceCPUnitMaterialFloor * quantityMaterialFloor;
    }

    public void CalculateActualDifferenceMaterialFloor() {
        actualDifferenceMaterialFloor = costCPMaterialFloor - actualCostMaterialFloor;
    }

    public void CalculateResidueMaterialFloor() {
        residueMaterialFloor = actualCostMaterialFloor - paidMaterialFloor;
    }


    public String getNameMaterialFloor() {
        return nameMaterialFloor;
    }

    public void setNameMaterialFloor(String nameMaterialFloor) {
        this.nameMaterialFloor = nameMaterialFloor;
    }


    public UnitType getUnitMaterialFloor() {
        return unitMaterialFloor.get();
    }

    public void setUnitMaterialFloor(UnitType unitMaterialFloor) {
        this.unitMaterialFloor.set(unitMaterialFloor);
    }

    public boolean getActivePMaterialFloor() {
        return activePMaterialFloor;
    }

    public void setActivePMaterialFloor(boolean activePMaterialFloor) {
        this.activePMaterialFloor = activePMaterialFloor;
    }

    public void setActivePMaterialFloor(String activePMaterialFloor) {
        this.activePMaterialFloor = Boolean.parseBoolean(activePMaterialFloor);
    }

    public boolean getActiveCMaterialFloor() {
        return activeCMaterialFloor;
    }

    public void setActiveCMaterialFloor(boolean activeCMaterialFloor) {
        this.activeCMaterialFloor = activeCMaterialFloor;
    }

    public void setActiveCMaterialFloor(String activeCMaterialFloor) {
        this.activeCMaterialFloor = Boolean.parseBoolean(activeCMaterialFloor);
    }

    public String getQuantityMaterialFloor() {
        return Double.toString(quantityMaterialFloor);
    }

    public void setQuantityMaterialFloor(double quantityMaterialFloor) {
        this.quantityMaterialFloor = quantityMaterialFloor;
    }

    public void setQuantityMaterialFloor(String quantityMaterialFloor) {
        this.quantityMaterialFloor = Double.parseDouble(quantityMaterialFloor);
        CalculatePriceOrderMaterialFloor();
        CalculateCostCPMaterialFloor();
    }

    public String getOrdinalPriceUnitMaterialFloor() {
        return Double.toString(ordinalPriceUnitMaterialFloor);
    }

    public void setOrdinalPriceUnitMaterialFloor(double ordinalPriceUnitMaterialFloor) {
        this.ordinalPriceUnitMaterialFloor = ordinalPriceUnitMaterialFloor;
    }

    public void setOrdinalPriceUnitMaterialFloor(String ordinalPriceUnitMaterialFloor) {
        this.ordinalPriceUnitMaterialFloor = Double.parseDouble(ordinalPriceUnitMaterialFloor);
        CalculatePriceOrderMaterialFloor();
    }

    public String getPriceCPUnitMaterialFloor() {
        return Double.toString(priceCPUnitMaterialFloor);
    }

    public void setPriceCPUnitMaterialFloor(double priceCPUnitMaterialFloor) {
        this.priceCPUnitMaterialFloor = priceCPUnitMaterialFloor;
    }

    public void setPriceCPUnitMaterialFloor(String priceCPUnitMaterialFloor) {
        this.priceCPUnitMaterialFloor = Double.parseDouble(priceCPUnitMaterialFloor);
        CalculateСostCPUnitMaterialFloor();
        CalculateCostCPMaterialFloor();
    }

    public String getPriceCPKeyMaterialFloor() {
        return Double.toString(priceCPKeyMaterialFloor);
    }

    public void setPriceCPKeyMaterialFloor(double priceCPKeyMaterialFloor) {
        this.priceCPKeyMaterialFloor = priceCPKeyMaterialFloor;
    }

    public void setPriceCPKeyMaterialFloor(String priceCPKeyMaterialFloor) {
        this.priceCPKeyMaterialFloor = Double.parseDouble(priceCPKeyMaterialFloor);
        CalculateСostCPUnitMaterialFloor();
        CalculateCostCPMaterialFloor();
    }

    public String getCostCPUnitMaterialFloor() {
        return Double.toString(costCPUnitMaterialFloor);
    }

    public void setCostCPUnitMaterialFloor(double costCPUnitMaterialFloor) {
        this.costCPUnitMaterialFloor = costCPUnitMaterialFloor;
    }

    public void setCostCPUnitMaterialFloor(String costCPUnitMaterialFloor) {
        this.costCPUnitMaterialFloor = Double.parseDouble(costCPUnitMaterialFloor);
    }

    public String getPriceOrderMaterialFloor() {
        return Double.toString(priceOrderMaterialFloor);
    }

    public void setPriceOrderMaterialFloor(double priceOrderMaterialFloor) {
        this.priceOrderMaterialFloor = priceOrderMaterialFloor;
    }

    public void setPriceOrderMaterialFloor(String priceOrderMaterialFloor) {
        this.priceOrderMaterialFloor = Double.parseDouble(priceOrderMaterialFloor);
    }

    public String getCostCPMaterialFloor() {
        return Double.toString(costCPMaterialFloor);
    }

    public void setCostCPMaterialFloor(double costCPMaterialFloor) {
        this.costCPMaterialFloor = costCPMaterialFloor;
    }

    public void setCostCPMaterialFloor(String costCPMaterialFloor) {
        this.costCPMaterialFloor = Double.parseDouble(costCPMaterialFloor);
        CalculateActualDifferenceMaterialFloor();
    }


    public TimeProduction getProductionTimeMaterialFloor() {
        return productionTimeMaterialFloor.get();
    }

    public void setProductionTimeMaterialFloor(TimeProduction productionTimeMaterialFloor) {
        this.productionTimeMaterialFloor.set(productionTimeMaterialFloor);
    }

    public String getActualCostMaterialFloor() {
        return Double.toString(actualCostMaterialFloor);
    }

    public void setActualCostMaterialFloor(double actualCostMaterialFloor) {
        this.actualCostMaterialFloor = actualCostMaterialFloor;
    }

    public void setActualCostMaterialFloor(String actualCostMaterialFloor) {
        this.actualCostMaterialFloor = Double.parseDouble(actualCostMaterialFloor);
        CalculateActualDifferenceMaterialFloor();
        CalculateResidueMaterialFloor();

    }

    public String getActualDifferenceMaterialFloor() {
        return Double.toString(actualDifferenceMaterialFloor);
    }

    public void setActualDifferenceMaterialFloor(double actualDifferenceMaterialFloor) {
        this.actualDifferenceMaterialFloor = actualDifferenceMaterialFloor;
    }

    public void setActualDifferenceMaterialFloor(String actualDifferenceMaterialFloor) {
        this.actualDifferenceMaterialFloor = Double.parseDouble(actualDifferenceMaterialFloor);
    }

    public String getPaidMaterialFloor() {
        return Double.toString(paidMaterialFloor);
    }

    public void setPaidMaterialFloor(double paidMaterialFloor) {
        this.paidMaterialFloor = paidMaterialFloor;
    }

    public void setPaidMaterialFloor(String paidMaterialFloor) {
        this.paidMaterialFloor = Double.parseDouble(paidMaterialFloor);
        CalculateResidueMaterialFloor();
    }

    public String getResidueMaterialFloor() {
        return Double.toString(residueMaterialFloor);
    }

    public void setResidueMaterialFloor(double residueMaterialFloor) {
        this.residueMaterialFloor = residueMaterialFloor;
    }

    public void setResidueMaterialFloor(String residueMaterialFloor) {
        this.residueMaterialFloor = Double.parseDouble(residueMaterialFloor);
    }

    public Date getDateOfDeliveryMaterialFloor() {
        return dateOfDeliveryMaterialFloor.get();
    }

    public void setDateOfDeliveryMaterialFloor(Date dateOfDeliveryMaterialFloor) {
        this.dateOfDeliveryMaterialFloor.set(dateOfDeliveryMaterialFloor);
    }


    public String getNameRoomMaterialFloor() {
        return nameRoomMaterialFloor;
    }

    public void setNameRoomMaterialFloor(String nameRoomMaterialFloor) {
        this.nameRoomMaterialFloor = nameRoomMaterialFloor;
    }

    public String getPlannedCPMaterialFloor() {
        return plannedCPMaterialFloor;
    }

    public void setPlannedCPMaterialFloor(String plannedCPMaterialFloor) {
        this.plannedCPMaterialFloor = plannedCPMaterialFloor;
    }

    public String getActualCPMaterialFloor() {
        return actualCPMaterialFloor;
    }

    public void setActualCPMaterialFloor(String actualCPMaterialFloor) {
        this.actualCPMaterialFloor = actualCPMaterialFloor;
    }

    public String getAccountMaterialFloor() {
        return accountMaterialFloor;
    }

    public void setAccountMaterialFloor(String accountMaterialFloor) {
        this.accountMaterialFloor = accountMaterialFloor;
    }

    public String getContactsMaterialFloor() {
        return contactsMaterialFloor;
    }

    public void setContactsMaterialFloor(String contactsMaterialFloor) {
        this.contactsMaterialFloor = contactsMaterialFloor;
    }

    public String getNotesMaterialFloor() {
        return notesMaterialFloor;
    }

    public void setNotesMaterialFloor(String notesMaterialFloor) {
        this.notesMaterialFloor = notesMaterialFloor;
    }

    public String getCharacteristicsMaterialFloor() {
        return characteristicsMaterialFloor;
    }

    public void setCharacteristicsMaterialFloor(String characteristicsMaterialFloor) {
        this.characteristicsMaterialFloor = characteristicsMaterialFloor;
    }




    public static class DatePickerCell<S, T> extends TableCell<MaterialFloor, Date> {

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
                ((MaterialFloor)getTableRow().getItem()).setDateOfDeliveryMaterialFloor(cal.getTime());
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
