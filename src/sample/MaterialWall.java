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

    public String getNameMaterialWall() {
        return nameMaterialWall.get();
    }

    public SimpleStringProperty nameMaterialWallProperty() {
        return nameMaterialWall;
    }

    public void setNameMaterialWall(String nameMaterialWall) {
        this.nameMaterialWall = new SimpleStringProperty(nameMaterialWall);
    }

    public String getUnitMaterialWall() {
        return unitMaterialWall.get();
    }

    public SimpleStringProperty unitMaterialWallProperty() {
        return unitMaterialWall;
    }

    public void setUnitMaterialWall(String unitMaterialWall) {
        this.unitMaterialWall = new SimpleStringProperty(unitMaterialWall);
    }

    public String getQuantityMaterialWall() {
        return quantityMaterialWall.get();
    }

    public SimpleStringProperty quantityMaterialWallProperty() {
        return quantityMaterialWall;
    }

    public void setQuantityMaterialWall(String quantityMaterialWall) {
        this.quantityMaterialWall = new SimpleStringProperty(quantityMaterialWall);
    }

    public String getOrdinalPriceUnitMaterialWall() {
        return ordinalPriceUnitMaterialWall.get();
    }

    public SimpleStringProperty ordinalPriceUnitMaterialWallProperty() {
        return ordinalPriceUnitMaterialWall;
    }

    public void setOrdinalPriceUnitMaterialWall(String ordinalPriceUnitMaterialWall) {
        this.ordinalPriceUnitMaterialWall = new SimpleStringProperty(ordinalPriceUnitMaterialWall);
    }

    public String getPriceCPUnitMaterialWall() {
        return priceCPUnitMaterialWall.get();
    }

    public SimpleStringProperty priceCPUnitMaterialWallProperty() {
        return priceCPUnitMaterialWall;
    }

    public void setPriceCPUnitMaterialWall(String priceCPUnitMaterialWall) {
        this.priceCPUnitMaterialWall = new SimpleStringProperty(priceCPUnitMaterialWall);
    }

    public String getPriceCPKeyMaterialWall() {
        return priceCPKeyMaterialWall.get();
    }

    public SimpleStringProperty priceCPKeyMaterialWallProperty() {
        return priceCPKeyMaterialWall;
    }

    public void setPriceCPKeyMaterialWall(String priceCPKeyMaterialWall) {
        this.priceCPKeyMaterialWall = new SimpleStringProperty(priceCPKeyMaterialWall);
    }

    public String getCostCPUnitMaterialWall() {
        return costCPUnitMaterialWall.get();
    }

    public SimpleStringProperty costCPUnitMaterialWallProperty() {
        return costCPUnitMaterialWall;
    }

    public void setCostCPUnitMaterialWall(String costCPUnitMaterialWall) {
        this.costCPUnitMaterialWall = new SimpleStringProperty(costCPUnitMaterialWall);
    }

    public String getPriceOrderMaterialWall() {
        return priceOrderMaterialWall.get();
    }

    public SimpleStringProperty priceOrderMaterialWallProperty() {
        return priceOrderMaterialWall;
    }

    public void setPriceOrderMaterialWall(String priceOrderMaterialWall) {
        this.priceOrderMaterialWall = new SimpleStringProperty(priceOrderMaterialWall);
    }

    public String getCostCPMaterialWall() {
        return costCPMaterialWall.get();
    }

    public SimpleStringProperty costCPMaterialWallProperty() {
        return costCPMaterialWall;
    }

    public void setCostCPMaterialWall(String costCPMaterialWall) {
        this.costCPMaterialWall = new SimpleStringProperty(costCPMaterialWall);
    }

    public String getProductionTimeMaterialWall() {
        return productionTimeMaterialWall.get();
    }

    public SimpleStringProperty productionTimeMaterialWallProperty() {
        return productionTimeMaterialWall;
    }

    public void setProductionTimeMaterialWall(String productionTimeMaterialWall) {
        this.productionTimeMaterialWall = new SimpleStringProperty(productionTimeMaterialWall);
    }

    public String getActualCostMaterialWall() {
        return actualCostMaterialWall.get();
    }

    public SimpleStringProperty actualCostMaterialWallProperty() {
        return actualCostMaterialWall;
    }

    public void setActualCostMaterialWall(String actualCostMaterialWall) {
        this.actualCostMaterialWall = new SimpleStringProperty(actualCostMaterialWall);
    }

    public String getActualDifferenceMaterialWall() {
        return actualDifferenceMaterialWall.get();
    }

    public SimpleStringProperty actualDifferenceMaterialWallProperty() {
        return actualDifferenceMaterialWall;
    }

    public void setActualDifferenceMaterialWall(String actualDifferenceMaterialWall) {
        this.actualDifferenceMaterialWall = new SimpleStringProperty(actualDifferenceMaterialWall);
    }

    public String getPaidMaterialWall() {
        return paidMaterialWall.get();
    }

    public SimpleStringProperty paidMaterialWallProperty() {
        return paidMaterialWall;
    }

    public void setPaidMaterialWall(String paidMaterialWall) {
        this.paidMaterialWall = new SimpleStringProperty(paidMaterialWall);
    }

    public String getResidueMaterialWall() {
        return residueMaterialWall.get();
    }

    public SimpleStringProperty residueMaterialWallProperty() {
        return residueMaterialWall;
    }

    public void setResidueMaterialWall(String residueMaterialWall) {
        this.residueMaterialWall = new SimpleStringProperty(residueMaterialWall);
    }

    public String getDateOfDeliveryMaterialWall() {
        return dateOfDeliveryMaterialWall.get();
    }

    public SimpleStringProperty dateOfDeliveryMaterialWallProperty() {
        return dateOfDeliveryMaterialWall;
    }

    public void setDateOfDeliveryMaterialWall(String dateOfDeliveryMaterialWall) {
        this.dateOfDeliveryMaterialWall = new SimpleStringProperty(dateOfDeliveryMaterialWall);
    }

    public String getPlannedCPMaterialWall() {
        return plannedCPMaterialWall.get();
    }

    public SimpleStringProperty plannedCPMaterialWallProperty() {
        return plannedCPMaterialWall;
    }

    public void setPlannedCPMaterialWall(String plannedCPMaterialWall) {
        this.plannedCPMaterialWall = new SimpleStringProperty(plannedCPMaterialWall);
    }

    public String getActualCPMaterialWall() {
        return actualCPMaterialWall.get();
    }

    public SimpleStringProperty actualCPMaterialWallProperty() {
        return actualCPMaterialWall;
    }

    public void setActualCPMaterialWall(String actualCPMaterialWall) {
        this.actualCPMaterialWall = new SimpleStringProperty(actualCPMaterialWall);
    }

    public String getAccountMaterialWall() {
        return accountMaterialWall.get();
    }

    public SimpleStringProperty accountMaterialWallProperty() {
        return accountMaterialWall;
    }

    public void setAccountMaterialWall(String accountMaterialWall) {
        this.accountMaterialWall = new SimpleStringProperty(accountMaterialWall);
    }

    public String getContactsMaterialWall() {
        return contactsMaterialWall.get();
    }

    public SimpleStringProperty contactsMaterialWallProperty() {
        return contactsMaterialWall;
    }

    public void setContactsMaterialWall(String contactsMaterialWall) {
        this.contactsMaterialWall = new SimpleStringProperty(contactsMaterialWall);
    }

    public String getNotesMaterialWall() {
        return notesMaterialWall.get();
    }

    public SimpleStringProperty notesMaterialWallProperty() {
        return notesMaterialWall;
    }

    public void setNotesMaterialWall(String notesMaterialWall) {
        this.notesMaterialWall = new SimpleStringProperty(notesMaterialWall);
    }

    public String getCharacteristicsMaterialWall() {
        return characteristicsMaterialWall.get();
    }

    public SimpleStringProperty characteristicsMaterialWallProperty() {
        return characteristicsMaterialWall;
    }

    public void setCharacteristicsMaterialWall(String characteristicsMaterialWall) {
        this.characteristicsMaterialWall = new SimpleStringProperty(characteristicsMaterialWall);
    }
}