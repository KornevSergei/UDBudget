package sample;

import javafx.beans.property.SimpleStringProperty;

public class MaterialCeiling {
    protected String nameMaterialCeiling;//Наименование
    protected boolean activePMaterialCeiling;//П
    protected boolean activeCMaterialCeiling;//С
    protected String unitMaterialCeiling;//Ед. изм.
    protected double quantityMaterialCeiling;//Количество
    protected double ordinalPriceUnitMaterialCeiling;//Цена порядковая за ед.
    protected double priceCPUnitMaterialCeiling;//Цена по КП за ед.
    protected double priceCPKeyMaterialCeiling;//Цена по КП под ключ
    protected double costCPUnitMaterialCeiling;//Стоимость по КП за ед.
    protected double priceOrderMaterialCeiling;//Порядок цен
    protected double costCPMaterialCeiling;//Стоимость по КП
    protected String productionTimeMaterialCeiling;//Срок доставки
    protected double actualCostMaterialCeiling;//Стоимость фактическая
    protected double actualDifferenceMaterialCeiling;//Разница фактическая
    protected double paidMaterialCeiling;//Оплачено
    protected double residueMaterialCeiling;//Остаток
    protected String dateOfDeliveryMaterialCeiling;//Дата поставки
    protected String nameRoomMaterialCeiling;//аименование помещения
    protected String plannedCPMaterialCeiling;
    protected String actualCPMaterialCeiling;
    protected String accountMaterialCeiling;
    protected String contactsMaterialCeiling;
    protected String notesMaterialCeiling;
    protected String characteristicsMaterialCeiling;


    public MaterialCeiling(String nameMaterialCeiling, boolean activePMaterialCeiling, boolean activeCMaterialCeiling, String unitMaterialCeiling, double quantityMaterialCeiling,
                        double ordinalPriceUnitMaterialCeiling, double priceCPUnitMaterialCeiling, double priceCPKeyMaterialCeiling, double costCPUnitMaterialCeiling,
                        double priceOrderMaterialCeiling, double costCPMaterialCeiling, String productionTimeMaterialCeiling, double actualCostMaterialCeiling,
                        double actualDifferenceMaterialCeiling, double paidMaterialCeiling, double residueMaterialCeiling, String dateOfDeliveryMaterialCeiling,String nameRoomMaterialCeiling,
                        String plannedCPMaterialCeiling, String actualCPMaterialCeiling, String accountMaterialCeiling, String contactsMaterialCeiling, String notesMaterialCeiling,
                        String characteristicsMaterialCeiling) {
        this.nameMaterialCeiling = nameMaterialCeiling;
        this.unitMaterialCeiling = unitMaterialCeiling;
        this.activePMaterialCeiling = activePMaterialCeiling;
        this.activeCMaterialCeiling = activeCMaterialCeiling;
        this.quantityMaterialCeiling = quantityMaterialCeiling;
        this.ordinalPriceUnitMaterialCeiling = ordinalPriceUnitMaterialCeiling;
        this.priceCPUnitMaterialCeiling = priceCPUnitMaterialCeiling;
        this.priceCPKeyMaterialCeiling = priceCPKeyMaterialCeiling;
        this.costCPUnitMaterialCeiling = costCPUnitMaterialCeiling;
        this.priceOrderMaterialCeiling = priceOrderMaterialCeiling;
        this.costCPMaterialCeiling = costCPMaterialCeiling;
        this.productionTimeMaterialCeiling = productionTimeMaterialCeiling;
        this.actualCostMaterialCeiling = actualCostMaterialCeiling;
        this.actualDifferenceMaterialCeiling = actualDifferenceMaterialCeiling;
        this.paidMaterialCeiling = paidMaterialCeiling;
        this.residueMaterialCeiling = residueMaterialCeiling;
        this.dateOfDeliveryMaterialCeiling = dateOfDeliveryMaterialCeiling;
        this.nameRoomMaterialCeiling = nameRoomMaterialCeiling;
        this.plannedCPMaterialCeiling = plannedCPMaterialCeiling;
        this.actualCPMaterialCeiling = actualCPMaterialCeiling;
        this.accountMaterialCeiling = accountMaterialCeiling;
        this.contactsMaterialCeiling = contactsMaterialCeiling;
        this.notesMaterialCeiling = notesMaterialCeiling;
        this.characteristicsMaterialCeiling = characteristicsMaterialCeiling;
    }

    public void CalculatePriceOrderMaterialCeiling() {
        priceOrderMaterialCeiling = quantityMaterialCeiling * ordinalPriceUnitMaterialCeiling;
    }

    public void CalculateСostCPUnitMaterialCeiling() {
        if (priceCPKeyMaterialCeiling > 0)
            costCPUnitMaterialCeiling = priceCPKeyMaterialCeiling / quantityMaterialCeiling;
        else costCPUnitMaterialCeiling = priceCPUnitMaterialCeiling;
    }

    public void CalculateCostCPMaterialCeiling() {
        if (priceCPKeyMaterialCeiling > 0)
            costCPMaterialCeiling = priceCPKeyMaterialCeiling;
        else costCPMaterialCeiling = priceCPUnitMaterialCeiling * quantityMaterialCeiling;
    }

    public void CalculateActualDifferenceMaterialCeiling() {
        actualDifferenceMaterialCeiling = costCPMaterialCeiling - actualCostMaterialCeiling;
    }

    public void CalculateResidueMaterialCeiling() {
        residueMaterialCeiling = actualCostMaterialCeiling - paidMaterialCeiling;
    }


    public String getNameMaterialCeiling() {
        return nameMaterialCeiling;
    }

    public void setNameMaterialCeiling(String nameMaterialCeiling) {
        this.nameMaterialCeiling = nameMaterialCeiling;
    }

    public String getUnitMaterialCeiling() {
        return unitMaterialCeiling;
    }

    public void setUnitMaterialCeiling(String unitMaterialCeiling) {
        this.unitMaterialCeiling = unitMaterialCeiling;
    }

    //Чекбоксы
    public boolean getActivePMaterialCeiling() {
        return activePMaterialCeiling;
    }

    public void setActivePMaterialCeiling(boolean activePMaterialCeiling) {
        this.activePMaterialCeiling = activePMaterialCeiling;
    }

    public void setActivePMaterialCeiling(String activePMaterialCeiling) {
        this.activePMaterialCeiling = Boolean.parseBoolean(activePMaterialCeiling);
    }

    public boolean getActiveCMaterialCeiling() {
        return activeCMaterialCeiling;
    }

    public void setActiveCMaterialCeiling(boolean activeCMaterialCeiling) {
        this.activeCMaterialCeiling = activeCMaterialCeiling;
    }

    public void setActiveCMaterialCeiling(String activeCMaterialCeiling) {
        this.activeCMaterialCeiling = Boolean.parseBoolean(activeCMaterialCeiling);
    }

    //Обана
    public String getQuantityMaterialCeiling() {
        return Double.toString(quantityMaterialCeiling);
    }

    public void setQuantityMaterialWall(double quantityMaterialCeiling) {
        this.quantityMaterialCeiling = quantityMaterialCeiling;
    }

    public void setQuantityMaterialCeiling(String quantityMaterialCeiling) {
        this.quantityMaterialCeiling = Double.parseDouble(quantityMaterialCeiling);
        CalculatePriceOrderMaterialCeiling();
        CalculateCostCPMaterialCeiling();
    }

    //Хуяк
    public String getOrdinalPriceUnitMaterialCeiling() {
        return Double.toString(ordinalPriceUnitMaterialCeiling);
    }

    public void setOrdinalPriceUnitMaterialCeiling(double ordinalPriceUnitMaterialCeiling) {
        this.ordinalPriceUnitMaterialCeiling = ordinalPriceUnitMaterialCeiling;
    }

    public void setOrdinalPriceUnitMaterialCeiling(String ordinalPriceUnitMaterialCeiling) {
        this.ordinalPriceUnitMaterialCeiling = Double.parseDouble(ordinalPriceUnitMaterialCeiling);
        CalculatePriceOrderMaterialCeiling();
    }

    public String getPriceCPUnitMaterialCeiling() {
        return Double.toString(priceCPUnitMaterialCeiling);
    }

    public void setPriceCPUnitMaterialCeiling(double priceCPUnitMaterialCeiling) {
        this.priceCPUnitMaterialCeiling = priceCPUnitMaterialCeiling;
    }

    public void setPriceCPUnitMaterialCeiling(String priceCPUnitMaterialCeiling) {
        this.priceCPUnitMaterialCeiling = Double.parseDouble(priceCPUnitMaterialCeiling);
        CalculateСostCPUnitMaterialCeiling();
        CalculateCostCPMaterialCeiling();
    }

    public String getPriceCPKeyMaterialCeiling() {
        return Double.toString(priceCPKeyMaterialCeiling);
    }

    public void setPriceCPKeyMaterialCeiling(double priceCPKeyMaterialCeiling) {
        this.priceCPKeyMaterialCeiling = priceCPKeyMaterialCeiling;
    }

    public void setPriceCPKeyMaterialCeiling(String priceCPKeyMaterialCeiling) {
        this.priceCPKeyMaterialCeiling = Double.parseDouble(priceCPKeyMaterialCeiling);
        CalculateСostCPUnitMaterialCeiling();
        CalculateCostCPMaterialCeiling();
    }

    public String getCostCPUnitMaterialCeiling() {
        return Double.toString(costCPUnitMaterialCeiling);
    }

    public void setCostCPUnitMaterialCeiling(double costCPUnitMaterialCeiling) {
        this.costCPUnitMaterialCeiling = costCPUnitMaterialCeiling;
    }

    public void setCostCPUnitMaterialCeiling(String costCPUnitMaterialCeiling) {
        this.costCPUnitMaterialCeiling = Double.parseDouble(costCPUnitMaterialCeiling);
    }

    //Понеслось
    public String getPriceOrderMaterialCeiling() {
        return Double.toString(priceOrderMaterialCeiling);
    }

    public void setPriceOrderMaterialCeiling(double priceOrderMaterialCeiling) {
        this.priceOrderMaterialCeiling = priceOrderMaterialCeiling;
    }

    public void setPriceOrderMaterialCeiling(String priceOrderMaterialCeiling) {
        this.priceOrderMaterialCeiling = Double.parseDouble(priceOrderMaterialCeiling);
    }

    public String getCostCPMaterialCeiling() {
        return Double.toString(costCPMaterialCeiling);
    }

    public void setCostCPMaterialCeiling(double costCPMaterialCeiling) {
        this.costCPMaterialCeiling = costCPMaterialCeiling;
    }

    public void setCostCPMaterialCeiling(String costCPMaterialCeiling) {
        this.costCPMaterialCeiling = Double.parseDouble(costCPMaterialCeiling);
        CalculateActualDifferenceMaterialCeiling();
    }

    public String getProductionTimeMaterialCeiling() {
        return productionTimeMaterialCeiling;
    }

    public void setProductionTimeMaterialCeiling(String productionTimeMaterialCeiling) {
        this.productionTimeMaterialCeiling = productionTimeMaterialCeiling;
    }

    public String getActualCostMaterialCeiling() {
        return Double.toString(actualCostMaterialCeiling);
    }

    public void setActualCostMaterialCeiling(double actualCostMaterialCeiling) {
        this.actualCostMaterialCeiling = actualCostMaterialCeiling;
    }

    public void setActualCostMaterialCeiling(String actualCostMaterialCeiling) {
        this.actualCostMaterialCeiling = Double.parseDouble(actualCostMaterialCeiling);
        CalculateActualDifferenceMaterialCeiling();
        CalculateResidueMaterialCeiling();

    }

    public String getActualDifferenceMaterialCeiling() {
        return Double.toString(actualDifferenceMaterialCeiling);
    }

    public void setActualDifferenceMaterialCeiling(double actualDifferenceMaterialCeiling) {
        this.actualDifferenceMaterialCeiling = actualDifferenceMaterialCeiling;
    }

    public void setActualDifferenceMaterialCeiling(String actualDifferenceMaterialCeiling) {
        this.actualDifferenceMaterialCeiling = Double.parseDouble(actualDifferenceMaterialCeiling);
    }

    public String getPaidMaterialCeiling() {
        return Double.toString(paidMaterialCeiling);
    }

    public void setPaidMaterialCeiling(double paidMaterialCeiling) {
        this.paidMaterialCeiling = paidMaterialCeiling;
    }

    public void setPaidMaterialCeiling(String paidMaterialCeiling) {
        this.paidMaterialCeiling = Double.parseDouble(paidMaterialCeiling);
        CalculateResidueMaterialCeiling();
    }

    public String getResidueMaterialCeiling() {
        return Double.toString(residueMaterialCeiling);
    }

    public void setResidueMaterialCeiling(double residueMaterialCeiling) {
        this.residueMaterialCeiling = residueMaterialCeiling;
    }

    public void setResidueMaterialCeiling(String residueMaterialCeiling) {
        this.residueMaterialCeiling = Double.parseDouble(residueMaterialCeiling);
    }

    public String getDateOfDeliveryMaterialCeiling() {
        return dateOfDeliveryMaterialCeiling;
    }

    public void setDateOfDeliveryMaterialCeiling(String dateOfDeliveryMaterialCeiling) {
        this.dateOfDeliveryMaterialCeiling = dateOfDeliveryMaterialCeiling;
    }

    public String getNameRoomMaterialCeiling() {
        return nameRoomMaterialCeiling;
    }

    public void setNameRoomMaterialCeiling(String nameRoomMaterialCeiling) {
        this.nameRoomMaterialCeiling = nameRoomMaterialCeiling;
    }

    public String getPlannedCPMaterialCeiling() {
        return plannedCPMaterialCeiling;
    }

    public void setPlannedCPMaterialCeiling(String plannedCPMaterialCeiling) {
        this.plannedCPMaterialCeiling = plannedCPMaterialCeiling;
    }

    public String getActualCPMaterialCeiling() {
        return actualCPMaterialCeiling;
    }

    public void setActualCPMaterialCeiling(String actualCPMaterialCeiling) {
        this.actualCPMaterialCeiling = actualCPMaterialCeiling;
    }

    public String getAccountMaterialCeiling() {
        return accountMaterialCeiling;
    }

    public void setAccountMaterialCeiling(String accountMaterialCeiling) {
        this.accountMaterialCeiling = accountMaterialCeiling;
    }

    public String getContactsMaterialCeiling() {
        return contactsMaterialCeiling;
    }

    public void setContactsMaterialCeiling(String contactsMaterialCeiling) {
        this.contactsMaterialCeiling = contactsMaterialCeiling;
    }

    public String getNotesMaterialCeiling() {
        return notesMaterialCeiling;
    }

    public void setNotesMaterialCeiling(String notesMaterialCeiling) {
        this.notesMaterialCeiling = notesMaterialCeiling;
    }

    public String getCharacteristicsMaterialCeiling() {
        return characteristicsMaterialCeiling;
    }

    public void setCharacteristicsMaterialCeiling(String characteristicsMaterialCeiling) {
        this.characteristicsMaterialCeiling = characteristicsMaterialCeiling;
    }
}
