package structs.linkedlist;


import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.util.Objects.*;


/**
 * <b><i><u>Description:</u></i></b><br/>
 * <p>
 * A <b>linked list</b> class, contains nodes.
 * </p>
 * <p>
 *     This is another paragraph...
 * </p>
 *
 * @author Max Gun
 * @since 12.02.2024
 * @version 1.0.0
 */
public class LinkedList {

    LinkedListNode head;

    public LinkedList() {
        System.out.println("A linked list was created!!!");
    }

    /**
     *
     * @param leftList a sorted list
     * @param rightList another sorted list
     *
     * @return a sorted merged {@link structs.linkedlist}
     *
     * @exception NullPointerException
     */
    public static LinkedList merge(LinkedList leftList, LinkedList rightList) {
        if (isNull(leftList) || leftList.isEmpty())
            return rightList;

        if (isNull(rightList) || rightList.isEmpty())
            return leftList;

        LinkedList mergedList = new LinkedList();

        LinkedListNode leftListNode = leftList.pullNode(0);
        LinkedListNode rightListNode = rightList.pullNode(0);

        while (nonNull(leftListNode) && nonNull(rightListNode)) {
            if (leftListNode.getData().compareTo(rightListNode.getData()) > 0) {
                mergedList.add(rightListNode.getData());
                rightListNode = rightList.pullNode(0);
            }
            else {
                mergedList.add(leftListNode.getData());
                leftListNode = leftList.pullNode(0);
            }
        }
        mergedList.append(leftList.isEmpty() ? rightList : leftList);

        return mergedList;
    }

    public LinkedList subList(int from, int to) {
        LinkedList resultList = new LinkedList();

        if (from < 0) from = 0;
        if (from >= to || isEmpty()) {
            return resultList;
        }

        LinkedListNode iterator = head;
        for (int i = 0; i < from; i++) {
            iterator = iterator.getNext();
        }

        int size = size();
        for (int i = from; i < to && i < size; i++) {
            resultList.add(iterator.getData());
            iterator = iterator.getNext();
        }

        return resultList;
    }

    public void append(LinkedList other) {
        if (isEmpty()) {
            head = other.head;
        }
        else {
            requireNonNull(getLastNode()).setNext(other.head);
        }
    }

    private boolean isEmpty() {
        return head == null;
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

    private LinkedListNode getLastNode() {
        if (isNull(head)) {
            return null;
        }

        LinkedListNode node = head;
        while (nonNull(node.getNext())) {
            node = node.getNext();
        }

        return node;
    }

    private LinkedListNode getNode(int idx) {
        return head == null ? null : head.getIndexedNode(idx);
    }

    public String get(int idx) {
        LinkedListNode node = getNode(idx);
        return nonNull(node) ? node.getData() : null;
    }

    public void remove(int idx) {

        pullNode(idx);
    }

    public LinkedListNode pullNode(int idx) {
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

    private boolean checkIndexes(int idx1, int idx2) {
        int limit = size();
        return idx1 != idx2 && idx1 < limit && idx2 < limit && idx1 >= 0 && idx2 >= 0;
    }

    public void swap(int idx1, int idx2) {
        if (checkIndexes(idx1, idx2)) {
            int maxIdx = max(idx1, idx2);
            int minIdx = min(idx1, idx2);

            LinkedListNode maxNode = pullNode(maxIdx);
            LinkedListNode minNode = pullNode(minIdx);

            add(maxNode.getData(), minIdx);
            add(minNode.getData(), maxIdx);
        }
    }

    public void swapNodes(int idx1, int idx2) {
        System.out.println("=====================");
        System.out.println(this);
        System.out.println("Size: " + size());
        if (checkIndexes(idx1, idx2)) {
            int maxIdx = max(idx1, idx2);
            int minIdx = min(idx1, idx2);

            LinkedListNode maxNode = pullNode(maxIdx);
            System.out.println("=====================");
            System.out.println("pullNode(maxIdx):");
            System.out.println(maxNode);
            System.out.println(this);
            System.out.println("Size: " + size());

            LinkedListNode minNode = pullNode(minIdx);
            System.out.println("=====================");
            System.out.println("pullNode(minIdx):");
            System.out.println(maxNode);
            System.out.println(minNode);
            System.out.println(this);
            System.out.println("Size: " + size());

            add(maxNode.getData(), minIdx);
            System.out.println("=====================");
            System.out.println("add(maxNode.getData(), minIdx):");
            System.out.println(minNode);
            System.out.println(this);
            System.out.println("Size: " + size());

            add(minNode.getData(), maxIdx);
            System.out.println("=====================");
            System.out.println("add(minNode.getData(), maxIdx):");
            System.out.println(maxNode);
            System.out.println(this);
            System.out.println("Size: " + size());
        }
    }

    public void insertionSort() {
        int count = 0;
        int size = size();
        for (int i = 0; i < size; i++) {
            int j = i;
            count++;
            while (j != 0 && isLeftGreater(j-1, j)) {
                swap(j-1, j);
                j--;
            }
        }
        System.out.println("insertionSort: " + count);
    }

    public void insertionSortWithComments() {
        int size = size();
        for (int i = 0; i < size; i++) {
            int j = i;
            while (j != 0 && isLeftGreater(j-1, j)) {
                swap(j-1, j);
                j--;
            }
            System.out.println("Iteration: " + i);
            System.out.println(this);
            System.out.println("=====================");
        }
    }

    public void bubbleSort() {
        int count = 0;
        int size = size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - (i + 1); j++) {
                count++;
                if (isLeftGreater(j, j+1)) {
                    swap(j, j+1);
                }
            }
        }
        System.out.println("bubbleSort: " + count);
    }

    public void bubbleSortWithComments() {
        int size = size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - (i + 1); j++) {
                if (isLeftGreater(j, j+1)) {
                    swap(j, j+1);
                }
            }

            System.out.println("Iteration: " + i);
            System.out.println(this);
            System.out.println("=====================");
        }
    }

    private boolean isLeftGreater(int leftIdx, int rightIdx) {
        String leftData = get(leftIdx);
        String rightData = get(rightIdx);
        return leftData.compareTo(rightData) > 0;
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

    public void reversePrint() {
        if (head != null) {
            head.reversePrint();
            System.out.println();
        }
    }

    public String print() {
        return "{" + (head == null ? "||}" : head.print());
    }

    @Override
    public String toString() {
        return print();
    }
}
