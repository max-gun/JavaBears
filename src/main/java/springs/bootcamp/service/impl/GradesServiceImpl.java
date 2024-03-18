package springs.bootcamp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.bootcamp.dao.StudentRepository;
import springs.bootcamp.model.dto.SubjectStatistics;
import springs.bootcamp.model.entities.Grades;
import springs.bootcamp.service.GradesService;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class GradesServiceImpl implements GradesService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<String> getAllSubjects() {
        return fetchAllSubjects();
    }

    @Override
    public SubjectStatistics getSubjectStatistics(String subjectName) {
        String fixedSubjectName = subjectName + "Grade";
        //List<Object[]> gradesInSubject = studentRepository.getGradesInSubject(fixedSubjectName);
        //System.out.println("Bazinga!");
        Map<String, Integer> gradesInSubject = new HashMap<>();//studentRepository.getGradesInSubject(fixedSubjectName);
        gradesInSubject.put("Alexey",50);
        gradesInSubject.put("Denis",100);
        gradesInSubject.put("Raz",110);


        //Set<Object> grades = gradesInSubject.stream().map(arr -> (Integer)arr[1]).collect(Collectors.toSet());
        Integer sum = 0;
        //System.out.println(grades);
        for (Integer grade : gradesInSubject.values()) {
            sum += grade;
        }

        Double avg = (double) sum / gradesInSubject.values().size();

        SubjectStatistics subjectStatistics = new SubjectStatistics(avg, gradesInSubject);

        return subjectStatistics;
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
