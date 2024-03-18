package springs.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springs.bootcamp.service.GradesService;

import java.util.List;

@RestController
public class GradesController {

    @Autowired
    GradesService gradesService;

    @RequestMapping(value="/getAllSubjects")
    public List<String> getAllSubjects(){
        return gradesService.getAllSubjects();
    }
}
