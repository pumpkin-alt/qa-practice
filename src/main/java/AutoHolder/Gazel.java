package AutoHolder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Gazel extends Auto{
    public Gazel (BigDecimal price, LocalDateTime releaseYear, String model, String name){
        super(price, releaseYear, model, name);
    }

}
