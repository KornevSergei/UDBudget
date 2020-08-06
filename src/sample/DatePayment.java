package sample;

public class DatePayment {
    public String dateDatePayment;
    public double paymentDatePayment;

    public DatePayment(String dateDatePayment, double paymentDatePayment) {
        this.dateDatePayment = dateDatePayment;
        this.paymentDatePayment = paymentDatePayment;
    }

    public String getDateDatePayment() {
        return dateDatePayment;
    }

    public void setDateDatePayment(String dateDatePayment) {
        this.dateDatePayment = dateDatePayment;
    }

    public String getPaymentDatePayment() {
        return Double.toString(paymentDatePayment);
    }

    public void setPaymentDatePayment(double paymentDatePayment) {
        this.paymentDatePayment = paymentDatePayment;
    }

    public void setPaymentDatePayment(String paymentDatePayment) {
        this.paymentDatePayment = Double.parseDouble(paymentDatePayment);
    }
}
