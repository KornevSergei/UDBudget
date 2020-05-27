package sample;

public class AK {
    private double rateAK;
    private double termAK;
    private double costAK;

    public AK(double rateAK, double termAK, double costAK) {
        this.rateAK = rateAK;
        this.termAK = termAK;
        this.costAK = costAK;
    }

    public void Calc() {
        costAK = rateAK * termAK;
    }

    public String getRateAK() {
        return Double.toString(rateAK);
    }

    public void setRateAK(double rateAK) {
        this.rateAK = rateAK;
    }
    public void setRateAK(String rateAK) {
        this.rateAK = Double.parseDouble(rateAK);
        Calc();
    }

    public String getTermAK() {
        return Double.toString(termAK);
    }

    public void setTermAK(double termAK) {
        this.termAK = termAK;
    }
    public void setTermAK(String termAK) {
        this.termAK = Double.parseDouble(termAK);
        Calc();
    }

    public String getCostAK() {
        return Double.toString(costAK);
    }

    public void setCostAK(double costAK) {
        this.costAK = costAK;
    }
    public void setCostAK(String costAK) {
        this.costAK = Double.parseDouble(costAK);
    }
}
