package AutoHolder;

import SystemEducation.SystemEducation;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {


        Gazel gaz1 = new Gazel(new BigDecimal(12000), LocalDateTime.of(2000, 12, 12, 12, 12), "gazel", "Gaz 222");

        Sedan vaz1 = new Sedan(new BigDecimal(12000), LocalDateTime.of(2000, 12, 12, 12, 12), "sedan", "ВАЗ 2107", 80);
        Sedan vaz2 = new Sedan(new BigDecimal(12000), LocalDateTime.of(2000, 12, 12, 12, 12), "sedan", "ВАЗ 2115", 60);

        Gazel gaz2 = new Gazel(new BigDecimal(12000), LocalDateTime.of(2000, 12, 12, 12, 12), "gazel", "Gaz 2232");

        List<Auto> autos = new ArrayList();
        autos.add(gaz1);
        autos.add(gaz2);
        autos.add(vaz1);
       Garage garage = new Garage(autos);
//
        AutoService autoService = new AutoService(garage.getAutos());

//        System.out.println("Количество авто - " + autoService.countAllAuto());
//        System.out.println("Количесвто авто модели sedan " + autoService.countAutoOneModel("sedan"));

//        vaz1.printAllInfo();



//        System.out.println(autoService.getPriceAllAuto());
//        System.out.println(autoService.getPriceOneModelAuto("sedan"));
//
        autoService.printCountModelsAutos();
        SystemEducation t1 = new SystemEducation(new ArrayList<>());




    }
}

