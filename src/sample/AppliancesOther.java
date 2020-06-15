package sample;

import javafx.beans.property.SimpleStringProperty;

public class AppliancesOther {
    protected String nameAppliancesOther;//Наименование
    protected boolean activePAppliancesOther;//П
    protected boolean activeCAppliancesOther;//С
    protected String unitAppliancesOther;//Ед. изм.
    protected double quantityAppliancesOther;//Количество
    protected double ordinalPriceUnitAppliancesOther;//Цена порядковая за ед.
    protected double priceCPUnitAppliancesOther;//Цена по КП за ед.
    protected double priceCPKeyAppliancesOther;//Цена по КП под ключ
    protected double costCPUnitAppliancesOther;//Стоимость по КП за ед.
    protected double priceOrderAppliancesOther;//Порядок цен
    protected double costCPAppliancesOther;//Стоимость по КП
    protected String productionTimeAppliancesOther;//Срок доставки
    protected double actualCostAppliancesOther;//Стоимость фактическая
    protected double actualDifferenceAppliancesOther;//Разница фактическая
    protected double paidAppliancesOther;//Оплачено
    protected double residueAppliancesOther;//Остаток
    protected String dateOfDeliveryAppliancesOther;//Дата поставки
    protected String nameRoomAppliancesOther;
    protected String plannedCPAppliancesOther;
    protected String actualCPAppliancesOther;
    protected String accountAppliancesOther;
    protected String contactsAppliancesOther;
    protected String notesAppliancesOther;
    protected String characteristicsAppliancesOther;


    public AppliancesOther(String nameAppliancesOther, boolean activePAppliancesOther, boolean activeCAppliancesOther, String unitAppliancesOther, double quantityAppliancesOther,
                           double ordinalPriceUnitAppliancesOther, double priceCPUnitAppliancesOther, double priceCPKeyAppliancesOther, double costCPUnitAppliancesOther,
                           double priceOrderAppliancesOther, double costCPAppliancesOther, String productionTimeAppliancesOther, double actualCostAppliancesOther,
                           double actualDifferenceAppliancesOther, double paidAppliancesOther, double residueAppliancesOther, String dateOfDeliveryAppliancesOther, String nameRoomAppliancesOther,
                           String plannedCPAppliancesOther, String actualCPAppliancesOther, String accountAppliancesOther, String contactsAppliancesOther, String notesAppliancesOther,
                           String characteristicsAppliancesOther) {
        this.nameAppliancesOther = nameAppliancesOther;
        this.unitAppliancesOther = unitAppliancesOther;
        this.activePAppliancesOther = activePAppliancesOther;
        this.activeCAppliancesOther = activeCAppliancesOther;
        this.quantityAppliancesOther = quantityAppliancesOther;
        this.ordinalPriceUnitAppliancesOther = ordinalPriceUnitAppliancesOther;
        this.priceCPUnitAppliancesOther = priceCPUnitAppliancesOther;
        this.priceCPKeyAppliancesOther = priceCPKeyAppliancesOther;
        this.costCPUnitAppliancesOther = costCPUnitAppliancesOther;
        this.priceOrderAppliancesOther = priceOrderAppliancesOther;
        this.costCPAppliancesOther = costCPAppliancesOther;
        this.productionTimeAppliancesOther = productionTimeAppliancesOther;
        this.actualCostAppliancesOther = actualCostAppliancesOther;
        this.actualDifferenceAppliancesOther = actualDifferenceAppliancesOther;
        this.paidAppliancesOther = paidAppliancesOther;
        this.residueAppliancesOther = residueAppliancesOther;
        this.dateOfDeliveryAppliancesOther = dateOfDeliveryAppliancesOther;
        this.nameRoomAppliancesOther = nameRoomAppliancesOther;
        this.plannedCPAppliancesOther = plannedCPAppliancesOther;
        this.actualCPAppliancesOther = actualCPAppliancesOther;
        this.accountAppliancesOther = accountAppliancesOther;
        this.contactsAppliancesOther = contactsAppliancesOther;
        this.notesAppliancesOther = notesAppliancesOther;
        this.characteristicsAppliancesOther = characteristicsAppliancesOther;
    }

    public void CalculatePriceOrderAppliancesOther() {
        priceOrderAppliancesOther = quantityAppliancesOther * ordinalPriceUnitAppliancesOther;
    }

    public void CalculateСostCPUnitAppliancesOther() {
        if (priceCPKeyAppliancesOther > 0)
            costCPUnitAppliancesOther = priceCPKeyAppliancesOther / quantityAppliancesOther;
        else costCPUnitAppliancesOther = priceCPUnitAppliancesOther;
    }

    public void CalculateCostCPAppliancesOther() {
        if (priceCPKeyAppliancesOther > 0)
            costCPAppliancesOther = priceCPKeyAppliancesOther;
        else costCPAppliancesOther = priceCPUnitAppliancesOther * quantityAppliancesOther;
    }

    public void CalculateActualDifferenceAppliancesOther() {
        actualDifferenceAppliancesOther = costCPAppliancesOther - actualCostAppliancesOther;
    }

    public void CalculateResidueAppliancesOther() {
        residueAppliancesOther = actualCostAppliancesOther - paidAppliancesOther;
    }


    public String getNameAppliancesOther() {
        return nameAppliancesOther;
    }

    public void setNameAppliancesOther(String nameAppliancesOther) {
        this.nameAppliancesOther = nameAppliancesOther;
    }

    public String getUnitAppliancesOther() {
        return unitAppliancesOther;
    }

    public void setUnitAppliancesOther(String unitAppliancesOther) {
        this.unitAppliancesOther = unitAppliancesOther;
    }

    //Чекбоксы
    public boolean getActivePAppliancesOther() {
        return activePAppliancesOther;
    }

    public void setActivePAppliancesOther(boolean activePAppliancesOther) {
        this.activePAppliancesOther = activePAppliancesOther;
    }

    public void setActivePAppliancesOther(String activePAppliancesOther) {
        this.activePAppliancesOther = Boolean.parseBoolean(activePAppliancesOther);
    }

    public boolean getActiveCAppliancesOther() {
        return activeCAppliancesOther;
    }

    public void setActiveCAppliancesOther(boolean activeCAppliancesOther) {
        this.activeCAppliancesOther = activeCAppliancesOther;
    }

    public void setActiveCAppliancesOther(String activeCAppliancesOther) {
        this.activeCAppliancesOther = Boolean.parseBoolean(activeCAppliancesOther);
    }

    //Обана
    public String getQuantityAppliancesOther() {
        return Double.toString(quantityAppliancesOther);
    }

    public void setQuantityAppliancesOther(double quantityAppliancesOther) {
        this.quantityAppliancesOther = quantityAppliancesOther;
    }

    public void setQuantityAppliancesOther(String quantityAppliancesOther) {
        this.quantityAppliancesOther = Double.parseDouble(quantityAppliancesOther);
        CalculatePriceOrderAppliancesOther();
        CalculateCostCPAppliancesOther();
    }

    //Хуяк
    public String getOrdinalPriceUnitAppliancesOther() {
        return Double.toString(ordinalPriceUnitAppliancesOther);
    }

    public void setOrdinalPriceUnitAppliancesOther(double ordinalPriceUnitAppliancesOther) {
        this.ordinalPriceUnitAppliancesOther = ordinalPriceUnitAppliancesOther;
    }

    public void setOrdinalPriceUnitAppliancesOther(String ordinalPriceUnitAppliancesOther) {
        this.ordinalPriceUnitAppliancesOther = Double.parseDouble(ordinalPriceUnitAppliancesOther);
        CalculatePriceOrderAppliancesOther();
    }

    public String getPriceCPUnitAppliancesOther() {
        return Double.toString(priceCPUnitAppliancesOther);
    }

    public void setPriceCPUnitAppliancesOther(double priceCPUnitAppliancesOther) {
        this.priceCPUnitAppliancesOther = priceCPUnitAppliancesOther;
    }

    public void setPriceCPUnitAppliancesOther(String priceCPUnitAppliancesOther) {
        this.priceCPUnitAppliancesOther = Double.parseDouble(priceCPUnitAppliancesOther);
        CalculateСostCPUnitAppliancesOther();
        CalculateCostCPAppliancesOther();
    }

    public String getPriceCPKeyAppliancesOther() {
        return Double.toString(priceCPKeyAppliancesOther);
    }

    public void setPriceCPKeyAppliancesOther(double priceCPKeyAppliancesOther) {
        this.priceCPKeyAppliancesOther = priceCPKeyAppliancesOther;
    }

    public void setPriceCPKeyAppliancesOther(String priceCPKeyAppliancesOther) {
        this.priceCPKeyAppliancesOther = Double.parseDouble(priceCPKeyAppliancesOther);
        CalculateСostCPUnitAppliancesOther();
        CalculateCostCPAppliancesOther();
    }

    public String getCostCPUnitAppliancesOther() {
        return Double.toString(costCPUnitAppliancesOther);
    }

    public void setCostCPUnitAppliancesOther(double costCPUnitAppliancesOther) {
        this.costCPUnitAppliancesOther = costCPUnitAppliancesOther;
    }

    public void setCostCPUnitAppliancesOther(String costCPUnitAppliancesOther) {
        this.costCPUnitAppliancesOther = Double.parseDouble(costCPUnitAppliancesOther);
    }

    //Понеслось
    public String getPriceOrderAppliancesOther() {
        return Double.toString(priceOrderAppliancesOther);
    }

    public void setPriceOrderAppliancesOther(double priceOrderAppliancesOther) {
        this.priceOrderAppliancesOther = priceOrderAppliancesOther;
    }

    public void setPriceOrderAppliancesOther(String priceOrderAppliancesOther) {
        this.priceOrderAppliancesOther = Double.parseDouble(priceOrderAppliancesOther);
    }

    public String getCostCPAppliancesOther() {
        return Double.toString(costCPAppliancesOther);
    }

    public void setCostCPAppliancesOther(double costCPAppliancesOther) {
        this.costCPAppliancesOther = costCPAppliancesOther;
    }

    public void setCostCPAppliancesOther(String costCPAppliancesOther) {
        this.costCPAppliancesOther = Double.parseDouble(costCPAppliancesOther);
        CalculateActualDifferenceAppliancesOther();
    }

    public String getProductionTimeAppliancesOther() {
        return productionTimeAppliancesOther;
    }

    public void setProductionTimeAppliancesOther(String productionTimeAppliancesOther) {
        this.productionTimeAppliancesOther = productionTimeAppliancesOther;
    }

    public String getActualCostAppliancesOther() {
        return Double.toString(actualCostAppliancesOther);
    }

    public void setActualCostAppliancesOther(double actualCostAppliancesOther) {
        this.actualCostAppliancesOther = actualCostAppliancesOther;
    }

    public void setActualCostAppliancesOther(String actualCostAppliancesOther) {
        this.actualCostAppliancesOther = Double.parseDouble(actualCostAppliancesOther);
        CalculateActualDifferenceAppliancesOther();
        CalculateResidueAppliancesOther();

    }

    public String getActualDifferenceAppliancesOther() {
        return Double.toString(actualDifferenceAppliancesOther);
    }

    public void setActualDifferenceAppliancesOther(double actualDifferenceAppliancesOther) {
        this.actualDifferenceAppliancesOther = actualDifferenceAppliancesOther;
    }

    public void setActualDifferenceAppliancesOther(String actualDifferenceAppliancesOther) {
        this.actualDifferenceAppliancesOther = Double.parseDouble(actualDifferenceAppliancesOther);
    }

    public String getPaidAppliancesOther() {
        return Double.toString(paidAppliancesOther);
    }

    public void setPaidAppliancesOther(double paidAppliancesOther) {
        this.paidAppliancesOther = paidAppliancesOther;
    }

    public void setPaidAppliancesOther(String paidAppliancesOther) {
        this.paidAppliancesOther = Double.parseDouble(paidAppliancesOther);
        CalculateResidueAppliancesOther();
    }

    public String getResidueAppliancesOther() {
        return Double.toString(residueAppliancesOther);
    }

    public void setResidueAppliancesOther(double residueAppliancesOther) {
        this.residueAppliancesOther = residueAppliancesOther;
    }

    public void setResidueAppliancesOther(String residueAppliancesOther) {
        this.residueAppliancesOther = Double.parseDouble(residueAppliancesOther);
    }

    public String getDateOfDeliveryAppliancesOther() {
        return dateOfDeliveryAppliancesOther;
    }

    public void setDateOfDeliveryAppliancesOther(String dateOfDeliveryAppliancesOther) {
        this.dateOfDeliveryAppliancesOther = dateOfDeliveryAppliancesOther;
    }

    public String getNameRoomAppliancesOther() {
        return nameRoomAppliancesOther;
    }

    public void setNameRoomAppliancesOther(String nameRoomAppliancesOther) {
        this.nameRoomAppliancesOther = nameRoomAppliancesOther;
    }

    public String getPlannedCPAppliancesOther() {
        return plannedCPAppliancesOther;
    }

    public void setPlannedCPAppliancesOther(String plannedCPAppliancesOther) {
        this.plannedCPAppliancesOther = plannedCPAppliancesOther;
    }

    public String getActualCPAppliancesOther() {
        return actualCPAppliancesOther;
    }

    public void setActualCPAppliancesOther(String actualCPAppliancesOther) {
        this.actualCPAppliancesOther = actualCPAppliancesOther;
    }

    public String getAccountAppliancesOther() {
        return accountAppliancesOther;
    }

    public void setAccountAppliancesOther(String accountAppliancesOther) {
        this.accountAppliancesOther = accountAppliancesOther;
    }

    public String getContactsAppliancesOther() {
        return contactsAppliancesOther;
    }

    public void setContactsAppliancesOther(String contactsAppliancesOther) {
        this.contactsAppliancesOther = contactsAppliancesOther;
    }

    public String getNotesAppliancesOther() {
        return notesAppliancesOther;
    }

    public void setNotesAppliancesOther(String notesAppliancesOther) {
        this.notesAppliancesOther = notesAppliancesOther;
    }

    public String getCharacteristicsAppliancesOther() {
        return characteristicsAppliancesOther;
    }

    public void setCharacteristicsAppliancesOther(String characteristicsAppliancesOther) {
        this.characteristicsAppliancesOther = characteristicsAppliancesOther;
    }
}

