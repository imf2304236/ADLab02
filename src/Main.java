public class Main {

    public static void main(String[] args) {
        // Testing Tree creation
        BiNode leftNode = new BiNode("left");
        BiNode rightNode = new BiNode("right");
        BiNode rootNode = new BiNode("root", leftNode, rightNode);
        Tree testTree = new Tree(rootNode);
    }
}
