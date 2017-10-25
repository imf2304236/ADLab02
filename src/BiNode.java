/**
 * ADLab02
 * Created by IF on 25.10.17.
 */
public class BiNode {
    // Field Declarations
    private String string;
    private BiNode leftChild;
    private BiNode rightChild;

    // Constructor Methods
    public BiNode(String stringInput) {
        string = stringInput;
        leftChild = null;
        rightChild = null;
    }

    public BiNode(String stringInput, BiNode leftInput, BiNode rightInput) {
        string = stringInput;
        leftChild = leftInput;
        rightChild = rightInput;
    }
}
