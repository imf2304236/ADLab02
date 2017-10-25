import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

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

    /**
     *
     * @param postfix
     */
    public Tree(String postfix) {
        rootNode = this.construct(postfix);
    }

    // Methods

    /**
     * Recursive Tree traversal method using the Post-order traversal sequence
     * @param node BiNode to begin traversing
     */
    private void postorderTraversal(BiNode node) {
        if (node.leftChild != null) { postorderTraversal(node.leftChild); }
        if (node.rightChild != null) { postorderTraversal(node.rightChild); }
        System.out.println(node.string);
    }

    /**
     * Recursive Tree traversal method using the Post-order traversal sequence
     */
    private void postorderTraversal() {
        postorderTraversal(rootNode);
    }

    /**
     * Postfix conversion method which builds a binary tree structure
     * @param postfix
     * @return Binode which represents the root of the tree structure
     */
    private BiNode construct(String postfix) {
        Stack<BiNode> stack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(postfix);
        double d;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            try {
                d = Double.parseDouble(token);
                BiNode node = new BiNode(token);
                stack.push(node);
            } catch (NumberFormatException e) {
                BiNode rightNode = stack.pop();
                BiNode leftNode = stack.pop();
                BiNode node = new BiNode(token, leftNode, rightNode);
                stack.push(node);
            }
        }
        return stack.pop();
    }

    /**
     * Main test method
     * @param args String array of arguments
     */
    public static void main(String[] args) {
        // Tree creation Test
        BiNode three = new BiNode("3");
        BiNode four = new BiNode("4");
        BiNode five = new BiNode("5");
        BiNode plus = new BiNode("+", four, three);
        BiNode root = new BiNode("*", five, plus);
        Tree tree = new Tree(root);

        // Post-order tree traversal Test
        tree.postorderTraversal();

        // Tree construction Test
        String postfix = "5 4 3 + *";
        Tree treeConstruct = new Tree(postfix);
    }
}
