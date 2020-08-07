package tables;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import components.TimeProduction;
import components.UnitType;

import java.time.Instant;
import java.util.Date;

public class Plumbing {
    protected SimpleStringProperty namePlumbing;//Наименование
    protected SimpleBooleanProperty activePPlumbing;//П
    protected SimpleBooleanProperty activeCPlumbing;//С
    protected SimpleObjectProperty <UnitType> unitPlumbing;//Ед. изм.
    protected SimpleDoubleProperty quantityPlumbing;//Количество
    protected SimpleDoubleProperty ordinalPriceUnitPlumbing;//Цена порядковая за ед.
    protected SimpleDoubleProperty priceCPUnitPlumbing;//Цена по КП за ед.
    protected SimpleDoubleProperty priceCPKeyPlumbing;//Цена по КП под ключ
    protected SimpleDoubleProperty costCPUnitPlumbing;//Стоимость по КП за ед.
    protected SimpleDoubleProperty priceOrderPlumbing;//Порядок цен
    protected SimpleDoubleProperty costCPPlumbing;//Стоимость по КП
    protected SimpleObjectProperty <TimeProduction> productionTimePlumbing;//Срок доставки
    protected SimpleDoubleProperty actualCostPlumbing;//Стоимость фактическая
    protected SimpleDoubleProperty actualDifferencePlumbing;//Разница фактическая
    protected SimpleDoubleProperty paidPlumbing;//Оплачено
    protected SimpleDoubleProperty residuePlumbing;//Остаток
    protected SimpleObjectProperty<Date> dateOfDeliveryPlumbing;//Дата поставки
    protected SimpleStringProperty plannedCPPlumbing;
    protected SimpleStringProperty actualCPPlumbing;
    protected SimpleStringProperty accountPlumbing;
    protected SimpleStringProperty contactsPlumbing;
    protected SimpleStringProperty notesPlumbing;
    protected SimpleStringProperty characteristicsPlumbing;


    public Plumbing(String namePlumbing, boolean activePPlumbing, boolean activeCPlumbing, String unitPlumbing, double quantityPlumbing,
                    double ordinalPriceUnitPlumbing, double priceCPUnitPlumbing, double priceCPKeyPlumbing, double costCPUnitPlumbing,
                    double priceOrderPlumbing, double costCPPlumbing, String productionTimePlumbing, double actualCostPlumbing,
                    double actualDifferencePlumbing, double paidPlumbing, double residuePlumbing, String dateOfDeliveryPlumbing,
                    String plannedCPPlumbing, String actualCPPlumbing, String accountPlumbing, String contactsPlumbing, String notesPlumbing,
                    String characteristicsPlumbing) {
        this.namePlumbing = new SimpleStringProperty(namePlumbing);
        this.activePPlumbing = new SimpleBooleanProperty(false);
        this.activeCPlumbing = new SimpleBooleanProperty(false);
        this.unitPlumbing = new SimpleObjectProperty<>(UnitType.THING);
        this.quantityPlumbing = new SimpleDoubleProperty(quantityPlumbing);
        this.ordinalPriceUnitPlumbing = new SimpleDoubleProperty(ordinalPriceUnitPlumbing);
        this.priceCPUnitPlumbing = new SimpleDoubleProperty(priceCPUnitPlumbing);
        this.priceCPKeyPlumbing = new SimpleDoubleProperty(priceCPKeyPlumbing);
        this.costCPUnitPlumbing = new SimpleDoubleProperty(costCPUnitPlumbing);
        this.priceOrderPlumbing = new SimpleDoubleProperty(priceOrderPlumbing);
        this.costCPPlumbing = new SimpleDoubleProperty(costCPPlumbing);
        this.productionTimePlumbing = new SimpleObjectProperty<>(TimeProduction.INSTOCK);
        this.actualCostPlumbing = new SimpleDoubleProperty(actualCostPlumbing);
        this.actualDifferencePlumbing = new SimpleDoubleProperty(actualDifferencePlumbing);
        this.paidPlumbing = new SimpleDoubleProperty(paidPlumbing);
        this.residuePlumbing = new SimpleDoubleProperty(residuePlumbing);
        this.dateOfDeliveryPlumbing = new SimpleObjectProperty<>(Date.from(Instant.now()));
        this.plannedCPPlumbing = new SimpleStringProperty(plannedCPPlumbing);
        this.actualCPPlumbing = new SimpleStringProperty(actualCPPlumbing);
        this.accountPlumbing = new SimpleStringProperty(accountPlumbing);
        this.contactsPlumbing = new SimpleStringProperty(contactsPlumbing);
        this.notesPlumbing = new SimpleStringProperty(notesPlumbing);
        this.characteristicsPlumbing = new SimpleStringProperty(characteristicsPlumbing);
    }



//    public void CalculatePriceOrderPlumbing() {
//        priceOrderPlumbing = quantityPlumbing * ordinalPriceUnitPlumbing;
//    }
//
//    public void CalculateСostCPUnitPlumbing() {
//        if (priceCPKeyPlumbing > 0)
//            costCPUnitPlumbing = priceCPKeyPlumbing / quantityPlumbing;
//        else costCPUnitPlumbing = priceCPUnitPlumbing;
//    }
//
//    public void CalculateCostCPPlumbing() {
//        if (priceCPKeyPlumbing > 0)
//            costCPPlumbing = priceCPKeyPlumbing;
//        else costCPPlumbing = priceCPUnitPlumbing * quantityPlumbing;
//    }
//
//    public void CalculateActualDifferencePlumbing() {
//        actualDifferencePlumbing = costCPPlumbing - actualCostPlumbing;
//    }
//
//    public void CalculateResiduePlumbing() {
//        residuePlumbing = actualCostPlumbing - paidPlumbing;
//    }


    public String getNamePlumbing() {
        return namePlumbing.get();
    }

    public SimpleStringProperty namePlumbingProperty() {
        return namePlumbing;
    }

    public void setNamePlumbing(String namePlumbing) {
        this.namePlumbing.set(namePlumbing);
    }

    public boolean isActivePPlumbing() {
        return activePPlumbing.get();
    }

    public SimpleBooleanProperty activePPlumbingProperty() {
        return activePPlumbing;
    }

    public void setActivePPlumbing(boolean activePPlumbing) {
        this.activePPlumbing.set(activePPlumbing);
    }

    public boolean isActiveCPlumbing() {
        return activeCPlumbing.get();
    }

    public SimpleBooleanProperty activeCPlumbingProperty() {
        return activeCPlumbing;
    }

    public void setActiveCPlumbing(boolean activeCPlumbing) {
        this.activeCPlumbing.set(activeCPlumbing);
    }

    public UnitType getUnitPlumbing() {
        return unitPlumbing.get();
    }

    public SimpleObjectProperty<UnitType> unitPlumbingProperty() {
        return unitPlumbing;
    }

    public void setUnitPlumbing(UnitType unitPlumbing) {
        this.unitPlumbing.set(unitPlumbing);
    }

    public double getQuantityPlumbing() {
        return quantityPlumbing.get();
    }

    public SimpleDoubleProperty quantityPlumbingProperty() {
        return quantityPlumbing;
    }

    public void setQuantityPlumbing(double quantityPlumbing) {
        this.quantityPlumbing.set(quantityPlumbing);
    }

    public double getOrdinalPriceUnitPlumbing() {
        return ordinalPriceUnitPlumbing.get();
    }

    public SimpleDoubleProperty ordinalPriceUnitPlumbingProperty() {
        return ordinalPriceUnitPlumbing;
    }

    public void setOrdinalPriceUnitPlumbing(double ordinalPriceUnitPlumbing) {
        this.ordinalPriceUnitPlumbing.set(ordinalPriceUnitPlumbing);
    }

    public double getPriceCPUnitPlumbing() {
        return priceCPUnitPlumbing.get();
    }

    public SimpleDoubleProperty priceCPUnitPlumbingProperty() {
        return priceCPUnitPlumbing;
    }

    public void setPriceCPUnitPlumbing(double priceCPUnitPlumbing) {
        this.priceCPUnitPlumbing.set(priceCPUnitPlumbing);
    }

    public double getPriceCPKeyPlumbing() {
        return priceCPKeyPlumbing.get();
    }

    public SimpleDoubleProperty priceCPKeyPlumbingProperty() {
        return priceCPKeyPlumbing;
    }

    public void setPriceCPKeyPlumbing(double priceCPKeyPlumbing) {
        this.priceCPKeyPlumbing.set(priceCPKeyPlumbing);
    }

    public double getCostCPUnitPlumbing() {
        return costCPUnitPlumbing.get();
    }

    public SimpleDoubleProperty costCPUnitPlumbingProperty() {
        return costCPUnitPlumbing;
    }

    public void setCostCPUnitPlumbing(double costCPUnitPlumbing) {
        this.costCPUnitPlumbing.set(costCPUnitPlumbing);
    }

    public double getPriceOrderPlumbing() {
        return priceOrderPlumbing.get();
    }

    public SimpleDoubleProperty priceOrderPlumbingProperty() {
        return priceOrderPlumbing;
    }

    public void setPriceOrderPlumbing(double priceOrderPlumbing) {
        this.priceOrderPlumbing.set(priceOrderPlumbing);
    }

    public double getCostCPPlumbing() {
        return costCPPlumbing.get();
    }

    public SimpleDoubleProperty costCPPlumbingProperty() {
        return costCPPlumbing;
    }

    public void setCostCPPlumbing(double costCPPlumbing) {
        this.costCPPlumbing.set(costCPPlumbing);
    }

    public TimeProduction getProductionTimePlumbing() {
        return productionTimePlumbing.get();
    }

    public SimpleObjectProperty<TimeProduction> productionTimePlumbingProperty() {
        return productionTimePlumbing;
    }

    public void setProductionTimePlumbing(TimeProduction productionTimePlumbing) {
        this.productionTimePlumbing.set(productionTimePlumbing);
    }

    public double getActualCostPlumbing() {
        return actualCostPlumbing.get();
    }

    public SimpleDoubleProperty actualCostPlumbingProperty() {
        return actualCostPlumbing;
    }

    public void setActualCostPlumbing(double actualCostPlumbing) {
        this.actualCostPlumbing.set(actualCostPlumbing);
    }

    public double getActualDifferencePlumbing() {
        return actualDifferencePlumbing.get();
    }

    public SimpleDoubleProperty actualDifferencePlumbingProperty() {
        return actualDifferencePlumbing;
    }

    public void setActualDifferencePlumbing(double actualDifferencePlumbing) {
        this.actualDifferencePlumbing.set(actualDifferencePlumbing);
    }

    public double getPaidPlumbing() {
        return paidPlumbing.get();
    }

    public SimpleDoubleProperty paidPlumbingProperty() {
        return paidPlumbing;
    }

    public void setPaidPlumbing(double paidPlumbing) {
        this.paidPlumbing.set(paidPlumbing);
    }

    public double getResiduePlumbing() {
        return residuePlumbing.get();
    }

    public SimpleDoubleProperty residuePlumbingProperty() {
        return residuePlumbing;
    }

    public void setResiduePlumbing(double residuePlumbing) {
        this.residuePlumbing.set(residuePlumbing);
    }

    public Date getDateOfDeliveryPlumbing() {
        return dateOfDeliveryPlumbing.get();
    }

    public SimpleObjectProperty<Date> dateOfDeliveryPlumbingProperty() {
        return dateOfDeliveryPlumbing;
    }

    public void setDateOfDeliveryPlumbing(Date dateOfDeliveryPlumbing) {
        this.dateOfDeliveryPlumbing.set(dateOfDeliveryPlumbing);
    }

    public String getPlannedCPPlumbing() {
        return plannedCPPlumbing.get();
    }

    public SimpleStringProperty plannedCPPlumbingProperty() {
        return plannedCPPlumbing;
    }

    public void setPlannedCPPlumbing(String plannedCPPlumbing) {
        this.plannedCPPlumbing.set(plannedCPPlumbing);
    }

    public String getActualCPPlumbing() {
        return actualCPPlumbing.get();
    }

    public SimpleStringProperty actualCPPlumbingProperty() {
        return actualCPPlumbing;
    }

    public void setActualCPPlumbing(String actualCPPlumbing) {
        this.actualCPPlumbing.set(actualCPPlumbing);
    }

    public String getAccountPlumbing() {
        return accountPlumbing.get();
    }

    public SimpleStringProperty accountPlumbingProperty() {
        return accountPlumbing;
    }

    public void setAccountPlumbing(String accountPlumbing) {
        this.accountPlumbing.set(accountPlumbing);
    }

    public String getContactsPlumbing() {
        return contactsPlumbing.get();
    }

    public SimpleStringProperty contactsPlumbingProperty() {
        return contactsPlumbing;
    }

    public void setContactsPlumbing(String contactsPlumbing) {
        this.contactsPlumbing.set(contactsPlumbing);
    }

    public String getNotesPlumbing() {
        return notesPlumbing.get();
    }

    public SimpleStringProperty notesPlumbingProperty() {
        return notesPlumbing;
    }

    public void setNotesPlumbing(String notesPlumbing) {
        this.notesPlumbing.set(notesPlumbing);
    }

    public String getCharacteristicsPlumbing() {
        return characteristicsPlumbing.get();
    }

    public SimpleStringProperty characteristicsPlumbingProperty() {
        return characteristicsPlumbing;
    }

    public void setCharacteristicsPlumbing(String characteristicsPlumbing) {
        this.characteristicsPlumbing.set(characteristicsPlumbing);
    }
}
