public class Stack {
    static final int MAX = 1000;
    int a[] = new int[MAX];
    int top;

    int pop() {
        if (top < 0) {
            return 0;
        }
        return a[top--];

    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack underflow");
        }
        return a[top];

    }

    boolean push(int x) {
        if (top > MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }

        a[++top] = x;
        return true;
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
    }
}
