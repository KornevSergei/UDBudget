package sample;

public class Statistic {
    protected String nameCategory;
    protected double totalCost;
    protected double costSGM;


    public Statistic(String nameCategory, double totalCost, double costSGM) {
        this.nameCategory = nameCategory;
        this.totalCost = totalCost;
        this.costSGM = costSGM;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = Double.parseDouble(totalCost);
    }

    public double getCostSGM() {
        return costSGM;
    }

    public void setCostSGM(double costSGM) {
        this.costSGM = costSGM;
    }

    public void setCostSGM(String costSGM) {
        this.costSGM = Double.parseDouble(costSGM);
    }
}
