package springs.bootcamp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.bootcamp.dao.StudentRepository;
import springs.bootcamp.model.Grades;
import springs.bootcamp.model.Student;
import springs.bootcamp.service.StudentsService;

import java.util.List;


@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentsServiceImpl() {
        System.out.println("Service Created");
    }

    @Override
    public Long getCountStudents() {
        return studentRepository.count();
    }

    @Override
    public Boolean isExist(Long studentId) {
        return studentRepository.existsById(studentId);
    }

    @Override
    public void registerStudent(String studentName, Integer math, Integer english, Integer cs) {
        Grades grades = new Grades(math, english, cs);
        Student student = new Student(studentName, grades);
        grades.setStudent(student);

        studentRepository.save(student);
    }

    @Override
    public void registerStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<String> getStudentsNames() {
        return studentRepository.findAllNames();
    }

    @Override
    public Student getStudent(String name) {
        return studentRepository.findByName(name);
    }
}
