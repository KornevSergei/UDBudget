package sample;

import javafx.beans.property.SimpleStringProperty;

public class Furniture {
    protected SimpleStringProperty nameFurniture;
    protected SimpleStringProperty unitFurniture;
    protected SimpleStringProperty quantityFurniture;
    protected SimpleStringProperty ordinalPricePerUnitFurniture;
    protected SimpleStringProperty priceCPPerUnitFurniture;
    protected SimpleStringProperty priceCPPerKeyFurniture;
    protected SimpleStringProperty costCPPerUnitFurniture;
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


    public Furniture() {
    }


    public Furniture(String nameFurniture, String unitFurniture, String quantityFurniture, String ordinalPricePerUnitFurniture, String priceCPPerUnitFurniture,
                     String priceCPPerKeyFurniture, String costCPPerUnitFurniture, String priceOrderFurniture, String costCPFurniture, String productionTimeFurniture,
                     String actualCostFurniture, String actualDifferenceFurniture, String paidFurniture, String residueFurniture, String dateOfDeliveryFurniture,
                     String plannedCPFurniture, String actualCPFurniture, String accountFurniture, String contactsFurniture, String notesFurniture, String characteristicsFurniture) {
        this.nameFurniture = new SimpleStringProperty(nameFurniture);
        this.unitFurniture = new SimpleStringProperty(unitFurniture);
        this.quantityFurniture = new SimpleStringProperty(quantityFurniture);
        this.ordinalPricePerUnitFurniture = new SimpleStringProperty(ordinalPricePerUnitFurniture);
        this.priceCPPerUnitFurniture = new SimpleStringProperty(priceCPPerUnitFurniture);
        this.priceCPPerKeyFurniture = new SimpleStringProperty(priceCPPerKeyFurniture);
        this.costCPPerUnitFurniture = new SimpleStringProperty(costCPPerUnitFurniture);
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
        this.unitFurniture.set(unitFurniture);
    }

    public String getQuantityFurniture() {
        return quantityFurniture.get();
    }

    public SimpleStringProperty quantityFurnitureProperty() {
        return quantityFurniture;
    }

    public void setQuantityFurniture(String quantityFurniture) {
        this.quantityFurniture.set(quantityFurniture);
    }

    public String getOrdinalPricePerUnitFurniture() {
        return ordinalPricePerUnitFurniture.get();
    }

    public SimpleStringProperty ordinalPricePerUnitFurnitureProperty() {
        return ordinalPricePerUnitFurniture;
    }

    public void setOrdinalPricePerUnitFurniture(String ordinalPricePerUnitFurniture) {
        this.ordinalPricePerUnitFurniture.set(ordinalPricePerUnitFurniture);
    }

    public String getPriceCPPerUnitFurniture() {
        return priceCPPerUnitFurniture.get();
    }

    public SimpleStringProperty priceCPPerUnitFurnitureProperty() {
        return priceCPPerUnitFurniture;
    }

    public void setPriceCPPerUnitFurniture(String priceCPPerUnitFurniture) {
        this.priceCPPerUnitFurniture.set(priceCPPerUnitFurniture);
    }

    public String getPriceCPPerKeyFurniture() {
        return priceCPPerKeyFurniture.get();
    }

    public SimpleStringProperty priceCPPerKeyFurnitureProperty() {
        return priceCPPerKeyFurniture;
    }

    public void setPriceCPPerKeyFurniture(String priceCPPerKeyFurniture) {
        this.priceCPPerKeyFurniture.set(priceCPPerKeyFurniture);
    }

    public String getCostCPPerUnitFurniture() {
        return costCPPerUnitFurniture.get();
    }

    public SimpleStringProperty costCPPerUnitFurnitureProperty() {
        return costCPPerUnitFurniture;
    }

    public void setCostCPPerUnitFurniture(String costCPPerUnitFurniture) {
        this.costCPPerUnitFurniture.set(costCPPerUnitFurniture);
    }

    public String getPriceOrderFurniture() {
        return priceOrderFurniture.get();
    }

    public SimpleStringProperty priceOrderFurnitureProperty() {
        return priceOrderFurniture;
    }

    public void setPriceOrderFurniture(String priceOrderFurniture) {
        this.priceOrderFurniture.set(priceOrderFurniture);
    }

    public String getCostCPFurniture() {
        return costCPFurniture.get();
    }

    public SimpleStringProperty costCPFurnitureProperty() {
        return costCPFurniture;
    }

    public void setCostCPFurniture(String costCPFurniture) {
        this.costCPFurniture.set(costCPFurniture);
    }

    public String getProductionTimeFurniture() {
        return productionTimeFurniture.get();
    }

    public SimpleStringProperty productionTimeFurnitureProperty() {
        return productionTimeFurniture;
    }

    public void setProductionTimeFurniture(String productionTimeFurniture) {
        this.productionTimeFurniture.set(productionTimeFurniture);
    }

    public String getActualCostFurniture() {
        return actualCostFurniture.get();
    }

    public SimpleStringProperty actualCostFurnitureProperty() {
        return actualCostFurniture;
    }

    public void setActualCostFurniture(String actualCostFurniture) {
        this.actualCostFurniture.set(actualCostFurniture);
    }

    public String getActualDifferenceFurniture() {
        return actualDifferenceFurniture.get();
    }

    public SimpleStringProperty actualDifferenceFurnitureProperty() {
        return actualDifferenceFurniture;
    }

    public void setActualDifferenceFurniture(String actualDifferenceFurniture) {
        this.actualDifferenceFurniture.set(actualDifferenceFurniture);
    }

    public String getPaidFurniture() {
        return paidFurniture.get();
    }

    public SimpleStringProperty paidFurnitureProperty() {
        return paidFurniture;
    }

    public void setPaidFurniture(String paidFurniture) {
        this.paidFurniture.set(paidFurniture);
    }

    public String getResidueFurniture() {
        return residueFurniture.get();
    }

    public SimpleStringProperty residueFurnitureProperty() {
        return residueFurniture;
    }

    public void setResidueFurniture(String residueFurniture) {
        this.residueFurniture.set(residueFurniture);
    }

    public String getDateOfDeliveryFurniture() {
        return dateOfDeliveryFurniture.get();
    }

    public SimpleStringProperty dateOfDeliveryFurnitureProperty() {
        return dateOfDeliveryFurniture;
    }

    public void setDateOfDeliveryFurniture(String dateOfDeliveryFurniture) {
        this.dateOfDeliveryFurniture.set(dateOfDeliveryFurniture);
    }

    public String getPlannedCPFurniture() {
        return plannedCPFurniture.get();
    }

    public SimpleStringProperty plannedCPFurnitureProperty() {
        return plannedCPFurniture;
    }

    public void setPlannedCPFurniture(String plannedCPFurniture) {
        this.plannedCPFurniture.set(plannedCPFurniture);
    }

    public String getActualCPFurniture() {
        return actualCPFurniture.get();
    }

    public SimpleStringProperty actualCPFurnitureProperty() {
        return actualCPFurniture;
    }

    public void setActualCPFurniture(String actualCPFurniture) {
        this.actualCPFurniture.set(actualCPFurniture);
    }

    public String getAccountFurniture() {
        return accountFurniture.get();
    }

    public SimpleStringProperty accountFurnitureProperty() {
        return accountFurniture;
    }

    public void setAccountFurniture(String accountFurniture) {
        this.accountFurniture.set(accountFurniture);
    }

    public String getContactsFurniture() {
        return contactsFurniture.get();
    }

    public SimpleStringProperty contactsFurnitureProperty() {
        return contactsFurniture;
    }

    public void setContactsFurniture(String contactsFurniture) {
        this.contactsFurniture.set(contactsFurniture);
    }

    public String getNotesFurniture() {
        return notesFurniture.get();
    }

    public SimpleStringProperty notesFurnitureProperty() {
        return notesFurniture;
    }

    public void setNotesFurniture(String notesFurniture) {
        this.notesFurniture.set(notesFurniture);
    }

    public String getCharacteristicsFurniture() {
        return characteristicsFurniture.get();
    }

    public SimpleStringProperty characteristicsFurnitureProperty() {
        return characteristicsFurniture;
    }

    public void setCharacteristicsFurniture(String characteristicsFurniture) {
        this.characteristicsFurniture.set(characteristicsFurniture);
    }
}
