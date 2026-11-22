package strategypractic.Sale;

public class Main {
    public static void main(String[] args) {

        StrategyOrder strategyOrder = new StrategyOrder();


        strategyOrder.setDiscounts(new StrategyFixDiscount(500));
        strategyOrder.executeStrategy(1000);


        strategyOrder.setDiscounts(new StrategyPercentDiscount(20));
        strategyOrder.executeStrategy(2000);

        strategyOrder.setDiscounts(new StrategyNoDiscount());
        strategyOrder.executeStrategy(2000);
    }
}
