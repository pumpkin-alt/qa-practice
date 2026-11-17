package Payment;

import java.math.BigDecimal;

public class Payment {
    public static void main(String[] args) {

        PayPal user1 = new PayPal("PayPal", "user1@mail.ru");
        MasterCard user2 = new MasterCard("MasterCard", 300023202);

        PaymentInfo[] paymentInfos = new PaymentInfo[] {user1, user2};

        for (int i = 0; i < paymentInfos.length; i++){
            paymentInfos[i].paymentInfo(new BigDecimal(100));
            paymentInfos[i].paymentInfo(new BigDecimal(200));

        }


    }
}
