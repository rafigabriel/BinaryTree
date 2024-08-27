public class App {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(new Node(30));
        tree.insert(new Node(10));
        tree.insert(new Node(5));
        tree.insert(new Node(20));
        tree.insert(new Node(15));
        tree.insert(new Node(13));
        tree.insert(new Node(12));
        tree.insert(new Node(40));
        tree.insert(new Node(50));
        tree.insert(new Node(60));

        tree.inOrder();
        System.out.println("---------------------------------------");
        tree.remove(5);
        tree.inOrder();
        System.out.println("---------------------------------------");
        tree.remove(50);
        tree.inOrder();
    }
}