package SystemEducation;

import java.sql.Time;
import java.time.Duration;

public class VideoLesson extends Material{

    boolean isWatch;

    public VideoLesson(String name, String description, Duration duration){
        super(name, description, duration);
        this.isWatch = true;
    }

    @Override
    public void printMaterialInfo(){
        System.out.println("Видео урок - " + getName() + "\n Описание - " + getDescription() + "\n Длительность - " + getDuration());
    }

}
