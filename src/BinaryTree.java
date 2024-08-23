public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    private Node newInsert(Node newNode, Node current) {
        if (current == null) {
            return newNode;
        }
        if (current.getValue() > newNode.getValue()) {
            current.setLeft(newInsert(newNode, current.getLeft()));
        } else {
            current.setRight(newInsert(newNode, current.getRight()));
        }
        return current;
    }

    void insert(Node newNode) {
        root = newInsert(newNode, root);
    }

    void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node element) {
        if (element != null) {
            System.out.println("Element: " + element.getValue());// ROOT
            preOrder(element.getLeft());// LEFT
            preOrder(element.getRight());// RIGHT
        }
    }
}