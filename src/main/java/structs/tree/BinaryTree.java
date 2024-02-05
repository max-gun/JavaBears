package structs.tree;

import org.springframework.core.env.Environment;

import static java.util.Objects.isNull;

public class BinaryTree {

    BinaryNode root;

    public BinaryTree() {

    }

    public void add(String data) {
        if (isNull(root)) {
            root = new BinaryNode(data);
        }
        else {
            System.out.println("Implementation required!!!");
        }
    }

    public int depth() {
        return isNull(root) ? 0 : root.depth();
    }

    public int size() {
        return isNull(root) ? 0 : root.size();
    }
}
