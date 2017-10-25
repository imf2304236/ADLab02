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
        BiNode leftNode = new BiNode("left");
        BiNode rightNode = new BiNode("right");
        BiNode rootNode = new BiNode("root", leftNode, rightNode);
        Tree testTree = new Tree(rootNode);
    }
}
