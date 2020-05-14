package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Room {
    protected SimpleStringProperty nameRoom;
    protected SimpleDoubleProperty yardageRoom;

    public Room() {
    }

    public Room(String nameRoom, double yardageRoom) {
        this.nameRoom = new SimpleStringProperty(nameRoom);
        this.yardageRoom = new SimpleDoubleProperty(yardageRoom);
    }

    public String getNameRoom() {
        return nameRoom.get();
    }

    public SimpleStringProperty nameRoomProperty() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = new SimpleStringProperty(nameRoom);
    }

    public double getYardageRoom() {
        return yardageRoom.get();
    }

    public SimpleDoubleProperty yardageRoomProperty() {
        return yardageRoom;
    }

    public void setYardageRoom(double yardageRoom) {
        this.yardageRoom = new SimpleDoubleProperty(yardageRoom);
    }
}
