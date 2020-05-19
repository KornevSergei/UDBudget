package sample;

public class Furniture {
    String nameFurniture, unitFurniture, quantityFurniture;

    public Furniture(String nameFurniture, String unitFurniture, String quantityFurniture) {
        this.nameFurniture = nameFurniture;
        this.unitFurniture = unitFurniture;
        this.quantityFurniture = quantityFurniture;
    }

    public Furniture() {
    }

    public String getNameFurniture() {
        return nameFurniture;
    }

    public void setNameFurniture(String nameFurniture) {
        this.nameFurniture = nameFurniture;
    }

    public String getUnitFurniture() {
        return unitFurniture;
    }

    public void setUnitFurniture(String unitFurniture) {
        this.unitFurniture = unitFurniture;
    }

    public String getQuantityFurniture() {
        return quantityFurniture;
    }

    public void setQuantityFurniture(String quantityFurniture) {
        this.quantityFurniture = quantityFurniture;
    }
}
