package sample;

public class Light {
    protected String nameLight;//Наименование
    protected boolean activePLight;//П
    protected boolean activeCLight;//С
    protected String unitLight;//Ед. изм.
    protected double quantityLight;//Количество
    protected double ordinalPriceUnitLight;//Цена порядковая за ед.
    protected double priceCPUnitLight;//Цена по КП за ед.
    protected double priceCPKeyLight;//Цена по КП под ключ
    protected double costCPUnitLight;//Стоимость по КП за ед.
    protected double priceOrderLight;//Порядок цен
    protected double costCPLight;//Стоимость по КП
    protected String productionTimeLight;//Срок доставки
    protected double actualCostLight;//Стоимость фактическая
    protected double actualDifferenceLight;//Разница фактическая
    protected double paidLight;//Оплачено
    protected double residueLight;//Остаток
    protected String dateOfDeliveryLight;//Дата поставки
    protected String plannedCPLight;
    protected String actualCPLight;
    protected String accountLight;
    protected String contactsLight;
    protected String notesLight;
    protected String characteristicsLight;


    public Light(String nameLight, boolean activePLight, boolean activeCLight, String unitLight, double quantityLight,
                 double ordinalPriceUnitLight, double priceCPUnitLight, double priceCPKeyLight, double costCPUnitLight,
                 double priceOrderLight, double costCPLight, String productionTimeLight, double actualCostLight,
                 double actualDifferenceLight, double paidLight, double residueLight, String dateOfDeliveryLight,
                 String plannedCPLight, String actualCPLight, String accountLight, String contactsLight, String notesLight,
                 String characteristicsLight) {
        this.nameLight = nameLight;
        this.activePLight = activePLight;
        this.activeCLight = activeCLight;
        this.unitLight = unitLight;
        this.quantityLight = quantityLight;
        this.ordinalPriceUnitLight = ordinalPriceUnitLight;
        this.priceCPUnitLight = priceCPUnitLight;
        this.priceCPKeyLight = priceCPKeyLight;
        this.costCPUnitLight = costCPUnitLight;
        this.priceOrderLight = priceOrderLight;
        this.costCPLight = costCPLight;
        this.productionTimeLight = productionTimeLight;
        this.actualCostLight = actualCostLight;
        this.actualDifferenceLight = actualDifferenceLight;
        this.paidLight = paidLight;
        this.residueLight = residueLight;
        this.dateOfDeliveryLight = dateOfDeliveryLight;
        this.plannedCPLight = plannedCPLight;
        this.actualCPLight = actualCPLight;
        this.accountLight = accountLight;
        this.contactsLight = contactsLight;
        this.notesLight = notesLight;
        this.characteristicsLight = characteristicsLight;
    }

    public void CalculatePriceOrderLight() {
        priceOrderLight = quantityLight * ordinalPriceUnitLight;
    }

    public void CalculateСostCPUnitLight() {
        if (priceCPKeyLight > 0)
            costCPUnitLight = priceCPKeyLight / quantityLight;
        else costCPUnitLight = priceCPUnitLight;
    }

    public void CalculateCostCPLight() {
        if (priceCPKeyLight > 0)
            costCPLight = priceCPKeyLight;
        else costCPLight = priceCPUnitLight * quantityLight;
    }

    public void CalculateActualDifferenceLight() {
        actualDifferenceLight = costCPLight - actualCostLight;
    }

    public void CalculateResidueLight() {
        residueLight = actualCostLight - paidLight;
    }


    public String getNameLight() {
        return nameLight;
    }

    public void setNameLight(String nameLight) {
        this.nameLight = nameLight;
    }

    public String getUnitLight() {
        return unitLight;
    }

    public void setUnitLight(String unitLight) {
        this.unitLight = unitLight;
    }

    //Чекбоксы
    public boolean getActivePLight() {
        return activePLight;
    }

    public void setActivePLight(boolean activePLight) {
        this.activePLight = activePLight;
    }

    public void setActivePLight(String activePLight) {
        this.activePLight = Boolean.parseBoolean(activePLight);
    }

    public boolean getActiveCLight() {
        return activeCLight;
    }

    public void setActiveCLight(boolean activeCLight) {
        this.activeCLight = activeCLight;
    }

    public void setActiveCLight(String activeCLight) {
        this.activeCLight = Boolean.parseBoolean(activeCLight);
    }

    public String getQuantityLight() {
        return Double.toString(quantityLight);
    }

    public void setQuantityLight(double quantityLight) {
        this.quantityLight = quantityLight;
    }

    public void setQuantityLight(String quantityLight) {
        this.quantityLight = Double.parseDouble(quantityLight);
        CalculatePriceOrderLight();
        CalculateCostCPLight();
    }

    public String getOrdinalPriceUnitLight() {
        return Double.toString(ordinalPriceUnitLight);
    }

    public void setOrdinalPriceUnitLight(double ordinalPriceUnitLight) {
        this.ordinalPriceUnitLight = ordinalPriceUnitLight;
    }

    public void setOrdinalPriceUnitLight(String ordinalPriceUnitLight) {
        this.ordinalPriceUnitLight = Double.parseDouble(ordinalPriceUnitLight);
        CalculatePriceOrderLight();
    }

    public String getPriceCPUnitLight() {
        return Double.toString(priceCPUnitLight);
    }

    public void setPriceCPUnitLight(double priceCPUnitLight) {
        this.priceCPUnitLight = priceCPUnitLight;
    }

    public void setPriceCPUnitLight(String priceCPUnitLight) {
        this.priceCPUnitLight = Double.parseDouble(priceCPUnitLight);
        CalculateСostCPUnitLight();
        CalculateCostCPLight();
    }

    public String getPriceCPKeyLight() {
        return Double.toString(priceCPKeyLight);
    }

    public void setPriceCPKeyLight(double priceCPKeyLight) {
        this.priceCPKeyLight = priceCPKeyLight;
    }

    public void setPriceCPKeyLight(String priceCPKeyLight) {
        this.priceCPKeyLight = Double.parseDouble(priceCPKeyLight);
        CalculateСostCPUnitLight();
        CalculateCostCPLight();
    }

    public String getCostCPUnitLight() {
        return Double.toString(costCPUnitLight);
    }

    public void setCostCPUnitLight(double costCPUnitLight) {
        this.costCPUnitLight = costCPUnitLight;
    }

    public void setCostCPUnitLight(String costCPUnitLight) {
        this.costCPUnitLight = Double.parseDouble(costCPUnitLight);
    }

    //Понеслось
    public String getPriceOrderLight() {
        return Double.toString(priceOrderLight);
    }

    public void setPriceOrderLight(double priceOrderLight) {
        this.priceOrderLight = priceOrderLight;
    }

    public void setPriceOrderLight(String priceOrderLight) {
        this.priceOrderLight = Double.parseDouble(priceOrderLight);
    }

    public String getCostCPLight() {
        return Double.toString(costCPLight);
    }

    public void setCostCPLight(double costCPLight) {
        this.costCPLight = costCPLight;
    }

    public void setCostCPLight(String costCPLight) {
        this.costCPLight = Double.parseDouble(costCPLight);
        CalculateActualDifferenceLight();
    }

    public String getProductionTimeLight() {
        return productionTimeLight;
    }

    public void setProductionTimeLight(String productionTimeLight) {
        this.productionTimeLight = productionTimeLight;
    }

    public String getActualCostLight() {
        return Double.toString(actualCostLight);
    }

    public void setActualCostLight(double actualCostLight) {
        this.actualCostLight = actualCostLight;
    }

    public void setActualCostLight(String actualCostLight) {
        this.actualCostLight = Double.parseDouble(actualCostLight);
        CalculateActualDifferenceLight();
        CalculateResidueLight();

    }

    public String getActualDifferenceLight() {
        return Double.toString(actualDifferenceLight);
    }

    public void setActualDifferenceLight(double actualDifferenceLight) {
        this.actualDifferenceLight = actualDifferenceLight;
    }

    public void setActualDifferenceLight(String actualDifferenceLight) {
        this.actualDifferenceLight = Double.parseDouble(actualDifferenceLight);
    }

    public String getPaidLight() {
        return Double.toString(paidLight);
    }

    public void setPaidLight(double paidLight) {
        this.paidLight = paidLight;
    }

    public void setPaidLight(String paidLight) {
        this.paidLight = Double.parseDouble(paidLight);
        CalculateResidueLight();
    }

    public String getResidueLight() {
        return Double.toString(residueLight);
    }

    public void setResidueLight(double residueLight) {
        this.residueLight = residueLight;
    }

    public void setResidueLight(String residueLight) {
        this.residueLight = Double.parseDouble(residueLight);
    }

    public String getDateOfDeliveryLight() {
        return dateOfDeliveryLight;
    }

    public void setDateOfDeliveryLight(String dateOfDeliveryLight) {
        this.dateOfDeliveryLight = dateOfDeliveryLight;
    }

    public String getPlannedCPLight() {
        return plannedCPLight;
    }

    public void setPlannedCPLight(String plannedCPLight) {
        this.plannedCPLight = plannedCPLight;
    }

    public String getActualCPLight() {
        return actualCPLight;
    }

    public void setActualCPLight(String actualCPLight) {
        this.actualCPLight = actualCPLight;
    }

    public String getAccountLight() {
        return accountLight;
    }

    public void setAccountLight(String accountLight) {
        this.accountLight = accountLight;
    }

    public String getContactsLight() {
        return contactsLight;
    }

    public void setContactsLight(String contactsLight) {
        this.contactsLight = contactsLight;
    }

    public String getNotesLight() {
        return notesLight;
    }

    public void setNotesLight(String notesLight) {
        this.notesLight = notesLight;
    }

    public String getCharacteristicsLight() {
        return characteristicsLight;
    }

    public void setCharacteristicsLight(String characteristicsLight) {
        this.characteristicsLight = characteristicsLight;
    }
}

