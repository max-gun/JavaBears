package designpatterns.singleton;

import structs.linkedlist.LinkedList;

public class School {

    private static School THE_SCHOOL; // Eager!!
    LinkedList studentList = new LinkedList(); // on construction, before constructor commands!

    static {
        System.out.println("STATIC");
        THE_SCHOOL = new School(); // Eager!!
    }

    public static School getInstance() {
        /*if (THE_SCHOOL == null) { // Lazy!!
            THE_SCHOOL = new School();
        }*/
        return THE_SCHOOL;
    }

    private School(){
        System.out.println("This is a constructor!");
        studentList.add("Something");
    }
}
