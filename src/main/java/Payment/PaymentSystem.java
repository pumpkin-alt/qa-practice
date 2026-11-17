package Payment;

public abstract class PaymentSystem implements PaymentInfo {
    private String paymentType;
    private String paymentStatus;

    public PaymentSystem(String paymentType) {
        this.paymentType = paymentType;
        this.paymentStatus = "PENDING";
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus() {
        paymentStatus = "SUCCESS";
    }
}
