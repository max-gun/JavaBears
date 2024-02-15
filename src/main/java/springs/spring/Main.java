package springs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springs.spring.components.HelloWorld;
import springs.spring.components.Kennel;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Kennel kennel = context.getBean(Kennel.class);

        System.out.println("Haski bark: " + kennel.getHaski().bark());
        System.out.println("Dalmatian bark: " + kennel.getDalmatian().bark());

        HelloWorld hw = context.getBean(HelloWorld.class);
        System.out.println(hw.getName());
        System.out.println(hw.getAge());
        System.out.println("########################");

        Bone bone = context.getBean(Bone.class);
        bone.setShape("long");
        bone.printShape();

        Bone anotherBone = (Bone) context.getBean("kosta");
        anotherBone.printShape();

        Bone yetAnotherBone = (Bone) context.getBean("etzem");
        yetAnotherBone.printShape();
    }
}
