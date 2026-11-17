package SystemEducation;

import java.sql.Time;
import java.time.Duration;

public class Tests extends Material{
   private int difficulty;

    public Tests(String name, String description, Duration duration, int difficulty){
        super(name, description, duration);
        this.difficulty = difficulty;
    }

    public int getDifficulty(){
        return difficulty;
    }

    @Override
    public void printMaterialInfo(){
        System.out.println("Тест на тему - " + getName() + "\n Сложность " + difficulty + "\n Описание - " + getDescription() + "\n Длительность - " + getDuration());
    }
}
