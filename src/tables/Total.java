package tables;

public class Total {
    protected String categoryNameTotal;
    protected double priceOrderTotal;
    protected double plannedCostTotal;
    protected double actualCostTotal;
    protected double differenceTotal;
    protected double paidTotal;
    protected double residueTotal;


    public Total(String categoryNameTotal, double priceOrderTotal, double plannedCostTotal, double actualCostTotal, double differenceTotal, double paidTotal, double residueTotal) {
        this.categoryNameTotal = categoryNameTotal;
        this.priceOrderTotal = priceOrderTotal;
        this.plannedCostTotal = plannedCostTotal;
        this.actualCostTotal = actualCostTotal;
        this.differenceTotal = differenceTotal;
        this.paidTotal = paidTotal;
        this.residueTotal = residueTotal;
    }

    public String getCategoryNameTotal() {
        return categoryNameTotal;
    }

    public void setCategoryNameTotal(String categoryNameTotal) {
        this.categoryNameTotal = categoryNameTotal;
    }

    public double getPriceOrderTotal() {
        return priceOrderTotal;
    }

    public void setPriceOrderTotal(double priceOrderTotal) {
        this.priceOrderTotal = priceOrderTotal;
    }
    public void setPriceOrderTotal(String priceOrderTotal) {
        this.priceOrderTotal = Double.parseDouble(priceOrderTotal);
    }

    public double getPlannedCostTotal() {
        return plannedCostTotal;
    }

    public void setPlannedCostTotal(double plannedCostTotal) {
        this.plannedCostTotal = plannedCostTotal;
    }
    public void setPlannedCostTotal(String plannedCostTotal) {
        this.plannedCostTotal = Double.parseDouble(plannedCostTotal);
    }

    public double getActualCostTotal() {
        return actualCostTotal;
    }

    public void setActualCostTotal(double actualCostTotal) {
        this.actualCostTotal = actualCostTotal;
    }
    public void setActualCostTotal(String actualCostTotal) {
        this.actualCostTotal = Double.parseDouble(actualCostTotal);
    }

    public double getDifferenceTotal() {
        return differenceTotal;
    }

    public void setDifferenceTotal(double differenceTotal) {
        this.differenceTotal = differenceTotal;
    }
    public void setDifferenceTotal(String differenceTotal) {
        this.differenceTotal = Double.parseDouble(differenceTotal);
    }

    public double getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(double paidTotal) {
        this.paidTotal = paidTotal;
    }
    public void setPaidTotal(String paidTotal) {
        this.paidTotal = Double.parseDouble(paidTotal);
    }

    public double getResidueTotal() {
        return residueTotal;
    }

    public void setResidueTotal(double residueTotal) {
        this.residueTotal = residueTotal;
    }
    public void setResidueTotal(String residueTotal) {
        this.residueTotal = Double.parseDouble(residueTotal);
    }
}
