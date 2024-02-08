package spring.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    public void sayHello() {
        System.out.println("Hello, World!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
