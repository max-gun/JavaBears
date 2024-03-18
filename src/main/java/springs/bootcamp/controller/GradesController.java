package springs.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springs.bootcamp.model.dto.SubjectStatistics;
import springs.bootcamp.service.GradesService;

import java.util.List;

@RestController
public class GradesController {

    @Autowired
    GradesService gradesService;

    @RequestMapping("/getAllSubjects")
    public List<String> getAllSubjects(){
        return gradesService.getAllSubjects();
    }

    @RequestMapping("/getSubjectStats/{subjectName}")
    public SubjectStatistics getSubjectStatistics(@PathVariable("subjectName") String subjectName) {
        return gradesService.getSubjectStatistics(subjectName);
    }
}
