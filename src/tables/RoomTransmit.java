package tables;

import components.TimeProduction;
import components.UnitType;
import javafx.beans.property.SimpleObjectProperty;

import java.util.Date;

public class RoomTransmit {
    protected String nameRoomTransmit;//Наименование
    protected boolean activePRoomTransmit;//П
    protected boolean activeCRoomTransmit;//С
    protected SimpleObjectProperty<UnitType> unitRoomTransmit;//Ед. изм.
    protected double quantityRoomTransmit;//Количество
    protected double ordinalPriceUnitRoomTransmit;//Цена порядковая за ед.
    protected double priceCPUnitRoomTransmit;//Цена по КП за ед.
    protected double priceCPKeyRoomTransmit;//Цена по КП под ключ
    protected double costCPUnitRoomTransmit;//Стоимость по КП за ед.
    protected double priceOrderRoomTransmit;//Порядок цен
    protected double costCPRoomTransmit;//Стоимость по КП
    protected SimpleObjectProperty<TimeProduction> productionTimeRoomTransmit;//Срок доставки
    protected double actualCostRoomTransmit;//Стоимость фактическая
    protected double actualDifferenceRoomTransmit;//Разница фактическая
    protected double paidRoomTransmit;//Оплачено
    protected double residueRoomTransmit;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryRoomTransmit;//Дата поставки
    protected String nameRoomRoomTransmit;//Наименование помещения
    protected String plannedCPRoomTransmit;//КП плановое
    protected String actualCPRoomTransmit;//КП фактическое
    protected String accountRoomTransmit;//счёт
    protected String contactsRoomTransmit;//контакты
    protected String notesRoomTransmit;//примечания
    protected String characteristicsRoomTransmit;//характеристики

    public RoomTransmit(String nameRoomTransmit, boolean activePRoomTransmit, boolean activeCRoomTransmit, SimpleObjectProperty<UnitType> unitRoomTransmit,
                        double quantityRoomTransmit, double ordinalPriceUnitRoomTransmit, double priceCPUnitRoomTransmit, double priceCPKeyRoomTransmit,
                        double costCPUnitRoomTransmit, double priceOrderRoomTransmit, double costCPRoomTransmit, SimpleObjectProperty<TimeProduction> productionTimeRoomTransmit,
                        double actualCostRoomTransmit, double actualDifferenceRoomTransmit, double paidRoomTransmit, double residueRoomTransmit,
                        SimpleObjectProperty<Date> dateOfDeliveryRoomTransmit, String nameRoomRoomTransmit, String plannedCPRoomTransmit, String actualCPRoomTransmit,
                        String accountRoomTransmit, String contactsRoomTransmit, String notesRoomTransmit, String characteristicsRoomTransmit) {
        this.nameRoomTransmit = nameRoomTransmit;
        this.activePRoomTransmit = activePRoomTransmit;
        this.activeCRoomTransmit = activeCRoomTransmit;
        this.unitRoomTransmit = unitRoomTransmit;
        this.quantityRoomTransmit = quantityRoomTransmit;
        this.ordinalPriceUnitRoomTransmit = ordinalPriceUnitRoomTransmit;
        this.priceCPUnitRoomTransmit = priceCPUnitRoomTransmit;
        this.priceCPKeyRoomTransmit = priceCPKeyRoomTransmit;
        this.costCPUnitRoomTransmit = costCPUnitRoomTransmit;
        this.priceOrderRoomTransmit = priceOrderRoomTransmit;
        this.costCPRoomTransmit = costCPRoomTransmit;
        this.productionTimeRoomTransmit = productionTimeRoomTransmit;
        this.actualCostRoomTransmit = actualCostRoomTransmit;
        this.actualDifferenceRoomTransmit = actualDifferenceRoomTransmit;
        this.paidRoomTransmit = paidRoomTransmit;
        this.residueRoomTransmit = residueRoomTransmit;
        this.dateOfDeliveryRoomTransmit = dateOfDeliveryRoomTransmit;
        this.nameRoomRoomTransmit = nameRoomRoomTransmit;
        this.plannedCPRoomTransmit = plannedCPRoomTransmit;
        this.actualCPRoomTransmit = actualCPRoomTransmit;
        this.accountRoomTransmit = accountRoomTransmit;
        this.contactsRoomTransmit = contactsRoomTransmit;
        this.notesRoomTransmit = notesRoomTransmit;
        this.characteristicsRoomTransmit = characteristicsRoomTransmit;
    }


    public void CalculatePriceOrderRoomTransmit() {
        priceOrderRoomTransmit = quantityRoomTransmit * ordinalPriceUnitRoomTransmit;
    }

    public void CalculateСostCPUnitRoomTransmit() {
        if (priceCPKeyRoomTransmit > 0)
            costCPUnitRoomTransmit = priceCPKeyRoomTransmit / quantityRoomTransmit;
        else costCPUnitRoomTransmit = priceCPUnitRoomTransmit;
    }

    public void CalculateCostCPRoomTransmit() {
        if (priceCPKeyRoomTransmit > 0)
            costCPRoomTransmit = priceCPKeyRoomTransmit;
        else costCPRoomTransmit = priceCPUnitRoomTransmit * quantityRoomTransmit;
    }

    public void CalculateActualDifferenceRoomTransmit() {
        actualDifferenceRoomTransmit = costCPRoomTransmit - actualCostRoomTransmit;
    }

    public void CalculateResidueRoomTransmit() {
        residueRoomTransmit = actualCostRoomTransmit - paidRoomTransmit;
    }


    public String getNameRoomTransmit() {
        return nameRoomTransmit;
    }

    public void setNameRoomTransmit(String nameRoomTransmit) {
        this.nameRoomTransmit = nameRoomTransmit;
    }


    public UnitType getUnitRoomTransmit() {
        return unitRoomTransmit.get();
    }

    public void setUnitRoomTransmit(UnitType unitRoomTransmit) {
        this.unitRoomTransmit.set(unitRoomTransmit);
    }

    public boolean getActivePRoomTransmit() {
        return activePRoomTransmit;
    }

    public void setActivePRoomTransmit(boolean activePRoomTransmit) {
        this.activePRoomTransmit = activePRoomTransmit;
    }

    public void setActivePRoomTransmit(String activePRoomTransmit) {
        this.activePRoomTransmit = Boolean.parseBoolean(activePRoomTransmit);
    }

    public boolean getActiveCRoomTransmit() {
        return activeCRoomTransmit;
    }

    public void setActiveCRoomTransmit(boolean activeCRoomTransmit) {
        this.activeCRoomTransmit = activeCRoomTransmit;
    }

    public void setActiveCRoomTransmit(String activeCRoomTransmit) {
        this.activeCRoomTransmit = Boolean.parseBoolean(activeCRoomTransmit);
    }

    public String getQuantityRoomTransmit() {
        return Double.toString(quantityRoomTransmit);
    }

    public void setQuantityRoomTransmit(double quantityRoomTransmit) {
        this.quantityRoomTransmit = quantityRoomTransmit;
    }

    public void setQuantityRoomTransmit(String quantityRoomTransmit) {
        this.quantityRoomTransmit = Double.parseDouble(quantityRoomTransmit);
        CalculatePriceOrderRoomTransmit();
        CalculateCostCPRoomTransmit();
    }

    public String getOrdinalPriceUnitRoomTransmit() {
        return Double.toString(ordinalPriceUnitRoomTransmit);
    }

    public void setOrdinalPriceUnitRoomTransmit(double ordinalPriceUnitRoomTransmit) {
        this.ordinalPriceUnitRoomTransmit = ordinalPriceUnitRoomTransmit;
    }

    public void setOrdinalPriceUnitRoomTransmit(String ordinalPriceUnitRoomTransmit) {
        this.ordinalPriceUnitRoomTransmit = Double.parseDouble(ordinalPriceUnitRoomTransmit);
        CalculatePriceOrderRoomTransmit();
    }

    public String getPriceCPUnitRoomTransmit() {
        return Double.toString(priceCPUnitRoomTransmit);
    }

    public void setPriceCPUnitRoomTransmit(double priceCPUnitRoomTransmit) {
        this.priceCPUnitRoomTransmit = priceCPUnitRoomTransmit;
    }

    public void setPriceCPUnitRoomTransmit(String priceCPUnitRoomTransmit) {
        this.priceCPUnitRoomTransmit = Double.parseDouble(priceCPUnitRoomTransmit);
        CalculateСostCPUnitRoomTransmit();
        CalculateCostCPRoomTransmit();
    }

    public String getPriceCPKeyRoomTransmit() {
        return Double.toString(priceCPKeyRoomTransmit);
    }

    public void setPriceCPKeyRoomTransmit(double priceCPKeyRoomTransmit) {
        this.priceCPKeyRoomTransmit = priceCPKeyRoomTransmit;
    }

    public void setPriceCPKeyRoomTransmit(String priceCPKeyRoomTransmit) {
        this.priceCPKeyRoomTransmit = Double.parseDouble(priceCPKeyRoomTransmit);
        CalculateСostCPUnitRoomTransmit();
        CalculateCostCPRoomTransmit();
    }

    public String getCostCPUnitRoomTransmit() {
        return Double.toString(costCPUnitRoomTransmit);
    }

    public void setCostCPUnitRoomTransmit(double costCPUnitRoomTransmit) {
        this.costCPUnitRoomTransmit = costCPUnitRoomTransmit;
    }

    public void setCostCPUnitRoomTransmit(String costCPUnitRoomTransmit) {
        this.costCPUnitRoomTransmit = Double.parseDouble(costCPUnitRoomTransmit);
    }

    public String getPriceOrderRoomTransmit() {
        return Double.toString(priceOrderRoomTransmit);
    }

    public void setPriceOrderRoomTransmit(double priceOrderRoomTransmit) {
        this.priceOrderRoomTransmit = priceOrderRoomTransmit;
    }

    public void setPriceOrderRoomTransmit(String priceOrderRoomTransmit) {
        this.priceOrderRoomTransmit = Double.parseDouble(priceOrderRoomTransmit);
    }

    public String getCostCPRoomTransmit() {
        return Double.toString(costCPRoomTransmit);
    }

    public void setCostCPRoomTransmit(double costCPRoomTransmit) {
        this.costCPRoomTransmit = costCPRoomTransmit;
    }

    public void setCostCPRoomTransmit(String costCPRoomTransmit) {
        this.costCPRoomTransmit = Double.parseDouble(costCPRoomTransmit);
        CalculateActualDifferenceRoomTransmit();
    }


    public TimeProduction getProductionTimeRoomTransmit() {
        return productionTimeRoomTransmit.get();
    }

    public void setProductionTimeRoomTransmit(TimeProduction productionTimeRoomTransmit) {
        this.productionTimeRoomTransmit.set(productionTimeRoomTransmit);
    }

    public String getActualCostRoomTransmit() {
        return Double.toString(actualCostRoomTransmit);
    }

    public void setActualCostRoomTransmit(double actualCostRoomTransmit) {
        this.actualCostRoomTransmit = actualCostRoomTransmit;
    }

    public void setActualCostRoomTransmit(String actualCostRoomTransmit) {
        this.actualCostRoomTransmit = Double.parseDouble(actualCostRoomTransmit);
        CalculateActualDifferenceRoomTransmit();
        CalculateResidueRoomTransmit();
    }

    public String getActualDifferenceRoomTransmit() {
        return Double.toString(actualDifferenceRoomTransmit);
    }

    public void setActualDifferenceRoomTransmit(double actualDifferenceRoomTransmit) {
        this.actualDifferenceRoomTransmit = actualDifferenceRoomTransmit;
    }

    public void setActualDifferenceRoomTransmit(String actualDifferenceRoomTransmit) {
        this.actualDifferenceRoomTransmit = Double.parseDouble(actualDifferenceRoomTransmit);
    }

    public String getPaidRoomTransmit() {
        return Double.toString(paidRoomTransmit);
    }

    public void setPaidRoomTransmit(double paidRoomTransmit) {
        this.paidRoomTransmit = paidRoomTransmit;
    }

    public void setPaidRoomTransmit(String paidRoomTransmit) {
        this.paidRoomTransmit = Double.parseDouble(paidRoomTransmit);
        CalculateResidueRoomTransmit();
    }

    public String getResidueRoomTransmit() {
        return Double.toString(residueRoomTransmit);
    }

    public void setResidueRoomTransmit(double residueRoomTransmit) {
        this.residueRoomTransmit = residueRoomTransmit;
    }

    public void setResidueRoomTransmit(String residueRoomTransmit) {
        this.residueRoomTransmit = Double.parseDouble(residueRoomTransmit);
    }

    public Date getDateOfDeliveryRoomTransmit() {
        return dateOfDeliveryRoomTransmit.get();
    }

    public void setDateOfDeliveryRoomTransmit(Date dateOfDeliveryRoomTransmit) {
        this.dateOfDeliveryRoomTransmit.set(dateOfDeliveryRoomTransmit);
    }


    public String getNameRoomRoomTransmit() {
        return nameRoomRoomTransmit;
    }

    public void setNameRoomRoomTransmit(String nameRoomRoomTransmit) {
        this.nameRoomRoomTransmit = nameRoomRoomTransmit;
    }

    public String getPlannedCPRoomTransmit() {
        return plannedCPRoomTransmit;
    }

    public void setPlannedCPRoomTransmit(String plannedCPRoomTransmit) {
        this.plannedCPRoomTransmit = plannedCPRoomTransmit;
    }

    public String getActualCPRoomTransmit() {
        return actualCPRoomTransmit;
    }

    public void setActualCPRoomTransmit(String actualCPRoomTransmit) {
        this.actualCPRoomTransmit = actualCPRoomTransmit;
    }

    public String getAccountRoomTransmit() {
        return accountRoomTransmit;
    }

    public void setAccountRoomTransmit(String accountRoomTransmit) {
        this.accountRoomTransmit = accountRoomTransmit;
    }

    public String getContactsRoomTransmit() {
        return contactsRoomTransmit;
    }

    public void setContactsRoomTransmit(String contactsRoomTransmit) {
        this.contactsRoomTransmit = contactsRoomTransmit;
    }

    public String getNotesRoomTransmit() {
        return notesRoomTransmit;
    }

    public void setNotesRoomTransmit(String notesRoomTransmit) {
        this.notesRoomTransmit = notesRoomTransmit;
    }

    public String getCharacteristicsRoomTransmit() {
        return characteristicsRoomTransmit;
    }

    public void setCharacteristicsRoomTransmit(String characteristicsRoomTransmit) {
        this.characteristicsRoomTransmit = characteristicsRoomTransmit;
    }

}
