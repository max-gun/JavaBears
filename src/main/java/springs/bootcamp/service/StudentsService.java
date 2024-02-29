package springs.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.bootcamp.dao.StudentRepository;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentRepository studentRepository;
    private List<String> names = List.of("Karina","Raz","Another Raz","Gideon",
            "Alexey","Olga","Max","Marina","Ismail", "Denis");

    public StudentsService() {
        System.out.println("Service Created");
    }
    public Integer getCountStudents() {
        return names.size();
    }

    public Boolean isExist(String name) {
        return names.contains(name);
    }
}
