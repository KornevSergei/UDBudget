package sample;

public class Plumbing {
    protected String namePlumbing;//Наименование
    protected boolean activePPlumbing;//П
    protected boolean activeCPlumbing;//С
    protected String unitPlumbing;//Ед. изм.
    protected double quantityPlumbing;//Количество
    protected double ordinalPriceUnitPlumbing;//Цена порядковая за ед.
    protected double priceCPUnitPlumbing;//Цена по КП за ед.
    protected double priceCPKeyPlumbing;//Цена по КП под ключ
    protected double costCPUnitPlumbing;//Стоимость по КП за ед.
    protected double priceOrderPlumbing;//Порядок цен
    protected double costCPPlumbing;//Стоимость по КП
    protected String productionTimePlumbing;//Срок доставки
    protected double actualCostPlumbing;//Стоимость фактическая
    protected double actualDifferencePlumbing;//Разница фактическая
    protected double paidPlumbing;//Оплачено
    protected double residuePlumbing;//Остаток
    protected String dateOfDeliveryPlumbing;//Дата поставки
    protected String plannedCPPlumbing;
    protected String actualCPPlumbing;
    protected String accountPlumbing;
    protected String contactsPlumbing;
    protected String notesPlumbing;
    protected String characteristicsPlumbing;


    public Plumbing(String namePlumbing, boolean activePPlumbing, boolean activeCPlumbing, String unitPlumbing, double quantityPlumbing,
                    double ordinalPriceUnitPlumbing, double priceCPUnitPlumbing, double priceCPKeyPlumbing, double costCPUnitPlumbing,
                    double priceOrderPlumbing, double costCPPlumbing, String productionTimePlumbing, double actualCostPlumbing,
                    double actualDifferencePlumbing, double paidPlumbing, double residuePlumbing, String dateOfDeliveryPlumbing,
                    String plannedCPPlumbing, String actualCPPlumbing, String accountPlumbing, String contactsPlumbing, String notesPlumbing,
                    String characteristicsPlumbing) {
        this.namePlumbing = namePlumbing;
        this.activePPlumbing = activePPlumbing;
        this.activeCPlumbing = activeCPlumbing;
        this.unitPlumbing = unitPlumbing;
        this.quantityPlumbing = quantityPlumbing;
        this.ordinalPriceUnitPlumbing = ordinalPriceUnitPlumbing;
        this.priceCPUnitPlumbing = priceCPUnitPlumbing;
        this.priceCPKeyPlumbing = priceCPKeyPlumbing;
        this.costCPUnitPlumbing = costCPUnitPlumbing;
        this.priceOrderPlumbing = priceOrderPlumbing;
        this.costCPPlumbing = costCPPlumbing;
        this.productionTimePlumbing = productionTimePlumbing;
        this.actualCostPlumbing = actualCostPlumbing;
        this.actualDifferencePlumbing = actualDifferencePlumbing;
        this.paidPlumbing = paidPlumbing;
        this.residuePlumbing = residuePlumbing;
        this.dateOfDeliveryPlumbing = dateOfDeliveryPlumbing;
        this.plannedCPPlumbing = plannedCPPlumbing;
        this.actualCPPlumbing = actualCPPlumbing;
        this.accountPlumbing = accountPlumbing;
        this.contactsPlumbing = contactsPlumbing;
        this.notesPlumbing = notesPlumbing;
        this.characteristicsPlumbing = characteristicsPlumbing;
    }

    public void CalculatePriceOrderPlumbing() {
        priceOrderPlumbing = quantityPlumbing * ordinalPriceUnitPlumbing;
    }

    public void CalculateСostCPUnitPlumbing() {
        if (priceCPKeyPlumbing > 0)
            costCPUnitPlumbing = priceCPKeyPlumbing / quantityPlumbing;
        else costCPUnitPlumbing = priceCPUnitPlumbing;
    }

    public void CalculateCostCPPlumbing() {
        if (priceCPKeyPlumbing > 0)
            costCPPlumbing = priceCPKeyPlumbing;
        else costCPPlumbing = priceCPUnitPlumbing * quantityPlumbing;
    }

    public void CalculateActualDifferencePlumbing() {
        actualDifferencePlumbing = costCPPlumbing - actualCostPlumbing;
    }

    public void CalculateResiduePlumbing() {
        residuePlumbing = actualCostPlumbing - paidPlumbing;
    }


    public String getNamePlumbing() {
        return namePlumbing;
    }

    public void setNamePlumbing(String namePlumbing) {
        this.namePlumbing = namePlumbing;
    }

    public String getUnitPlumbing() {
        return unitPlumbing;
    }

    public void setUnitPlumbing(String unitPlumbing) {
        this.unitPlumbing = unitPlumbing;
    }

    //Чекбоксы
    public boolean getActivePPlumbing() {
        return activePPlumbing;
    }

    public void setActivePPlumbing(boolean activePPlumbing) {
        this.activePPlumbing = activePPlumbing;
    }

    public void setActivePPlumbing(String activePPlumbing) {
        this.activePPlumbing = Boolean.parseBoolean(activePPlumbing);
    }

    public boolean getActiveCPlumbing() {
        return activeCPlumbing;
    }

    public void setActiveCPlumbing(boolean activeCPlumbing) {
        this.activeCPlumbing = activeCPlumbing;
    }

    public void setActiveCPlumbing(String activeCPlumbing) {
        this.activeCPlumbing = Boolean.parseBoolean(activeCPlumbing);
    }

    //Обана
    public String getQuantityPlumbing() {
        return Double.toString(quantityPlumbing);
    }

    public void setQuantityPlumbing(double quantityPlumbing) {
        this.quantityPlumbing = quantityPlumbing;
    }

    public void setQuantityPlumbing(String quantityPlumbing) {
        this.quantityPlumbing = Double.parseDouble(quantityPlumbing);
        CalculatePriceOrderPlumbing();
        CalculateCostCPPlumbing();
    }

    //Хуяк
    public String getOrdinalPriceUnitPlumbing() {
        return Double.toString(ordinalPriceUnitPlumbing);
    }

    public void setOrdinalPriceUnitPlumbing(double ordinalPriceUnitPlumbing) {
        this.ordinalPriceUnitPlumbing = ordinalPriceUnitPlumbing;
    }

    public void setOrdinalPriceUnitPlumbing(String ordinalPriceUnitPlumbing) {
        this.ordinalPriceUnitPlumbing = Double.parseDouble(ordinalPriceUnitPlumbing);
        CalculatePriceOrderPlumbing();
    }

    public String getPriceCPUnitPlumbing() {
        return Double.toString(priceCPUnitPlumbing);
    }

    public void setPriceCPUnitPlumbing(double priceCPUnitPlumbing) {
        this.priceCPUnitPlumbing = priceCPUnitPlumbing;
    }

    public void setPriceCPUnitPlumbing(String priceCPUnitPlumbing) {
        this.priceCPUnitPlumbing = Double.parseDouble(priceCPUnitPlumbing);
        CalculateСostCPUnitPlumbing();
        CalculateCostCPPlumbing();
    }

    public String getPriceCPKeyPlumbing() {
        return Double.toString(priceCPKeyPlumbing);
    }

    public void setPriceCPKeyPlumbing(double priceCPKeyPlumbing) {
        this.priceCPKeyPlumbing = priceCPKeyPlumbing;
    }

    public void setPriceCPKeyPlumbing(String priceCPKeyPlumbing) {
        this.priceCPKeyPlumbing = Double.parseDouble(priceCPKeyPlumbing);
        CalculateСostCPUnitPlumbing();
        CalculateCostCPPlumbing();
    }

    public String getCostCPUnitPlumbing() {
        return Double.toString(costCPUnitPlumbing);
    }

    public void setCostCPUnitPlumbing(double costCPUnitPlumbing) {
        this.costCPUnitPlumbing = costCPUnitPlumbing;
    }

    public void setCostCPUnitPlumbing(String costCPUnitPlumbing) {
        this.costCPUnitPlumbing = Double.parseDouble(costCPUnitPlumbing);
    }

    //Понеслось
    public String getPriceOrderPlumbing() {
        return Double.toString(priceOrderPlumbing);
    }

    public void setPriceOrderPlumbing(double priceOrderPlumbing) {
        this.priceOrderPlumbing = priceOrderPlumbing;
    }

    public void setPriceOrderPlumbing(String priceOrderPlumbing) {
        this.priceOrderPlumbing = Double.parseDouble(priceOrderPlumbing);
    }

    public String getCostCPPlumbing() {
        return Double.toString(costCPPlumbing);
    }

    public void setCostCPPlumbing(double costCPPlumbing) {
        this.costCPPlumbing = costCPPlumbing;
    }

    public void setCostCPPlumbing(String costCPPlumbing) {
        this.costCPPlumbing = Double.parseDouble(costCPPlumbing);
        CalculateActualDifferencePlumbing();
    }

    public String getProductionTimePlumbing() {
        return productionTimePlumbing;
    }

    public void setProductionTimePlumbing(String productionTimePlumbing) {
        this.productionTimePlumbing = productionTimePlumbing;
    }

    public String getActualCostPlumbing() {
        return Double.toString(actualCostPlumbing);
    }

    public void setActualCostPlumbing(double actualCostPlumbing) {
        this.actualCostPlumbing = actualCostPlumbing;
    }

    public void setActualCostPlumbing(String actualCostPlumbing) {
        this.actualCostPlumbing = Double.parseDouble(actualCostPlumbing);
        CalculateActualDifferencePlumbing();
        CalculateResiduePlumbing();

    }

    public String getActualDifferencePlumbing() {
        return Double.toString(actualDifferencePlumbing);
    }

    public void setActualDifferencePlumbing(double actualDifferencePlumbing) {
        this.actualDifferencePlumbing = actualDifferencePlumbing;
    }

    public void setActualDifferencePlumbing(String actualDifferencePlumbing) {
        this.actualDifferencePlumbing = Double.parseDouble(actualDifferencePlumbing);
    }

    public String getPaidPlumbing() {
        return Double.toString(paidPlumbing);
    }

    public void setPaidPlumbing(double paidPlumbing) {
        this.paidPlumbing = paidPlumbing;
    }

    public void setPaidPlumbing(String paidPlumbing) {
        this.paidPlumbing = Double.parseDouble(paidPlumbing);
        CalculateResiduePlumbing();
    }

    public String getResiduePlumbing() {
        return Double.toString(residuePlumbing);
    }

    public void setResiduePlumbing(double residuePlumbing) {
        this.residuePlumbing = residuePlumbing;
    }

    public void setResiduePlumbing(String residuePlumbing) {
        this.residuePlumbing = Double.parseDouble(residuePlumbing);
    }

    public String getDateOfDeliveryPlumbing() {
        return dateOfDeliveryPlumbing;
    }

    public void setDateOfDeliveryPlumbing(String dateOfDeliveryPlumbing) {
        this.dateOfDeliveryPlumbing = dateOfDeliveryPlumbing;
    }

    public String getPlannedCPPlumbing() {
        return plannedCPPlumbing;
    }

    public void setPlannedCPPlumbing(String plannedCPPlumbing) {
        this.plannedCPPlumbing = plannedCPPlumbing;
    }

    public String getActualCPPlumbing() {
        return actualCPPlumbing;
    }

    public void setActualCPPlumbing(String actualCPPlumbing) {
        this.actualCPPlumbing = actualCPPlumbing;
    }

    public String getAccountPlumbing() {
        return accountPlumbing;
    }

    public void setAccountPlumbing(String accountPlumbing) {
        this.accountPlumbing = accountPlumbing;
    }

    public String getContactsPlumbing() {
        return contactsPlumbing;
    }

    public void setContactsPlumbing(String contactsPlumbing) {
        this.contactsPlumbing = contactsPlumbing;
    }

    public String getNotesPlumbing() {
        return notesPlumbing;
    }

    public void setNotesPlumbing(String notesPlumbing) {
        this.notesPlumbing = notesPlumbing;
    }

    public String getCharacteristicsPlumbing() {
        return characteristicsPlumbing;
    }

    public void setCharacteristicsPlumbing(String characteristicsPlumbing) {
        this.characteristicsPlumbing = characteristicsPlumbing;
    }
}
