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

    // Constructors
    /**
     * Tree constructor method
     * @param root BiNode to be assigned as the root node of the Tree
     */
    public Tree(BiNode root) {
        rootNode = root;
    }

    /**
     * Tree constructor method
     * @param postfix Postfix expression String to construct as Treee
     */
    public Tree(String postfix) {
        rootNode = this.construct(postfix);
    }

    // Methods
    /**
     * Recursive Tree traversal method using the In-order traversal algorithm
     * @param node BiNode to begin traversing
     */
    private void inorderTraversal(BiNode node) {
        if (node.leftChild != null) { inorderTraversal(node.leftChild); }
        System.out.print(node.string + " ");
        if (node.rightChild != null) { inorderTraversal(node.rightChild); }
    }

    /**
     * Recursive Tree traversal method using the In-order traversal algorithm
     */
    public void inorderTraversal() {
        System.out.print("\n");
        inorderTraversal(rootNode);
    }

    /**
     * Recursive Tree traversal method using the Post-order traversal algorithm
     * @param node BiNode to begin traversing
     */
    private void postorderTraversal(BiNode node) {
        if (node.leftChild != null) { postorderTraversal(node.leftChild); }
        if (node.rightChild != null) { postorderTraversal(node.rightChild); }
        System.out.print(node.string + " ");
    }

    /**
     * Recursive Tree traversal method using the Post-order traversal algorithm
     */
    public void postorderTraversal() {
        System.out.print("\n");
        postorderTraversal(rootNode);
    }

    /**
     * Postfix conversion method which builds a binary tree structure
     * @param postfix Postfix expression String to convert
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
     * Recursive method which builds a fully-parenthesized Infix expression from a tree
     * @param node BiNode representing root node of tree or subtree
     * @return String representing the subtree with node as its root
     */
    private String infixGenerator(BiNode node) {
        StringBuilder stringBuilder = new StringBuilder();
        if (node.leftChild != null && node.rightChild != null) {
            stringBuilder.append("(");
        }
        if (node.leftChild != null) {
            stringBuilder.append(infixGenerator(node.leftChild));
        }
        stringBuilder.append(node.string);
        if (node.rightChild!= null) {
            stringBuilder.append(infixGenerator(node.rightChild));
        }
        if (node.leftChild != null && node.rightChild != null) {
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }

    /**
     * Recursive method which builds a fully-parenthesized Infix expression from a tree
     * @return String representing Infix expression
     */
    public String infixGenerator() {
        System.out.print("\n");
        return infixGenerator(rootNode);
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
        treeConstruct.postorderTraversal();
        postfix = "5.1 9 8.88 - 4 6 + * 7 % /";
        new Tree(postfix).postorderTraversal();

        // In-order tree traversal Test
        tree.inorderTraversal();

        // Infix generation Test
        System.out.println(tree.infixGenerator());
    }
}
