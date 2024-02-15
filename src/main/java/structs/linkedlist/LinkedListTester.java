package structs.linkedlist;

import static structs.linkedlist.LinkedList.merge;

public class LinkedListTester {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Denis");
        linkedList.add("Gideon");
        linkedList.add("Max");
        linkedList.add("Doron");
        linkedList.add("Karina");
        linkedList.add("Raz");

        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());
        System.out.println("########################");

        LinkedList resultList = linkedList.subList(0,4);
        System.out.println(resultList);
        System.out.println("Size: " + resultList.size());
        System.out.println("########################");
    }
}
