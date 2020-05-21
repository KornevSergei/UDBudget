package sample;

import javafx.beans.property.SimpleStringProperty;

public class MaterialOther {
    protected SimpleStringProperty nameMaterialOther;
    protected SimpleStringProperty unitMaterialOther;
    protected SimpleStringProperty quantityMaterialOther;
    protected SimpleStringProperty ordinalPriceUnitMaterialOther;
    protected SimpleStringProperty priceCPUnitMaterialOther;
    protected SimpleStringProperty priceCPKeyMaterialOther;
    protected SimpleStringProperty costCPUnitMaterialOther;
    protected SimpleStringProperty priceOrderMaterialOther;
    protected SimpleStringProperty costCPMaterialOther;
    protected SimpleStringProperty productionTimeMaterialOther;
    protected SimpleStringProperty actualCostMaterialOther;
    protected SimpleStringProperty actualDifferenceMaterialOther;
    protected SimpleStringProperty paidMaterialOther;
    protected SimpleStringProperty residueMaterialOther;
    protected SimpleStringProperty dateOfDeliveryMaterialOther;
    protected SimpleStringProperty plannedCPMaterialOther;
    protected SimpleStringProperty actualCPMaterialOther;
    protected SimpleStringProperty accountMaterialOther;
    protected SimpleStringProperty contactsMaterialOther;
    protected SimpleStringProperty notesMaterialOther;
    protected SimpleStringProperty characteristicsMaterialOther;

    public MaterialOther() {
    }

    public MaterialOther(String nameMaterialOther, String unitMaterialOther, String quantityMaterialOther, String ordinalPriceUnitMaterialOther,
                           String priceCPUnitMaterialOther, String priceCPKeyMaterialOther, String costCPUnitMaterialOther, String priceOrderMaterialOther,
                           String costCPMaterialOther, String productionTimeMaterialOther, String actualCostMaterialOther,
                           String actualDifferenceMaterialOther, String paidMaterialOther, String residueMaterialOther, String dateOfDeliveryMaterialOther,
                           String plannedCPMaterialOther, String actualCPMaterialOther, String accountMaterialOther, String contactsMaterialOther,
                           String notesMaterialOther, String characteristicsMaterialOther) {
        this.nameMaterialOther = new SimpleStringProperty(nameMaterialOther);
        this.unitMaterialOther = new SimpleStringProperty(unitMaterialOther);
        this.quantityMaterialOther = new SimpleStringProperty(quantityMaterialOther);
        this.ordinalPriceUnitMaterialOther = new SimpleStringProperty(ordinalPriceUnitMaterialOther);
        this.priceCPUnitMaterialOther = new SimpleStringProperty(priceCPUnitMaterialOther);
        this.priceCPKeyMaterialOther = new SimpleStringProperty(priceCPKeyMaterialOther);
        this.costCPUnitMaterialOther = new SimpleStringProperty(costCPUnitMaterialOther);
        this.priceOrderMaterialOther = new SimpleStringProperty(priceOrderMaterialOther);
        this.costCPMaterialOther = new SimpleStringProperty(costCPMaterialOther);
        this.productionTimeMaterialOther = new SimpleStringProperty(productionTimeMaterialOther);
        this.actualCostMaterialOther = new SimpleStringProperty(actualCostMaterialOther);
        this.actualDifferenceMaterialOther = new SimpleStringProperty(actualDifferenceMaterialOther);
        this.paidMaterialOther = new SimpleStringProperty(paidMaterialOther);
        this.residueMaterialOther = new SimpleStringProperty(residueMaterialOther);
        this.dateOfDeliveryMaterialOther = new SimpleStringProperty(dateOfDeliveryMaterialOther);
        this.plannedCPMaterialOther = new SimpleStringProperty(plannedCPMaterialOther);
        this.actualCPMaterialOther = new SimpleStringProperty(actualCPMaterialOther);
        this.accountMaterialOther = new SimpleStringProperty(accountMaterialOther);
        this.contactsMaterialOther = new SimpleStringProperty(contactsMaterialOther);
        this.notesMaterialOther = new SimpleStringProperty(notesMaterialOther);
        this.characteristicsMaterialOther = new SimpleStringProperty(characteristicsMaterialOther);
    }

    public String getNameMaterialOther() {
        return nameMaterialOther.get();
    }

    public SimpleStringProperty nameMaterialOtherProperty() {
        return nameMaterialOther;
    }

    public void setNameMaterialOther(String nameMaterialOther) {
        this.nameMaterialOther = new SimpleStringProperty(nameMaterialOther);
    }

    public String getUnitMaterialOther() {
        return unitMaterialOther.get();
    }

    public SimpleStringProperty unitMaterialOtherProperty() {
        return unitMaterialOther;
    }

    public void setUnitMaterialOther(String unitMaterialOther) {
        this.unitMaterialOther = new SimpleStringProperty(unitMaterialOther);
    }

    public String getQuantityMaterialOther() {
        return quantityMaterialOther.get();
    }

    public SimpleStringProperty quantityMaterialOtherProperty() {
        return quantityMaterialOther;
    }

    public void setQuantityMaterialOther(String quantityMaterialOther) {
        this.quantityMaterialOther = new SimpleStringProperty(quantityMaterialOther);
    }

    public String getOrdinalPriceUnitMaterialOther() {
        return ordinalPriceUnitMaterialOther.get();
    }

    public SimpleStringProperty ordinalPriceUnitMaterialOtherProperty() {
        return ordinalPriceUnitMaterialOther;
    }

    public void setOrdinalPriceUnitMaterialOther(String ordinalPriceUnitMaterialOther) {
        this.ordinalPriceUnitMaterialOther = new SimpleStringProperty(ordinalPriceUnitMaterialOther);
    }

    public String getPriceCPUnitMaterialOther() {
        return priceCPUnitMaterialOther.get();
    }

    public SimpleStringProperty priceCPUnitMaterialOtherProperty() {
        return priceCPUnitMaterialOther;
    }

    public void setPriceCPUnitMaterialOther(String priceCPUnitMaterialOther) {
        this.priceCPUnitMaterialOther = new SimpleStringProperty(priceCPUnitMaterialOther);
    }

    public String getPriceCPKeyMaterialOther() {
        return priceCPKeyMaterialOther.get();
    }

    public SimpleStringProperty priceCPKeyMaterialOtherProperty() {
        return priceCPKeyMaterialOther;
    }

    public void setPriceCPKeyMaterialOther(String priceCPKeyMaterialOther) {
        this.priceCPKeyMaterialOther = new SimpleStringProperty(priceCPKeyMaterialOther);
    }

    public String getCostCPUnitMaterialOther() {
        return costCPUnitMaterialOther.get();
    }

    public SimpleStringProperty costCPUnitMaterialOtherProperty() {
        return costCPUnitMaterialOther;
    }

    public void setCostCPUnitMaterialOther(String costCPUnitMaterialOther) {
        this.costCPUnitMaterialOther = new SimpleStringProperty(costCPUnitMaterialOther);
    }

    public String getPriceOrderMaterialOther() {
        return priceOrderMaterialOther.get();
    }

    public SimpleStringProperty priceOrderMaterialOtherProperty() {
        return priceOrderMaterialOther;
    }

    public void setPriceOrderMaterialOther(String priceOrderMaterialOther) {
        this.priceOrderMaterialOther = new SimpleStringProperty(priceOrderMaterialOther);
    }

    public String getCostCPMaterialOther() {
        return costCPMaterialOther.get();
    }

    public SimpleStringProperty costCPMaterialOtherProperty() {
        return costCPMaterialOther;
    }

    public void setCostCPMaterialOther(String costCPMaterialOther) {
        this.costCPMaterialOther = new SimpleStringProperty(costCPMaterialOther);
    }

    public String getProductionTimeMaterialOther() {
        return productionTimeMaterialOther.get();
    }

    public SimpleStringProperty productionTimeMaterialOtherProperty() {
        return productionTimeMaterialOther;
    }

    public void setProductionTimeMaterialOther(String productionTimeMaterialOther) {
        this.productionTimeMaterialOther = new SimpleStringProperty(productionTimeMaterialOther);
    }

    public String getActualCostMaterialOther() {
        return actualCostMaterialOther.get();
    }

    public SimpleStringProperty actualCostMaterialOtherProperty() {
        return actualCostMaterialOther;
    }

    public void setActualCostMaterialOther(String actualCostMaterialOther) {
        this.actualCostMaterialOther = new SimpleStringProperty(actualCostMaterialOther);
    }

    public String getActualDifferenceMaterialOther() {
        return actualDifferenceMaterialOther.get();
    }

    public SimpleStringProperty actualDifferenceMaterialOtherProperty() {
        return actualDifferenceMaterialOther;
    }

    public void setActualDifferenceMaterialOther(String actualDifferenceMaterialOther) {
        this.actualDifferenceMaterialOther = new SimpleStringProperty(actualDifferenceMaterialOther);
    }

    public String getPaidMaterialOther() {
        return paidMaterialOther.get();
    }

    public SimpleStringProperty paidMaterialOtherProperty() {
        return paidMaterialOther;
    }

    public void setPaidMaterialOther(String paidMaterialOther) {
        this.paidMaterialOther = new SimpleStringProperty(paidMaterialOther);
    }

    public String getResidueMaterialOther() {
        return residueMaterialOther.get();
    }

    public SimpleStringProperty residueMaterialOtherProperty() {
        return residueMaterialOther;
    }

    public void setResidueMaterialOther(String residueMaterialOther) {
        this.residueMaterialOther = new SimpleStringProperty(residueMaterialOther);
    }

    public String getDateOfDeliveryMaterialOther() {
        return dateOfDeliveryMaterialOther.get();
    }

    public SimpleStringProperty dateOfDeliveryMaterialOtherProperty() {
        return dateOfDeliveryMaterialOther;
    }

    public void setDateOfDeliveryMaterialOther(String dateOfDeliveryMaterialOther) {
        this.dateOfDeliveryMaterialOther = new SimpleStringProperty(dateOfDeliveryMaterialOther);
    }

    public String getPlannedCPMaterialOther() {
        return plannedCPMaterialOther.get();
    }

    public SimpleStringProperty plannedCPMaterialOtherProperty() {
        return plannedCPMaterialOther;
    }

    public void setPlannedCPMaterialOther(String plannedCPMaterialOther) {
        this.plannedCPMaterialOther = new SimpleStringProperty(plannedCPMaterialOther);
    }

    public String getActualCPMaterialOther() {
        return actualCPMaterialOther.get();
    }

    public SimpleStringProperty actualCPMaterialOtherProperty() {
        return actualCPMaterialOther;
    }

    public void setActualCPMaterialOther(String actualCPMaterialOther) {
        this.actualCPMaterialOther = new SimpleStringProperty(actualCPMaterialOther);
    }

    public String getAccountMaterialOther() {
        return accountMaterialOther.get();
    }

    public SimpleStringProperty accountMaterialOtherProperty() {
        return accountMaterialOther;
    }

    public void setAccountMaterialOther(String accountMaterialOther) {
        this.accountMaterialOther = new SimpleStringProperty(accountMaterialOther);
    }

    public String getContactsMaterialOther() {
        return contactsMaterialOther.get();
    }

    public SimpleStringProperty contactsMaterialOtherProperty() {
        return contactsMaterialOther;
    }

    public void setContactsMaterialOther(String contactsMaterialOther) {
        this.contactsMaterialOther = new SimpleStringProperty(contactsMaterialOther);
    }

    public String getNotesMaterialOther() {
        return notesMaterialOther.get();
    }

    public SimpleStringProperty notesMaterialOtherProperty() {
        return notesMaterialOther;
    }

    public void setNotesMaterialOther(String notesMaterialOther) {
        this.notesMaterialOther = new SimpleStringProperty(notesMaterialOther);
    }

    public String getCharacteristicsMaterialOther() {
        return characteristicsMaterialOther.get();
    }

    public SimpleStringProperty characteristicsMaterialOtherProperty() {
        return characteristicsMaterialOther;
    }

    public void setCharacteristicsMaterialOther(String characteristicsMaterialOther) {
        this.characteristicsMaterialOther = new SimpleStringProperty(characteristicsMaterialOther);
    }
}
