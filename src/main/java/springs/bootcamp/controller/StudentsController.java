package springs.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springs.bootcamp.service.StudentsService;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    StudentsService studentsService;

    @RequestMapping(value="/isRegistered/{studentId}")
    public Boolean isStudentExist(@PathVariable("studentId") Long studentId){
        return studentsService.isExist(studentId);
    }

    @RequestMapping("/countStudents")
    public Long getCountStudents(){
        return studentsService.getCountStudents();
    }

    @RequestMapping("/schoolName")
    public String getSchoolName(){
        return "Gimnasia";
    }

    @RequestMapping("/studentsNames")
    public List<String> getStudentsNames(){
        return studentsService.getStudentsNames();
    }

    @RequestMapping("/register/{studentName}/{studentAVG}")
    public void registerStudent(@PathVariable("studentName") String name, @PathVariable("studentAVG") Integer avg) {
        studentsService.registerStudent(name, avg);
    }
}
