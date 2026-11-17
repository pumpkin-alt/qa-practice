package Proviant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Product potato = new Product(new BigDecimal(120), "Картошка");
        Product carrot = new Product(new BigDecimal(200), "Морковка");

        List<Product> products = new ArrayList<>();
        products.add(carrot);
        products.add(potato);

        Order n1 = new Order(12415253, products);

        n1.check();
    }
}
