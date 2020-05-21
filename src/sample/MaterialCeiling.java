package sample;

import javafx.beans.property.SimpleStringProperty;

public class MaterialCeiling {
    protected SimpleStringProperty nameMaterialCeiling;
    protected SimpleStringProperty unitMaterialCeiling;
    protected SimpleStringProperty quantityMaterialCeiling;
    protected SimpleStringProperty ordinalPriceUnitMaterialCeiling;
    protected SimpleStringProperty priceCPUnitMaterialCeiling;
    protected SimpleStringProperty priceCPKeyMaterialCeiling;
    protected SimpleStringProperty costCPUnitMaterialCeiling;
    protected SimpleStringProperty priceOrderMaterialCeiling;
    protected SimpleStringProperty costCPMaterialCeiling;
    protected SimpleStringProperty productionTimeMaterialCeiling;
    protected SimpleStringProperty actualCostMaterialCeiling;
    protected SimpleStringProperty actualDifferenceMaterialCeiling;
    protected SimpleStringProperty paidMaterialCeiling;
    protected SimpleStringProperty residueMaterialCeiling;
    protected SimpleStringProperty dateOfDeliveryMaterialCeiling;
    protected SimpleStringProperty plannedCPMaterialCeiling;
    protected SimpleStringProperty actualCPMaterialCeiling;
    protected SimpleStringProperty accountMaterialCeiling;
    protected SimpleStringProperty contactsMaterialCeiling;
    protected SimpleStringProperty notesMaterialCeiling;
    protected SimpleStringProperty characteristicsMaterialCeiling;

    public MaterialCeiling() {
    }

    public MaterialCeiling(String nameMaterialCeiling, String unitMaterialCeiling, String quantityMaterialCeiling, String ordinalPriceUnitMaterialCeiling,
                         String priceCPUnitMaterialCeiling, String priceCPKeyMaterialCeiling, String costCPUnitMaterialCeiling, String priceOrderMaterialCeiling,
                         String costCPMaterialCeiling, String productionTimeMaterialCeiling, String actualCostMaterialCeiling,
                         String actualDifferenceMaterialCeiling, String paidMaterialCeiling, String residueMaterialCeiling, String dateOfDeliveryMaterialCeiling,
                         String plannedCPMaterialCeiling, String actualCPMaterialCeiling, String accountMaterialCeiling, String contactsMaterialCeiling,
                         String notesMaterialCeiling, String characteristicsMaterialCeiling) {
        this.nameMaterialCeiling = new SimpleStringProperty(nameMaterialCeiling);
        this.unitMaterialCeiling = new SimpleStringProperty(unitMaterialCeiling);
        this.quantityMaterialCeiling = new SimpleStringProperty(quantityMaterialCeiling);
        this.ordinalPriceUnitMaterialCeiling = new SimpleStringProperty(ordinalPriceUnitMaterialCeiling);
        this.priceCPUnitMaterialCeiling = new SimpleStringProperty(priceCPUnitMaterialCeiling);
        this.priceCPKeyMaterialCeiling = new SimpleStringProperty(priceCPKeyMaterialCeiling);
        this.costCPUnitMaterialCeiling = new SimpleStringProperty(costCPUnitMaterialCeiling);
        this.priceOrderMaterialCeiling = new SimpleStringProperty(priceOrderMaterialCeiling);
        this.costCPMaterialCeiling = new SimpleStringProperty(costCPMaterialCeiling);
        this.productionTimeMaterialCeiling = new SimpleStringProperty(productionTimeMaterialCeiling);
        this.actualCostMaterialCeiling = new SimpleStringProperty(actualCostMaterialCeiling);
        this.actualDifferenceMaterialCeiling = new SimpleStringProperty(actualDifferenceMaterialCeiling);
        this.paidMaterialCeiling = new SimpleStringProperty(paidMaterialCeiling);
        this.residueMaterialCeiling = new SimpleStringProperty(residueMaterialCeiling);
        this.dateOfDeliveryMaterialCeiling = new SimpleStringProperty(dateOfDeliveryMaterialCeiling);
        this.plannedCPMaterialCeiling = new SimpleStringProperty(plannedCPMaterialCeiling);
        this.actualCPMaterialCeiling = new SimpleStringProperty(actualCPMaterialCeiling);
        this.accountMaterialCeiling = new SimpleStringProperty(accountMaterialCeiling);
        this.contactsMaterialCeiling = new SimpleStringProperty(contactsMaterialCeiling);
        this.notesMaterialCeiling = new SimpleStringProperty(notesMaterialCeiling);
        this.characteristicsMaterialCeiling = new SimpleStringProperty(characteristicsMaterialCeiling);
    }

    public String getNameMaterialCeiling() {
        return nameMaterialCeiling.get();
    }

    public SimpleStringProperty nameMaterialCeilingProperty() {
        return nameMaterialCeiling;
    }

    public void setNameMaterialCeiling(String nameMaterialCeiling) {
        this.nameMaterialCeiling = new SimpleStringProperty(nameMaterialCeiling);
    }

    public String getUnitMaterialCeiling() {
        return unitMaterialCeiling.get();
    }

    public SimpleStringProperty unitMaterialCeilingProperty() {
        return unitMaterialCeiling;
    }

    public void setUnitMaterialCeiling(String unitMaterialCeiling) {
        this.unitMaterialCeiling = new SimpleStringProperty(unitMaterialCeiling);
    }

    public String getQuantityMaterialCeiling() {
        return quantityMaterialCeiling.get();
    }

    public SimpleStringProperty quantityMaterialCeilingProperty() {
        return quantityMaterialCeiling;
    }

    public void setQuantityMaterialCeiling(String quantityMaterialCeiling) {
        this.quantityMaterialCeiling = new SimpleStringProperty(quantityMaterialCeiling);
    }

    public String getOrdinalPriceUnitMaterialCeiling() {
        return ordinalPriceUnitMaterialCeiling.get();
    }

    public SimpleStringProperty ordinalPriceUnitMaterialCeilingProperty() {
        return ordinalPriceUnitMaterialCeiling;
    }

    public void setOrdinalPriceUnitMaterialCeiling(String ordinalPriceUnitMaterialCeiling) {
        this.ordinalPriceUnitMaterialCeiling = new SimpleStringProperty(ordinalPriceUnitMaterialCeiling);
    }

    public String getPriceCPUnitMaterialCeiling() {
        return priceCPUnitMaterialCeiling.get();
    }

    public SimpleStringProperty priceCPUnitMaterialCeilingProperty() {
        return priceCPUnitMaterialCeiling;
    }

    public void setPriceCPUnitMaterialCeiling(String priceCPUnitMaterialCeiling) {
        this.priceCPUnitMaterialCeiling = new SimpleStringProperty(priceCPUnitMaterialCeiling);
    }

    public String getPriceCPKeyMaterialCeiling() {
        return priceCPKeyMaterialCeiling.get();
    }

    public SimpleStringProperty priceCPKeyMaterialCeilingProperty() {
        return priceCPKeyMaterialCeiling;
    }

    public void setPriceCPKeyMaterialCeiling(String priceCPKeyMaterialCeiling) {
        this.priceCPKeyMaterialCeiling = new SimpleStringProperty(priceCPKeyMaterialCeiling);
    }

    public String getCostCPUnitMaterialCeiling() {
        return costCPUnitMaterialCeiling.get();
    }

    public SimpleStringProperty costCPUnitMaterialCeilingProperty() {
        return costCPUnitMaterialCeiling;
    }

    public void setCostCPUnitMaterialCeiling(String costCPUnitMaterialCeiling) {
        this.costCPUnitMaterialCeiling = new SimpleStringProperty(costCPUnitMaterialCeiling);
    }

    public String getPriceOrderMaterialCeiling() {
        return priceOrderMaterialCeiling.get();
    }

    public SimpleStringProperty priceOrderMaterialCeilingProperty() {
        return priceOrderMaterialCeiling;
    }

    public void setPriceOrderMaterialCeiling(String priceOrderMaterialCeiling) {
        this.priceOrderMaterialCeiling = new SimpleStringProperty(priceOrderMaterialCeiling);
    }

    public String getCostCPMaterialCeiling() {
        return costCPMaterialCeiling.get();
    }

    public SimpleStringProperty costCPMaterialCeilingProperty() {
        return costCPMaterialCeiling;
    }

    public void setCostCPMaterialCeiling(String costCPMaterialCeiling) {
        this.costCPMaterialCeiling = new SimpleStringProperty(costCPMaterialCeiling);
    }

    public String getProductionTimeMaterialCeiling() {
        return productionTimeMaterialCeiling.get();
    }

    public SimpleStringProperty productionTimeMaterialCeilingProperty() {
        return productionTimeMaterialCeiling;
    }

    public void setProductionTimeMaterialCeiling(String productionTimeMaterialCeiling) {
        this.productionTimeMaterialCeiling = new SimpleStringProperty(productionTimeMaterialCeiling);
    }

    public String getActualCostMaterialCeiling() {
        return actualCostMaterialCeiling.get();
    }

    public SimpleStringProperty actualCostMaterialCeilingProperty() {
        return actualCostMaterialCeiling;
    }

    public void setActualCostMaterialCeiling(String actualCostMaterialCeiling) {
        this.actualCostMaterialCeiling = new SimpleStringProperty(actualCostMaterialCeiling);
    }

    public String getActualDifferenceMaterialCeiling() {
        return actualDifferenceMaterialCeiling.get();
    }

    public SimpleStringProperty actualDifferenceMaterialCeilingProperty() {
        return actualDifferenceMaterialCeiling;
    }

    public void setActualDifferenceMaterialCeiling(String actualDifferenceMaterialCeiling) {
        this.actualDifferenceMaterialCeiling = new SimpleStringProperty(actualDifferenceMaterialCeiling);
    }

    public String getPaidMaterialCeiling() {
        return paidMaterialCeiling.get();
    }

    public SimpleStringProperty paidMaterialCeilingProperty() {
        return paidMaterialCeiling;
    }

    public void setPaidMaterialCeiling(String paidMaterialCeiling) {
        this.paidMaterialCeiling = new SimpleStringProperty(paidMaterialCeiling);
    }

    public String getResidueMaterialCeiling() {
        return residueMaterialCeiling.get();
    }

    public SimpleStringProperty residueMaterialCeilingProperty() {
        return residueMaterialCeiling;
    }

    public void setResidueMaterialCeiling(String residueMaterialCeiling) {
        this.residueMaterialCeiling = new SimpleStringProperty(residueMaterialCeiling);
    }

    public String getDateOfDeliveryMaterialCeiling() {
        return dateOfDeliveryMaterialCeiling.get();
    }

    public SimpleStringProperty dateOfDeliveryMaterialCeilingProperty() {
        return dateOfDeliveryMaterialCeiling;
    }

    public void setDateOfDeliveryMaterialCeiling(String dateOfDeliveryMaterialCeiling) {
        this.dateOfDeliveryMaterialCeiling = new SimpleStringProperty(dateOfDeliveryMaterialCeiling);
    }

    public String getPlannedCPMaterialCeiling() {
        return plannedCPMaterialCeiling.get();
    }

    public SimpleStringProperty plannedCPMaterialCeilingProperty() {
        return plannedCPMaterialCeiling;
    }

    public void setPlannedCPMaterialCeiling(String plannedCPMaterialCeiling) {
        this.plannedCPMaterialCeiling = new SimpleStringProperty(plannedCPMaterialCeiling);
    }

    public String getActualCPMaterialCeiling() {
        return actualCPMaterialCeiling.get();
    }

    public SimpleStringProperty actualCPMaterialCeilingProperty() {
        return actualCPMaterialCeiling;
    }

    public void setActualCPMaterialCeiling(String actualCPMaterialCeiling) {
        this.actualCPMaterialCeiling = new SimpleStringProperty(actualCPMaterialCeiling);
    }

    public String getAccountMaterialCeiling() {
        return accountMaterialCeiling.get();
    }

    public SimpleStringProperty accountMaterialCeilingProperty() {
        return accountMaterialCeiling;
    }

    public void setAccountMaterialCeiling(String accountMaterialCeiling) {
        this.accountMaterialCeiling = new SimpleStringProperty(accountMaterialCeiling);
    }

    public String getContactsMaterialCeiling() {
        return contactsMaterialCeiling.get();
    }

    public SimpleStringProperty contactsMaterialCeilingProperty() {
        return contactsMaterialCeiling;
    }

    public void setContactsMaterialCeiling(String contactsMaterialCeiling) {
        this.contactsMaterialCeiling = new SimpleStringProperty(contactsMaterialCeiling);
    }

    public String getNotesMaterialCeiling() {
        return notesMaterialCeiling.get();
    }

    public SimpleStringProperty notesMaterialCeilingProperty() {
        return notesMaterialCeiling;
    }

    public void setNotesMaterialCeiling(String notesMaterialCeiling) {
        this.notesMaterialCeiling = new SimpleStringProperty(notesMaterialCeiling);
    }

    public String getCharacteristicsMaterialCeiling() {
        return characteristicsMaterialCeiling.get();
    }

    public SimpleStringProperty characteristicsMaterialCeilingProperty() {
        return characteristicsMaterialCeiling;
    }

    public void setCharacteristicsMaterialCeiling(String characteristicsMaterialCeiling) {
        this.characteristicsMaterialCeiling = new SimpleStringProperty(characteristicsMaterialCeiling);
    }
}
