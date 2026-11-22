package strategypractic.Sale;

public class StrategyNoDiscount implements Discount {
    public double discountedPrice(double price) {
        return price;
    }
}
