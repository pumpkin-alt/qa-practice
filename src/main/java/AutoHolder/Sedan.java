package AutoHolder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Sedan extends Auto {

    private double maxSpeed;

    public Sedan(BigDecimal price, LocalDateTime releaseYear, String model, String name, double maxSpeed) {
        super(price, releaseYear, model, name);
        this.maxSpeed = maxSpeed;
    }

    public void getPriceAllAuto(){
        System.out.println(getPrice());
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }


}
