package structs.linkedlist;

import java.util.Objects;

public class LinkedListNode {

    String data;
    LinkedListNode next;

    public LinkedListNode(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public void addToTail(String data) {
        if (next == null) {
            next = new LinkedListNode(data);
        }
        else {
            next.addToTail(data);
        }
    }

    public int countToTail() {
        return 1 + (next == null ? 0 : next.countToTail());
    }

    public LinkedListNode getIndexedNode(int idx) {
        if (idx == 0 || next == null)
            return this;
        return next.getIndexedNode(idx - 1);
    }

    public void reversePrint() {
        if (next != null) {
            next.reversePrint();
        }
        System.out.print(data + " ");
    }

    public String print() {
        if (next == null) {
            return this + "||}";
        }
        return this + next.print();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedListNode that = (LinkedListNode) o;
        return Objects.equals(data, that.data) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "[" + data + "]->";
    }
}
