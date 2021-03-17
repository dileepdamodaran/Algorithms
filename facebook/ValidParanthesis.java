package facebook;

import java.util.Stack;

/**
 * Leetcode 20
 */
public class ValidParanthesis {

    public static void main(String args[]) {
        String s = "()";
        isValid(s);
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
