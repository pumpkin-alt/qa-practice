package AutoHolder;

import java.util.List;

public class Garage {
    private List<Auto> autos;

    public Garage(List<Auto> autos) {
        this.autos = autos;
    }

    public List<Auto> getAutos(){
        return autos;
    }


}
