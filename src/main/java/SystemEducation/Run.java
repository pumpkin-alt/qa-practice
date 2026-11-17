package SystemEducation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        VideoLesson lesson1 = new VideoLesson("Вводный урок мира", "Разговоры о важном будет интересно", Duration.parse("PT3H4M"));
        VideoLesson lesson2 = new VideoLesson("Вводный урок воды", "Разговоры о важном будет интересно", Duration.parse("PT1H14M"));
        VideoLesson lesson3 = new VideoLesson("Вводный урок тараканов", "Разговоры о важном будет интересно", Duration.parse("PT2H4M"));

        List<Material> materials = new ArrayList<>();

        materials.add(lesson1);
        materials.add(lesson2);
        materials.add(lesson3);

        CourseOfMaterils lessons = new CourseOfMaterils(materials);
        SystemEducation systemEducations = new SystemEducation(lessons.getCourse());

        System.out.println(systemEducations.totalDuration().toHours());
    }

}
