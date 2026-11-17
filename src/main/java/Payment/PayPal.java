package Payment;

import java.math.BigDecimal;

public class PayPal extends PaymentSystem {
    private String email;

    public PayPal(String paymentType, String email) {
        super(paymentType);
        this.email = email;
    }

    @Override
    public void paymentInfo(BigDecimal paymentSum) {
        System.out.println("Перевод " + paymentSum + " на PayPal: " + getEmail());
        setPaymentStatus();
    }

    public String getEmail() {
        return email;
    }

}
