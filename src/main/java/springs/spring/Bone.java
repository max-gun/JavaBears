package springs.spring;

public class Bone {

    private String shape;
    private int length;

    public Bone() {
        System.out.println("Bazinga!!!");
    }

    public void printShape() {
        System.out.println("The shape of the bone is: " + shape);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
