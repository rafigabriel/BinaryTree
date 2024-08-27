public class Node {
    Node right;
    Node left;
    private int value;

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }

}