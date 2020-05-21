package sample;

import javafx.beans.property.SimpleStringProperty;

public class MaterialWall {
    protected SimpleStringProperty nameMaterialWall;
    protected SimpleStringProperty unitMaterialWall;
    protected SimpleStringProperty quantityMaterialWall;
    protected SimpleStringProperty ordinalPriceUnitMaterialWall;
    protected SimpleStringProperty priceCPUnitMaterialWall;
    protected SimpleStringProperty priceCPKeyMaterialWall;
    protected SimpleStringProperty costCPUnitMaterialWall;
    protected SimpleStringProperty priceOrderMaterialWall;
    protected SimpleStringProperty costCPMaterialWall;
    protected SimpleStringProperty productionTimeMaterialWall;
    protected SimpleStringProperty actualCostMaterialWall;
    protected SimpleStringProperty actualDifferenceMaterialWall;
    protected SimpleStringProperty paidMaterialWall;
    protected SimpleStringProperty residueMaterialWall;
    protected SimpleStringProperty dateOfDeliveryMaterialWall;
    protected SimpleStringProperty plannedCPMaterialWall;
    protected SimpleStringProperty actualCPMaterialWall;
    protected SimpleStringProperty accountMaterialWall;
    protected SimpleStringProperty contactsMaterialWall;
    protected SimpleStringProperty notesMaterialWall;
    protected SimpleStringProperty characteristicsMaterialWall;

    public MaterialWall() {
    }

    public MaterialWall(String nameMaterialWall, String unitMaterialWall, String quantityMaterialWall, String ordinalPriceUnitMaterialWall,
                        String priceCPUnitMaterialWall, String priceCPKeyMaterialWall, String costCPUnitMaterialWall, String priceOrderMaterialWall,
                        String costCPMaterialWall, String productionTimeMaterialWall, String actualCostMaterialWall,
                        String actualDifferenceMaterialWall, String paidMaterialWall, String residueMaterialWall, String dateOfDeliveryMaterialWall,
                        String plannedCPMaterialWall, String actualCPMaterialWall, String accountMaterialWall, String contactsMaterialWall,
                        String notesMaterialWall, String characteristicsMaterialWall) {
        this.nameMaterialWall = new SimpleStringProperty(nameMaterialWall);
        this.unitMaterialWall = new SimpleStringProperty(unitMaterialWall);
        this.quantityMaterialWall = new SimpleStringProperty(quantityMaterialWall);
        this.ordinalPriceUnitMaterialWall = new SimpleStringProperty(ordinalPriceUnitMaterialWall);
        this.priceCPUnitMaterialWall = new SimpleStringProperty(priceCPUnitMaterialWall);
        this.priceCPKeyMaterialWall = new SimpleStringProperty(priceCPKeyMaterialWall);
        this.costCPUnitMaterialWall = new SimpleStringProperty(costCPUnitMaterialWall);
        this.priceOrderMaterialWall = new SimpleStringProperty(priceOrderMaterialWall);
        this.costCPMaterialWall = new SimpleStringProperty(costCPMaterialWall);
        this.productionTimeMaterialWall = new SimpleStringProperty(productionTimeMaterialWall);
        this.actualCostMaterialWall = new SimpleStringProperty(actualCostMaterialWall);
        this.actualDifferenceMaterialWall = new SimpleStringProperty(actualDifferenceMaterialWall);
        this.paidMaterialWall = new SimpleStringProperty(paidMaterialWall);
        this.residueMaterialWall = new SimpleStringProperty(residueMaterialWall);
        this.dateOfDeliveryMaterialWall = new SimpleStringProperty(dateOfDeliveryMaterialWall);
        this.plannedCPMaterialWall = new SimpleStringProperty(plannedCPMaterialWall);
        this.actualCPMaterialWall = new SimpleStringProperty(actualCPMaterialWall);
        this.accountMaterialWall = new SimpleStringProperty(accountMaterialWall);
        this.contactsMaterialWall = new SimpleStringProperty(contactsMaterialWall);
        this.notesMaterialWall = new SimpleStringProperty(notesMaterialWall);
        this.characteristicsMaterialWall = new SimpleStringProperty(characteristicsMaterialWall);
    }

    public String getNameMaterial() {
        return nameMaterialWall.get();
    }

    public SimpleStringProperty nameMaterialProperty() {
        return nameMaterialWall;
    }

    public void setNameMaterial(String nameMaterial) {
        this.nameMaterialWall = new SimpleStringProperty(nameMaterial);
    }

    public String getUnitMaterial() {
        return unitMaterialWall.get();
    }

    public SimpleStringProperty unitMaterialProperty() {
        return unitMaterialWall;
    }

    public void setUnitMaterial(String unitMaterial) {
        this.unitMaterialWall = new SimpleStringProperty(unitMaterial);
    }

    public String getQuantityMaterial() {
        return quantityMaterialWall.get();
    }

    public SimpleStringProperty quantityMaterialProperty() {
        return quantityMaterialWall;
    }

    public void setQuantityMaterial(String quantityMaterial) {
        this.quantityMaterialWall = new SimpleStringProperty(quantityMaterial);
    }

    public String getOrdinalPriceUnitMaterial() {
        return ordinalPriceUnitMaterialWall.get();
    }

    public SimpleStringProperty ordinalPriceUnitMaterialProperty() {
        return ordinalPriceUnitMaterialWall;
    }

    public void setOrdinalPriceUnitMaterial(String ordinalPriceUnitMaterial) {
        this.ordinalPriceUnitMaterialWall = new SimpleStringProperty(ordinalPriceUnitMaterial);
    }

    public String getPriceCPUnitMaterial() {
        return priceCPUnitMaterialWall.get();
    }

    public SimpleStringProperty priceCPUnitMaterialProperty() {
        return priceCPUnitMaterialWall;
    }

    public void setPriceCPUnitMaterial(String priceCPUnitMaterial) {
        this.priceCPUnitMaterialWall = new SimpleStringProperty(priceCPUnitMaterial);
    }

    public String getPriceCPKeyMaterial() {
        return priceCPKeyMaterialWall.get();
    }

    public SimpleStringProperty priceCPKeyMaterialProperty() {
        return priceCPKeyMaterialWall;
    }

    public void setPriceCPKeyMaterial(String priceCPKeyMaterial) {
        this.priceCPKeyMaterialWall = new SimpleStringProperty(priceCPKeyMaterial);
    }

    public String getCostCPUnitMaterial() {
        return costCPUnitMaterialWall.get();
    }

    public SimpleStringProperty costCPUnitMaterialProperty() {
        return costCPUnitMaterialWall;
    }

    public void setCostCPUnitMaterial(String costCPUnitMaterial) {
        this.costCPUnitMaterialWall = new SimpleStringProperty(costCPUnitMaterial);
    }

    public String getPriceOrderMaterial() {
        return priceOrderMaterialWall.get();
    }

    public SimpleStringProperty priceOrderMaterialProperty() {
        return priceOrderMaterialWall;
    }

    public void setPriceOrderMaterial(String priceOrderMaterial) {
        this.priceOrderMaterialWall = new SimpleStringProperty(priceOrderMaterial);
    }

    public String getCostCPMaterial() {
        return costCPMaterialWall.get();
    }

    public SimpleStringProperty costCPMaterialProperty() {
        return costCPMaterialWall;
    }

    public void setCostCPMaterial(String costCPMaterial) {
        this.costCPMaterialWall = new SimpleStringProperty(costCPMaterial);
    }

    public String getProductionTimeMaterial() {
        return productionTimeMaterialWall.get();
    }

    public SimpleStringProperty productionTimeMaterialProperty() {
        return productionTimeMaterialWall;
    }

    public void setProductionTimeMaterial(String productionTimeMaterial) {
        this.productionTimeMaterialWall = new SimpleStringProperty(productionTimeMaterial);
    }

    public String getActualCostMaterial() {
        return actualCostMaterialWall.get();
    }

    public SimpleStringProperty actualCostMaterialProperty() {
        return actualCostMaterialWall;
    }

    public void setActualCostMaterial(String actualCostMaterial) {
        this.actualCostMaterialWall = new SimpleStringProperty(actualCostMaterial);
    }

    public String getActualDifferenceMaterial() {
        return actualDifferenceMaterialWall.get();
    }

    public SimpleStringProperty actualDifferenceMaterialProperty() {
        return actualDifferenceMaterialWall;
    }

    public void setActualDifferenceMaterial(String actualDifferenceMaterial) {
        this.actualDifferenceMaterialWall = new SimpleStringProperty(actualDifferenceMaterial);
    }

    public String getPaidMaterial() {
        return paidMaterialWall.get();
    }

    public SimpleStringProperty paidMaterialProperty() {
        return paidMaterialWall;
    }

    public void setPaidMaterial(String paidMaterial) {
        this.paidMaterialWall = new SimpleStringProperty(paidMaterial);
    }

    public String getResidueMaterial() {
        return residueMaterialWall.get();
    }

    public SimpleStringProperty residueMaterialProperty() {
        return residueMaterialWall;
    }

    public void setResidueMaterial(String residueMaterial) {
        this.residueMaterialWall = new SimpleStringProperty(residueMaterial);
    }

    public String getDateOfDeliveryMaterial() {
        return dateOfDeliveryMaterialWall.get();
    }

    public SimpleStringProperty dateOfDeliveryMaterialProperty() {
        return dateOfDeliveryMaterialWall;
    }

    public void setDateOfDeliveryMaterial(String dateOfDeliveryMaterial) {
        this.dateOfDeliveryMaterialWall = new SimpleStringProperty(dateOfDeliveryMaterial);
    }

    public String getPlannedCPMaterial() {
        return plannedCPMaterialWall.get();
    }

    public SimpleStringProperty plannedCPMaterialProperty() {
        return plannedCPMaterialWall;
    }

    public void setPlannedCPMaterial(String plannedCPMaterial) {
        this.plannedCPMaterialWall = new SimpleStringProperty(plannedCPMaterial);
    }

    public String getActualCPMaterial() {
        return actualCPMaterialWall.get();
    }

    public SimpleStringProperty actualCPMaterialProperty() {
        return actualCPMaterialWall;
    }

    public void setActualCPMaterial(String actualCPMaterial) {
        this.actualCPMaterialWall = new SimpleStringProperty(actualCPMaterial);
    }

    public String getAccountMaterial() {
        return accountMaterialWall.get();
    }

    public SimpleStringProperty accountMaterialProperty() {
        return accountMaterialWall;
    }

    public void setAccountMaterial(String accountMaterial) {
        this.accountMaterialWall = new SimpleStringProperty(accountMaterial);
    }

    public String getContactsMaterial() {
        return contactsMaterialWall.get();
    }

    public SimpleStringProperty contactsMaterialProperty() {
        return contactsMaterialWall;
    }

    public void setContactsMaterial(String contactsMaterial) {
        this.contactsMaterialWall = new SimpleStringProperty(contactsMaterial);
    }

    public String getNotesMaterial() {
        return notesMaterialWall.get();
    }

    public SimpleStringProperty notesMaterialProperty() {
        return notesMaterialWall;
    }

    public void setNotesMaterial(String notesMaterial) {
        this.notesMaterialWall = new SimpleStringProperty(notesMaterial);
    }

    public String getCharacteristicsMaterial() {
        return characteristicsMaterialWall.get();
    }

    public SimpleStringProperty characteristicsMaterialProperty() {
        return characteristicsMaterialWall;
    }

    public void setCharacteristicsMaterial(String characteristicsMaterial) {
        this.characteristicsMaterialWall = new SimpleStringProperty(characteristicsMaterial);
    }
}
