package sample;

import javafx.beans.property.SimpleStringProperty;

public class MaterialFloor {
    protected SimpleStringProperty nameMaterialFloor;
    protected SimpleStringProperty unitMaterialFloor;
    protected SimpleStringProperty quantityMaterialFloor;
    protected SimpleStringProperty ordinalPriceUnitMaterialFloor;
    protected SimpleStringProperty priceCPUnitMaterialFloor;
    protected SimpleStringProperty priceCPKeyMaterialFloor;
    protected SimpleStringProperty costCPUnitMaterialFloor;
    protected SimpleStringProperty priceOrderMaterialFloor;
    protected SimpleStringProperty costCPMaterialFloor;
    protected SimpleStringProperty productionTimeMaterialFloor;
    protected SimpleStringProperty actualCostMaterialFloor;
    protected SimpleStringProperty actualDifferenceMaterialFloor;
    protected SimpleStringProperty paidMaterialFloor;
    protected SimpleStringProperty residueMaterialFloor;
    protected SimpleStringProperty dateOfDeliveryMaterialFloor;
    protected SimpleStringProperty plannedCPMaterialFloor;
    protected SimpleStringProperty actualCPMaterialFloor;
    protected SimpleStringProperty accountMaterialFloor;
    protected SimpleStringProperty contactsMaterialFloor;
    protected SimpleStringProperty notesMaterialFloor;
    protected SimpleStringProperty characteristicsMaterialFloor;

    public MaterialFloor() {
    }

    public MaterialFloor(String nameMaterialFloor, String unitMaterialFloor, String quantityMaterialFloor, String ordinalPriceUnitMaterialFloor,
                        String priceCPUnitMaterialFloor, String priceCPKeyMaterialFloor, String costCPUnitMaterialFloor, String priceOrderMaterialFloor,
                        String costCPMaterialFloor, String productionTimeMaterialFloor, String actualCostMaterialFloor,
                        String actualDifferenceMaterialFloor, String paidMaterialFloor, String residueMaterialFloor, String dateOfDeliveryMaterialFloor,
                        String plannedCPMaterialFloor, String actualCPMaterialFloor, String accountMaterialFloor, String contactsMaterialFloor,
                        String notesMaterialFloor, String characteristicsMaterialFloor) {
        this.nameMaterialFloor = new SimpleStringProperty(nameMaterialFloor);
        this.unitMaterialFloor = new SimpleStringProperty(unitMaterialFloor);
        this.quantityMaterialFloor = new SimpleStringProperty(quantityMaterialFloor);
        this.ordinalPriceUnitMaterialFloor = new SimpleStringProperty(ordinalPriceUnitMaterialFloor);
        this.priceCPUnitMaterialFloor = new SimpleStringProperty(priceCPUnitMaterialFloor);
        this.priceCPKeyMaterialFloor = new SimpleStringProperty(priceCPKeyMaterialFloor);
        this.costCPUnitMaterialFloor = new SimpleStringProperty(costCPUnitMaterialFloor);
        this.priceOrderMaterialFloor = new SimpleStringProperty(priceOrderMaterialFloor);
        this.costCPMaterialFloor = new SimpleStringProperty(costCPMaterialFloor);
        this.productionTimeMaterialFloor = new SimpleStringProperty(productionTimeMaterialFloor);
        this.actualCostMaterialFloor = new SimpleStringProperty(actualCostMaterialFloor);
        this.actualDifferenceMaterialFloor = new SimpleStringProperty(actualDifferenceMaterialFloor);
        this.paidMaterialFloor = new SimpleStringProperty(paidMaterialFloor);
        this.residueMaterialFloor = new SimpleStringProperty(residueMaterialFloor);
        this.dateOfDeliveryMaterialFloor = new SimpleStringProperty(dateOfDeliveryMaterialFloor);
        this.plannedCPMaterialFloor = new SimpleStringProperty(plannedCPMaterialFloor);
        this.actualCPMaterialFloor = new SimpleStringProperty(actualCPMaterialFloor);
        this.accountMaterialFloor = new SimpleStringProperty(accountMaterialFloor);
        this.contactsMaterialFloor = new SimpleStringProperty(contactsMaterialFloor);
        this.notesMaterialFloor = new SimpleStringProperty(notesMaterialFloor);
        this.characteristicsMaterialFloor = new SimpleStringProperty(characteristicsMaterialFloor);
    }

    public String getNameMaterialFloor() {
        return nameMaterialFloor.get();
    }

    public SimpleStringProperty nameMaterialFloorProperty() {
        return nameMaterialFloor;
    }

    public void setNameMaterialFloor(String nameMaterialFloor) {
        this.nameMaterialFloor = new SimpleStringProperty(nameMaterialFloor);
    }

    public String getUnitMaterialFloor() {
        return unitMaterialFloor.get();
    }

    public SimpleStringProperty unitMaterialFloorProperty() {
        return unitMaterialFloor;
    }

    public void setUnitMaterialFloor(String unitMaterialFloor) {
        this.unitMaterialFloor = new SimpleStringProperty(unitMaterialFloor);
    }

    public String getQuantityMaterialFloor() {
        return quantityMaterialFloor.get();
    }

    public SimpleStringProperty quantityMaterialFloorProperty() {
        return quantityMaterialFloor;
    }

    public void setQuantityMaterialFloor(String quantityMaterialFloor) {
        this.quantityMaterialFloor = new SimpleStringProperty(quantityMaterialFloor);
    }

    public String getOrdinalPriceUnitMaterialFloor() {
        return ordinalPriceUnitMaterialFloor.get();
    }

    public SimpleStringProperty ordinalPriceUnitMaterialFloorProperty() {
        return ordinalPriceUnitMaterialFloor;
    }

    public void setOrdinalPriceUnitMaterialFloor(String ordinalPriceUnitMaterialFloor) {
        this.ordinalPriceUnitMaterialFloor = new SimpleStringProperty(ordinalPriceUnitMaterialFloor);
    }

    public String getPriceCPUnitMaterialFloor() {
        return priceCPUnitMaterialFloor.get();
    }

    public SimpleStringProperty priceCPUnitMaterialFloorProperty() {
        return priceCPUnitMaterialFloor;
    }

    public void setPriceCPUnitMaterialFloor(String priceCPUnitMaterialFloor) {
        this.priceCPUnitMaterialFloor = new SimpleStringProperty(priceCPUnitMaterialFloor);
    }

    public String getPriceCPKeyMaterialFloor() {
        return priceCPKeyMaterialFloor.get();
    }

    public SimpleStringProperty priceCPKeyMaterialFloorProperty() {
        return priceCPKeyMaterialFloor;
    }

    public void setPriceCPKeyMaterialFloor(String priceCPKeyMaterialFloor) {
        this.priceCPKeyMaterialFloor = new SimpleStringProperty(priceCPKeyMaterialFloor);
    }

    public String getCostCPUnitMaterialFloor() {
        return costCPUnitMaterialFloor.get();
    }

    public SimpleStringProperty costCPUnitMaterialFloorProperty() {
        return costCPUnitMaterialFloor;
    }

    public void setCostCPUnitMaterialFloor(String costCPUnitMaterialFloor) {
        this.costCPUnitMaterialFloor = new SimpleStringProperty(costCPUnitMaterialFloor);
    }

    public String getPriceOrderMaterialFloor() {
        return priceOrderMaterialFloor.get();
    }

    public SimpleStringProperty priceOrderMaterialFloorProperty() {
        return priceOrderMaterialFloor;
    }

    public void setPriceOrderMaterialFloor(String priceOrderMaterialFloor) {
        this.priceOrderMaterialFloor = new SimpleStringProperty(priceOrderMaterialFloor);
    }

    public String getCostCPMaterialFloor() {
        return costCPMaterialFloor.get();
    }

    public SimpleStringProperty costCPMaterialFloorProperty() {
        return costCPMaterialFloor;
    }

    public void setCostCPMaterialFloor(String costCPMaterialFloor) {
        this.costCPMaterialFloor = new SimpleStringProperty(costCPMaterialFloor);
    }

    public String getProductionTimeMaterialFloor() {
        return productionTimeMaterialFloor.get();
    }

    public SimpleStringProperty productionTimeMaterialFloorProperty() {
        return productionTimeMaterialFloor;
    }

    public void setProductionTimeMaterialFloor(String productionTimeMaterialFloor) {
        this.productionTimeMaterialFloor = new SimpleStringProperty(productionTimeMaterialFloor);
    }

    public String getActualCostMaterialFloor() {
        return actualCostMaterialFloor.get();
    }

    public SimpleStringProperty actualCostMaterialFloorProperty() {
        return actualCostMaterialFloor;
    }

    public void setActualCostMaterialFloor(String actualCostMaterialFloor) {
        this.actualCostMaterialFloor = new SimpleStringProperty(actualCostMaterialFloor);
    }

    public String getActualDifferenceMaterialFloor() {
        return actualDifferenceMaterialFloor.get();
    }

    public SimpleStringProperty actualDifferenceMaterialFloorProperty() {
        return actualDifferenceMaterialFloor;
    }

    public void setActualDifferenceMaterialFloor(String actualDifferenceMaterialFloor) {
        this.actualDifferenceMaterialFloor = new SimpleStringProperty(actualDifferenceMaterialFloor);
    }

    public String getPaidMaterialFloor() {
        return paidMaterialFloor.get();
    }

    public SimpleStringProperty paidMaterialFloorProperty() {
        return paidMaterialFloor;
    }

    public void setPaidMaterialFloor(String paidMaterialFloor) {
        this.paidMaterialFloor = new SimpleStringProperty(paidMaterialFloor);
    }

    public String getResidueMaterialFloor() {
        return residueMaterialFloor.get();
    }

    public SimpleStringProperty residueMaterialFloorProperty() {
        return residueMaterialFloor;
    }

    public void setResidueMaterialFloor(String residueMaterialFloor) {
        this.residueMaterialFloor = new SimpleStringProperty(residueMaterialFloor);
    }

    public String getDateOfDeliveryMaterialFloor() {
        return dateOfDeliveryMaterialFloor.get();
    }

    public SimpleStringProperty dateOfDeliveryMaterialFloorProperty() {
        return dateOfDeliveryMaterialFloor;
    }

    public void setDateOfDeliveryMaterialFloor(String dateOfDeliveryMaterialFloor) {
        this.dateOfDeliveryMaterialFloor = new SimpleStringProperty(dateOfDeliveryMaterialFloor);
    }

    public String getPlannedCPMaterialFloor() {
        return plannedCPMaterialFloor.get();
    }

    public SimpleStringProperty plannedCPMaterialFloorProperty() {
        return plannedCPMaterialFloor;
    }

    public void setPlannedCPMaterialFloor(String plannedCPMaterialFloor) {
        this.plannedCPMaterialFloor = new SimpleStringProperty(plannedCPMaterialFloor);
    }

    public String getActualCPMaterialFloor() {
        return actualCPMaterialFloor.get();
    }

    public SimpleStringProperty actualCPMaterialFloorProperty() {
        return actualCPMaterialFloor;
    }

    public void setActualCPMaterialFloor(String actualCPMaterialFloor) {
        this.actualCPMaterialFloor = new SimpleStringProperty(actualCPMaterialFloor);
    }

    public String getAccountMaterialFloor() {
        return accountMaterialFloor.get();
    }

    public SimpleStringProperty accountMaterialFloorProperty() {
        return accountMaterialFloor;
    }

    public void setAccountMaterialFloor(String accountMaterialFloor) {
        this.accountMaterialFloor = new SimpleStringProperty(accountMaterialFloor);
    }

    public String getContactsMaterialFloor() {
        return contactsMaterialFloor.get();
    }

    public SimpleStringProperty contactsMaterialFloorProperty() {
        return contactsMaterialFloor;
    }

    public void setContactsMaterialFloor(String contactsMaterialFloor) {
        this.contactsMaterialFloor = new SimpleStringProperty(contactsMaterialFloor);
    }

    public String getNotesMaterialFloor() {
        return notesMaterialFloor.get();
    }

    public SimpleStringProperty notesMaterialFloorProperty() {
        return notesMaterialFloor;
    }

    public void setNotesMaterialFloor(String notesMaterialFloor) {
        this.notesMaterialFloor = new SimpleStringProperty(notesMaterialFloor);
    }

    public String getCharacteristicsMaterialFloor() {
        return characteristicsMaterialFloor.get();
    }

    public SimpleStringProperty characteristicsMaterialFloorProperty() {
        return characteristicsMaterialFloor;
    }

    public void setCharacteristicsMaterialFloor(String characteristicsMaterialFloor) {
        this.characteristicsMaterialFloor = new SimpleStringProperty(characteristicsMaterialFloor);
    }
}
