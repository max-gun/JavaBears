package springs.bootcamp.service.impl;

import org.springframework.stereotype.Service;
import springs.bootcamp.model.entities.Grades;
import springs.bootcamp.service.GradesService;

import java.lang.reflect.Field;
import java.util.List;

@Service
public class GradesServiceImpl implements GradesService {
    @Override
    public List<String> getAllSubjects() {
        return List.of("Math", "English", "Computer Science");
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        Field[] fields = grades.getClass().getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
