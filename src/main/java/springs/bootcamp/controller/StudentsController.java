package springs.bootcamp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    @RequestMapping("/countStudents")
    public Integer countStudents() {
        System.out.println("Starting count students");
        return 25;
    }
}
