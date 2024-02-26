package structs.linkedlist;


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

        linkedList.mergeSort();
        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());
        System.out.println("########################");
    }
}
