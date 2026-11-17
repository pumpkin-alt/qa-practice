package Proviant;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private int id;
    private List<Product> products;
    private BigDecimal productSum;

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public BigDecimal calculateOrderSum() {
        productSum = new BigDecimal(0);
        for (Product product : products) {
            productSum = productSum.add(product.getPrice());
        }
        return productSum;
    }

    public void check(){
        System.out.println("Идентификатор покупки: " + id);
        for (Product product : products){

            System.out.println("Наименование: " + product.getName() + " цена: " + product.getPrice());
        }
        System.out.println("Сумма покупки: " + calculateOrderSum());
    }
}

