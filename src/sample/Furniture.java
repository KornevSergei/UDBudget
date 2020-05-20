package sample;

import javafx.beans.property.SimpleStringProperty;

public class Furniture {
    protected SimpleStringProperty nameFurniture;
    protected SimpleStringProperty unitFurniture;
    protected SimpleStringProperty quantityFurniture;

    public Furniture() {
    }

    public Furniture(String nameFurniture, String unitFurniture, String quantityFurniture) {
        this.nameFurniture = new SimpleStringProperty(nameFurniture);
        this.unitFurniture = new SimpleStringProperty(unitFurniture);
        this.quantityFurniture = new SimpleStringProperty(quantityFurniture);
    }

    public String getNameFurniture() {
        return nameFurniture.get();
    }

    public SimpleStringProperty nameFurnitureProperty() {
        return nameFurniture;
    }

    public void setNameFurniture(String nameFurniture) {
        this.nameFurniture = new SimpleStringProperty(nameFurniture);
    }

    public String getUnitFurniture() {
        return unitFurniture.get();
    }

    public SimpleStringProperty unitFurnitureProperty() {
        return unitFurniture;
    }

    public void setUnitFurniture(String unitFurniture) {
        this.unitFurniture = new SimpleStringProperty(unitFurniture);
    }

    public String getQuantityFurniture() {
        return quantityFurniture.get();
    }

    public SimpleStringProperty quantityFurnitureProperty() {
        return quantityFurniture;
    }

    public void setQuantityFurniture(String quantityFurniture) {
        this.quantityFurniture = new SimpleStringProperty(quantityFurniture);
    }
}
