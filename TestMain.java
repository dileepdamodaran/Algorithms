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

    }
}
