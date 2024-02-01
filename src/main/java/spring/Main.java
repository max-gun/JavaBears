package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.components.Dalmatian;
import spring.components.Haski;
import spring.components.HelloWorld;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.sayHello();

        Dog rexi = context.getBean(Dalmatian.class);
        Dog max = context.getBean(Haski.class);

        System.out.println(rexi.bark());
        System.out.println(max.bark());
    }
}
