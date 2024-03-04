package springs.bootcamp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.bootcamp.dao.StudentRepository;
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
    public void registerStudent(String studentName, Integer avg) {
        Student student = new Student(studentName, avg);
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
}
