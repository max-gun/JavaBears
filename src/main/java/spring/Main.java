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

        System.out.println("Dalmatian:");
        Dog rexi = context.getBean(Dalmatian.class);
        rexi.setDogId(112);
        System.out.println("dog id: " + rexi.getDogId());

        Dog max = context.getBean(Dalmatian.class);
        System.out.println("dog id: " + max.getDogId());

        System.out.println("\nHaski:");
        Dog alexey = context.getBean(Haski.class);
        alexey.setDogId(207);
        System.out.println("dog id: " + alexey.getDogId());

        Dog raz = context.getBean(Haski.class);
        System.out.println("dog id: " + raz.getDogId());
    }
}
