package designpatterns.singleton;

import designpatterns.builder.AsianBowl;

public class SchoolTest {
    public static void main(String[] args) {

        School school = School.getInstance();

        //AsianBowl.AsianBowlBuilder bowl = AsianBowl.getBuilder();
        AsianBowl bowl = AsianBowl.getBuilder()
                .beef(true)
                .broccoli(true)
                .mushrooms(true)
                .squash(true)
                .build();



        String message = new StringBuilder()
                .append("Hello")
                .append(" ")
                .append("World")
                .append("!!!")
                .toString();
        System.out.println(message);
    }
}
