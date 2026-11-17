package AutoHolder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AutoService {
    private List<Auto> autos;

    public AutoService(List<Auto> autos) {
        this.autos = autos;
    }

//    public BigDecimal getPriceAllAuto() {
//        BigDecimal priceAllAuto = new BigDecimal(0);
//        for (int i = 0; i < autos.size(); i++) {
//            priceAllAuto = priceAllAuto.add(autos[i].getPrice());
//        }
//        return priceAllAuto;
//    }

    public BigDecimal getPriceOneModelAuto(String model) {
        BigDecimal priceOneModelAuto = new BigDecimal(0);
        for (Auto name : autos){
            if(model.equals(name.getModel())){
                priceOneModelAuto = priceOneModelAuto.add(name.getPrice());
            }
        }
        return priceOneModelAuto;
    }

    public BigDecimal getPriceOneReleaseDateAuto(LocalDateTime releaseYear) {
        BigDecimal priceOneReleaseDateAuto = new BigDecimal(0);
        for(Auto name : autos){
            if(releaseYear.isEqual(name.getReleaseYear())){
                priceOneReleaseDateAuto = priceOneReleaseDateAuto.add(name.getPrice());
            }
        }
        return priceOneReleaseDateAuto;
    }

    public int countAllAuto() {
        int countAllAuto = 0;
        for (Auto name : autos) {
            countAllAuto++;
        }
        return countAllAuto;
    }

    public int countAutoOneModel(String model) {
        int countAutoOneModel = 0;
        for(Auto name : autos){
            if(model.equals(name.getModel())){
                countAutoOneModel++;
            }
        }
        return countAutoOneModel;
    }

    public int countAutoOneReleaseDate(LocalDateTime releaseYear) {
        int countAutoOneReleaseDate = 0;
        for(Auto name : autos){
            if(releaseYear.isEqual(name.getReleaseYear())){
                countAutoOneReleaseDate++;
            }
        }
        return countAutoOneReleaseDate;
    }

    public void printCountModelsAutos() {
        Set<String> noDublicateModel = new HashSet<>();
        for(Auto model : autos){
            noDublicateModel.add(model.getModel());
        }
        int countModelAuto = 0;
            for(String name1 : noDublicateModel){
                for(Auto name2 : autos){
                    if(name1.equals(name2.getModel())){
                        countModelAuto++;
                    }
            }
                System.out.println("Авто модели " + name1 + " - " + countModelAuto);
                countModelAuto = 0;
        }







//        int countModel = 0;
//        boolean isDublicate = false;
//        String[] dublicateModels = new String[autos.length];
//        for (int i = 0; i < autos.length; i++) {
//            for (int modelIndex = 0; modelIndex < dublicateModels.length; modelIndex++) {
//                if (dublicateModels[modelIndex] != null && dublicateModels[modelIndex].equals(autos[i].getModel())) {
//                    isDublicate = true;
//                }
//            }
//            for (int j = 0; j < autos.length; j++) {
//                if (isDublicate) {
//                    break;
//                }
//                if (autos[i].getModel().equals(autos[j].getModel())) {
//                    countModel++;
//                }
//            }
//            if (!isDublicate) {
//                System.out.println("Количество авто " + autos[i].getModel() + ": " + countModel);
//            }
//            countModel = 0;
//            dublicateModels[i] = autos[i].getModel();
//            isDublicate = false;
//        }


    }

}
