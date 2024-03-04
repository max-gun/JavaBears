package springs.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springs.bootcamp.model.Student;
import springs.bootcamp.service.StudentsService;
import springs.bootcamp.service.impl.StudentsServiceImpl;

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

    @RequestMapping(method = RequestMethod.POST,value = "/register")
    public void registerStudentByPost(@RequestBody Student student){
        studentsService.registerStudent(student);
    }

    @RequestMapping(value="/getstudent/{studentName}")
    public Student getStudent(@PathVariable("studentName") String name) {
        return studentsService.getStudent(name);
    }
}
