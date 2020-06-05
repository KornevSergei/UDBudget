package sample;


public class AppliancesDelivery {
    protected String nameAppliancesDelivery;//Наименование
    protected boolean activePAppliancesDelivery;//П
    protected boolean activeCAppliancesDelivery;//С
    protected String unitAppliancesDelivery;//Ед. изм.
    protected double quantityAppliancesDelivery;//Количество
    protected double ordinalPriceUnitAppliancesDelivery;//Цена порядковая за ед.
    protected double priceCPUnitAppliancesDelivery;//Цена по КП за ед.
    protected double priceCPKeyAppliancesDelivery;//Цена по КП под ключ
    protected double costCPUnitAppliancesDelivery;//Стоимость по КП за ед.
    protected double priceOrderAppliancesDelivery;//Порядок цен
    protected double costCPAppliancesDelivery;//Стоимость по КП
    protected String productionTimeAppliancesDelivery;//Срок доставки
    protected double actualCostAppliancesDelivery;//Стоимость фактическая
    protected double actualDifferenceAppliancesDelivery;//Разница фактическая
    protected double paidAppliancesDelivery;//Оплачено
    protected double residueAppliancesDelivery;//Остаток
    protected String dateOfDeliveryAppliancesDelivery;//Дата поставки
    protected String plannedCPAppliancesDelivery;
    protected String actualCPAppliancesDelivery;
    protected String accountAppliancesDelivery;
    protected String contactsAppliancesDelivery;
    protected String notesAppliancesDelivery;
    protected String characteristicsAppliancesDelivery;


    public AppliancesDelivery(String nameAppliancesDelivery, boolean activePAppliancesDelivery, boolean activeCAppliancesDelivery, String unitAppliancesDelivery, double quantityAppliancesDelivery,
                              double ordinalPriceUnitAppliancesDelivery, double priceCPUnitAppliancesDelivery, double priceCPKeyAppliancesDelivery, double costCPUnitAppliancesDelivery,
                              double priceOrderAppliancesDelivery, double costCPAppliancesDelivery, String productionTimeAppliancesDelivery, double actualCostAppliancesDelivery,
                              double actualDifferenceAppliancesDelivery, double paidAppliancesDelivery, double residueAppliancesDelivery, String dateOfDeliveryAppliancesDelivery,
                              String plannedCPAppliancesDelivery, String actualCPAppliancesDelivery, String accountAppliancesDelivery, String contactsAppliancesDelivery, String notesAppliancesDelivery,
                              String characteristicsAppliancesDelivery) {
        this.nameAppliancesDelivery = nameAppliancesDelivery;
        this.unitAppliancesDelivery = unitAppliancesDelivery;
        this.activePAppliancesDelivery = activePAppliancesDelivery;
        this.activeCAppliancesDelivery = activeCAppliancesDelivery;
        this.quantityAppliancesDelivery = quantityAppliancesDelivery;
        this.ordinalPriceUnitAppliancesDelivery = ordinalPriceUnitAppliancesDelivery;
        this.priceCPUnitAppliancesDelivery = priceCPUnitAppliancesDelivery;
        this.priceCPKeyAppliancesDelivery = priceCPKeyAppliancesDelivery;
        this.costCPUnitAppliancesDelivery = costCPUnitAppliancesDelivery;
        this.priceOrderAppliancesDelivery = priceOrderAppliancesDelivery;
        this.costCPAppliancesDelivery = costCPAppliancesDelivery;
        this.productionTimeAppliancesDelivery = productionTimeAppliancesDelivery;
        this.actualCostAppliancesDelivery = actualCostAppliancesDelivery;
        this.actualDifferenceAppliancesDelivery = actualDifferenceAppliancesDelivery;
        this.paidAppliancesDelivery = paidAppliancesDelivery;
        this.residueAppliancesDelivery = residueAppliancesDelivery;
        this.dateOfDeliveryAppliancesDelivery = dateOfDeliveryAppliancesDelivery;
        this.plannedCPAppliancesDelivery = plannedCPAppliancesDelivery;
        this.actualCPAppliancesDelivery = actualCPAppliancesDelivery;
        this.accountAppliancesDelivery = accountAppliancesDelivery;
        this.contactsAppliancesDelivery = contactsAppliancesDelivery;
        this.notesAppliancesDelivery = notesAppliancesDelivery;
        this.characteristicsAppliancesDelivery = characteristicsAppliancesDelivery;
    }

    public void CalculatePriceOrderAppliancesDelivery() {
        priceOrderAppliancesDelivery = quantityAppliancesDelivery * ordinalPriceUnitAppliancesDelivery;
    }

    public void CalculateСostCPUnitAppliancesDelivery() {
        if (priceCPKeyAppliancesDelivery > 0)
            costCPUnitAppliancesDelivery = priceCPKeyAppliancesDelivery / quantityAppliancesDelivery;
        else costCPUnitAppliancesDelivery = priceCPUnitAppliancesDelivery;
    }

    public void CalculateCostCPAppliancesDelivery() {
        if (priceCPKeyAppliancesDelivery > 0)
            costCPAppliancesDelivery = priceCPKeyAppliancesDelivery;
        else costCPAppliancesDelivery = priceCPUnitAppliancesDelivery * quantityAppliancesDelivery;
    }

    public void CalculateActualDifferenceAppliancesDelivery() {
        actualDifferenceAppliancesDelivery = costCPAppliancesDelivery - actualCostAppliancesDelivery;
    }

    public void CalculateResidueAppliancesDelivery() {
        residueAppliancesDelivery = actualCostAppliancesDelivery - paidAppliancesDelivery;
    }


    public String getNameAppliancesDelivery() {
        return nameAppliancesDelivery;
    }

    public void setNameAppliancesDelivery(String nameAppliancesDelivery) {
        this.nameAppliancesDelivery = nameAppliancesDelivery;
    }

    public String getUnitAppliancesDelivery() {
        return unitAppliancesDelivery;
    }

    public void setUnitAppliancesDelivery(String unitAppliancesDelivery) {
        this.unitAppliancesDelivery = unitAppliancesDelivery;
    }

    //Чекбоксы
    public boolean getActivePAppliancesDelivery() {
        return activePAppliancesDelivery;
    }

    public void setActivePAppliancesDelivery(boolean activePAppliancesDelivery) {
        this.activePAppliancesDelivery = activePAppliancesDelivery;
    }

    public void setActivePAppliancesDelivery(String activePAppliancesDelivery) {
        this.activePAppliancesDelivery = Boolean.parseBoolean(activePAppliancesDelivery);
    }

    public boolean getActiveCAppliancesDelivery() {
        return activeCAppliancesDelivery;
    }

    public void setActiveCAppliancesDelivery(boolean activeCAppliancesDelivery) {
        this.activeCAppliancesDelivery = activeCAppliancesDelivery;
    }

    public void setActiveCAppliancesDelivery(String activeCAppliancesDelivery) {
        this.activeCAppliancesDelivery = Boolean.parseBoolean(activeCAppliancesDelivery);
    }

    //Обана
    public String getQuantityAppliancesDelivery() {
        return Double.toString(quantityAppliancesDelivery);
    }

    public void setQuantityAppliancesDelivery(double quantityAppliancesDelivery) {
        this.quantityAppliancesDelivery = quantityAppliancesDelivery;
    }

    public void setQuantityAppliancesDelivery(String quantityAppliancesDelivery) {
        this.quantityAppliancesDelivery = Double.parseDouble(quantityAppliancesDelivery);
        CalculatePriceOrderAppliancesDelivery();
        CalculateCostCPAppliancesDelivery();
    }

    //Хуяк
    public String getOrdinalPriceUnitAppliancesDelivery() {
        return Double.toString(ordinalPriceUnitAppliancesDelivery);
    }

    public void setOrdinalPriceUnitAppliancesDelivery(double ordinalPriceUnitAppliancesDelivery) {
        this.ordinalPriceUnitAppliancesDelivery = ordinalPriceUnitAppliancesDelivery;
    }

    public void setOrdinalPriceUnitAppliancesDelivery(String ordinalPriceUnitAppliancesDelivery) {
        this.ordinalPriceUnitAppliancesDelivery = Double.parseDouble(ordinalPriceUnitAppliancesDelivery);
        CalculatePriceOrderAppliancesDelivery();
    }

    public String getPriceCPUnitAppliancesDelivery() {
        return Double.toString(priceCPUnitAppliancesDelivery);
    }

    public void setPriceCPUnitAppliancesDelivery(double priceCPUnitAppliancesDelivery) {
        this.priceCPUnitAppliancesDelivery = priceCPUnitAppliancesDelivery;
    }

    public void setPriceCPUnitAppliancesDelivery(String priceCPUnitAppliancesDelivery) {
        this.priceCPUnitAppliancesDelivery = Double.parseDouble(priceCPUnitAppliancesDelivery);
        CalculateСostCPUnitAppliancesDelivery();
        CalculateCostCPAppliancesDelivery();
    }

    public String getPriceCPKeyAppliancesDelivery() {
        return Double.toString(priceCPKeyAppliancesDelivery);
    }

    public void setPriceCPKeyAppliancesDelivery(double priceCPKeyAppliancesDelivery) {
        this.priceCPKeyAppliancesDelivery = priceCPKeyAppliancesDelivery;
    }

    public void setPriceCPKeyAppliancesDelivery(String priceCPKeyAppliancesDelivery) {
        this.priceCPKeyAppliancesDelivery = Double.parseDouble(priceCPKeyAppliancesDelivery);
        CalculateСostCPUnitAppliancesDelivery();
        CalculateCostCPAppliancesDelivery();
    }

    public String getCostCPUnitAppliancesDelivery() {
        return Double.toString(costCPUnitAppliancesDelivery);
    }

    public void setCostCPUnitAppliancesDelivery(double costCPUnitAppliancesDelivery) {
        this.costCPUnitAppliancesDelivery = costCPUnitAppliancesDelivery;
    }

    public void setCostCPUnitAppliancesDelivery(String costCPUnitAppliancesDelivery) {
        this.costCPUnitAppliancesDelivery = Double.parseDouble(costCPUnitAppliancesDelivery);
    }

    //Понеслось
    public String getPriceOrderAppliancesDelivery() {
        return Double.toString(priceOrderAppliancesDelivery);
    }

    public void setPriceOrderAppliancesDelivery(double priceOrderAppliancesDelivery) {
        this.priceOrderAppliancesDelivery = priceOrderAppliancesDelivery;
    }

    public void setPriceOrderAppliancesDelivery(String priceOrderAppliancesDelivery) {
        this.priceOrderAppliancesDelivery = Double.parseDouble(priceOrderAppliancesDelivery);
    }

    public String getCostCPAppliancesDelivery() {
        return Double.toString(costCPAppliancesDelivery);
    }

    public void setCostCPAppliancesDelivery(double costCPAppliancesDelivery) {
        this.costCPAppliancesDelivery = costCPAppliancesDelivery;
    }

    public void setCostCPAppliancesDelivery(String costCPAppliancesDelivery) {
        this.costCPAppliancesDelivery = Double.parseDouble(costCPAppliancesDelivery);
        CalculateActualDifferenceAppliancesDelivery();
    }

    public String getProductionTimeAppliancesDelivery() {
        return productionTimeAppliancesDelivery;
    }

    public void setProductionTimeAppliancesDelivery(String productionTimeAppliancesDelivery) {
        this.productionTimeAppliancesDelivery = productionTimeAppliancesDelivery;
    }

    public String getActualCostAppliancesDelivery() {
        return Double.toString(actualCostAppliancesDelivery);
    }

    public void setActualCostAppliancesDelivery(double actualCostAppliancesDelivery) {
        this.actualCostAppliancesDelivery = actualCostAppliancesDelivery;
    }

    public void setActualCostAppliancesDelivery(String actualCostAppliancesDelivery) {
        this.actualCostAppliancesDelivery = Double.parseDouble(actualCostAppliancesDelivery);
        CalculateActualDifferenceAppliancesDelivery();
        CalculateResidueAppliancesDelivery();

    }

    public String getActualDifferenceAppliancesDelivery() {
        return Double.toString(actualDifferenceAppliancesDelivery);
    }

    public void setActualDifferenceAppliancesDelivery(double actualDifferenceAppliancesDelivery) {
        this.actualDifferenceAppliancesDelivery = actualDifferenceAppliancesDelivery;
    }

    public void setActualDifferenceAppliancesDelivery(String actualDifferenceAppliancesDelivery) {
        this.actualDifferenceAppliancesDelivery = Double.parseDouble(actualDifferenceAppliancesDelivery);
    }

    public String getPaidAppliancesDelivery() {
        return Double.toString(paidAppliancesDelivery);
    }

    public void setPaidAppliancesDelivery(double paidAppliancesDelivery) {
        this.paidAppliancesDelivery = paidAppliancesDelivery;
    }

    public void setPaidAppliancesDelivery(String paidAppliancesDelivery) {
        this.paidAppliancesDelivery = Double.parseDouble(paidAppliancesDelivery);
        CalculateResidueAppliancesDelivery();
    }

    public String getResidueAppliancesDelivery() {
        return Double.toString(residueAppliancesDelivery);
    }

    public void setResidueAppliancesDelivery(double residueAppliancesDelivery) {
        this.residueAppliancesDelivery = residueAppliancesDelivery;
    }

    public void setResidueAppliancesDelivery(String residueAppliancesDelivery) {
        this.residueAppliancesDelivery = Double.parseDouble(residueAppliancesDelivery);
    }

    public String getDateOfDeliveryAppliancesDelivery() {
        return dateOfDeliveryAppliancesDelivery;
    }

    public void setDateOfDeliveryAppliancesDelivery(String dateOfDeliveryAppliancesDelivery) {
        this.dateOfDeliveryAppliancesDelivery = dateOfDeliveryAppliancesDelivery;
    }

    public String getPlannedCPAppliancesDelivery() {
        return plannedCPAppliancesDelivery;
    }

    public void setPlannedCPAppliancesDelivery(String plannedCPAppliancesDelivery) {
        this.plannedCPAppliancesDelivery = plannedCPAppliancesDelivery;
    }

    public String getActualCPAppliancesDelivery() {
        return actualCPAppliancesDelivery;
    }

    public void setActualCPAppliancesDelivery(String actualCPAppliancesDelivery) {
        this.actualCPAppliancesDelivery = actualCPAppliancesDelivery;
    }

    public String getAccountAppliancesDelivery() {
        return accountAppliancesDelivery;
    }

    public void setAccountAppliancesDelivery(String accountAppliancesDelivery) {
        this.accountAppliancesDelivery = accountAppliancesDelivery;
    }

    public String getContactsAppliancesDelivery() {
        return contactsAppliancesDelivery;
    }

    public void setContactsAppliancesDelivery(String contactsAppliancesDelivery) {
        this.contactsAppliancesDelivery = contactsAppliancesDelivery;
    }

    public String getNotesAppliancesDelivery() {
        return notesAppliancesDelivery;
    }

    public void setNotesAppliancesDelivery(String notesAppliancesDelivery) {
        this.notesAppliancesDelivery = notesAppliancesDelivery;
    }

    public String getCharacteristicsAppliancesDelivery() {
        return characteristicsAppliancesDelivery;
    }

    public void setCharacteristicsAppliancesDelivery(String characteristicsAppliancesDelivery) {
        this.characteristicsAppliancesDelivery = characteristicsAppliancesDelivery;
    }
}

