package sample;

import javafx.beans.property.SimpleStringProperty;

public class AppliancesOther {
    protected SimpleStringProperty nameAppliancesOther;
    protected SimpleStringProperty unitAppliancesOther;
    protected SimpleStringProperty quantityAppliancesOther;
    protected SimpleStringProperty ordinalPriceUnitAppliancesOther;
    protected SimpleStringProperty priceCPUnitAppliancesOther;
    protected SimpleStringProperty priceCPKeyAppliancesOther;
    protected SimpleStringProperty costCPUnitAppliancesOther;
    protected SimpleStringProperty priceOrderAppliancesOther;
    protected SimpleStringProperty costCPAppliancesOther;
    protected SimpleStringProperty productionTimeAppliancesOther;
    protected SimpleStringProperty actualCostAppliancesOther;
    protected SimpleStringProperty actualDifferenceAppliancesOther;
    protected SimpleStringProperty paidAppliancesOther;
    protected SimpleStringProperty residueAppliancesOther;
    protected SimpleStringProperty dateOfDeliveryAppliancesOther;
    protected SimpleStringProperty plannedCPAppliancesOther;
    protected SimpleStringProperty actualCPAppliancesOther;
    protected SimpleStringProperty accountAppliancesOther;
    protected SimpleStringProperty contactsAppliancesOther;
    protected SimpleStringProperty notesAppliancesOther;
    protected SimpleStringProperty characteristicsAppliancesOther;

    public AppliancesOther() {
    }

    public AppliancesOther(String nameAppliancesOther, String unitAppliancesOther, String quantityAppliancesOther, String ordinalPriceUnitAppliancesOther,
                             String priceCPUnitAppliancesOther, String priceCPKeyAppliancesOther, String costCPUnitAppliancesOther, String priceOrderAppliancesOther,
                             String costCPAppliancesOther, String productionTimeAppliancesOther, String actualCostAppliancesOther,
                             String actualDifferenceAppliancesOther, String paidAppliancesOther, String residueAppliancesOther, String dateOfDeliveryAppliancesOther,
                             String plannedCPAppliancesOther, String actualCPAppliancesOther, String accountAppliancesOther, String contactsAppliancesOther,
                             String notesAppliancesOther, String characteristicsAppliancesOther) {
        this.nameAppliancesOther = new SimpleStringProperty(nameAppliancesOther);
        this.unitAppliancesOther = new SimpleStringProperty(unitAppliancesOther);
        this.quantityAppliancesOther = new SimpleStringProperty(quantityAppliancesOther);
        this.ordinalPriceUnitAppliancesOther = new SimpleStringProperty(ordinalPriceUnitAppliancesOther);
        this.priceCPUnitAppliancesOther = new SimpleStringProperty(priceCPUnitAppliancesOther);
        this.priceCPKeyAppliancesOther = new SimpleStringProperty(priceCPKeyAppliancesOther);
        this.costCPUnitAppliancesOther = new SimpleStringProperty(costCPUnitAppliancesOther);
        this.priceOrderAppliancesOther = new SimpleStringProperty(priceOrderAppliancesOther);
        this.costCPAppliancesOther = new SimpleStringProperty(costCPAppliancesOther);
        this.productionTimeAppliancesOther = new SimpleStringProperty(productionTimeAppliancesOther);
        this.actualCostAppliancesOther = new SimpleStringProperty(actualCostAppliancesOther);
        this.actualDifferenceAppliancesOther = new SimpleStringProperty(actualDifferenceAppliancesOther);
        this.paidAppliancesOther = new SimpleStringProperty(paidAppliancesOther);
        this.residueAppliancesOther = new SimpleStringProperty(residueAppliancesOther);
        this.dateOfDeliveryAppliancesOther = new SimpleStringProperty(dateOfDeliveryAppliancesOther);
        this.plannedCPAppliancesOther = new SimpleStringProperty(plannedCPAppliancesOther);
        this.actualCPAppliancesOther = new SimpleStringProperty(actualCPAppliancesOther);
        this.accountAppliancesOther = new SimpleStringProperty(accountAppliancesOther);
        this.contactsAppliancesOther = new SimpleStringProperty(contactsAppliancesOther);
        this.notesAppliancesOther = new SimpleStringProperty(notesAppliancesOther);
        this.characteristicsAppliancesOther = new SimpleStringProperty(characteristicsAppliancesOther);
    }

    public String getNameAppliancesOther() {
        return nameAppliancesOther.get();
    }

    public SimpleStringProperty nameAppliancesOtherProperty() {
        return nameAppliancesOther;
    }

    public void setNameMaterialOther(String nameAppliancesKitchen) {
        this.nameAppliancesOther = new SimpleStringProperty(nameAppliancesKitchen);
    }

    public String getUnitAppliancesOther() {
        return unitAppliancesOther.get();
    }

    public SimpleStringProperty unitAppliancesOtherProperty() {
        return unitAppliancesOther;
    }

    public void setUnitAppliancesOther(String unitAppliancesOther) {
        this.unitAppliancesOther = new SimpleStringProperty(unitAppliancesOther);
    }

    public String getQuantityAppliancesOther() {
        return quantityAppliancesOther.get();
    }

    public SimpleStringProperty quantityAppliancesOtherProperty() {
        return quantityAppliancesOther;
    }

    public void setQuantityAppliancesOther(String quantityAppliancesOther) {
        this.quantityAppliancesOther = new SimpleStringProperty(quantityAppliancesOther);
    }

    public String getOrdinalPriceUnitAppliancesOther() {
        return ordinalPriceUnitAppliancesOther.get();
    }

    public SimpleStringProperty ordinalPriceUnitAppliancesOtherProperty() {
        return ordinalPriceUnitAppliancesOther;
    }

    public void setOrdinalPriceUnitAppliancesOther(String ordinalPriceUnitAppliancesOther) {
        this.ordinalPriceUnitAppliancesOther = new SimpleStringProperty(ordinalPriceUnitAppliancesOther);
    }

    public String getPriceCPUnitAppliancesOther() {
        return priceCPUnitAppliancesOther.get();
    }

    public SimpleStringProperty priceCPUnitAppliancesOtherProperty() {
        return priceCPUnitAppliancesOther;
    }

    public void setPriceCPUnitAppliancesOther(String priceCPUnitAppliancesOther) {
        this.priceCPUnitAppliancesOther = new SimpleStringProperty(priceCPUnitAppliancesOther);
    }

    public String getPriceCPKeyAppliancesOther() {
        return priceCPKeyAppliancesOther.get();
    }

    public SimpleStringProperty priceCPKeyAppliancesOtherProperty() {
        return priceCPKeyAppliancesOther;
    }

    public void setPriceCPKeyAppliancesOther(String priceCPKeyAppliancesOther) {
        this.priceCPKeyAppliancesOther = new SimpleStringProperty(priceCPKeyAppliancesOther);
    }

    public String getCostCPUnitAppliancesOther() {
        return costCPUnitAppliancesOther.get();
    }

    public SimpleStringProperty costCPUnitAppliancesOtherProperty() {
        return costCPUnitAppliancesOther;
    }

    public void setCostCPUnitAppliancesOther(String costCPUnitAppliancesOther) {
        this.costCPUnitAppliancesOther = new SimpleStringProperty(costCPUnitAppliancesOther);
    }

    public String getPriceOrderAppliancesOther() {
        return priceOrderAppliancesOther.get();
    }

    public SimpleStringProperty priceOrderAppliancesOtherProperty() {
        return priceOrderAppliancesOther;
    }

    public void setPriceOrderAppliancesOther(String priceOrderAppliancesOther) {
        this.priceOrderAppliancesOther = new SimpleStringProperty(priceOrderAppliancesOther);
    }

    public String getCostCPAppliancesOther() {
        return costCPAppliancesOther.get();
    }

    public SimpleStringProperty costCPAppliancesOtherProperty() {
        return costCPAppliancesOther;
    }

    public void setCostCPAppliancesOther(String costCPAppliancesOther) {
        this.costCPAppliancesOther = new SimpleStringProperty(costCPAppliancesOther);
    }

    public String getProductionTimeAppliancesOther() {
        return productionTimeAppliancesOther.get();
    }

    public SimpleStringProperty productionTimeAppliancesOtherProperty() {
        return productionTimeAppliancesOther;
    }

    public void setProductionTimeAppliancesOther(String productionTimeAppliancesOther) {
        this.productionTimeAppliancesOther = new SimpleStringProperty(productionTimeAppliancesOther);
    }

    public String getActualCostAppliancesOther() {
        return actualCostAppliancesOther.get();
    }

    public SimpleStringProperty actualCostAppliancesOtherProperty() {
        return actualCostAppliancesOther;
    }

    public void setActualCostAppliancesOther(String actualCostAppliancesOther) {
        this.actualCostAppliancesOther = new SimpleStringProperty(actualCostAppliancesOther);
    }

    public String getActualDifferenceAppliancesOther() {
        return actualDifferenceAppliancesOther.get();
    }

    public SimpleStringProperty actualDifferenceAppliancesOtherProperty() {
        return actualDifferenceAppliancesOther;
    }

    public void setActualDifferenceAppliancesOther(String actualDifferenceAppliancesOther) {
        this.actualDifferenceAppliancesOther = new SimpleStringProperty(actualDifferenceAppliancesOther);
    }

    public String getPaidAppliancesOther() {
        return paidAppliancesOther.get();
    }

    public SimpleStringProperty paidAppliancesOtherProperty() {
        return paidAppliancesOther;
    }

    public void setPaidAppliancesOther(String paidAppliancesOther) {
        this.paidAppliancesOther = new SimpleStringProperty(paidAppliancesOther);
    }

    public String getResidueAppliancesOther() {
        return residueAppliancesOther.get();
    }

    public SimpleStringProperty residueAppliancesOtherProperty() {
        return residueAppliancesOther;
    }

    public void setResidueAppliancesOther(String residueAppliancesOther) {
        this.residueAppliancesOther = new SimpleStringProperty(residueAppliancesOther);
    }

    public String getDateOfDeliveryAppliancesOther() {
        return dateOfDeliveryAppliancesOther.get();
    }

    public SimpleStringProperty dateOfDeliveryAppliancesOtherProperty() {
        return dateOfDeliveryAppliancesOther;
    }

    public void setDateOfDeliveryAppliancesOther(String dateOfDeliveryAppliancesOther) {
        this.dateOfDeliveryAppliancesOther = new SimpleStringProperty(dateOfDeliveryAppliancesOther);
    }

    public String getPlannedCPAppliancesOther() {
        return plannedCPAppliancesOther.get();
    }

    public SimpleStringProperty plannedCPAppliancesOtherProperty() {
        return plannedCPAppliancesOther;
    }

    public void setPlannedCPAppliancesOther(String plannedCPAppliancesOther) {
        this.plannedCPAppliancesOther = new SimpleStringProperty(plannedCPAppliancesOther);
    }

    public String getActualCPAppliancesOther() {
        return actualCPAppliancesOther.get();
    }

    public SimpleStringProperty actualCPAppliancesOtherProperty() {
        return actualCPAppliancesOther;
    }

    public void setActualCPAppliancesOther(String actualCPAppliancesOther) {
        this.actualCPAppliancesOther = new SimpleStringProperty(actualCPAppliancesOther);
    }

    public String getAccountAppliancesOther() {
        return accountAppliancesOther.get();
    }

    public SimpleStringProperty accountAppliancesOtherProperty() {
        return accountAppliancesOther;
    }

    public void setAccountAppliancesOther(String accountAppliancesOther) {
        this.accountAppliancesOther = new SimpleStringProperty(accountAppliancesOther);
    }

    public String getContactsAppliancesOther() {
        return contactsAppliancesOther.get();
    }

    public SimpleStringProperty contactsAppliancesOtherProperty() {
        return contactsAppliancesOther;
    }

    public void setContactsAppliancesOther(String contactsAppliancesOther) {
        this.contactsAppliancesOther = new SimpleStringProperty(contactsAppliancesOther);
    }

    public String getNotesAppliancesOther() {
        return notesAppliancesOther.get();
    }

    public SimpleStringProperty notesAppliancesOtherProperty() {
        return notesAppliancesOther;
    }

    public void setNotesAppliancesOther(String notesAppliancesOther) {
        this.notesAppliancesOther = new SimpleStringProperty(notesAppliancesOther);
    }

    public String getCharacteristicsAppliancesOther() {
        return characteristicsAppliancesOther.get();
    }

    public SimpleStringProperty characteristicsAppliancesOtherProperty() {
        return characteristicsAppliancesOther;
    }

    public void setCharacteristicsAppliancesOther(String characteristicsAppliancesOther) {
        this.characteristicsAppliancesOther = new SimpleStringProperty(characteristicsAppliancesOther);
    }
}
