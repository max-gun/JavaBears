package structs.linkedlist;

import static structs.linkedlist.LinkedList.merge;

public class LinkedListTester {

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add("Denis");
        linkedList1.add("Gideon");
        linkedList1.add("Max");

        LinkedList linkedList2 = new LinkedList();
        linkedList2.add("Doron");
        linkedList2.add("Karina");
        linkedList2.add("Raz");

        System.out.println(linkedList1);
        System.out.println("Size: " + linkedList1.size());
        System.out.println("########################");
        System.out.println(linkedList2);
        System.out.println("Size: " + linkedList2.size());
        System.out.println("########################");

        LinkedList resultList = merge(linkedList1, linkedList2);
        System.out.println(resultList);
        System.out.println("Size: " + resultList.size());
        System.out.println("########################");

    }
}
