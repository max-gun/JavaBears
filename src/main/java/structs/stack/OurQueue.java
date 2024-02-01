package structs.stack;

import structs.linkedlist.LinkedList;
import structs.linkedlist.LinkedListNode;

import static java.util.Objects.nonNull;

public class OurQueue {

    LinkedList list;

    public OurQueue() {
        list = new LinkedList();
    }

    public void enqueue(String data) {
        list.add(data);
    }

    public String dequeue() {
        LinkedListNode node = list.pullNode(0);
        return nonNull(node) ? node.getData() : "";
    }

    public String peek() {
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void print() {
        System.out.println(list);
    }
}
