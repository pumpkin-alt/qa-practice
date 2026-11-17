package SystemEducation;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;

public abstract class Material {
    private String name;
    private String description;
    private Duration duration;

    public Material(String name, String description, Duration duration){
        this.description = description;
        this.duration = duration;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Duration getDuration(){
        return duration;
    }

    public abstract void printMaterialInfo();

}
