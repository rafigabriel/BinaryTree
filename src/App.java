public class App {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert((new Node(30)));
        tree.insert((new Node(10)));
        tree.insert((new Node(20)));
        tree.insert((new Node(40)));

        tree.preOrder();
    }
}