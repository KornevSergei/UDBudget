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

    protected SimpleObjectProperty<Date> date;

    public Room(String nameRoom, double areaRoom, boolean selectBathRoom) {
        this.nameRoom = nameRoom;
        this.areaRoom = areaRoom;
        this.selectBathRoom = selectBathRoom;


        
        this.nameRoomTransmit = new SimpleStringProperty("");
        this.activePRoomTransmit = new SimpleBooleanProperty(false);
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



    public Date getDate() {
        return date.get();
    }

    public void setDate(Date date) {
        this.date.set(date);
    }

    public SimpleObjectProperty<Date> dateProperty() { return date;
    }
}
