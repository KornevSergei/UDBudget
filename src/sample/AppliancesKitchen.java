package sample;

import javafx.beans.property.SimpleStringProperty;

public class AppliancesKitchen {
    protected SimpleStringProperty nameAppliancesKitchen;
    protected SimpleStringProperty unitAppliancesKitchen;
    protected SimpleStringProperty quantityAppliancesKitchen;
    protected SimpleStringProperty ordinalPriceUnitAppliancesKitchen;
    protected SimpleStringProperty priceCPUnitAppliancesKitchen;
    protected SimpleStringProperty priceCPKeyAppliancesKitchen;
    protected SimpleStringProperty costCPUnitAppliancesKitchen;
    protected SimpleStringProperty priceOrderAppliancesKitchen;
    protected SimpleStringProperty costCPAppliancesKitchen;
    protected SimpleStringProperty productionTimeAppliancesKitchen;
    protected SimpleStringProperty actualCostAppliancesKitchen;
    protected SimpleStringProperty actualDifferenceAppliancesKitchen;
    protected SimpleStringProperty paidAppliancesKitchen;
    protected SimpleStringProperty residueAppliancesKitchen;
    protected SimpleStringProperty dateOfDeliveryAppliancesKitchen;
    protected SimpleStringProperty plannedCPAppliancesKitchen;
    protected SimpleStringProperty actualCPAppliancesKitchen;
    protected SimpleStringProperty accountAppliancesKitchen;
    protected SimpleStringProperty contactsAppliancesKitchen;
    protected SimpleStringProperty notesAppliancesKitchen;
    protected SimpleStringProperty characteristicsAppliancesKitchen;

    public AppliancesKitchen() {
    }

    public AppliancesKitchen(String nameAppliancesKitchen, String unitAppliancesKitchen, String quantityAppliancesKitchen, String ordinalPriceUnitAppliancesKitchen,
                         String priceCPUnitAppliancesKitchen, String priceCPKeyAppliancesKitchen, String costCPUnitAppliancesKitchen, String priceOrderAppliancesKitchen,
                         String costCPAppliancesKitchen, String productionTimeAppliancesKitchen, String actualCostAppliancesKitchen,
                         String actualDifferenceAppliancesKitchen, String paidAppliancesKitchen, String residueAppliancesKitchen, String dateOfDeliveryAppliancesKitchen,
                         String plannedCPAppliancesKitchen, String actualCPAppliancesKitchen, String accountAppliancesKitchen, String contactsAppliancesKitchen,
                         String notesAppliancesKitchen, String characteristicsAppliancesKitchen) {
        this.nameAppliancesKitchen = new SimpleStringProperty(nameAppliancesKitchen);
        this.unitAppliancesKitchen = new SimpleStringProperty(unitAppliancesKitchen);
        this.quantityAppliancesKitchen = new SimpleStringProperty(quantityAppliancesKitchen);
        this.ordinalPriceUnitAppliancesKitchen = new SimpleStringProperty(ordinalPriceUnitAppliancesKitchen);
        this.priceCPUnitAppliancesKitchen = new SimpleStringProperty(priceCPUnitAppliancesKitchen);
        this.priceCPKeyAppliancesKitchen = new SimpleStringProperty(priceCPKeyAppliancesKitchen);
        this.costCPUnitAppliancesKitchen = new SimpleStringProperty(costCPUnitAppliancesKitchen);
        this.priceOrderAppliancesKitchen = new SimpleStringProperty(priceOrderAppliancesKitchen);
        this.costCPAppliancesKitchen = new SimpleStringProperty(costCPAppliancesKitchen);
        this.productionTimeAppliancesKitchen = new SimpleStringProperty(productionTimeAppliancesKitchen);
        this.actualCostAppliancesKitchen = new SimpleStringProperty(actualCostAppliancesKitchen);
        this.actualDifferenceAppliancesKitchen = new SimpleStringProperty(actualDifferenceAppliancesKitchen);
        this.paidAppliancesKitchen = new SimpleStringProperty(paidAppliancesKitchen);
        this.residueAppliancesKitchen = new SimpleStringProperty(residueAppliancesKitchen);
        this.dateOfDeliveryAppliancesKitchen = new SimpleStringProperty(dateOfDeliveryAppliancesKitchen);
        this.plannedCPAppliancesKitchen = new SimpleStringProperty(plannedCPAppliancesKitchen);
        this.actualCPAppliancesKitchen = new SimpleStringProperty(actualCPAppliancesKitchen);
        this.accountAppliancesKitchen = new SimpleStringProperty(accountAppliancesKitchen);
        this.contactsAppliancesKitchen = new SimpleStringProperty(contactsAppliancesKitchen);
        this.notesAppliancesKitchen = new SimpleStringProperty(notesAppliancesKitchen);
        this.characteristicsAppliancesKitchen = new SimpleStringProperty(characteristicsAppliancesKitchen);
    }

    public String getNameAppliancesKitchen() {
        return nameAppliancesKitchen.get();
    }

    public SimpleStringProperty nameAppliancesKitchenProperty() {
        return nameAppliancesKitchen;
    }

    public void setNameMaterialOther(String nameAppliancesKitchen) {
        this.nameAppliancesKitchen = new SimpleStringProperty(nameAppliancesKitchen);
    }

    public String getUnitAppliancesKitchen() {
        return unitAppliancesKitchen.get();
    }

    public SimpleStringProperty unitAppliancesKitchenProperty() {
        return unitAppliancesKitchen;
    }

    public void setUnitAppliancesKitchen(String unitAppliancesKitchen) {
        this.unitAppliancesKitchen = new SimpleStringProperty(unitAppliancesKitchen);
    }

    public String getQuantityAppliancesKitchen() {
        return quantityAppliancesKitchen.get();
    }

    public SimpleStringProperty quantityAppliancesKitchenProperty() {
        return quantityAppliancesKitchen;
    }

    public void setQuantityAppliancesKitchen(String quantityAppliancesKitchen) {
        this.quantityAppliancesKitchen = new SimpleStringProperty(quantityAppliancesKitchen);
    }

    public String getOrdinalPriceUnitAppliancesKitchen() {
        return ordinalPriceUnitAppliancesKitchen.get();
    }

    public SimpleStringProperty ordinalPriceUnitAppliancesKitchenProperty() {
        return ordinalPriceUnitAppliancesKitchen;
    }

    public void setOrdinalPriceUnitAppliancesKitchen(String ordinalPriceUnitAppliancesKitchen) {
        this.ordinalPriceUnitAppliancesKitchen = new SimpleStringProperty(ordinalPriceUnitAppliancesKitchen);
    }

    public String getPriceCPUnitAppliancesKitchen() {
        return priceCPUnitAppliancesKitchen.get();
    }

    public SimpleStringProperty priceCPUnitAppliancesKitchenProperty() {
        return priceCPUnitAppliancesKitchen;
    }

    public void setPriceCPUnitAppliancesKitchen(String priceCPUnitAppliancesKitchen) {
        this.priceCPUnitAppliancesKitchen = new SimpleStringProperty(priceCPUnitAppliancesKitchen);
    }

    public String getPriceCPKeyAppliancesKitchen() {
        return priceCPKeyAppliancesKitchen.get();
    }

    public SimpleStringProperty priceCPKeyAppliancesKitchenProperty() {
        return priceCPKeyAppliancesKitchen;
    }

    public void setPriceCPKeyAppliancesKitchen(String priceCPKeyAppliancesKitchen) {
        this.priceCPKeyAppliancesKitchen = new SimpleStringProperty(priceCPKeyAppliancesKitchen);
    }

    public String getCostCPUnitAppliancesKitchen() {
        return costCPUnitAppliancesKitchen.get();
    }

    public SimpleStringProperty costCPUnitAppliancesKitchenProperty() {
        return costCPUnitAppliancesKitchen;
    }

    public void setCostCPUnitAppliancesKitchen(String costCPUnitAppliancesKitchen) {
        this.costCPUnitAppliancesKitchen = new SimpleStringProperty(costCPUnitAppliancesKitchen);
    }

    public String getPriceOrderAppliancesKitchen() {
        return priceOrderAppliancesKitchen.get();
    }

    public SimpleStringProperty priceOrderAppliancesKitchenProperty() {
        return priceOrderAppliancesKitchen;
    }

    public void setPriceOrderAppliancesKitchen(String priceOrderAppliancesKitchen) {
        this.priceOrderAppliancesKitchen = new SimpleStringProperty(priceOrderAppliancesKitchen);
    }

    public String getCostCPAppliancesKitchen() {
        return costCPAppliancesKitchen.get();
    }

    public SimpleStringProperty costCPAppliancesKitchenProperty() {
        return costCPAppliancesKitchen;
    }

    public void setCostCPAppliancesKitchen(String costCPAppliancesKitchen) {
        this.costCPAppliancesKitchen = new SimpleStringProperty(costCPAppliancesKitchen);
    }

    public String getProductionTimeAppliancesKitchen() {
        return productionTimeAppliancesKitchen.get();
    }

    public SimpleStringProperty productionTimeAppliancesKitchenProperty() {
        return productionTimeAppliancesKitchen;
    }

    public void setProductionTimeAppliancesKitchen(String productionTimeAppliancesKitchen) {
        this.productionTimeAppliancesKitchen = new SimpleStringProperty(productionTimeAppliancesKitchen);
    }

    public String getActualCostAppliancesKitchen() {
        return actualCostAppliancesKitchen.get();
    }

    public SimpleStringProperty actualCostAppliancesKitchenProperty() {
        return actualCostAppliancesKitchen;
    }

    public void setActualCostAppliancesKitchen(String actualCostAppliancesKitchen) {
        this.actualCostAppliancesKitchen = new SimpleStringProperty(actualCostAppliancesKitchen);
    }

    public String getActualDifferenceAppliancesKitchen() {
        return actualDifferenceAppliancesKitchen.get();
    }

    public SimpleStringProperty actualDifferenceAppliancesKitchenProperty() {
        return actualDifferenceAppliancesKitchen;
    }

    public void setActualDifferenceAppliancesKitchen(String actualDifferenceAppliancesKitchen) {
        this.actualDifferenceAppliancesKitchen = new SimpleStringProperty(actualDifferenceAppliancesKitchen);
    }

    public String getPaidAppliancesKitchen() {
        return paidAppliancesKitchen.get();
    }

    public SimpleStringProperty paidAppliancesKitchenProperty() {
        return paidAppliancesKitchen;
    }

    public void setPaidAppliancesKitchen(String paidAppliancesKitchen) {
        this.paidAppliancesKitchen = new SimpleStringProperty(paidAppliancesKitchen);
    }

    public String getResidueAppliancesKitchen() {
        return residueAppliancesKitchen.get();
    }

    public SimpleStringProperty residueAppliancesKitchenProperty() {
        return residueAppliancesKitchen;
    }

    public void setResidueAppliancesKitchen(String residueAppliancesKitchen) {
        this.residueAppliancesKitchen = new SimpleStringProperty(residueAppliancesKitchen);
    }

    public String getDateOfDeliveryAppliancesKitchen() {
        return dateOfDeliveryAppliancesKitchen.get();
    }

    public SimpleStringProperty dateOfDeliveryAppliancesKitchenProperty() {
        return dateOfDeliveryAppliancesKitchen;
    }

    public void setDateOfDeliveryAppliancesKitchen(String dateOfDeliveryAppliancesKitchen) {
        this.dateOfDeliveryAppliancesKitchen = new SimpleStringProperty(dateOfDeliveryAppliancesKitchen);
    }

    public String getPlannedCPAppliancesKitchen() {
        return plannedCPAppliancesKitchen.get();
    }

    public SimpleStringProperty plannedCPAppliancesKitchenProperty() {
        return plannedCPAppliancesKitchen;
    }

    public void setPlannedCPAppliancesKitchen(String plannedCPAppliancesKitchen) {
        this.plannedCPAppliancesKitchen = new SimpleStringProperty(plannedCPAppliancesKitchen);
    }

    public String getActualCPAppliancesKitchen() {
        return actualCPAppliancesKitchen.get();
    }

    public SimpleStringProperty actualCPAppliancesKitchenProperty() {
        return actualCPAppliancesKitchen;
    }

    public void setActualCPAppliancesKitchen(String actualCPAppliancesKitchen) {
        this.actualCPAppliancesKitchen = new SimpleStringProperty(actualCPAppliancesKitchen);
    }

    public String getAccountAppliancesKitchen() {
        return accountAppliancesKitchen.get();
    }

    public SimpleStringProperty accountAppliancesKitchenProperty() {
        return accountAppliancesKitchen;
    }

    public void setAccountAppliancesKitchen(String accountAppliancesKitchen) {
        this.accountAppliancesKitchen = new SimpleStringProperty(accountAppliancesKitchen);
    }

    public String getContactsAppliancesKitchen() {
        return contactsAppliancesKitchen.get();
    }

    public SimpleStringProperty contactsAppliancesKitchenProperty() {
        return contactsAppliancesKitchen;
    }

    public void setContactsAppliancesKitchen(String contactsAppliancesKitchen) {
        this.contactsAppliancesKitchen = new SimpleStringProperty(contactsAppliancesKitchen);
    }

    public String getNotesAppliancesKitchen() {
        return notesAppliancesKitchen.get();
    }

    public SimpleStringProperty notesAppliancesKitchenProperty() {
        return notesAppliancesKitchen;
    }

    public void setNotesAppliancesKitchen(String notesAppliancesKitchen) {
        this.notesAppliancesKitchen = new SimpleStringProperty(notesAppliancesKitchen);
    }

    public String getCharacteristicsAppliancesKitchen() {
        return characteristicsAppliancesKitchen.get();
    }

    public SimpleStringProperty characteristicsAppliancesKitchenProperty() {
        return characteristicsAppliancesKitchen;
    }

    public void setCharacteristicsAppliancesKitchen(String characteristicsAppliancesKitchen) {
        this.characteristicsAppliancesKitchen = new SimpleStringProperty(characteristicsAppliancesKitchen);
    }
}
