package structs.stack;

import structs.linkedlist.LinkedList;
import structs.linkedlist.LinkedListNode;

import static java.util.Objects.nonNull;

public class OurStack {

    private LinkedList list;
    private static final int INSERTION_INDEX = 0;

    public OurStack() {
        list = new LinkedList();
    }

    public void push(String data) {
        list.add(data, INSERTION_INDEX);
    }

    public String pop() {
        LinkedListNode node = list.pullNode(INSERTION_INDEX);
        return nonNull(node) ? node.getData() : "";
    }

    public String peek() {
        return list.get(INSERTION_INDEX);
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
