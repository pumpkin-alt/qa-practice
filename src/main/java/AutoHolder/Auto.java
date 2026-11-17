package AutoHolder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Auto {
    private BigDecimal price;
    private LocalDateTime releaseYear;
    private String model;
    private String name;

    public Auto(BigDecimal price, LocalDateTime releaseYear, String model, String name){
        this.model = model;
        this.name = name;
        this.price = price;
        this.releaseYear = releaseYear;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public LocalDateTime getReleaseYear(){
        return releaseYear;
    }

    public String getModel(){
        return model;
    }

    public String getName(){
        return name;
    }

    public void printAllInfo(){
        System.out.println("Модель авто: " + getModel() + "\n" + "Наименование авто: " + getName() + "\n" + "Год выпуска авто: " + getReleaseYear() + "\n" + "Стоимость авто: " + getPrice());
    }

//    public abstract void getPriceAllAuto();
//
//    public abstract BigDecimal getPriceOneModelAuto();
//
//    public abstract BigDecimal getPriceOneReleaseDateAuto();
//
//    public abstract int countAutoOneModel();
//
//    public abstract int countAutoOneReleaseDate();
//
//    public abstract int countAllAuto();

}
