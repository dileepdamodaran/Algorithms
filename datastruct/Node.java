package datastruct;

public class Node {

    int value;
    private  Node left;
    private  Node right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int key) {
        this.value = key;
    }
}
