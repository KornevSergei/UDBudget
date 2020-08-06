package sample;

public class Statistic {
    public String nameCategory;
    public double totalCost;
    public double costSGM;
    public boolean activeStatistic;


    public Statistic(String nameCategory, double totalCost, double costSGM, boolean activeStatistic) {
        this.nameCategory = nameCategory;
        this.totalCost = totalCost;
        this.costSGM = costSGM;
        this.activeStatistic = activeStatistic;
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

    public boolean getActiveStatistic() {
        return activeStatistic;
    }

    public void setActiveStatistic(boolean activeStatistic) {
        this.activeStatistic = activeStatistic;
    }

    public void setActiveStatistic(String activeStatistic) {
        this.activeStatistic = Boolean.parseBoolean(activeStatistic);
    }
}
