package facebook;

import java.util.Stack;

/**
 * Leetcode 20
 */
public class ValidParanthesis {

    public static void main(String args[]) {
        String s = "()";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        if (s.length() % 2 != 0)
            return false;
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
