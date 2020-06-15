package sample;

import javafx.beans.property.SimpleStringProperty;

public class AppliancesKitchen {
    protected String nameAppliancesKitchen;//Наименование
    protected boolean activePAppliancesKitchen;//П
    protected boolean activeCAppliancesKitchen;//С
    protected String unitAppliancesKitchen;//Ед. изм.
    protected double quantityAppliancesKitchen;//Количество
    protected double ordinalPriceUnitAppliancesKitchen;//Цена порядковая за ед.
    protected double priceCPUnitAppliancesKitchen;//Цена по КП за ед.
    protected double priceCPKeyAppliancesKitchen;//Цена по КП под ключ
    protected double costCPUnitAppliancesKitchen;//Стоимость по КП за ед.
    protected double priceOrderAppliancesKitchen;//Порядок цен
    protected double costCPAppliancesKitchen;//Стоимость по КП
    protected String productionTimeAppliancesKitchen;//Срок доставки
    protected double actualCostAppliancesKitchen;//Стоимость фактическая
    protected double actualDifferenceAppliancesKitchen;//Разница фактическая
    protected double paidAppliancesKitchen;//Оплачено
    protected double residueAppliancesKitchen;//Остаток
    protected String dateOfDeliveryAppliancesKitchen;//Дата поставки
    protected String nameRoomAppliancesKitchen;//Наименование помещения
    protected String plannedCPAppliancesKitchen;
    protected String actualCPAppliancesKitchen;
    protected String accountAppliancesKitchen;
    protected String contactsAppliancesKitchen;
    protected String notesAppliancesKitchen;
    protected String characteristicsAppliancesKitchen;


    public AppliancesKitchen(String nameAppliancesKitchen, boolean activePAppliancesKitchen, boolean activeCAppliancesKitchen, String unitAppliancesKitchen, double quantityAppliancesKitchen,
                             double ordinalPriceUnitAppliancesKitchen, double priceCPUnitAppliancesKitchen, double priceCPKeyAppliancesKitchen, double costCPUnitAppliancesKitchen,
                             double priceOrderAppliancesKitchen, double costCPAppliancesKitchen, String productionTimeAppliancesKitchen, double actualCostAppliancesKitchen,
                             double actualDifferenceAppliancesKitchen, double paidAppliancesKitchen, double residueAppliancesKitchen, String dateOfDeliveryAppliancesKitchen,String nameRoomAppliancesKitchen,
                             String plannedCPAppliancesKitchen, String actualCPAppliancesKitchen, String accountAppliancesKitchen, String contactsAppliancesKitchen, String notesAppliancesKitchen,
                             String characteristicsAppliancesKitchen) {
        this.nameAppliancesKitchen = nameAppliancesKitchen;
        this.unitAppliancesKitchen = unitAppliancesKitchen;
        this.activePAppliancesKitchen = activePAppliancesKitchen;
        this.activeCAppliancesKitchen = activeCAppliancesKitchen;
        this.quantityAppliancesKitchen = quantityAppliancesKitchen;
        this.ordinalPriceUnitAppliancesKitchen = ordinalPriceUnitAppliancesKitchen;
        this.priceCPUnitAppliancesKitchen = priceCPUnitAppliancesKitchen;
        this.priceCPKeyAppliancesKitchen = priceCPKeyAppliancesKitchen;
        this.costCPUnitAppliancesKitchen = costCPUnitAppliancesKitchen;
        this.priceOrderAppliancesKitchen = priceOrderAppliancesKitchen;
        this.costCPAppliancesKitchen = costCPAppliancesKitchen;
        this.productionTimeAppliancesKitchen = productionTimeAppliancesKitchen;
        this.actualCostAppliancesKitchen = actualCostAppliancesKitchen;
        this.actualDifferenceAppliancesKitchen = actualDifferenceAppliancesKitchen;
        this.paidAppliancesKitchen = paidAppliancesKitchen;
        this.residueAppliancesKitchen = residueAppliancesKitchen;
        this.dateOfDeliveryAppliancesKitchen = dateOfDeliveryAppliancesKitchen;
        this.nameRoomAppliancesKitchen = nameRoomAppliancesKitchen;
        this.plannedCPAppliancesKitchen = plannedCPAppliancesKitchen;
        this.actualCPAppliancesKitchen = actualCPAppliancesKitchen;
        this.accountAppliancesKitchen = accountAppliancesKitchen;
        this.contactsAppliancesKitchen = contactsAppliancesKitchen;
        this.notesAppliancesKitchen = notesAppliancesKitchen;
        this.characteristicsAppliancesKitchen = characteristicsAppliancesKitchen;
    }

    public void CalculatePriceOrderAppliancesKitchen() {
        priceOrderAppliancesKitchen = quantityAppliancesKitchen * ordinalPriceUnitAppliancesKitchen;
    }

    public void CalculateСostCPUnitAppliancesKitchen() {
        if (priceCPKeyAppliancesKitchen > 0)
            costCPUnitAppliancesKitchen = priceCPKeyAppliancesKitchen / quantityAppliancesKitchen;
        else costCPUnitAppliancesKitchen = priceCPUnitAppliancesKitchen;
    }

    public void CalculateCostCPAppliancesKitchen() {
        if (priceCPKeyAppliancesKitchen > 0)
            costCPAppliancesKitchen = priceCPKeyAppliancesKitchen;
        else costCPAppliancesKitchen = priceCPUnitAppliancesKitchen * quantityAppliancesKitchen;
    }

    public void CalculateActualDifferenceAppliancesKitchen() {
        actualDifferenceAppliancesKitchen = costCPAppliancesKitchen - actualCostAppliancesKitchen;
    }

    public void CalculateResidueAppliancesKitchen() {
        residueAppliancesKitchen = actualCostAppliancesKitchen - paidAppliancesKitchen;
    }


    public String getNameAppliancesKitchen() {
        return nameAppliancesKitchen;
    }

    public void setNameAppliancesKitchen(String nameAppliancesKitchen) {
        this.nameAppliancesKitchen = nameAppliancesKitchen;
    }

    public String getUnitAppliancesKitchen() {
        return unitAppliancesKitchen;
    }

    public void setUnitAppliancesKitchen(String unitAppliancesKitchen) {
        this.unitAppliancesKitchen = unitAppliancesKitchen;
    }

    //Чекбоксы
    public boolean getActivePAppliancesKitchen() {
        return activePAppliancesKitchen;
    }

    public void setActivePAppliancesKitchen(boolean activePAppliancesKitchen) {
        this.activePAppliancesKitchen = activePAppliancesKitchen;
    }

    public void setActivePAppliancesKitchen(String activePAppliancesKitchen) {
        this.activePAppliancesKitchen = Boolean.parseBoolean(activePAppliancesKitchen);
    }

    public boolean getActiveCAppliancesKitchen() {
        return activeCAppliancesKitchen;
    }

    public void setActiveCAppliancesKitchen(boolean activeCAppliancesKitchen) {
        this.activeCAppliancesKitchen = activeCAppliancesKitchen;
    }

    public void setActiveCAppliancesKitchen(String activeCAppliancesKitchen) {
        this.activeCAppliancesKitchen = Boolean.parseBoolean(activeCAppliancesKitchen);
    }

    //Обана
    public String getQuantityAppliancesKitchen() {
        return Double.toString(quantityAppliancesKitchen);
    }

    public void setQuantityAppliancesKitchen(double quantityAppliancesKitchen) {
        this.quantityAppliancesKitchen = quantityAppliancesKitchen;
    }

    public void setQuantityAppliancesKitchen(String quantityAppliancesKitchen) {
        this.quantityAppliancesKitchen = Double.parseDouble(quantityAppliancesKitchen);
        CalculatePriceOrderAppliancesKitchen();
        CalculateCostCPAppliancesKitchen();
    }

    //Хуяк
    public String getOrdinalPriceUnitAppliancesKitchen() {
        return Double.toString(ordinalPriceUnitAppliancesKitchen);
    }

    public void setOrdinalPriceUnitAppliancesKitchen(double ordinalPriceUnitAppliancesKitchen) {
        this.ordinalPriceUnitAppliancesKitchen = ordinalPriceUnitAppliancesKitchen;
    }

    public void setOrdinalPriceUnitAppliancesKitchen(String ordinalPriceUnitAppliancesKitchen) {
        this.ordinalPriceUnitAppliancesKitchen = Double.parseDouble(ordinalPriceUnitAppliancesKitchen);
        CalculatePriceOrderAppliancesKitchen();
    }

    public String getPriceCPUnitAppliancesKitchen() {
        return Double.toString(priceCPUnitAppliancesKitchen);
    }

    public void setPriceCPUnitAppliancesKitchen(double priceCPUnitAppliancesKitchen) {
        this.priceCPUnitAppliancesKitchen = priceCPUnitAppliancesKitchen;
    }

    public void setPriceCPUnitAppliancesKitchen(String priceCPUnitAppliancesKitchen) {
        this.priceCPUnitAppliancesKitchen = Double.parseDouble(priceCPUnitAppliancesKitchen);
        CalculateСostCPUnitAppliancesKitchen();
        CalculateCostCPAppliancesKitchen();
    }

    public String getPriceCPKeyAppliancesKitchen() {
        return Double.toString(priceCPKeyAppliancesKitchen);
    }

    public void setPriceCPKeyAppliancesKitchen(double priceCPKeyAppliancesKitchen) {
        this.priceCPKeyAppliancesKitchen = priceCPKeyAppliancesKitchen;
    }

    public void setPriceCPKeyAppliancesKitchen(String priceCPKeyAppliancesKitchen) {
        this.priceCPKeyAppliancesKitchen = Double.parseDouble(priceCPKeyAppliancesKitchen);
        CalculateСostCPUnitAppliancesKitchen();
        CalculateCostCPAppliancesKitchen();
    }

    public String getCostCPUnitAppliancesKitchen() {
        return Double.toString(costCPUnitAppliancesKitchen);
    }

    public void setCostCPUnitAppliancesKitchen(double costCPUnitAppliancesKitchen) {
        this.costCPUnitAppliancesKitchen = costCPUnitAppliancesKitchen;
    }

    public void setCostCPUnitAppliancesKitchen(String costCPUnitAppliancesKitchen) {
        this.costCPUnitAppliancesKitchen = Double.parseDouble(costCPUnitAppliancesKitchen);
    }

    //Понеслось
    public String getPriceOrderAppliancesKitchen() {
        return Double.toString(priceOrderAppliancesKitchen);
    }

    public void setPriceOrderAppliancesKitchen(double priceOrderAppliancesKitchen) {
        this.priceOrderAppliancesKitchen = priceOrderAppliancesKitchen;
    }

    public void setPriceOrderAppliancesKitchen(String priceOrderAppliancesKitchen) {
        this.priceOrderAppliancesKitchen = Double.parseDouble(priceOrderAppliancesKitchen);
    }

    public String getCostCPAppliancesKitchen() {
        return Double.toString(costCPAppliancesKitchen);
    }

    public void setCostCPAppliancesKitchen(double costCPAppliancesKitchen) {
        this.costCPAppliancesKitchen = costCPAppliancesKitchen;
    }

    public void setCostCPAppliancesKitchen(String costCPAppliancesKitchen) {
        this.costCPAppliancesKitchen = Double.parseDouble(costCPAppliancesKitchen);
        CalculateActualDifferenceAppliancesKitchen();
    }

    public String getProductionTimeAppliancesKitchen() {
        return productionTimeAppliancesKitchen;
    }

    public void setProductionTimeAppliancesKitchen(String productionTimeAppliancesKitchen) {
        this.productionTimeAppliancesKitchen = productionTimeAppliancesKitchen;
    }

    public String getActualCostAppliancesKitchen() {
        return Double.toString(actualCostAppliancesKitchen);
    }

    public void setActualCostAppliancesKitchen(double actualCostAppliancesKitchen) {
        this.actualCostAppliancesKitchen = actualCostAppliancesKitchen;
    }

    public void setActualCostAppliancesKitchen(String actualCostAppliancesKitchen) {
        this.actualCostAppliancesKitchen = Double.parseDouble(actualCostAppliancesKitchen);
        CalculateActualDifferenceAppliancesKitchen();
        CalculateResidueAppliancesKitchen();

    }

    public String getActualDifferenceAppliancesKitchen() {
        return Double.toString(actualDifferenceAppliancesKitchen);
    }

    public void setActualDifferenceAppliancesKitchen(double actualDifferenceAppliancesKitchen) {
        this.actualDifferenceAppliancesKitchen = actualDifferenceAppliancesKitchen;
    }

    public void setActualDifferenceAppliancesKitchen(String actualDifferenceAppliancesKitchen) {
        this.actualDifferenceAppliancesKitchen = Double.parseDouble(actualDifferenceAppliancesKitchen);
    }

    public String getPaidAppliancesKitchen() {
        return Double.toString(paidAppliancesKitchen);
    }

    public void setPaidAppliancesKitchen(double paidAppliancesKitchen) {
        this.paidAppliancesKitchen = paidAppliancesKitchen;
    }

    public void setPaidAppliancesKitchen(String paidAppliancesKitchen) {
        this.paidAppliancesKitchen = Double.parseDouble(paidAppliancesKitchen);
        CalculateResidueAppliancesKitchen();
    }

    public String getResidueAppliancesKitchen() {
        return Double.toString(residueAppliancesKitchen);
    }

    public void setResidueAppliancesKitchen(double residueAppliancesKitchen) {
        this.residueAppliancesKitchen = residueAppliancesKitchen;
    }

    public void setResidueAppliancesKitchen(String residueAppliancesKitchen) {
        this.residueAppliancesKitchen = Double.parseDouble(residueAppliancesKitchen);
    }

    public String getDateOfDeliveryAppliancesKitchen() {
        return dateOfDeliveryAppliancesKitchen;
    }

    public void setDateOfDeliveryAppliancesKitchen(String dateOfKitchenAppliancesKitchen) {
        this.dateOfDeliveryAppliancesKitchen = dateOfKitchenAppliancesKitchen;
    }

    public String getNameRoomAppliancesKitchen() {
        return nameRoomAppliancesKitchen;
    }

    public void setNameRoomAppliancesKitchen(String nameRoomAppliancesKitchen) {
        this.nameRoomAppliancesKitchen = nameRoomAppliancesKitchen;
    }

    public String getPlannedCPAppliancesKitchen() {
        return plannedCPAppliancesKitchen;
    }

    public void setPlannedCPAppliancesKitchen(String plannedCPAppliancesKitchen) {
        this.plannedCPAppliancesKitchen = plannedCPAppliancesKitchen;
    }

    public String getActualCPAppliancesKitchen() {
        return actualCPAppliancesKitchen;
    }

    public void setActualCPAppliancesKitchen(String actualCPAppliancesKitchen) {
        this.actualCPAppliancesKitchen = actualCPAppliancesKitchen;
    }

    public String getAccountAppliancesKitchen() {
        return accountAppliancesKitchen;
    }

    public void setAccountAppliancesKitchen(String accountAppliancesKitchen) {
        this.accountAppliancesKitchen = accountAppliancesKitchen;
    }

    public String getContactsAppliancesKitchen() {
        return contactsAppliancesKitchen;
    }

    public void setContactsAppliancesKitchen(String contactsAppliancesKitchen) {
        this.contactsAppliancesKitchen = contactsAppliancesKitchen;
    }

    public String getNotesAppliancesKitchen() {
        return notesAppliancesKitchen;
    }

    public void setNotesAppliancesKitchen(String notesAppliancesKitchen) {
        this.notesAppliancesKitchen = notesAppliancesKitchen;
    }

    public String getCharacteristicsAppliancesKitchen() {
        return characteristicsAppliancesKitchen;
    }

    public void setCharacteristicsAppliancesKitchen(String characteristicsAppliancesKitchen) {
        this.characteristicsAppliancesKitchen = characteristicsAppliancesKitchen;
    }
}
