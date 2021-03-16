import java.util.ArrayList;

public class TestMain {
    public static void main(String args[]) {
        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }

        LinkedList lLst = new LinkedList();
        lLst.insert(lLst, 2);
        lLst.insert(lLst, 4);
        lLst.insert(lLst, 6);

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);

        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);

        int sum = 17;
        System.out.println(sum % 10);
        System.out.println(7 / 10);

    }
}
