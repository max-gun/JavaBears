package springs.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springs.bootcamp.model.dto.UpdateGradesSheetRequest;
import springs.bootcamp.model.entities.Grades;
import springs.bootcamp.model.entities.Student;
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

    @RequestMapping("/register/{studentName}/{math}/{eng}/{cs}")
    public void registerStudent(@PathVariable("studentName") String name,
                                @PathVariable("math") Integer math,
                                @PathVariable("eng") Integer eng,
                                @PathVariable("cs") Integer cs) {
        studentsService.registerStudent(name, math, eng, cs);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/register")
    public void registerStudentByPost(@RequestBody Student student){
        studentsService.registerStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/updateGradesSheet")
    public void updateGradesSheet(@RequestBody UpdateGradesSheetRequest updateGradesSheetRequest) {
        studentsService.updateGradesSheet(updateGradesSheetRequest);
    }

    @RequestMapping(value="/getstudent/{studentName}")
    public Student getStudent(@PathVariable("studentName") String name) {
        return studentsService.getStudent(name);
    }
}
