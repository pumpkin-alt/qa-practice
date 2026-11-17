package Payment;

import java.math.BigDecimal;

public class MasterCard extends PaymentSystem {
    private int numberCard;

    public MasterCard(String paymentType, int numberCard) {
        super(paymentType);
        this.numberCard = numberCard;
    }

    public int getnumberCard() {
        return numberCard;
    }

    @Override
    public void paymentInfo(BigDecimal paymentSum) {
        System.out.println("Списано " + paymentSum + " с карты " + getnumberCard());
        setPaymentStatus();
    }
}
