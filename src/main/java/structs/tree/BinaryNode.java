package structs.tree;

import java.util.Objects;

import static java.lang.Math.max;
import static java.util.Objects.nonNull;

public class BinaryNode {

    private String data;

    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(String data) {
        this.data = data;
    }

    public int depth() {
        return 1 + max((nonNull(left) ? left.depth() : 0), (nonNull(right) ? right.depth() : 0));
    }

    public int size() {
        return 1 + (nonNull(left) ? left.size() : 0) + (nonNull(right) ? right.size() : 0);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryNode that = (BinaryNode) o;
        return Objects.equals(data, that.data) && Objects.equals(left, that.left) && Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, left, right);
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "data='" + data + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
