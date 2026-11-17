package SystemEducation;

import java.time.Duration;
import java.util.List;

public class SystemEducation {

    private List<Material> course;

    public SystemEducation(List<Material> course) {
        this.course = course;
    }


    public Duration totalDuration() {
        int countLessons = 0;
        Duration duration = Duration.ofSeconds(0);
        for (Material name : course) {
            countLessons++;
            duration = name.getDuration().plus(duration);
        }
        return duration;
    }


}
