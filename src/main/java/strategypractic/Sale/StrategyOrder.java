package strategypractic.Sale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
public class StrategyOrder {
    @Setter
    private Discount discounts;

    public void executeStrategy(double price) {
       double finishPrice = this.discounts.discountedPrice(price);
        System.out.println("Итоговая сумма - " + finishPrice);
    }

}
