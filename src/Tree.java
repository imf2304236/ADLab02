/**
 * ADLab02
 * Created by IF on 25.10.17.
 */
public class Tree {
    // Field Declarations
    private BiNode rootNode;

    // Constructor

    /**
     * Tree constructor method
     * @param root BiNode to be assigned as the root node of the Tree
     */
    public Tree(BiNode root) {
        rootNode = root;
    }

    // Methods

    /**
     * Recursive Tree traversal method using the Post-order traversal sequence
     * @param node BiNode to begin traversing
     */
    private void postorderTraversal(BiNode node) {

    }

    /**
     *
     */
    private void postorderTraversal() {

    }

    /**
     * Main test method
     * @param args String array of arguments
     */
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
