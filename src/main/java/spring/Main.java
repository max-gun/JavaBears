package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.components.Dalmatian;
import spring.components.Haski;
import spring.components.HelloWorld;
import spring.components.Kennel;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Kennel kennel = context.getBean(Kennel.class);

        System.out.println("Haski bark: " + kennel.getHaski().bark());
        System.out.println("Dalmatian bark: " + kennel.getDalmatian().bark());

        HelloWorld hw = context.getBean(HelloWorld.class);
        System.out.println(hw.getName());
    }
}
