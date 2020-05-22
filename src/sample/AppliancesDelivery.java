package sample;

import javafx.beans.property.SimpleStringProperty;

public class AppliancesDelivery {
        protected SimpleStringProperty nameAppliancesDelivery;
        protected SimpleStringProperty unitAppliancesDelivery;
        protected SimpleStringProperty quantityAppliancesDelivery;
        protected SimpleStringProperty ordinalPriceUnitAppliancesDelivery;
        protected SimpleStringProperty priceCPUnitAppliancesDelivery;
        protected SimpleStringProperty priceCPKeyAppliancesDelivery;
        protected SimpleStringProperty costCPUnitAppliancesDelivery;
        protected SimpleStringProperty priceOrderAppliancesDelivery;
        protected SimpleStringProperty costCPAppliancesDelivery;
        protected SimpleStringProperty productionTimeAppliancesDelivery;
        protected SimpleStringProperty actualCostAppliancesDelivery;
        protected SimpleStringProperty actualDifferenceAppliancesDelivery;
        protected SimpleStringProperty paidAppliancesDelivery;
        protected SimpleStringProperty residueAppliancesDelivery;
        protected SimpleStringProperty dateOfDeliveryAppliancesDelivery;
        protected SimpleStringProperty plannedCPAppliancesDelivery;
        protected SimpleStringProperty actualCPAppliancesDelivery;
        protected SimpleStringProperty accountAppliancesDelivery;
        protected SimpleStringProperty contactsAppliancesDelivery;
        protected SimpleStringProperty notesAppliancesDelivery;
        protected SimpleStringProperty characteristicsAppliancesDelivery;

        public AppliancesDelivery() {
        }

        public AppliancesDelivery(String nameAppliancesDelivery, String unitAppliancesDelivery, String quantityAppliancesDelivery, String ordinalPriceUnitAppliancesDelivery,
                               String priceCPUnitAppliancesDelivery, String priceCPKeyAppliancesDelivery, String costCPUnitAppliancesDelivery, String priceOrderAppliancesDelivery,
                               String costCPAppliancesDelivery, String productionTimeAppliancesDelivery, String actualCostAppliancesDelivery,
                               String actualDifferenceAppliancesDelivery, String paidAppliancesDelivery, String residueAppliancesDelivery, String dateOfDeliveryAppliancesDelivery,
                               String plannedCPAppliancesDelivery, String actualCPAppliancesDelivery, String accountAppliancesDelivery, String contactsAppliancesDelivery,
                               String notesAppliancesDelivery, String characteristicsAppliancesDelivery) {
            this.nameAppliancesDelivery = new SimpleStringProperty(nameAppliancesDelivery);
            this.unitAppliancesDelivery = new SimpleStringProperty(unitAppliancesDelivery);
            this.quantityAppliancesDelivery = new SimpleStringProperty(quantityAppliancesDelivery);
            this.ordinalPriceUnitAppliancesDelivery = new SimpleStringProperty(ordinalPriceUnitAppliancesDelivery);
            this.priceCPUnitAppliancesDelivery = new SimpleStringProperty(priceCPUnitAppliancesDelivery);
            this.priceCPKeyAppliancesDelivery = new SimpleStringProperty(priceCPKeyAppliancesDelivery);
            this.costCPUnitAppliancesDelivery = new SimpleStringProperty(costCPUnitAppliancesDelivery);
            this.priceOrderAppliancesDelivery = new SimpleStringProperty(priceOrderAppliancesDelivery);
            this.costCPAppliancesDelivery = new SimpleStringProperty(costCPAppliancesDelivery);
            this.productionTimeAppliancesDelivery = new SimpleStringProperty(productionTimeAppliancesDelivery);
            this.actualCostAppliancesDelivery = new SimpleStringProperty(actualCostAppliancesDelivery);
            this.actualDifferenceAppliancesDelivery = new SimpleStringProperty(actualDifferenceAppliancesDelivery);
            this.paidAppliancesDelivery = new SimpleStringProperty(paidAppliancesDelivery);
            this.residueAppliancesDelivery = new SimpleStringProperty(residueAppliancesDelivery);
            this.dateOfDeliveryAppliancesDelivery = new SimpleStringProperty(dateOfDeliveryAppliancesDelivery);
            this.plannedCPAppliancesDelivery = new SimpleStringProperty(plannedCPAppliancesDelivery);
            this.actualCPAppliancesDelivery = new SimpleStringProperty(actualCPAppliancesDelivery);
            this.accountAppliancesDelivery = new SimpleStringProperty(accountAppliancesDelivery);
            this.contactsAppliancesDelivery = new SimpleStringProperty(contactsAppliancesDelivery);
            this.notesAppliancesDelivery = new SimpleStringProperty(notesAppliancesDelivery);
            this.characteristicsAppliancesDelivery = new SimpleStringProperty(characteristicsAppliancesDelivery);
        }

        public String getNameAppliancesDelivery() {
            return nameAppliancesDelivery.get();
        }

        public SimpleStringProperty nameAppliancesDeliveryProperty() {
            return nameAppliancesDelivery;
        }

        public void setNameMaterialOther(String nameAppliancesKitchen) {
            this.nameAppliancesDelivery = new SimpleStringProperty(nameAppliancesKitchen);
        }

        public String getUnitAppliancesDelivery() {
            return unitAppliancesDelivery.get();
        }

        public SimpleStringProperty unitAppliancesDeliveryProperty() {
            return unitAppliancesDelivery;
        }

        public void setUnitAppliancesDelivery(String unitAppliancesDelivery) {
            this.unitAppliancesDelivery = new SimpleStringProperty(unitAppliancesDelivery);
        }

        public String getQuantityAppliancesDelivery() {
            return quantityAppliancesDelivery.get();
        }

        public SimpleStringProperty quantityAppliancesDeliveryProperty() {
            return quantityAppliancesDelivery;
        }

        public void setQuantityAppliancesDelivery(String quantityAppliancesDelivery) {
            this.quantityAppliancesDelivery = new SimpleStringProperty(quantityAppliancesDelivery);
        }

        public String getOrdinalPriceUnitAppliancesDelivery() {
            return ordinalPriceUnitAppliancesDelivery.get();
        }

        public SimpleStringProperty ordinalPriceUnitAppliancesDeliveryProperty() {
            return ordinalPriceUnitAppliancesDelivery;
        }

        public void setOrdinalPriceUnitAppliancesDelivery(String ordinalPriceUnitAppliancesDelivery) {
            this.ordinalPriceUnitAppliancesDelivery = new SimpleStringProperty(ordinalPriceUnitAppliancesDelivery);
        }

        public String getPriceCPUnitAppliancesDelivery() {
            return priceCPUnitAppliancesDelivery.get();
        }

        public SimpleStringProperty priceCPUnitAppliancesDeliveryProperty() {
            return priceCPUnitAppliancesDelivery;
        }

        public void setPriceCPUnitAppliancesDelivery(String priceCPUnitAppliancesDelivery) {
            this.priceCPUnitAppliancesDelivery = new SimpleStringProperty(priceCPUnitAppliancesDelivery);
        }

        public String getPriceCPKeyAppliancesDelivery() {
            return priceCPKeyAppliancesDelivery.get();
        }

        public SimpleStringProperty priceCPKeyAppliancesDeliveryProperty() {
            return priceCPKeyAppliancesDelivery;
        }

        public void setPriceCPKeyAppliancesDelivery(String priceCPKeyAppliancesDelivery) {
            this.priceCPKeyAppliancesDelivery = new SimpleStringProperty(priceCPKeyAppliancesDelivery);
        }

        public String getCostCPUnitAppliancesDelivery() {
            return costCPUnitAppliancesDelivery.get();
        }

        public SimpleStringProperty costCPUnitAppliancesDeliveryProperty() {
            return costCPUnitAppliancesDelivery;
        }

        public void setCostCPUnitAppliancesDelivery(String costCPUnitAppliancesDelivery) {
            this.costCPUnitAppliancesDelivery = new SimpleStringProperty(costCPUnitAppliancesDelivery);
        }

        public String getPriceOrderAppliancesDelivery() {
            return priceOrderAppliancesDelivery.get();
        }

        public SimpleStringProperty priceOrderAppliancesDeliveryProperty() {
            return priceOrderAppliancesDelivery;
        }

        public void setPriceOrderAppliancesDelivery(String priceOrderAppliancesDelivery) {
            this.priceOrderAppliancesDelivery = new SimpleStringProperty(priceOrderAppliancesDelivery);
        }

        public String getCostCPAppliancesDelivery() {
            return costCPAppliancesDelivery.get();
        }

        public SimpleStringProperty costCPAppliancesDeliveryProperty() {
            return costCPAppliancesDelivery;
        }

        public void setCostCPAppliancesDelivery(String costCPAppliancesDelivery) {
            this.costCPAppliancesDelivery = new SimpleStringProperty(costCPAppliancesDelivery);
        }

        public String getProductionTimeAppliancesDelivery() {
            return productionTimeAppliancesDelivery.get();
        }

        public SimpleStringProperty productionTimeAppliancesDeliveryProperty() {
            return productionTimeAppliancesDelivery;
        }

        public void setProductionTimeAppliancesDelivery(String productionTimeAppliancesDelivery) {
            this.productionTimeAppliancesDelivery = new SimpleStringProperty(productionTimeAppliancesDelivery);
        }

        public String getActualCostAppliancesDelivery() {
            return actualCostAppliancesDelivery.get();
        }

        public SimpleStringProperty actualCostAppliancesDeliveryProperty() {
            return actualCostAppliancesDelivery;
        }

        public void setActualCostAppliancesDelivery(String actualCostAppliancesDelivery) {
            this.actualCostAppliancesDelivery = new SimpleStringProperty(actualCostAppliancesDelivery);
        }

        public String getActualDifferenceAppliancesDelivery() {
            return actualDifferenceAppliancesDelivery.get();
        }

        public SimpleStringProperty actualDifferenceAppliancesDeliveryProperty() {
            return actualDifferenceAppliancesDelivery;
        }

        public void setActualDifferenceAppliancesDelivery(String actualDifferenceAppliancesDelivery) {
            this.actualDifferenceAppliancesDelivery = new SimpleStringProperty(actualDifferenceAppliancesDelivery);
        }

        public String getPaidAppliancesDelivery() {
            return paidAppliancesDelivery.get();
        }

        public SimpleStringProperty paidAppliancesDeliveryProperty() {
            return paidAppliancesDelivery;
        }

        public void setPaidAppliancesDelivery(String paidAppliancesDelivery) {
            this.paidAppliancesDelivery = new SimpleStringProperty(paidAppliancesDelivery);
        }

        public String getResidueAppliancesDelivery() {
            return residueAppliancesDelivery.get();
        }

        public SimpleStringProperty residueAppliancesDeliveryProperty() {
            return residueAppliancesDelivery;
        }

        public void setResidueAppliancesDelivery(String residueAppliancesDelivery) {
            this.residueAppliancesDelivery = new SimpleStringProperty(residueAppliancesDelivery);
        }

        public String getDateOfDeliveryAppliancesDelivery() {
            return dateOfDeliveryAppliancesDelivery.get();
        }

        public SimpleStringProperty dateOfDeliveryAppliancesDeliveryProperty() {
            return dateOfDeliveryAppliancesDelivery;
        }

        public void setDateOfDeliveryAppliancesDelivery(String dateOfDeliveryAppliancesDelivery) {
            this.dateOfDeliveryAppliancesDelivery = new SimpleStringProperty(dateOfDeliveryAppliancesDelivery);
        }

        public String getPlannedCPAppliancesDelivery() {
            return plannedCPAppliancesDelivery.get();
        }

        public SimpleStringProperty plannedCPAppliancesDeliveryProperty() {
            return plannedCPAppliancesDelivery;
        }

        public void setPlannedCPAppliancesDelivery(String plannedCPAppliancesDelivery) {
            this.plannedCPAppliancesDelivery = new SimpleStringProperty(plannedCPAppliancesDelivery);
        }

        public String getActualCPAppliancesDelivery() {
            return actualCPAppliancesDelivery.get();
        }

        public SimpleStringProperty actualCPAppliancesDeliveryProperty() {
            return actualCPAppliancesDelivery;
        }

        public void setActualCPAppliancesDelivery(String actualCPAppliancesDelivery) {
            this.actualCPAppliancesDelivery = new SimpleStringProperty(actualCPAppliancesDelivery);
        }

        public String getAccountAppliancesDelivery() {
            return accountAppliancesDelivery.get();
        }

        public SimpleStringProperty accountAppliancesDeliveryProperty() {
            return accountAppliancesDelivery;
        }

        public void setAccountAppliancesDelivery(String accountAppliancesDelivery) {
            this.accountAppliancesDelivery = new SimpleStringProperty(accountAppliancesDelivery);
        }

        public String getContactsAppliancesDelivery() {
            return contactsAppliancesDelivery.get();
        }

        public SimpleStringProperty contactsAppliancesDeliveryProperty() {
            return contactsAppliancesDelivery;
        }

        public void setContactsAppliancesDelivery(String contactsAppliancesDelivery) {
            this.contactsAppliancesDelivery = new SimpleStringProperty(contactsAppliancesDelivery);
        }

        public String getNotesAppliancesDelivery() {
            return notesAppliancesDelivery.get();
        }

        public SimpleStringProperty notesAppliancesDeliveryProperty() {
            return notesAppliancesDelivery;
        }

        public void setNotesAppliancesDelivery(String notesAppliancesDelivery) {
            this.notesAppliancesDelivery = new SimpleStringProperty(notesAppliancesDelivery);
        }

        public String getCharacteristicsAppliancesDelivery() {
            return characteristicsAppliancesDelivery.get();
        }

        public SimpleStringProperty characteristicsAppliancesDeliveryProperty() {
            return characteristicsAppliancesDelivery;
        }

        public void setCharacteristicsAppliancesDelivery(String characteristicsAppliancesDelivery) {
            this.characteristicsAppliancesDelivery = new SimpleStringProperty(characteristicsAppliancesDelivery);
        }
}
