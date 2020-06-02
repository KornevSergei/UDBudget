package sample;

public class Room {
    protected String nameRoom;
    protected double areaRoom;
    protected boolean selectBathRoom;

    public Room(String nameRoom, double areaRoom, boolean selectBathRoom) {
        this.nameRoom = nameRoom;
        this.areaRoom = areaRoom;
        this.selectBathRoom = selectBathRoom;
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
}
