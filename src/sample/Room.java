package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

import java.awt.*;

public class Room {
    protected SimpleStringProperty nameRoom;
    protected SimpleDoubleProperty yardageRoom;
    protected Checkbox selectBathroomRoom;

    public Room() {
    }


    public Room(String nameRoom, double yardageRoom) {
        this.nameRoom = new SimpleStringProperty(nameRoom);
        this.yardageRoom = new SimpleDoubleProperty(yardageRoom);
        this.selectBathroomRoom = new Checkbox();
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




    public Checkbox getSelect(){
        return selectBathroomRoom;
    }
    public void setSelect(Checkbox selectBathroomRoom){
        this.selectBathroomRoom = selectBathroomRoom;
    }

}
