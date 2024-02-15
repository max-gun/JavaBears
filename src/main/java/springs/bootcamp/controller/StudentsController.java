package springs.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springs.bootcamp.service.StudentsService;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    StudentsService studentsService;

    public Integer isStudentExist(String name){

    }

    @RequestMapping("/countStudents")
    public Integer getCountStudents(){
        return studentsService.getCountStudents();
    }

    @RequestMapping("/schoolName")
    public String getSchoolName(){
        return "Gimnasia";
    }

    @RequestMapping("/studentsNames")
    public List<String> getStudentsNames(){
        return List.of("Gideon","Raz","Olga");
    }
}
