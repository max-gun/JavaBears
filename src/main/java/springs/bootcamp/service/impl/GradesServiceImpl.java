package springs.bootcamp.service.impl;

import org.springframework.stereotype.Service;
import springs.bootcamp.model.entities.Grades;
import springs.bootcamp.service.GradesService;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Service
public class GradesServiceImpl implements GradesService {
    @Override
    public List<String> getAllSubjects() {
        return fetchAllSubjects();
    }

    private List<String> fetchAllSubjects() {
        Grades grades = new Grades();
        Field[] fields = grades.getClass().getDeclaredFields();

        List<String> subjects = new ArrayList<>();

        for (Field field : fields) {
            if (!field.getName().equals("gradesId")) {
                String subject = field.getName().split("Grade")[0];
                subjects.add(subject);
            }
        }

        return subjects;
    }
}
