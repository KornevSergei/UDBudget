package sample;

public class Decoration {
    protected String nameDecoration;//Наименование
    protected boolean activePDecoration;//П
    protected boolean activeCDecoration;//С
    protected String unitDecoration;//Ед. изм.
    protected double quantityDecoration;//Количество
    protected double ordinalPriceUnitDecoration;//Цена порядковая за ед.
    protected double priceCPUnitDecoration;//Цена по КП за ед.
    protected double priceCPKeyDecoration;//Цена по КП под ключ
    protected double costCPUnitDecoration;//Стоимость по КП за ед.
    protected double priceOrderDecoration;//Порядок цен
    protected double costCPDecoration;//Стоимость по КП
    protected String productionTimeDecoration;//Срок доставки
    protected double actualCostDecoration;//Стоимость фактическая
    protected double actualDifferenceDecoration;//Разница фактическая
    protected double paidDecoration;//Оплачено
    protected double residueDecoration;//Остаток
    protected String dateOfDeliveryDecoration;//Дата поставки
    protected String plannedCPDecoration;
    protected String actualCPDecoration;
    protected String accountDecoration;
    protected String contactsDecoration;
    protected String notesDecoration;
    protected String characteristicsDecoration;


    public Decoration(String nameDecoration, boolean activePDecoration, boolean activeCDecoration, String unitDecoration, double quantityDecoration,
                      double ordinalPriceUnitDecoration, double priceCPUnitDecoration, double priceCPKeyDecoration, double costCPUnitDecoration,
                      double priceOrderDecoration, double costCPDecoration, String productionTimeDecoration, double actualCostDecoration,
                      double actualDifferenceDecoration, double paidDecoration, double residueDecoration, String dateOfDeliveryDecoration,
                      String plannedCPDecoration, String actualCPDecoration, String accountDecoration, String contactsDecoration, String notesDecoration,
                      String characteristicsDecoration) {
        this.nameDecoration = nameDecoration;
        this.activePDecoration = activePDecoration;
        this.activeCDecoration = activeCDecoration;
        this.unitDecoration = unitDecoration;
        this.quantityDecoration = quantityDecoration;
        this.ordinalPriceUnitDecoration = ordinalPriceUnitDecoration;
        this.priceCPUnitDecoration = priceCPUnitDecoration;
        this.priceCPKeyDecoration = priceCPKeyDecoration;
        this.costCPUnitDecoration = costCPUnitDecoration;
        this.priceOrderDecoration = priceOrderDecoration;
        this.costCPDecoration = costCPDecoration;
        this.productionTimeDecoration = productionTimeDecoration;
        this.actualCostDecoration = actualCostDecoration;
        this.actualDifferenceDecoration = actualDifferenceDecoration;
        this.paidDecoration = paidDecoration;
        this.residueDecoration = residueDecoration;
        this.dateOfDeliveryDecoration = dateOfDeliveryDecoration;
        this.plannedCPDecoration = plannedCPDecoration;
        this.actualCPDecoration = actualCPDecoration;
        this.accountDecoration = accountDecoration;
        this.contactsDecoration = contactsDecoration;
        this.notesDecoration = notesDecoration;
        this.characteristicsDecoration = characteristicsDecoration;
    }

    public void CalculatePriceOrderDecoration() {
        priceOrderDecoration = quantityDecoration * ordinalPriceUnitDecoration;
    }

    public void CalculateСostCPUnitDecoration() {
        if (priceCPKeyDecoration > 0)
            costCPUnitDecoration = priceCPKeyDecoration / quantityDecoration;
        else costCPUnitDecoration = priceCPUnitDecoration;
    }

    public void CalculateCostCPDecoration() {
        if (priceCPKeyDecoration > 0)
            costCPDecoration = priceCPKeyDecoration;
        else costCPDecoration = priceCPUnitDecoration * quantityDecoration;
    }

    public void CalculateActualDifferenceDecoration() {
        actualDifferenceDecoration = costCPDecoration - actualCostDecoration;
    }

    public void CalculateResidueDecoration() {
        residueDecoration = actualCostDecoration - paidDecoration;
    }


    public String getNameDecoration() {
        return nameDecoration;
    }

    public void setNameDecoration(String nameDecoration) {
        this.nameDecoration = nameDecoration;
    }

    public String getUnitDecoration() {
        return unitDecoration;
    }

    public void setUnitDecoration(String unitDecoration) {
        this.unitDecoration = unitDecoration;
    }

    //Чекбоксы
    public boolean getActivePDecoration() {
        return activePDecoration;
    }

    public void setActivePDecoration(boolean activePDecoration) {
        this.activePDecoration = activePDecoration;
    }

    public void setActivePDecoration(String activePDecoration) {
        this.activePDecoration = Boolean.parseBoolean(activePDecoration);
    }

    public boolean getActiveCDecoration() {
        return activeCDecoration;
    }

    public void setActiveCDecoration(boolean activeCDecoration) {
        this.activeCDecoration = activeCDecoration;
    }

    public void setActiveCDecoration(String activeCDecoration) {
        this.activeCDecoration = Boolean.parseBoolean(activeCDecoration);
    }

    public String getQuantityDecoration() {
        return Double.toString(quantityDecoration);
    }

    public void setQuantityDecoration(double quantityDecoration) {
        this.quantityDecoration = quantityDecoration;
    }

    public void setQuantityDecoration(String quantityDecoration) {
        this.quantityDecoration = Double.parseDouble(quantityDecoration);
        CalculatePriceOrderDecoration();
        CalculateCostCPDecoration();
    }

    public String getOrdinalPriceUnitDecoration() {
        return Double.toString(ordinalPriceUnitDecoration);
    }

    public void setOrdinalPriceUnitDecoration(double ordinalPriceUnitDecoration) {
        this.ordinalPriceUnitDecoration = ordinalPriceUnitDecoration;
    }

    public void setOrdinalPriceUnitDecoration(String ordinalPriceUnitDecoration) {
        this.ordinalPriceUnitDecoration = Double.parseDouble(ordinalPriceUnitDecoration);
        CalculatePriceOrderDecoration();
    }

    public String getPriceCPUnitDecoration() {
        return Double.toString(priceCPUnitDecoration);
    }

    public void setPriceCPUnitDecoration(double priceCPUnitDecoration) {
        this.priceCPUnitDecoration = priceCPUnitDecoration;
    }

    public void setPriceCPUnitDecoration(String priceCPUnitDecoration) {
        this.priceCPUnitDecoration = Double.parseDouble(priceCPUnitDecoration);
        CalculateСostCPUnitDecoration();
        CalculateCostCPDecoration();
    }

    public String getPriceCPKeyDecoration() {
        return Double.toString(priceCPKeyDecoration);
    }

    public void setPriceCPKeyDecoration(double priceCPKeyDecoration) {
        this.priceCPKeyDecoration = priceCPKeyDecoration;
    }

    public void setPriceCPKeyDecoration(String priceCPKeyDecoration) {
        this.priceCPKeyDecoration = Double.parseDouble(priceCPKeyDecoration);
        CalculateСostCPUnitDecoration();
        CalculateCostCPDecoration();
    }

    public String getCostCPUnitDecoration() {
        return Double.toString(costCPUnitDecoration);
    }

    public void setCostCPUnitDecoration(double costCPUnitDecoration) {
        this.costCPUnitDecoration = costCPUnitDecoration;
    }

    public void setCostCPUnitDecoration(String costCPUnitDecoration) {
        this.costCPUnitDecoration = Double.parseDouble(costCPUnitDecoration);
    }

    //Понеслось
    public String getPriceOrderDecoration() {
        return Double.toString(priceOrderDecoration);
    }

    public void setPriceOrderDecoration(double priceOrderDecoration) {
        this.priceOrderDecoration = priceOrderDecoration;
    }

    public void setPriceOrderDecoration(String priceOrderDecoration) {
        this.priceOrderDecoration = Double.parseDouble(priceOrderDecoration);
    }

    public String getCostCPDecoration() {
        return Double.toString(costCPDecoration);
    }

    public void setCostCPDecoration(double costCPDecoration) {
        this.costCPDecoration = costCPDecoration;
    }

    public void setCostCPDecoration(String costCPDecoration) {
        this.costCPDecoration = Double.parseDouble(costCPDecoration);
        CalculateActualDifferenceDecoration();
    }

    public String getProductionTimeDecoration() {
        return productionTimeDecoration;
    }

    public void setProductionTimeDecoration(String productionTimeDecoration) {
        this.productionTimeDecoration = productionTimeDecoration;
    }

    public String getActualCostDecoration() {
        return Double.toString(actualCostDecoration);
    }

    public void setActualCostDecoration(double actualCostDecoration) {
        this.actualCostDecoration = actualCostDecoration;
    }

    public void setActualCostDecoration(String actualCostDecoration) {
        this.actualCostDecoration = Double.parseDouble(actualCostDecoration);
        CalculateActualDifferenceDecoration();
        CalculateResidueDecoration();

    }

    public String getActualDifferenceDecoration() {
        return Double.toString(actualDifferenceDecoration);
    }

    public void setActualDifferenceDecoration(double actualDifferenceDecoration) {
        this.actualDifferenceDecoration = actualDifferenceDecoration;
    }

    public void setActualDifferenceDecoration(String actualDifferenceDecoration) {
        this.actualDifferenceDecoration = Double.parseDouble(actualDifferenceDecoration);
    }

    public String getPaidDecoration() {
        return Double.toString(paidDecoration);
    }

    public void setPaidDecoration(double paidDecoration) {
        this.paidDecoration = paidDecoration;
    }

    public void setPaidDecoration(String paidDecoration) {
        this.paidDecoration = Double.parseDouble(paidDecoration);
        CalculateResidueDecoration();
    }

    public String getResidueDecoration() {
        return Double.toString(residueDecoration);
    }

    public void setResidueDecoration(double residueDecoration) {
        this.residueDecoration = residueDecoration;
    }

    public void setResidueDecoration(String residueDecoration) {
        this.residueDecoration = Double.parseDouble(residueDecoration);
    }

    public String getDateOfDeliveryDecoration() {
        return dateOfDeliveryDecoration;
    }

    public void setDateOfDeliveryDecoration(String dateOfDeliveryDecoration) {
        this.dateOfDeliveryDecoration = dateOfDeliveryDecoration;
    }

    public String getPlannedCPDecoration() {
        return plannedCPDecoration;
    }

    public void setPlannedCPDecoration(String plannedCPDecoration) {
        this.plannedCPDecoration = plannedCPDecoration;
    }

    public String getActualCPDecoration() {
        return actualCPDecoration;
    }

    public void setActualCPDecoration(String actualCPDecoration) {
        this.actualCPDecoration = actualCPDecoration;
    }

    public String getAccountDecoration() {
        return accountDecoration;
    }

    public void setAccountDecoration(String accountDecoration) {
        this.accountDecoration = accountDecoration;
    }

    public String getContactsDecoration() {
        return contactsDecoration;
    }

    public void setContactsDecoration(String contactsDecoration) {
        this.contactsDecoration = contactsDecoration;
    }

    public String getNotesDecoration() {
        return notesDecoration;
    }

    public void setNotesDecoration(String notesDecoration) {
        this.notesDecoration = notesDecoration;
    }

    public String getCharacteristicsDecoration() {
        return characteristicsDecoration;
    }

    public void setCharacteristicsDecoration(String characteristicsDecoration) {
        this.characteristicsDecoration = characteristicsDecoration;
    }
}

