package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.components.Dalmatian;
import spring.components.HelloWorld;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.sayHello();

        Dog rexi = context.getBean(Dalmatian.class);
        rexi.setDogId(112);
        System.out.println("dog id: " + rexi.getDogId());

        Dog max = context.getBean(Dalmatian.class);
        System.out.println("dog id: " + max.getDogId());
    }
}
