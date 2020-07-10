package sample;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.Instant;
import java.util.Date;

public class Room {
    protected String nameRoom;
    protected double areaRoom;
    protected boolean selectBathRoom;


    protected SimpleStringProperty nameRoomTransmit;//Наименование
    protected SimpleBooleanProperty activePRoomTransmit;//П
    protected SimpleBooleanProperty activeCRoomTransmit;//С
    protected SimpleObjectProperty<UnitType> unitRoomTransmit;//Ед. изм.
    protected SimpleDoubleProperty quantityRoomTransmit;//Количество
    protected SimpleDoubleProperty ordinalPriceUnitRoomTransmit;//Цена порядковая за ед.
    protected SimpleDoubleProperty priceCPUnitRoomTransmit;//Цена по КП за ед.
    protected SimpleDoubleProperty priceCPKeyRoomTransmit;//Цена по КП под ключ
    protected SimpleDoubleProperty costCPUnitRoomTransmit;//Стоимость по КП за ед.
    protected SimpleDoubleProperty priceOrderRoomTransmit;//Порядок цен
    protected SimpleDoubleProperty costCPRoomTransmit;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeRoomTransmit;//Срок доставки
    protected SimpleDoubleProperty actualCostRoomTransmit;//Стоимость фактическая
    protected SimpleDoubleProperty actualDifferenceRoomTransmit;//Разница фактическая
    protected SimpleDoubleProperty paidRoomTransmit;//Оплачено
    protected SimpleDoubleProperty residueRoomTransmit;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryRoomTransmit;//Дата поставки
    protected SimpleStringProperty nameRoomRoomTransmit;//Наименование помещения
    protected SimpleStringProperty plannedCPRoomTransmit;//КП плановое
    protected SimpleStringProperty actualCPRoomTransmit;//КП фактическое
    protected SimpleStringProperty accountRoomTransmit;//счёт
    protected SimpleStringProperty contactsRoomTransmit;//контакты
    protected SimpleStringProperty notesRoomTransmit;//примечания
    protected SimpleStringProperty characteristicsRoomTransmit;//характеристики


    public Room(String nameRoom, double areaRoom, boolean selectBathRoom) {
        this.nameRoom = nameRoom;
        this.areaRoom = areaRoom;
        this.selectBathRoom = selectBathRoom;





        this.nameRoomTransmit = new SimpleStringProperty("");
        this.activePRoomTransmit = new SimpleBooleanProperty(true);
        this.activeCRoomTransmit = new SimpleBooleanProperty(false);
        this.unitRoomTransmit = new SimpleObjectProperty<>(UnitType.THING);
        this.quantityRoomTransmit = new SimpleDoubleProperty(0.0);
        this.ordinalPriceUnitRoomTransmit = new SimpleDoubleProperty(0.0);
        this.priceCPUnitRoomTransmit = new SimpleDoubleProperty(0.0);
        this.priceCPKeyRoomTransmit = new SimpleDoubleProperty(0.0);
        this.costCPUnitRoomTransmit = new SimpleDoubleProperty(0.0);
        this.priceOrderRoomTransmit = new SimpleDoubleProperty(0.0);
        this.costCPRoomTransmit = new SimpleDoubleProperty(0.0);
        this.productionTimeRoomTransmit = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostRoomTransmit = new SimpleDoubleProperty(0.0);
        this.actualDifferenceRoomTransmit = new SimpleDoubleProperty(0.0);
        this.paidRoomTransmit = new SimpleDoubleProperty(0.0);
        this.residueRoomTransmit = new SimpleDoubleProperty(0.0);
        this.dateOfDeliveryRoomTransmit = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.nameRoomRoomTransmit = new SimpleStringProperty("");
        this.plannedCPRoomTransmit = new SimpleStringProperty("");
        this.actualCPRoomTransmit = new SimpleStringProperty("");
        this.accountRoomTransmit = new SimpleStringProperty("");
        this.contactsRoomTransmit = new SimpleStringProperty("");
        this.notesRoomTransmit = new SimpleStringProperty("");
        this.characteristicsRoomTransmit = new SimpleStringProperty("");

    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getAreaRoom() {
        return Double.toString(areaRoom);
    }

    public void setAreaRoom(double areaRoom) {
        this.areaRoom = areaRoom;
    }

    public void setAreaRoom(String areaRoom) {
        this.areaRoom = Double.parseDouble(areaRoom);
    }

    public boolean getSelectBathRoom() {
        return selectBathRoom;
    }

    public void setSelectBathRoom(boolean selectBathRoom) {
        this.selectBathRoom = selectBathRoom;
    }

    public void setSelectBathroom(String selectBathRoom) {
        this.selectBathRoom = Boolean.parseBoolean(selectBathRoom);
    }




    //Тест с Пропертями!!!!!!!!!!!
    public String getNameRoomTransmit() {
        return nameRoomTransmit.get();
    }

    public void setNameRoomTransmit(String nameRoomTransmit) {
        this.nameRoomTransmit.set(nameRoomTransmit);
    }

    public boolean isActivePRoomTransmit() {
        return activePRoomTransmit.get();
    }

    public void setActivePRoomTransmit(boolean activePRoomTransmit) {
        this.activePRoomTransmit.set(activePRoomTransmit);
    }

    public boolean isActiveCRoomTransmit() {
        return activeCRoomTransmit.get();
    }


    public void setActiveCRoomTransmit(boolean activeCRoomTransmit) {
        this.activeCRoomTransmit.set(activeCRoomTransmit);
    }

    public UnitType getUnitRoomTransmit() {
        return unitRoomTransmit.get();
    }

    public SimpleObjectProperty<UnitType> unitRoomTransmitProperty() {
        return unitRoomTransmit;
    }

    public void setUnitRoomTransmit(UnitType unitRoomTransmit) {
        this.unitRoomTransmit.set(unitRoomTransmit);
    }

    public double getQuantityRoomTransmit() {
        return quantityRoomTransmit.get();
    }

    public SimpleDoubleProperty quantityRoomTransmitProperty() {
        return quantityRoomTransmit;
    }

    public void setQuantityRoomTransmit(double quantityRoomTransmit) {
        this.quantityRoomTransmit.set(quantityRoomTransmit);
    }

    public double getOrdinalPriceUnitRoomTransmit() {
        return ordinalPriceUnitRoomTransmit.get();
    }

    public SimpleDoubleProperty ordinalPriceUnitRoomTransmitProperty() {
        return ordinalPriceUnitRoomTransmit;
    }

    public void setOrdinalPriceUnitRoomTransmit(double ordinalPriceUnitRoomTransmit) {
        this.ordinalPriceUnitRoomTransmit.set(ordinalPriceUnitRoomTransmit);
    }

    public double getPriceCPUnitRoomTransmit() {
        return priceCPUnitRoomTransmit.get();
    }

    public SimpleDoubleProperty priceCPUnitRoomTransmitProperty() {
        return priceCPUnitRoomTransmit;
    }

    public void setPriceCPUnitRoomTransmit(double priceCPUnitRoomTransmit) {
        this.priceCPUnitRoomTransmit.set(priceCPUnitRoomTransmit);
    }

    public double getPriceCPKeyRoomTransmit() {
        return priceCPKeyRoomTransmit.get();
    }

    public SimpleDoubleProperty priceCPKeyRoomTransmitProperty() {
        return priceCPKeyRoomTransmit;
    }

    public void setPriceCPKeyRoomTransmit(double priceCPKeyRoomTransmit) {
        this.priceCPKeyRoomTransmit.set(priceCPKeyRoomTransmit);
    }

    public double getCostCPUnitRoomTransmit() {
        return costCPUnitRoomTransmit.get();
    }

    public SimpleDoubleProperty costCPUnitRoomTransmitProperty() {
        return costCPUnitRoomTransmit;
    }

    public void setCostCPUnitRoomTransmit(double costCPUnitRoomTransmit) {
        this.costCPUnitRoomTransmit.set(costCPUnitRoomTransmit);
    }

    public double getPriceOrderRoomTransmit() {
        return priceOrderRoomTransmit.get();
    }

    public SimpleDoubleProperty priceOrderRoomTransmitProperty() {
        return priceOrderRoomTransmit;
    }

    public void setPriceOrderRoomTransmit(double priceOrderRoomTransmit) {
        this.priceOrderRoomTransmit.set(priceOrderRoomTransmit);
    }

    public double getCostCPRoomTransmit() {
        return costCPRoomTransmit.get();
    }

    public SimpleDoubleProperty costCPRoomTransmitProperty() {
        return costCPRoomTransmit;
    }

    public void setCostCPRoomTransmit(double costCPRoomTransmit) {
        this.costCPRoomTransmit.set(costCPRoomTransmit);
    }

    public TimeProduction getProductionTimeRoomTransmit() {
        return productionTimeRoomTransmit.get();
    }

    public SimpleObjectProperty<TimeProduction> productionTimeRoomTransmitProperty() {
        return productionTimeRoomTransmit;
    }

    public void setProductionTimeRoomTransmit(TimeProduction productionTimeRoomTransmit) {
        this.productionTimeRoomTransmit.set(productionTimeRoomTransmit);
    }

    public double getActualCostRoomTransmit() {
        return actualCostRoomTransmit.get();
    }

    public SimpleDoubleProperty actualCostRoomTransmitProperty() {
        return actualCostRoomTransmit;
    }

    public void setActualCostRoomTransmit(double actualCostRoomTransmit) {
        this.actualCostRoomTransmit.set(actualCostRoomTransmit);
    }

    public double getActualDifferenceRoomTransmit() {
        return actualDifferenceRoomTransmit.get();
    }

    public SimpleDoubleProperty actualDifferenceRoomTransmitProperty() {
        return actualDifferenceRoomTransmit;
    }

    public void setActualDifferenceRoomTransmit(double actualDifferenceRoomTransmit) {
        this.actualDifferenceRoomTransmit.set(actualDifferenceRoomTransmit);
    }

    public double getPaidRoomTransmit() {
        return paidRoomTransmit.get();
    }

    public SimpleDoubleProperty paidRoomTransmitProperty() {
        return paidRoomTransmit;
    }

    public void setPaidRoomTransmit(double paidRoomTransmit) {
        this.paidRoomTransmit.set(paidRoomTransmit);
    }

    public double getResidueRoomTransmit() {
        return residueRoomTransmit.get();
    }

    public SimpleDoubleProperty residueRoomTransmitProperty() {
        return residueRoomTransmit;
    }

    public void setResidueRoomTransmit(double residueRoomTransmit) {
        this.residueRoomTransmit.set(residueRoomTransmit);
    }

    public Date getDateOfDeliveryRoomTransmit() {
        return dateOfDeliveryRoomTransmit.get();
    }

    public SimpleObjectProperty<Date> dateOfDeliveryRoomTransmitProperty() {
        return dateOfDeliveryRoomTransmit;
    }

    public void setDateOfDeliveryRoomTransmit(Date dateOfDeliveryRoomTransmit) {
        this.dateOfDeliveryRoomTransmit.set(dateOfDeliveryRoomTransmit);
    }

    public String getNameRoomRoomTransmit() {
        return nameRoomRoomTransmit.get();
    }

    public SimpleStringProperty nameRoomRoomTransmitProperty() {
        return nameRoomRoomTransmit;
    }

    public void setNameRoomRoomTransmit(String nameRoomRoomTransmit) {
        this.nameRoomRoomTransmit.set(nameRoomRoomTransmit);
    }

    public String getPlannedCPRoomTransmit() {
        return plannedCPRoomTransmit.get();
    }

    public SimpleStringProperty plannedCPRoomTransmitProperty() {
        return plannedCPRoomTransmit;
    }

    public void setPlannedCPRoomTransmit(String plannedCPRoomTransmit) {
        this.plannedCPRoomTransmit.set(plannedCPRoomTransmit);
    }

    public String getActualCPRoomTransmit() {
        return actualCPRoomTransmit.get();
    }

    public SimpleStringProperty actualCPRoomTransmitProperty() {
        return actualCPRoomTransmit;
    }

    public void setActualCPRoomTransmit(String actualCPRoomTransmit) {
        this.actualCPRoomTransmit.set(actualCPRoomTransmit);
    }

    public String getAccountRoomTransmit() {
        return accountRoomTransmit.get();
    }

    public SimpleStringProperty accountRoomTransmitProperty() {
        return accountRoomTransmit;
    }

    public void setAccountRoomTransmit(String accountRoomTransmit) {
        this.accountRoomTransmit.set(accountRoomTransmit);
    }

    public String getContactsRoomTransmit() {
        return contactsRoomTransmit.get();
    }

    public SimpleStringProperty contactsRoomTransmitProperty() {
        return contactsRoomTransmit;
    }

    public void setContactsRoomTransmit(String contactsRoomTransmit) {
        this.contactsRoomTransmit.set(contactsRoomTransmit);
    }

    public String getNotesRoomTransmit() {
        return notesRoomTransmit.get();
    }

    public SimpleStringProperty notesRoomTransmitProperty() {
        return notesRoomTransmit;
    }

    public void setNotesRoomTransmit(String notesRoomTransmit) {
        this.notesRoomTransmit.set(notesRoomTransmit);
    }

    public String getCharacteristicsRoomTransmit() {
        return characteristicsRoomTransmit.get();
    }

    public SimpleStringProperty characteristicsRoomTransmitProperty() {
        return characteristicsRoomTransmit;
    }

    public void setCharacteristicsRoomTransmit(String characteristicsRoomTransmit) {
        this.characteristicsRoomTransmit.set(characteristicsRoomTransmit);
    }
}
