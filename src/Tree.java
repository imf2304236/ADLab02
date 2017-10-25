/**
 * ADLab02
 * Created by IF on 25.10.17.
 */
public class Tree {
    // Field Declarations
    private BiNode rootNode;

    // Constructor
    public Tree(BiNode root) {
        rootNode = root;
    }

    public static void main(String[] args) {
        // Testing Tree creation
        BiNode three = new BiNode("3");
        BiNode four = new BiNode("4");
        BiNode five = new BiNode("5");
        BiNode plus = new BiNode("+", four, three);
        BiNode root = new BiNode("*", five, plus);
        Tree tree = new Tree(root);
    }
}
