package spring.components;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}
