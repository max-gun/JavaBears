package Springfields;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springfields")
public class SpringfieldsRunner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringfieldsRunner.class);
        SchoolManagementSystem johnBryce = context.getBean(SchoolManagementSystem.class);
        johnBryce.check();
        johnBryce.getCoffeeBar().check();
        System.out.println(johnBryce.getStudentNames());
        System.out.println(johnBryce.getProfessorsNames());
    }
}
