package tables;

import javafx.beans.property.SimpleStringProperty;

public class Furniture {
//    protected SimpleStringProperty nameFurniture;
//    protected SimpleStringProperty unitFurniture;
    protected SimpleStringProperty quantityFurniture;
    protected SimpleStringProperty ordinalPriceUnitFurniture;
    protected SimpleStringProperty priceCPUnitFurniture;
    protected SimpleStringProperty priceCPKeyFurniture;
    protected SimpleStringProperty costCPUnitFurniture;
    protected SimpleStringProperty priceOrderFurniture;
    protected SimpleStringProperty costCPFurniture;
    protected SimpleStringProperty productionTimeFurniture;
    protected SimpleStringProperty actualCostFurniture;
    protected SimpleStringProperty actualDifferenceFurniture;
    protected SimpleStringProperty paidFurniture;
    protected SimpleStringProperty residueFurniture;
    protected SimpleStringProperty dateOfDeliveryFurniture;
    protected SimpleStringProperty plannedCPFurniture;
    protected SimpleStringProperty actualCPFurniture;
    protected SimpleStringProperty accountFurniture;
    protected SimpleStringProperty contactsFurniture;
    protected SimpleStringProperty notesFurniture;
    protected SimpleStringProperty characteristicsFurniture;

    private double nameFurniture;
    private double unitFurniture;


    public Furniture() {
    }


    public Furniture(String nameFurniture, String unitFurniture, String quantityFurniture, String ordinalPricePerUnitFurniture, String priceCPPerUnitFurniture,
                     String priceCPPerKeyFurniture, String costCPPerUnitFurniture, String priceOrderFurniture, String costCPFurniture, String productionTimeFurniture,
                     String actualCostFurniture, String actualDifferenceFurniture, String paidFurniture, String residueFurniture, String dateOfDeliveryFurniture,
                     String plannedCPFurniture, String actualCPFurniture, String accountFurniture, String contactsFurniture, String notesFurniture, String characteristicsFurniture) {
//        this.nameFurniture = new SimpleStringProperty(nameFurniture);
//        this.unitFurniture = new SimpleStringProperty(unitFurniture);
        this.quantityFurniture = new SimpleStringProperty(quantityFurniture);
        this.ordinalPriceUnitFurniture = new SimpleStringProperty(ordinalPricePerUnitFurniture);
        this.priceCPUnitFurniture = new SimpleStringProperty(priceCPPerUnitFurniture);
        this.priceCPKeyFurniture = new SimpleStringProperty(priceCPPerKeyFurniture);
        this.costCPUnitFurniture = new SimpleStringProperty(costCPPerUnitFurniture);
        this.priceOrderFurniture = new SimpleStringProperty(priceOrderFurniture);
        this.costCPFurniture = new SimpleStringProperty(costCPFurniture);
        this.productionTimeFurniture = new SimpleStringProperty(productionTimeFurniture);
        this.actualCostFurniture = new SimpleStringProperty(actualCostFurniture);
        this.actualDifferenceFurniture = new SimpleStringProperty(actualDifferenceFurniture);
        this.paidFurniture = new SimpleStringProperty(paidFurniture);
        this.residueFurniture = new SimpleStringProperty(residueFurniture);
        this.dateOfDeliveryFurniture = new SimpleStringProperty(dateOfDeliveryFurniture);
        this.plannedCPFurniture = new SimpleStringProperty(plannedCPFurniture);
        this.actualCPFurniture = new SimpleStringProperty(actualCPFurniture);
        this.accountFurniture = new SimpleStringProperty(accountFurniture);
        this.contactsFurniture = new SimpleStringProperty(contactsFurniture);
        this.notesFurniture = new SimpleStringProperty(notesFurniture);
        this.characteristicsFurniture = new SimpleStringProperty(characteristicsFurniture);
    }


//    public void Calculate() {
//        priceOrderFurniture = quantityFurniture * ordinalPriceUnitFurniture;
//    }

    public Furniture(double nameFurniture, double unitFurniture) {
        this.nameFurniture = nameFurniture;
        this.unitFurniture = unitFurniture;
    }

    public String getNameFurniture() {
        return Double.toString(nameFurniture);
    }

    public void setNameFurniture(double nameFurniture) {
        this.nameFurniture = nameFurniture;
    }

    public void setNameFurniture(String nameFurniture) {
        this.nameFurniture = Double.parseDouble(nameFurniture);
    }



    public String getUnitFurniture() {
        return Double.toString(unitFurniture);
    }

    public void setUnitFurniture(double unitFurniture) {
        this.unitFurniture = unitFurniture;
    }

    public void setUnitFurniture(String  unitFurniture) {
        this.unitFurniture = Double.parseDouble(unitFurniture);
    }

//
//    public String getNameFurniture() {
//        return nameFurniture.get();
//    }
//
//    public SimpleStringProperty nameFurnitureProperty() {
//        return nameFurniture;
//    }
//
//    public void setNameFurniture(String nameFurniture) {
//        this.nameFurniture = new SimpleStringProperty(nameFurniture);
//    }
//
//    public String getUnitFurniture() {
//        return unitFurniture.get();
//    }
//
//    public SimpleStringProperty unitFurnitureProperty() {
//        return unitFurniture;
//    }
//
//    public void setUnitFurniture(String unitFurniture) {
//        this.unitFurniture = new SimpleStringProperty(unitFurniture);
//    }

    public String getQuantityFurniture() {
        return quantityFurniture.get();
    }

    public SimpleStringProperty quantityFurnitureProperty() {
        return quantityFurniture;
    }

    public void setQuantityFurniture(String quantityFurniture) {
        this.quantityFurniture = new SimpleStringProperty(quantityFurniture);
    }

    public String getOrdinalPriceUnitFurniture() {
        return ordinalPriceUnitFurniture.get();
    }

    public SimpleStringProperty ordinalPriceUnitFurnitureProperty() {
        return ordinalPriceUnitFurniture;
    }

    public void setOrdinalPriceUnitFurniture(String ordinalPriceUnitFurniture) {
        this.ordinalPriceUnitFurniture = new SimpleStringProperty(ordinalPriceUnitFurniture);
    }

    public String getPriceCPUnitFurniture() {
        return priceCPUnitFurniture.get();
    }

    public SimpleStringProperty priceCPUnitFurnitureProperty() {
        return priceCPUnitFurniture;
    }

    public void setPriceCPUnitFurniture(String priceCPUnitFurniture) {
        this.priceCPUnitFurniture = new SimpleStringProperty(priceCPUnitFurniture);
    }

    public String getPriceCPKeyFurniture() {
        return priceCPKeyFurniture.get();
    }

    public SimpleStringProperty priceCPKeyFurnitureProperty() {
        return priceCPKeyFurniture;
    }

    public void setPriceCPKeyFurniture(String priceCPKeyFurniture) {
        this.priceCPKeyFurniture = new SimpleStringProperty(priceCPKeyFurniture);
    }

    public String getCostCPUnitFurniture() {
        return costCPUnitFurniture.get();
    }

    public SimpleStringProperty costCPUnitFurnitureProperty() {
        return costCPUnitFurniture;
    }

    public void setCostCPUnitFurniture(String costCPUnitFurniture) {
        this.costCPUnitFurniture = new SimpleStringProperty(costCPUnitFurniture);
    }

    public String getPriceOrderFurniture() {
        return priceOrderFurniture.get();
    }

    public SimpleStringProperty priceOrderFurnitureProperty() {
        return priceOrderFurniture;
    }

    public void setPriceOrderFurniture(String priceOrderFurniture) {
        this.priceOrderFurniture = new SimpleStringProperty(priceOrderFurniture);
    }

    public String getCostCPFurniture() {
        return costCPFurniture.get();
    }

    public SimpleStringProperty costCPFurnitureProperty() {
        return costCPFurniture;
    }

    public void setCostCPFurniture(String costCPFurniture) {
        this.costCPFurniture = new SimpleStringProperty(costCPFurniture);
    }

    public String getProductionTimeFurniture() {
        return productionTimeFurniture.get();
    }

    public SimpleStringProperty productionTimeFurnitureProperty() {
        return productionTimeFurniture;
    }

    public void setProductionTimeFurniture(String productionTimeFurniture) {
        this.productionTimeFurniture = new SimpleStringProperty(productionTimeFurniture);
    }

    public String getActualCostFurniture() {
        return actualCostFurniture.get();
    }

    public SimpleStringProperty actualCostFurnitureProperty() {
        return actualCostFurniture;
    }

    public void setActualCostFurniture(String actualCostFurniture) {
        this.actualCostFurniture = new SimpleStringProperty(actualCostFurniture);
    }

    public String getActualDifferenceFurniture() {
        return actualDifferenceFurniture.get();
    }

    public SimpleStringProperty actualDifferenceFurnitureProperty() {
        return actualDifferenceFurniture;
    }

    public void setActualDifferenceFurniture(String actualDifferenceFurniture) {
        this.actualDifferenceFurniture = new SimpleStringProperty(actualDifferenceFurniture);
    }

    public String getPaidFurniture() {
        return paidFurniture.get();
    }

    public SimpleStringProperty paidFurnitureProperty() {
        return paidFurniture;
    }

    public void setPaidFurniture(String paidFurniture) {
        this.paidFurniture = new SimpleStringProperty(paidFurniture);
    }

    public String getResidueFurniture() {
        return residueFurniture.get();
    }

    public SimpleStringProperty residueFurnitureProperty() {
        return residueFurniture;
    }

    public void setResidueFurniture(String residueFurniture) {
        this.residueFurniture = new SimpleStringProperty(residueFurniture);
    }

    public String getDateOfDeliveryFurniture() {
        return dateOfDeliveryFurniture.get();
    }

    public SimpleStringProperty dateOfDeliveryFurnitureProperty() {
        return dateOfDeliveryFurniture;
    }

    public void setDateOfDeliveryFurniture(String dateOfDeliveryFurniture) {
        this.dateOfDeliveryFurniture = new SimpleStringProperty(dateOfDeliveryFurniture);
    }

    public String getPlannedCPFurniture() {
        return plannedCPFurniture.get();
    }

    public SimpleStringProperty plannedCPFurnitureProperty() {
        return plannedCPFurniture;
    }

    public void setPlannedCPFurniture(String plannedCPFurniture) {
        this.plannedCPFurniture = new SimpleStringProperty(plannedCPFurniture);
    }

    public String getActualCPFurniture() {
        return actualCPFurniture.get();
    }

    public SimpleStringProperty actualCPFurnitureProperty() {
        return actualCPFurniture;
    }

    public void setActualCPFurniture(String actualCPFurniture) {
        this.actualCPFurniture = new SimpleStringProperty(actualCPFurniture);
    }

    public String getAccountFurniture() {
        return accountFurniture.get();
    }

    public SimpleStringProperty accountFurnitureProperty() {
        return accountFurniture;
    }

    public void setAccountFurniture(String accountFurniture) {
        this.accountFurniture = new SimpleStringProperty(accountFurniture);
    }

    public String getContactsFurniture() {
        return contactsFurniture.get();
    }

    public SimpleStringProperty contactsFurnitureProperty() {
        return contactsFurniture;
    }

    public void setContactsFurniture(String contactsFurniture) {
        this.contactsFurniture = new SimpleStringProperty(contactsFurniture);
    }

    public String getNotesFurniture() {
        return notesFurniture.get();
    }

    public SimpleStringProperty notesFurnitureProperty() {
        return notesFurniture;
    }

    public void setNotesFurniture(String notesFurniture) {
        this.notesFurniture = new SimpleStringProperty(notesFurniture);
    }

    public String getCharacteristicsFurniture() {
        return characteristicsFurniture.get();
    }

    public SimpleStringProperty characteristicsFurnitureProperty() {
        return characteristicsFurniture;
    }

    public void setCharacteristicsFurniture(String characteristicsFurniture) {
        this.characteristicsFurniture = new SimpleStringProperty(characteristicsFurniture);
    }
}
