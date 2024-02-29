package springs.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.bootcamp.dao.StudentRepository;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentsService() {
        System.out.println("Service Created");
    }
    public Long getCountStudents() {
        return studentRepository.count();
    }

    public Boolean isExist(Long studentId) {
        return studentRepository.existsById(studentId);
    }
}
