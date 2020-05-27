package sample;

import javafx.beans.property.SimpleStringProperty;

public class MaterialWall {
    protected String nameMaterialWall;
    protected String unitMaterialWall;
    protected double quantityMaterialWall;//1
    protected double ordinalPriceUnitMaterialWall;//2
    protected double priceCPUnitMaterialWall;
    protected double priceCPKeyMaterialWall;
    protected double costCPUnitMaterialWall;
    protected double priceOrderMaterialWall;//=
    protected double costCPMaterialWall;
    protected String productionTimeMaterialWall;
    protected double actualCostMaterialWall;
    protected double actualDifferenceMaterialWall;
    protected double paidMaterialWall;
    protected double residueMaterialWall;
    protected String dateOfDeliveryMaterialWall;
    protected String plannedCPMaterialWall;
    protected String actualCPMaterialWall;
    protected String accountMaterialWall;
    protected String contactsMaterialWall;
    protected String notesMaterialWall;
    protected String characteristicsMaterialWall;

    public MaterialWall(double quantityMaterialWall, double ordinalPriceUnitMaterialWall, double priceOrderMaterialWall) {
        this.quantityMaterialWall = quantityMaterialWall;
        this.ordinalPriceUnitMaterialWall = ordinalPriceUnitMaterialWall;
        this.priceOrderMaterialWall = priceOrderMaterialWall;
    }

    public MaterialWall(String nameMaterialWall, String unitMaterialWall, double quantityMaterialWall, double ordinalPriceUnitMaterialWall, double priceCPUnitMaterialWall, double priceCPKeyMaterialWall, double costCPUnitMaterialWall, double priceOrderMaterialWall, double costCPMaterialWall, String productionTimeMaterialWall, double actualCostMaterialWall, double actualDifferenceMaterialWall, double paidMaterialWall, double residueMaterialWall, String dateOfDeliveryMaterialWall, String plannedCPMaterialWall, String actualCPMaterialWall, String accountMaterialWall, String contactsMaterialWall, String notesMaterialWall, String characteristicsMaterialWall) {
        this.nameMaterialWall = nameMaterialWall;
        this.unitMaterialWall = unitMaterialWall;
        this.quantityMaterialWall = quantityMaterialWall;
        this.ordinalPriceUnitMaterialWall = ordinalPriceUnitMaterialWall;
        this.priceCPUnitMaterialWall = priceCPUnitMaterialWall;
        this.priceCPKeyMaterialWall = priceCPKeyMaterialWall;
        this.costCPUnitMaterialWall = costCPUnitMaterialWall;
        this.priceOrderMaterialWall = priceOrderMaterialWall;
        this.costCPMaterialWall = costCPMaterialWall;
        this.productionTimeMaterialWall = productionTimeMaterialWall;
        this.actualCostMaterialWall = actualCostMaterialWall;
        this.actualDifferenceMaterialWall = actualDifferenceMaterialWall;
        this.paidMaterialWall = paidMaterialWall;
        this.residueMaterialWall = residueMaterialWall;
        this.dateOfDeliveryMaterialWall = dateOfDeliveryMaterialWall;
        this.plannedCPMaterialWall = plannedCPMaterialWall;
        this.actualCPMaterialWall = actualCPMaterialWall;
        this.accountMaterialWall = accountMaterialWall;
        this.contactsMaterialWall = contactsMaterialWall;
        this.notesMaterialWall = notesMaterialWall;
        this.characteristicsMaterialWall = characteristicsMaterialWall;
    }

    public void Calculate() {
        priceOrderMaterialWall = quantityMaterialWall * ordinalPriceUnitMaterialWall;
    }

    public String getNameMaterialWall() {
        return nameMaterialWall;
    }

    public void setNameMaterialWall(String nameMaterialWall) {
        this.nameMaterialWall = nameMaterialWall;
    }

    public String getUnitMaterialWall() {
        return unitMaterialWall;
    }

    public void setUnitMaterialWall(String unitMaterialWall) {
        this.unitMaterialWall = unitMaterialWall;
    }

    //Обана
    public String getQuantityMaterialWall() {
        return Double.toString(quantityMaterialWall);
    }

    public void setQuantityMaterialWall(double quantityMaterialWall) {
        this.quantityMaterialWall = quantityMaterialWall;
    }

    public void setQuantityMaterialWall(String quantityMaterialWall) {
        this.quantityMaterialWall = Double.parseDouble(quantityMaterialWall);
        Calculate();
    }
    //Хуяк
    public String getOrdinalPriceUnitMaterialWall() {
        return Double.toString(ordinalPriceUnitMaterialWall);
    }

    public void setOrdinalPriceUnitMaterialWall(double ordinalPriceUnitMaterialWall) {
        this.ordinalPriceUnitMaterialWall = ordinalPriceUnitMaterialWall;
    }
    public void setOrdinalPriceUnitMaterialWall(String ordinalPriceUnitMaterialWall) {
        this.ordinalPriceUnitMaterialWall = Double.parseDouble(ordinalPriceUnitMaterialWall);
        Calculate();
    }

    public double getPriceCPUnitMaterialWall() {
        return priceCPUnitMaterialWall;
    }

    public void setPriceCPUnitMaterialWall(double priceCPUnitMaterialWall) {
        this.priceCPUnitMaterialWall = priceCPUnitMaterialWall;
    }

    public double getPriceCPKeyMaterialWall() {
        return priceCPKeyMaterialWall;
    }

    public void setPriceCPKeyMaterialWall(double priceCPKeyMaterialWall) {
        this.priceCPKeyMaterialWall = priceCPKeyMaterialWall;
    }

    public double getCostCPUnitMaterialWall() {
        return costCPUnitMaterialWall;
    }

    public void setCostCPUnitMaterialWall(double costCPUnitMaterialWall) {
        this.costCPUnitMaterialWall = costCPUnitMaterialWall;
    }
    //Понеслось
    public String getPriceOrderMaterialWall() {
        return Double.toString(priceOrderMaterialWall);
    }

    public void setPriceOrderMaterialWall(double priceOrderMaterialWall) {
        this.priceOrderMaterialWall = priceOrderMaterialWall;
    }

    public void setPriceOrderMaterialWall(String priceOrderMaterialWall) {
        this.priceOrderMaterialWall = Double.parseDouble(priceOrderMaterialWall);
    }

    public double getCostCPMaterialWall() {
        return costCPMaterialWall;
    }

    public void setCostCPMaterialWall(double costCPMaterialWall) {
        this.costCPMaterialWall = costCPMaterialWall;
    }

    public String getProductionTimeMaterialWall() {
        return productionTimeMaterialWall;
    }

    public void setProductionTimeMaterialWall(String productionTimeMaterialWall) {
        this.productionTimeMaterialWall = productionTimeMaterialWall;
    }

    public double getActualCostMaterialWall() {
        return actualCostMaterialWall;
    }

    public void setActualCostMaterialWall(double actualCostMaterialWall) {
        this.actualCostMaterialWall = actualCostMaterialWall;
    }

    public double getActualDifferenceMaterialWall() {
        return actualDifferenceMaterialWall;
    }

    public void setActualDifferenceMaterialWall(double actualDifferenceMaterialWall) {
        this.actualDifferenceMaterialWall = actualDifferenceMaterialWall;
    }

    public double getPaidMaterialWall() {
        return paidMaterialWall;
    }

    public void setPaidMaterialWall(double paidMaterialWall) {
        this.paidMaterialWall = paidMaterialWall;
    }

    public double getResidueMaterialWall() {
        return residueMaterialWall;
    }

    public void setResidueMaterialWall(double residueMaterialWall) {
        this.residueMaterialWall = residueMaterialWall;
    }

    public String getDateOfDeliveryMaterialWall() {
        return dateOfDeliveryMaterialWall;
    }

    public void setDateOfDeliveryMaterialWall(String dateOfDeliveryMaterialWall) {
        this.dateOfDeliveryMaterialWall = dateOfDeliveryMaterialWall;
    }

    public String getPlannedCPMaterialWall() {
        return plannedCPMaterialWall;
    }

    public void setPlannedCPMaterialWall(String plannedCPMaterialWall) {
        this.plannedCPMaterialWall = plannedCPMaterialWall;
    }

    public String getActualCPMaterialWall() {
        return actualCPMaterialWall;
    }

    public void setActualCPMaterialWall(String actualCPMaterialWall) {
        this.actualCPMaterialWall = actualCPMaterialWall;
    }

    public String getAccountMaterialWall() {
        return accountMaterialWall;
    }

    public void setAccountMaterialWall(String accountMaterialWall) {
        this.accountMaterialWall = accountMaterialWall;
    }

    public String getContactsMaterialWall() {
        return contactsMaterialWall;
    }

    public void setContactsMaterialWall(String contactsMaterialWall) {
        this.contactsMaterialWall = contactsMaterialWall;
    }

    public String getNotesMaterialWall() {
        return notesMaterialWall;
    }

    public void setNotesMaterialWall(String notesMaterialWall) {
        this.notesMaterialWall = notesMaterialWall;
    }

    public String getCharacteristicsMaterialWall() {
        return characteristicsMaterialWall;
    }

    public void setCharacteristicsMaterialWall(String characteristicsMaterialWall) {
        this.characteristicsMaterialWall = characteristicsMaterialWall;
    }
}