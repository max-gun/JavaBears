package structs.tree;

public class BinaryTreeTester {

    public static void main(String[] args) {
        BinaryNode denis = new BinaryNode("Denis");

        BinaryNode yonatan = new BinaryNode("Yonatan");
        denis.setLeft(yonatan);

        BinaryNode moran = new BinaryNode("Moran");
        denis.setRight(moran);

        BinaryNode ismail = new BinaryNode("Ismail");
        moran.setLeft(ismail);

        BinaryNode doron = new BinaryNode("Doron");
        moran.setRight(doron);

        yonatan.setRight(new BinaryNode("anchor"));

        BinaryTree bt = new BinaryTree();
        bt.root = denis;

        System.out.println("Depth: " + bt.depth());
    }
}
