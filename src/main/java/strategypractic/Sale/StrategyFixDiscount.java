package strategypractic.Sale;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StrategyFixDiscount implements Discount {
    private double discount;

    public double discountedPrice(double price){
        double discountedPrice = price - discount;
        if(discountedPrice == 0 || discountedPrice < 0) {
            return 0;
        }
        return discountedPrice;
    }

}
