package sample;

import javafx.beans.property.SimpleStringProperty;

public class Material {
    protected SimpleStringProperty nameMaterial;
    protected SimpleStringProperty unitMaterial;
    protected SimpleStringProperty quantityMaterial;
    protected SimpleStringProperty ordinalPriceUnitMaterial;
    protected SimpleStringProperty priceCPUnitMaterial;
    protected SimpleStringProperty priceCPKeyMaterial;
    protected SimpleStringProperty costCPUnitMaterial;
    protected SimpleStringProperty priceOrderMaterial;
    protected SimpleStringProperty costCPMaterial;
    protected SimpleStringProperty productionTimeMaterial;
    protected SimpleStringProperty actualCostMaterial;
    protected SimpleStringProperty actualDifferenceMaterial;
    protected SimpleStringProperty paidMaterial;
    protected SimpleStringProperty residueMaterial;
    protected SimpleStringProperty dateOfDeliveryMaterial;
    protected SimpleStringProperty plannedCPMaterial;
    protected SimpleStringProperty actualCPMaterial;
    protected SimpleStringProperty accountMaterial;
    protected SimpleStringProperty contactsMaterial;
    protected SimpleStringProperty notesMaterial;
    protected SimpleStringProperty characteristicsMaterial;

    public Material() {
    }

    public Material(String nameMaterial, String unitMaterial, String quantityMaterial, String ordinalPriceUnitMaterial,
                    String priceCPUnitMaterial, String priceCPKeyMaterial, String costCPUnitMaterial, String priceOrderMaterial,
                    String costCPMaterial, String productionTimeMaterial, String actualCostMaterial,
                    String actualDifferenceMaterial, String paidMaterial, String residueMaterial, String dateOfDeliveryMaterial,
                    String plannedCPMaterial, String actualCPMaterial, String accountMaterial, String contactsMaterial,
                    String notesMaterial, String characteristicsMaterial) {
        this.nameMaterial = new SimpleStringProperty(nameMaterial);
        this.unitMaterial = new SimpleStringProperty(unitMaterial);
        this.quantityMaterial = new SimpleStringProperty(quantityMaterial);
        this.ordinalPriceUnitMaterial = new SimpleStringProperty(ordinalPriceUnitMaterial);
        this.priceCPUnitMaterial = new SimpleStringProperty(priceCPUnitMaterial);
        this.priceCPKeyMaterial = new SimpleStringProperty(priceCPKeyMaterial);
        this.costCPUnitMaterial = new SimpleStringProperty(costCPUnitMaterial);
        this.priceOrderMaterial = new SimpleStringProperty(priceOrderMaterial);
        this.costCPMaterial = new SimpleStringProperty(costCPMaterial);
        this.productionTimeMaterial = new SimpleStringProperty(productionTimeMaterial);
        this.actualCostMaterial = new SimpleStringProperty(actualCostMaterial);
        this.actualDifferenceMaterial = new SimpleStringProperty(actualDifferenceMaterial);
        this.paidMaterial = new SimpleStringProperty(paidMaterial);
        this.residueMaterial = new SimpleStringProperty(residueMaterial);
        this.dateOfDeliveryMaterial = new SimpleStringProperty(dateOfDeliveryMaterial);
        this.plannedCPMaterial = new SimpleStringProperty(plannedCPMaterial);
        this.actualCPMaterial = new SimpleStringProperty(actualCPMaterial);
        this.accountMaterial = new SimpleStringProperty(accountMaterial);
        this.contactsMaterial = new SimpleStringProperty(contactsMaterial);
        this.notesMaterial = new SimpleStringProperty(notesMaterial);
        this.characteristicsMaterial = new SimpleStringProperty(characteristicsMaterial);
    }

    public String getNameMaterial() {
        return nameMaterial.get();
    }

    public SimpleStringProperty nameMaterialProperty() {
        return nameMaterial;
    }

    public void setNameMaterial(String nameMaterial) {
        this.nameMaterial = new SimpleStringProperty(nameMaterial);
    }

    public String getUnitMaterial() {
        return unitMaterial.get();
    }

    public SimpleStringProperty unitMaterialProperty() {
        return unitMaterial;
    }

    public void setUnitMaterial(String unitMaterial) {
        this.unitMaterial = new SimpleStringProperty(unitMaterial);
    }

    public String getQuantityMaterial() {
        return quantityMaterial.get();
    }

    public SimpleStringProperty quantityMaterialProperty() {
        return quantityMaterial;
    }

    public void setQuantityMaterial(String quantityMaterial) {
        this.quantityMaterial = new SimpleStringProperty(quantityMaterial);
    }

    public String getOrdinalPriceUnitMaterial() {
        return ordinalPriceUnitMaterial.get();
    }

    public SimpleStringProperty ordinalPriceUnitMaterialProperty() {
        return ordinalPriceUnitMaterial;
    }

    public void setOrdinalPriceUnitMaterial(String ordinalPriceUnitMaterial) {
        this.ordinalPriceUnitMaterial = new SimpleStringProperty(ordinalPriceUnitMaterial);
    }

    public String getPriceCPUnitMaterial() {
        return priceCPUnitMaterial.get();
    }

    public SimpleStringProperty priceCPUnitMaterialProperty() {
        return priceCPUnitMaterial;
    }

    public void setPriceCPUnitMaterial(String priceCPUnitMaterial) {
        this.priceCPUnitMaterial = new SimpleStringProperty(priceCPUnitMaterial);
    }

    public String getPriceCPKeyMaterial() {
        return priceCPKeyMaterial.get();
    }

    public SimpleStringProperty priceCPKeyMaterialProperty() {
        return priceCPKeyMaterial;
    }

    public void setPriceCPKeyMaterial(String priceCPKeyMaterial) {
        this.priceCPKeyMaterial = new SimpleStringProperty(priceCPKeyMaterial);
    }

    public String getCostCPUnitMaterial() {
        return costCPUnitMaterial.get();
    }

    public SimpleStringProperty costCPUnitMaterialProperty() {
        return costCPUnitMaterial;
    }

    public void setCostCPUnitMaterial(String costCPUnitMaterial) {
        this.costCPUnitMaterial = new SimpleStringProperty(costCPUnitMaterial);
    }

    public String getPriceOrderMaterial() {
        return priceOrderMaterial.get();
    }

    public SimpleStringProperty priceOrderMaterialProperty() {
        return priceOrderMaterial;
    }

    public void setPriceOrderMaterial(String priceOrderMaterial) {
        this.priceOrderMaterial = new SimpleStringProperty(priceOrderMaterial);
    }

    public String getCostCPMaterial() {
        return costCPMaterial.get();
    }

    public SimpleStringProperty costCPMaterialProperty() {
        return costCPMaterial;
    }

    public void setCostCPMaterial(String costCPMaterial) {
        this.costCPMaterial = new SimpleStringProperty(costCPMaterial);
    }

    public String getProductionTimeMaterial() {
        return productionTimeMaterial.get();
    }

    public SimpleStringProperty productionTimeMaterialProperty() {
        return productionTimeMaterial;
    }

    public void setProductionTimeMaterial(String productionTimeMaterial) {
        this.productionTimeMaterial = new SimpleStringProperty(productionTimeMaterial);
    }

    public String getActualCostMaterial() {
        return actualCostMaterial.get();
    }

    public SimpleStringProperty actualCostMaterialProperty() {
        return actualCostMaterial;
    }

    public void setActualCostMaterial(String actualCostMaterial) {
        this.actualCostMaterial = new SimpleStringProperty(actualCostMaterial);
    }

    public String getActualDifferenceMaterial() {
        return actualDifferenceMaterial.get();
    }

    public SimpleStringProperty actualDifferenceMaterialProperty() {
        return actualDifferenceMaterial;
    }

    public void setActualDifferenceMaterial(String actualDifferenceMaterial) {
        this.actualDifferenceMaterial = new SimpleStringProperty(actualDifferenceMaterial);
    }

    public String getPaidMaterial() {
        return paidMaterial.get();
    }

    public SimpleStringProperty paidMaterialProperty() {
        return paidMaterial;
    }

    public void setPaidMaterial(String paidMaterial) {
        this.paidMaterial = new SimpleStringProperty(paidMaterial);
    }

    public String getResidueMaterial() {
        return residueMaterial.get();
    }

    public SimpleStringProperty residueMaterialProperty() {
        return residueMaterial;
    }

    public void setResidueMaterial(String residueMaterial) {
        this.residueMaterial = new SimpleStringProperty(residueMaterial);
    }

    public String getDateOfDeliveryMaterial() {
        return dateOfDeliveryMaterial.get();
    }

    public SimpleStringProperty dateOfDeliveryMaterialProperty() {
        return dateOfDeliveryMaterial;
    }

    public void setDateOfDeliveryMaterial(String dateOfDeliveryMaterial) {
        this.dateOfDeliveryMaterial = new SimpleStringProperty(dateOfDeliveryMaterial);
    }

    public String getPlannedCPMaterial() {
        return plannedCPMaterial.get();
    }

    public SimpleStringProperty plannedCPMaterialProperty() {
        return plannedCPMaterial;
    }

    public void setPlannedCPMaterial(String plannedCPMaterial) {
        this.plannedCPMaterial = new SimpleStringProperty(plannedCPMaterial);
    }

    public String getActualCPMaterial() {
        return actualCPMaterial.get();
    }

    public SimpleStringProperty actualCPMaterialProperty() {
        return actualCPMaterial;
    }

    public void setActualCPMaterial(String actualCPMaterial) {
        this.actualCPMaterial = new SimpleStringProperty(actualCPMaterial);
    }

    public String getAccountMaterial() {
        return accountMaterial.get();
    }

    public SimpleStringProperty accountMaterialProperty() {
        return accountMaterial;
    }

    public void setAccountMaterial(String accountMaterial) {
        this.accountMaterial = new SimpleStringProperty(accountMaterial);
    }

    public String getContactsMaterial() {
        return contactsMaterial.get();
    }

    public SimpleStringProperty contactsMaterialProperty() {
        return contactsMaterial;
    }

    public void setContactsMaterial(String contactsMaterial) {
        this.contactsMaterial = new SimpleStringProperty(contactsMaterial);
    }

    public String getNotesMaterial() {
        return notesMaterial.get();
    }

    public SimpleStringProperty notesMaterialProperty() {
        return notesMaterial;
    }

    public void setNotesMaterial(String notesMaterial) {
        this.notesMaterial = new SimpleStringProperty(notesMaterial);
    }

    public String getCharacteristicsMaterial() {
        return characteristicsMaterial.get();
    }

    public SimpleStringProperty characteristicsMaterialProperty() {
        return characteristicsMaterial;
    }

    public void setCharacteristicsMaterial(String characteristicsMaterial) {
        this.characteristicsMaterial = new SimpleStringProperty(characteristicsMaterial);
    }
}
