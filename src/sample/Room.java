package sample;

import javafx.beans.property.SimpleObjectProperty;

import java.time.Instant;
import java.util.Date;

public class Room {
    protected String nameRoom;
    protected double areaRoom;
    protected boolean selectBathRoom;

    protected SimpleObjectProperty<Date> date;

    public Room(String nameRoom, double areaRoom, boolean selectBathRoom) {
        this.nameRoom = nameRoom;
        this.areaRoom = areaRoom;
        this.selectBathRoom = selectBathRoom;

        this.date = new SimpleObjectProperty<>(Date.from(Instant.now()));
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
