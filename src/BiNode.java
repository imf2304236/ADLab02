/**
 * ADLab02
 * Created by IF on 25.10.17.
 */
public class BiNode {
    // Field Declarations
    public String string;
    public BiNode leftChild;
    public BiNode rightChild;

    // Constructor Methods
    public BiNode(String stringInput) {
        this(stringInput, null, null);
    }

    public BiNode(String stringInput, BiNode leftInput, BiNode rightInput) {
        string = stringInput;
        leftChild = leftInput;
        rightChild = rightInput;
    }
}
