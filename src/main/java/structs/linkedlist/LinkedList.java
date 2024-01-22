package structs.linkedlist;

public class LinkedList {

    LinkedListNode head;

    public LinkedList() {
    }

    public void linearAdd(String data) {
        LinkedListNode newNode = new LinkedListNode(data);

        if (head == null){
            head = newNode;
        }
        else {
            LinkedListNode iterator = head;
            while (iterator.getNext() != null) {
                iterator = iterator.getNext();
            }
            iterator.setNext(newNode);
        }
    }

    public void add(String data) {
        if (head == null) {
            head = new LinkedListNode(data);
        }
        else {
            head.addToTail(data);
        }
    }

    public int lenearSize() {
        LinkedListNode iterator = head;
        int count = 1;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
            count++;
        }
        return count;
    }

    public int size() {
        return head == null ? 0 : head.countToTail();
    }

    public void add(String data, int idx) {
        int size = size();
        if (size == 0 || idx >= size){
            add(data);
        }
        else {
            LinkedListNode newNode = new LinkedListNode(data);
            if (idx == 0) {
                newNode.setNext(head);
                head = newNode;
            } else {
                LinkedListNode prevNode = getNode(idx - 1);
                newNode.setNext(prevNode.getNext());
                prevNode.setNext(newNode);
            }
        }
    }

    private LinkedListNode getNodeLinear(int idx) {
        LinkedListNode iterator = head;
        int lastNodeIdx = size() -1;
        for (int i = 0; i < idx && i < lastNodeIdx; i++) {
            iterator = iterator.getNext();
        }
        return iterator;
    }

    private LinkedListNode getNode(int idx) {
        return head.getIndexedNode(idx);
    }

    public void remove(int idx) {
        pull(idx);
    }

    public LinkedListNode pull(int idx) {
        LinkedListNode pulledNode = null;

        if (idx >= 0 && idx < size()) {
            if (idx == 0) {
                pulledNode = head;
                head = head.getNext();
            }
            else {
                LinkedListNode prevNode = getNode(idx - 1);
                pulledNode = prevNode.getNext();
                prevNode.setNext(prevNode.getNext().getNext());
            }

            pulledNode.setNext(null);
        }

        return pulledNode;
    }

    public String linearPrint() {
        String result = "{";

        if (head != null) {
            LinkedListNode iterator = head;
            while (iterator.getNext() != null) {
                result += iterator;
                iterator = iterator.getNext();
            }
            result += iterator;
        }

        result += "||}";
        return result;
    }

    public String print() {
        return "{" + (head == null ? "||}" : head.print());
    }

    @Override
    public String toString() {
        return print();
    }
}
