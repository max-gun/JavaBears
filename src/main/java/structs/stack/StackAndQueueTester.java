package structs.stack;

public class StackAndQueueTester {

    public static void main(String[] args) {
        OurQueue queue = new OurQueue();

        System.out.println("isEmpty? " + queue.isEmpty());

        queue.enqueue("Max");
        queue.enqueue("Alexey");
        queue.enqueue("Moran");
        queue.enqueue("Doron");

        System.out.println("isEmpty? " + queue.isEmpty());
        System.out.println("size: " + queue.size());
        queue.print();

        System.out.println("===============");
        System.out.println("Peek: " + queue.peek());
        System.out.println("Pop: " + queue.dequeue());
        System.out.println("size: " + queue.size());
        queue.print();
    }
}
