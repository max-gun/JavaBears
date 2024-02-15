package springs.bootcamp.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    private List<String> names = List.of("Karina","Raz","Another Raz","Gideon",
            "Alexey","Olga","Max","Marina","Ismail", "Denis");

    public StudentsService() {
        System.out.println("Service Created");
    }
    public Integer getCountStudents() {
        return names.size();
    }
}
