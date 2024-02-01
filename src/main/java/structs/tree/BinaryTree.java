package structs.tree;

import org.springframework.core.env.Environment;

import static java.util.Objects.isNull;

public class BinaryTree {

    private BinaryNode root;

    public BinaryTree() {

    }

    public void add(String data) {
        if (root == null) {
            root = new BinaryNode(data);
        }
        else {
            System.out.println("Implementation required!!!");
        }
    }

    public int depth() {
        return 0; //TODO: replace with your implementation!!!!
    }

    public int size() {
        if (isNull(root)) {
            return 0;
        }

        return root.size();
    }
}
