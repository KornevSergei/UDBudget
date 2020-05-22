package sample;

import javafx.beans.property.SimpleStringProperty;

public class MaterialSuddenly {
    protected SimpleStringProperty nameMaterialSuddenly;
    protected SimpleStringProperty unitMaterialSuddenly;
    protected SimpleStringProperty quantityMaterialSuddenly;
    protected SimpleStringProperty ordinalPriceUnitMaterialSuddenly;
    protected SimpleStringProperty priceCPUnitMaterialSuddenly;
    protected SimpleStringProperty priceCPKeyMaterialSuddenly;
    protected SimpleStringProperty costCPUnitMaterialSuddenly;
    protected SimpleStringProperty priceOrderMaterialSuddenly;
    protected SimpleStringProperty costCPMaterialSuddenly;
    protected SimpleStringProperty productionTimeMaterialSuddenly;
    protected SimpleStringProperty actualCostMaterialSuddenly;
    protected SimpleStringProperty actualDifferenceMaterialSuddenly;
    protected SimpleStringProperty paidMaterialSuddenly;
    protected SimpleStringProperty residueMaterialSuddenly;
    protected SimpleStringProperty dateOfDeliveryMaterialSuddenly;
    protected SimpleStringProperty plannedCPMaterialSuddenly;
    protected SimpleStringProperty actualCPMaterialSuddenly;
    protected SimpleStringProperty accountMaterialSuddenly;
    protected SimpleStringProperty contactsMaterialSuddenly;
    protected SimpleStringProperty notesMaterialSuddenly;
    protected SimpleStringProperty characteristicsMaterialSuddenly;

    public MaterialSuddenly() {
    }

    public MaterialSuddenly(String nameMaterialSuddenly, String unitMaterialSuddenly, String quantityMaterialSuddenly, String ordinalPriceUnitMaterialSuddenly,
                         String priceCPUnitMaterialSuddenly, String priceCPKeyMaterialSuddenly, String costCPUnitMaterialSuddenly, String priceOrderMaterialSuddenly,
                         String costCPMaterialSuddenly, String productionTimeMaterialSuddenly, String actualCostMaterialSuddenly,
                         String actualDifferenceMaterialSuddenly, String paidMaterialSuddenly, String residueMaterialSuddenly, String dateOfDeliveryMaterialSuddenly,
                         String plannedCPMaterialSuddenly, String actualCPMaterialSuddenly, String accountMaterialSuddenly, String contactsMaterialSuddenly,
                         String notesMaterialSuddenly, String characteristicsMaterialSuddenly) {
        this.nameMaterialSuddenly = new SimpleStringProperty(nameMaterialSuddenly);
        this.unitMaterialSuddenly = new SimpleStringProperty(unitMaterialSuddenly);
        this.quantityMaterialSuddenly = new SimpleStringProperty(quantityMaterialSuddenly);
        this.ordinalPriceUnitMaterialSuddenly = new SimpleStringProperty(ordinalPriceUnitMaterialSuddenly);
        this.priceCPUnitMaterialSuddenly = new SimpleStringProperty(priceCPUnitMaterialSuddenly);
        this.priceCPKeyMaterialSuddenly = new SimpleStringProperty(priceCPKeyMaterialSuddenly);
        this.costCPUnitMaterialSuddenly = new SimpleStringProperty(costCPUnitMaterialSuddenly);
        this.priceOrderMaterialSuddenly = new SimpleStringProperty(priceOrderMaterialSuddenly);
        this.costCPMaterialSuddenly = new SimpleStringProperty(costCPMaterialSuddenly);
        this.productionTimeMaterialSuddenly = new SimpleStringProperty(productionTimeMaterialSuddenly);
        this.actualCostMaterialSuddenly = new SimpleStringProperty(actualCostMaterialSuddenly);
        this.actualDifferenceMaterialSuddenly = new SimpleStringProperty(actualDifferenceMaterialSuddenly);
        this.paidMaterialSuddenly = new SimpleStringProperty(paidMaterialSuddenly);
        this.residueMaterialSuddenly = new SimpleStringProperty(residueMaterialSuddenly);
        this.dateOfDeliveryMaterialSuddenly = new SimpleStringProperty(dateOfDeliveryMaterialSuddenly);
        this.plannedCPMaterialSuddenly = new SimpleStringProperty(plannedCPMaterialSuddenly);
        this.actualCPMaterialSuddenly = new SimpleStringProperty(actualCPMaterialSuddenly);
        this.accountMaterialSuddenly = new SimpleStringProperty(accountMaterialSuddenly);
        this.contactsMaterialSuddenly = new SimpleStringProperty(contactsMaterialSuddenly);
        this.notesMaterialSuddenly = new SimpleStringProperty(notesMaterialSuddenly);
        this.characteristicsMaterialSuddenly = new SimpleStringProperty(characteristicsMaterialSuddenly);
    }

    public String getNameMaterialSuddenly() {
        return nameMaterialSuddenly.get();
    }

    public SimpleStringProperty nameMaterialSuddenlyProperty() {
        return nameMaterialSuddenly;
    }

    public void setNameMaterialSuddenly(String nameMaterialSuddenly) {
        this.nameMaterialSuddenly = new SimpleStringProperty(nameMaterialSuddenly);
    }

    public String getUnitMaterialSuddenly() {
        return unitMaterialSuddenly.get();
    }

    public SimpleStringProperty unitMaterialSuddenlyProperty() {
        return unitMaterialSuddenly;
    }

    public void setUnitMaterialSuddenly(String unitMaterialSuddenly) {
        this.unitMaterialSuddenly = new SimpleStringProperty(unitMaterialSuddenly);
    }

    public String getQuantityMaterialSuddenly() {
        return quantityMaterialSuddenly.get();
    }

    public SimpleStringProperty quantityMaterialSuddenlyProperty() {
        return quantityMaterialSuddenly;
    }

    public void setQuantityMaterialSuddenly(String quantityMaterialSuddenly) {
        this.quantityMaterialSuddenly = new SimpleStringProperty(quantityMaterialSuddenly);
    }

    public String getOrdinalPriceUnitMaterialSuddenly() {
        return ordinalPriceUnitMaterialSuddenly.get();
    }

    public SimpleStringProperty ordinalPriceUnitMaterialSuddenlyProperty() {
        return ordinalPriceUnitMaterialSuddenly;
    }

    public void setOrdinalPriceUnitMaterialSuddenly(String ordinalPriceUnitMaterialSuddenly) {
        this.ordinalPriceUnitMaterialSuddenly = new SimpleStringProperty(ordinalPriceUnitMaterialSuddenly);
    }

    public String getPriceCPUnitMaterialSuddenly() {
        return priceCPUnitMaterialSuddenly.get();
    }

    public SimpleStringProperty priceCPUnitMaterialSuddenlyProperty() {
        return priceCPUnitMaterialSuddenly;
    }

    public void setPriceCPUnitMaterialSuddenly(String priceCPUnitMaterialSuddenly) {
        this.priceCPUnitMaterialSuddenly = new SimpleStringProperty(priceCPUnitMaterialSuddenly);
    }

    public String getPriceCPKeyMaterialSuddenly() {
        return priceCPKeyMaterialSuddenly.get();
    }

    public SimpleStringProperty priceCPKeyMaterialSuddenlyProperty() {
        return priceCPKeyMaterialSuddenly;
    }

    public void setPriceCPKeyMaterialSuddenly(String priceCPKeyMaterialSuddenly) {
        this.priceCPKeyMaterialSuddenly = new SimpleStringProperty(priceCPKeyMaterialSuddenly);
    }

    public String getCostCPUnitMaterialSuddenly() {
        return costCPUnitMaterialSuddenly.get();
    }

    public SimpleStringProperty costCPUnitMaterialSuddenlyProperty() {
        return costCPUnitMaterialSuddenly;
    }

    public void setCostCPUnitMaterialSuddenly(String costCPUnitMaterialSuddenly) {
        this.costCPUnitMaterialSuddenly = new SimpleStringProperty(costCPUnitMaterialSuddenly);
    }

    public String getPriceOrderMaterialSuddenly() {
        return priceOrderMaterialSuddenly.get();
    }

    public SimpleStringProperty priceOrderMaterialSuddenlyProperty() {
        return priceOrderMaterialSuddenly;
    }

    public void setPriceOrderMaterialSuddenly(String priceOrderMaterialSuddenly) {
        this.priceOrderMaterialSuddenly = new SimpleStringProperty(priceOrderMaterialSuddenly);
    }

    public String getCostCPMaterialSuddenly() {
        return costCPMaterialSuddenly.get();
    }

    public SimpleStringProperty costCPMaterialSuddenlyProperty() {
        return costCPMaterialSuddenly;
    }

    public void setCostCPMaterialSuddenly(String costCPMaterialSuddenly) {
        this.costCPMaterialSuddenly = new SimpleStringProperty(costCPMaterialSuddenly);
    }

    public String getProductionTimeMaterialSuddenly() {
        return productionTimeMaterialSuddenly.get();
    }

    public SimpleStringProperty productionTimeMaterialSuddenlyProperty() {
        return productionTimeMaterialSuddenly;
    }

    public void setProductionTimeMaterialSuddenly(String productionTimeMaterialSuddenly) {
        this.productionTimeMaterialSuddenly = new SimpleStringProperty(productionTimeMaterialSuddenly);
    }

    public String getActualCostMaterialSuddenly() {
        return actualCostMaterialSuddenly.get();
    }

    public SimpleStringProperty actualCostMaterialSuddenlyProperty() {
        return actualCostMaterialSuddenly;
    }

    public void setActualCostMaterialSuddenly(String actualCostMaterialSuddenly) {
        this.actualCostMaterialSuddenly = new SimpleStringProperty(actualCostMaterialSuddenly);
    }

    public String getActualDifferenceMaterialSuddenly() {
        return actualDifferenceMaterialSuddenly.get();
    }

    public SimpleStringProperty actualDifferenceMaterialSuddenlyProperty() {
        return actualDifferenceMaterialSuddenly;
    }

    public void setActualDifferenceMaterialSuddenly(String actualDifferenceMaterialSuddenly) {
        this.actualDifferenceMaterialSuddenly = new SimpleStringProperty(actualDifferenceMaterialSuddenly);
    }

    public String getPaidMaterialSuddenly() {
        return paidMaterialSuddenly.get();
    }

    public SimpleStringProperty paidMaterialSuddenlyProperty() {
        return paidMaterialSuddenly;
    }

    public void setPaidMaterialSuddenly(String paidMaterialSuddenly) {
        this.paidMaterialSuddenly = new SimpleStringProperty(paidMaterialSuddenly);
    }

    public String getResidueMaterialSuddenly() {
        return residueMaterialSuddenly.get();
    }

    public SimpleStringProperty residueMaterialSuddenlyProperty() {
        return residueMaterialSuddenly;
    }

    public void setResidueMaterialSuddenly(String residueMaterialSuddenly) {
        this.residueMaterialSuddenly = new SimpleStringProperty(residueMaterialSuddenly);
    }

    public String getDateOfDeliveryMaterialSuddenly() {
        return dateOfDeliveryMaterialSuddenly.get();
    }

    public SimpleStringProperty dateOfDeliveryMaterialSuddenlyProperty() {
        return dateOfDeliveryMaterialSuddenly;
    }

    public void setDateOfDeliveryMaterialSuddenly(String dateOfDeliveryMaterialSuddenly) {
        this.dateOfDeliveryMaterialSuddenly = new SimpleStringProperty(dateOfDeliveryMaterialSuddenly);
    }

    public String getPlannedCPMaterialSuddenly() {
        return plannedCPMaterialSuddenly.get();
    }

    public SimpleStringProperty plannedCPMaterialSuddenlyProperty() {
        return plannedCPMaterialSuddenly;
    }

    public void setPlannedCPMaterialSuddenly(String plannedCPMaterialSuddenly) {
        this.plannedCPMaterialSuddenly = new SimpleStringProperty(plannedCPMaterialSuddenly);
    }

    public String getActualCPMaterialSuddenly() {
        return actualCPMaterialSuddenly.get();
    }

    public SimpleStringProperty actualCPMaterialSuddenlyProperty() {
        return actualCPMaterialSuddenly;
    }

    public void setActualCPMaterialSuddenly(String actualCPMaterialSuddenly) {
        this.actualCPMaterialSuddenly = new SimpleStringProperty(actualCPMaterialSuddenly);
    }

    public String getAccountMaterialSuddenly() {
        return accountMaterialSuddenly.get();
    }

    public SimpleStringProperty accountMaterialSuddenlyProperty() {
        return accountMaterialSuddenly;
    }

    public void setAccountMaterialSuddenly(String accountMaterialSuddenly) {
        this.accountMaterialSuddenly = new SimpleStringProperty(accountMaterialSuddenly);
    }

    public String getContactsMaterialSuddenly() {
        return contactsMaterialSuddenly.get();
    }

    public SimpleStringProperty contactsMaterialSuddenlyProperty() {
        return contactsMaterialSuddenly;
    }

    public void setContactsMaterialSuddenly(String contactsMaterialSuddenly) {
        this.contactsMaterialSuddenly = new SimpleStringProperty(contactsMaterialSuddenly);
    }

    public String getNotesMaterialSuddenly() {
        return notesMaterialSuddenly.get();
    }

    public SimpleStringProperty notesMaterialSuddenlyProperty() {
        return notesMaterialSuddenly;
    }

    public void setNotesMaterialSuddenly(String notesMaterialSuddenly) {
        this.notesMaterialSuddenly = new SimpleStringProperty(notesMaterialSuddenly);
    }

    public String getCharacteristicsMaterialSuddenly() {
        return characteristicsMaterialSuddenly.get();
    }

    public SimpleStringProperty characteristicsMaterialSuddenlyProperty() {
        return characteristicsMaterialSuddenly;
    }

    public void setCharacteristicsMaterialSuddenly(String characteristicsMaterialSuddenly) {
        this.characteristicsMaterialSuddenly = new SimpleStringProperty(characteristicsMaterialSuddenly);
    }
}
