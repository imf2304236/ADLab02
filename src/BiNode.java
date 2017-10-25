/**
 * <pre>
 * ADL Lab 02
 * Ian Fennie: 2304236
 * 25.10.17
 *
 * Project file compiled with Javac using JetBrains IntelliJ IDEA 2017.2.5
 *
 * Each lab partner has independently completed solutions for both Problems 3 and 4.
 *
 * </pre>
 *
 * An implementation of a binary node to be used within the Tree class or another
 * binary tree structure implementation.
 */
public class BiNode {
    // Field Declarations
    public String string;
    public BiNode leftChild;
    public BiNode rightChild;

    // Constructor Methods
    /**
     * Constructor method for "leafs". Sets child nodes to null
     * @param stringInput String value stored within the node
     */
    public BiNode(String stringInput) {
        this(stringInput, null, null);
    }

    /**
     * Constuctor method for "branch nodes".
     * @param stringInput String value stored within the node
     * @param leftInput BiNode to be stored as the left child node
     * @param rightInput BiNode to be stored as the right child node
     */
    public BiNode(String stringInput, BiNode leftInput, BiNode rightInput) {
        string = stringInput;
        leftChild = leftInput;
        rightChild = rightInput;
    }
}
