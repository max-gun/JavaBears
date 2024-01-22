package structs.linkedlist;

public class LinkedListTester {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Size: " + linkedList.size());

        linkedList.add("Max");
        linkedList.add("Denis");
        linkedList.add("Gideon");
        linkedList.add("Raz");
        linkedList.add("Doron");


        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());
        System.out.println("=====================");

        linkedList.add("Karina", 10);
        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());
        System.out.println("=====================");

        System.out.println(linkedList.pull(0));
        System.out.println(linkedList.pull(10));
        System.out.println(linkedList.pull(4));
        System.out.println(linkedList.pull(1));
        System.out.println(linkedList.pull(1));
        System.out.println(linkedList.pull(0));
        System.out.println(linkedList.pull(0));
        System.out.println(linkedList.pull(0));

        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());
    }
}
