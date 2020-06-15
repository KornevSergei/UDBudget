package sample;

public class MaterialOther {
    protected String nameMaterialOther;//Наименование
    protected boolean activePMaterialOther;//П
    protected boolean activeCMaterialOther;//С
    protected String unitMaterialOther;//Ед. изм.
    protected double quantityMaterialOther;//Количество
    protected double ordinalPriceUnitMaterialOther;//Цена порядковая за ед.
    protected double priceCPUnitMaterialOther;//Цена по КП за ед.
    protected double priceCPKeyMaterialOther;//Цена по КП под ключ
    protected double costCPUnitMaterialOther;//Стоимость по КП за ед.
    protected double priceOrderMaterialOther;//Порядок цен
    protected double costCPMaterialOther;//Стоимость по КП
    protected String productionTimeMaterialOther;//Срок доставки
    protected double actualCostMaterialOther;//Стоимость фактическая
    protected double actualDifferenceMaterialOther;//Разница фактическая
    protected double paidMaterialOther;//Оплачено
    protected double residueMaterialOther;//Остаток
    protected String dateOfDeliveryMaterialOther;//Дата поставки
    protected String nameRoomMaterialOther;//аименование помещения
    protected String plannedCPMaterialOther;
    protected String actualCPMaterialOther;
    protected String accountMaterialOther;
    protected String contactsMaterialOther;
    protected String notesMaterialOther;
    protected String characteristicsMaterialOther;


    public MaterialOther(String nameMaterialOther, boolean activePMaterialOther, boolean activeCMaterialOther, String unitMaterialOther, double quantityMaterialOther,
                         double ordinalPriceUnitMaterialOther, double priceCPUnitMaterialOther, double priceCPKeyMaterialOther, double costCPUnitMaterialOther,
                         double priceOrderMaterialOther, double costCPMaterialOther, String productionTimeMaterialOther, double actualCostMaterialOther,
                         double actualDifferenceMaterialOther, double paidMaterialOther, double residueMaterialOther, String dateOfDeliveryMaterialOther,String nameRoomMaterialOther,
                         String plannedCPMaterialOther, String actualCPMaterialOther, String accountMaterialOther, String contactsMaterialOther, String notesMaterialOther,
                         String characteristicsMaterialOther) {
        this.nameMaterialOther = nameMaterialOther;
        this.unitMaterialOther = unitMaterialOther;
        this.activePMaterialOther = activePMaterialOther;
        this.activeCMaterialOther = activeCMaterialOther;
        this.quantityMaterialOther = quantityMaterialOther;
        this.ordinalPriceUnitMaterialOther = ordinalPriceUnitMaterialOther;
        this.priceCPUnitMaterialOther = priceCPUnitMaterialOther;
        this.priceCPKeyMaterialOther = priceCPKeyMaterialOther;
        this.costCPUnitMaterialOther = costCPUnitMaterialOther;
        this.priceOrderMaterialOther = priceOrderMaterialOther;
        this.costCPMaterialOther = costCPMaterialOther;
        this.productionTimeMaterialOther = productionTimeMaterialOther;
        this.actualCostMaterialOther = actualCostMaterialOther;
        this.actualDifferenceMaterialOther = actualDifferenceMaterialOther;
        this.paidMaterialOther = paidMaterialOther;
        this.residueMaterialOther = residueMaterialOther;
        this.dateOfDeliveryMaterialOther = dateOfDeliveryMaterialOther;
        this.nameRoomMaterialOther = nameRoomMaterialOther;
        this.plannedCPMaterialOther = plannedCPMaterialOther;
        this.actualCPMaterialOther = actualCPMaterialOther;
        this.accountMaterialOther = accountMaterialOther;
        this.contactsMaterialOther = contactsMaterialOther;
        this.notesMaterialOther = notesMaterialOther;
        this.characteristicsMaterialOther = characteristicsMaterialOther;
    }

    public void CalculatePriceOrderMaterialOther() {
        priceOrderMaterialOther = quantityMaterialOther * ordinalPriceUnitMaterialOther;
    }

    public void CalculateСostCPUnitMaterialOther() {
        if (priceCPKeyMaterialOther > 0)
            costCPUnitMaterialOther = priceCPKeyMaterialOther / quantityMaterialOther;
        else costCPUnitMaterialOther = priceCPUnitMaterialOther;
    }

    public void CalculateCostCPMaterialOther() {
        if (priceCPKeyMaterialOther > 0)
            costCPMaterialOther = priceCPKeyMaterialOther;
        else costCPMaterialOther = priceCPUnitMaterialOther * quantityMaterialOther;
    }

    public void CalculateActualDifferenceMaterialOther() {
        actualDifferenceMaterialOther = costCPMaterialOther - actualCostMaterialOther;
    }

    public void CalculateResidueMaterialOther() {
        residueMaterialOther = actualCostMaterialOther - paidMaterialOther;
    }


    public String getNameMaterialOther() {
        return nameMaterialOther;
    }

    public void setNameMaterialOther(String nameMaterialOther) {
        this.nameMaterialOther = nameMaterialOther;
    }

    public String getUnitMaterialOther() {
        return unitMaterialOther;
    }

    public void setUnitMaterialOther(String unitMaterialOther) {
        this.unitMaterialOther = unitMaterialOther;
    }

    //Чекбоксы
    public boolean getActivePMaterialOther() {
        return activePMaterialOther;
    }

    public void setActivePMaterialOther(boolean activePMaterialOther) {
        this.activePMaterialOther = activePMaterialOther;
    }

    public void setActivePMaterialOther(String activePMaterialOther) {
        this.activePMaterialOther = Boolean.parseBoolean(activePMaterialOther);
    }

    public boolean getActiveCMaterialOther() {
        return activeCMaterialOther;
    }

    public void setActiveCMaterialOther(boolean activeCMaterialOther) {
        this.activeCMaterialOther = activeCMaterialOther;
    }

    public void setActiveCMaterialOther(String activeCMaterialOther) {
        this.activeCMaterialOther = Boolean.parseBoolean(activeCMaterialOther);
    }

    //Обана
    public String getQuantityMaterialOther() {
        return Double.toString(quantityMaterialOther);
    }

    public void setQuantityMaterialOther(double quantityMaterialOther) {
        this.quantityMaterialOther = quantityMaterialOther;
    }

    public void setQuantityMaterialOther(String quantityMaterialOther) {
        this.quantityMaterialOther = Double.parseDouble(quantityMaterialOther);
        CalculatePriceOrderMaterialOther();
        CalculateCostCPMaterialOther();
    }

    //Хуяк
    public String getOrdinalPriceUnitMaterialOther() {
        return Double.toString(ordinalPriceUnitMaterialOther);
    }

    public void setOrdinalPriceUnitMaterialOther(double ordinalPriceUnitMaterialOther) {
        this.ordinalPriceUnitMaterialOther = ordinalPriceUnitMaterialOther;
    }

    public void setOrdinalPriceUnitMaterialOther(String ordinalPriceUnitMaterialOther) {
        this.ordinalPriceUnitMaterialOther = Double.parseDouble(ordinalPriceUnitMaterialOther);
        CalculatePriceOrderMaterialOther();
    }

    public String getPriceCPUnitMaterialOther() {
        return Double.toString(priceCPUnitMaterialOther);
    }

    public void setPriceCPUnitMaterialOther(double priceCPUnitMaterialOther) {
        this.priceCPUnitMaterialOther = priceCPUnitMaterialOther;
    }

    public void setPriceCPUnitMaterialOther(String priceCPUnitMaterialOther) {
        this.priceCPUnitMaterialOther = Double.parseDouble(priceCPUnitMaterialOther);
        CalculateСostCPUnitMaterialOther();
        CalculateCostCPMaterialOther();
    }

    public String getPriceCPKeyMaterialOther() {
        return Double.toString(priceCPKeyMaterialOther);
    }

    public void setPriceCPKeyMaterialOther(double priceCPKeyMaterialOther) {
        this.priceCPKeyMaterialOther = priceCPKeyMaterialOther;
    }

    public void setPriceCPKeyMaterialOther(String priceCPKeyMaterialOther) {
        this.priceCPKeyMaterialOther = Double.parseDouble(priceCPKeyMaterialOther);
        CalculateСostCPUnitMaterialOther();
        CalculateCostCPMaterialOther();
    }

    public String getCostCPUnitMaterialOther() {
        return Double.toString(costCPUnitMaterialOther);
    }

    public void setCostCPUnitMaterialOther(double costCPUnitMaterialOther) {
        this.costCPUnitMaterialOther = costCPUnitMaterialOther;
    }

    public void setCostCPUnitMaterialOther(String costCPUnitMaterialOther) {
        this.costCPUnitMaterialOther = Double.parseDouble(costCPUnitMaterialOther);
    }

    //Понеслось
    public String getPriceOrderMaterialOther() {
        return Double.toString(priceOrderMaterialOther);
    }

    public void setPriceOrderMaterialOther(double priceOrderMaterialOther) {
        this.priceOrderMaterialOther = priceOrderMaterialOther;
    }

    public void setPriceOrderMaterialOther(String priceOrderMaterialOther) {
        this.priceOrderMaterialOther = Double.parseDouble(priceOrderMaterialOther);
    }

    public String getCostCPMaterialOther() {
        return Double.toString(costCPMaterialOther);
    }

    public void setCostCPMaterialOther(double costCPMaterialOther) {
        this.costCPMaterialOther = costCPMaterialOther;
    }

    public void setCostCPMaterialOther(String costCPMaterialOther) {
        this.costCPMaterialOther = Double.parseDouble(costCPMaterialOther);
        CalculateActualDifferenceMaterialOther();
    }

    public String getProductionTimeMaterialOther() {
        return productionTimeMaterialOther;
    }

    public void setProductionTimeMaterialOther(String productionTimeMaterialOther) {
        this.productionTimeMaterialOther = productionTimeMaterialOther;
    }

    public String getActualCostMaterialOther() {
        return Double.toString(actualCostMaterialOther);
    }

    public void setActualCostMaterialOther(double actualCostMaterialOther) {
        this.actualCostMaterialOther = actualCostMaterialOther;
    }

    public void setActualCostMaterialOther(String actualCostMaterialOther) {
        this.actualCostMaterialOther = Double.parseDouble(actualCostMaterialOther);
        CalculateActualDifferenceMaterialOther();
        CalculateResidueMaterialOther();

    }

    public String getActualDifferenceMaterialOther() {
        return Double.toString(actualDifferenceMaterialOther);
    }

    public void setActualDifferenceMaterialOther(double actualDifferenceMaterialOther) {
        this.actualDifferenceMaterialOther = actualDifferenceMaterialOther;
    }

    public void setActualDifferenceMaterialOther(String actualDifferenceMaterialOther) {
        this.actualDifferenceMaterialOther = Double.parseDouble(actualDifferenceMaterialOther);
    }

    public String getPaidMaterialOther() {
        return Double.toString(paidMaterialOther);
    }

    public void setPaidMaterialOther(double paidMaterialOther) {
        this.paidMaterialOther = paidMaterialOther;
    }

    public void setPaidMaterialOther(String paidMaterialOther) {
        this.paidMaterialOther = Double.parseDouble(paidMaterialOther);
        CalculateResidueMaterialOther();
    }

    public String getResidueMaterialOther() {
        return Double.toString(residueMaterialOther);
    }

    public void setResidueMaterialOther(double residueMaterialOther) {
        this.residueMaterialOther = residueMaterialOther;
    }

    public void setResidueMaterialOther(String residueMaterialOther) {
        this.residueMaterialOther = Double.parseDouble(residueMaterialOther);
    }

    public String getDateOfDeliveryMaterialOther() {
        return dateOfDeliveryMaterialOther;
    }

    public void setDateOfDeliveryMaterialOther(String dateOfDeliveryMaterialOther) {
        this.dateOfDeliveryMaterialOther = dateOfDeliveryMaterialOther;
    }

    public String getNameRoomMaterialOther() {
        return nameRoomMaterialOther;
    }

    public void setNameRoomMaterialOther(String nameRoomMaterialOther) {
        this.nameRoomMaterialOther = nameRoomMaterialOther;
    }

    public String getPlannedCPMaterialOther() {
        return plannedCPMaterialOther;
    }

    public void setPlannedCPMaterialOther(String plannedCPMaterialOther) {
        this.plannedCPMaterialOther = plannedCPMaterialOther;
    }

    public String getActualCPMaterialOther() {
        return actualCPMaterialOther;
    }

    public void setActualCPMaterialOther(String actualCPMaterialOther) {
        this.actualCPMaterialOther = actualCPMaterialOther;
    }

    public String getAccountMaterialOther() {
        return accountMaterialOther;
    }

    public void setAccountMaterialOther(String accountMaterialOther) {
        this.accountMaterialOther = accountMaterialOther;
    }

    public String getContactsMaterialOther() {
        return contactsMaterialOther;
    }

    public void setContactsMaterialOther(String contactsMaterialOther) {
        this.contactsMaterialOther = contactsMaterialOther;
    }

    public String getNotesMaterialOther() {
        return notesMaterialOther;
    }

    public void setNotesMaterialOther(String notesMaterialOther) {
        this.notesMaterialOther = notesMaterialOther;
    }

    public String getCharacteristicsMaterialOther() {
        return characteristicsMaterialOther;
    }

    public void setCharacteristicsMaterialOther(String characteristicsMaterialOther) {
        this.characteristicsMaterialOther = characteristicsMaterialOther;
    }
}
