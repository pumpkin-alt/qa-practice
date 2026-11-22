package strategypractic.Sale;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StrategyPercentDiscount implements Discount{

    private double discount;

    public double discountedPrice(double price){
        double discountedPrice =  (1 - (discount / 100)) * price;
        return discountedPrice;
    }
}
