package Springfields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SchoolManagementSystem {

    @Autowired
    private CoffeeBar coffeeBar;

    @Autowired
    private List<String> studentNames;

    @Autowired
    private List<String> professorsNames;

    public List<String> getProfessorsNames() {
        return professorsNames;
    }

    public void setProfessorsNames(List<String> professorsNames) {
        this.professorsNames = professorsNames;
    }

    public CoffeeBar getCoffeeBar() {
        return coffeeBar;
    }

    public void setCoffeeBar(CoffeeBar coffeeBar) {
        this.coffeeBar = coffeeBar;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }

    public void check(){
        System.out.println("Bazinga!");
    }
}
