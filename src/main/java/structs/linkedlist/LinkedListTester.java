package structs.linkedlist;

public class LinkedListTester {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //System.out.println("Size: " + linkedList.size());

        linkedList.add("Max");
        linkedList.add("Denis");
        linkedList.add("Gideon");
        linkedList.add("Raz");
        linkedList.add("Doron");


        //System.out.println(linkedList);
        //System.out.println("Size: " + linkedList.size());
        //System.out.println("=====================");

        linkedList.add("Karina", 10);
        //System.out.println(linkedList);
        //System.out.println("Size: " + linkedList.size());
        //System.out.println("=====================");

        /*
        System.out.println(linkedList.pullNode(0));
        System.out.println(linkedList.pullNode(10));
        System.out.println(linkedList.pullNode(4));
        System.out.println(linkedList.pullNode(1));
        System.out.println(linkedList.pullNode(1));
        System.out.println(linkedList.pullNode(0));
        System.out.println(linkedList.pullNode(0));
        System.out.println(linkedList.pullNode(0));
         */

        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());
        System.out.println("########################");
        linkedList.swapNodes(2,3);
        System.out.println("=====================");
        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());

        /*linkedList.remove(0);
        linkedList.remove(10);
        linkedList.remove(4);
        linkedList.remove(1);
        linkedList.remove(1);
        linkedList.remove(0);
        linkedList.remove(0);
        linkedList.remove(0);*/

        //linkedList.swap(2,4);

        //System.out.println(linkedList);
        //System.out.println("Size: " + linkedList.size());

        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());
        System.out.println("=====================");

        linkedList.sortWithComments();
        System.out.println(linkedList);
        System.out.println("Size: " + linkedList.size());
        System.out.println("=====================");
    }
}
