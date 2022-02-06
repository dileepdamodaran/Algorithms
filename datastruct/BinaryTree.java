package datastruct;

public class BinaryTree {
    Node root;

    BinaryTree(int key){
       root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

    public static void main(String args[]){
        BinaryTree t = new BinaryTree(1);
        t.root = new Node(1);

        t.root.setLeft( new Node(2));
        t.root.setRight(new Node(3));
        
        t.root.getLeft().setLeft(new Node(4));
        t.root.getRight().setRight(new Node(5));

    }
}
