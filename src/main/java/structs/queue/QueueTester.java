package structs.queue;

import structs.stack.OurQueue;

public class QueueTester {
    public static void main(String[] args) {
        OurStack stack = new OurStack();

        System.out.println("isEmpty? " + stack.isEmpty());

        stack.push("Max");
        stack.push("Alexey");
        stack.push("Moran");
        stack.push("Doron");

        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        stack.print();

        System.out.println("===============");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("size: " + stack.size());
        stack.print();
    }
}
