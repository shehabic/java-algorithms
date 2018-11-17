package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateParentheses {
    public static void test() {
        ValidateParentheses sut = new ValidateParentheses();
        System.out.println(" Result is " + sut.isValid("([)]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char key = '_';
        for (char ch: s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.add(ch);
                continue;
            }
            if (ch == '}') key = '{';
            else if (ch == ']') key = '[';
            else if (ch == ')') key = '(';
            if (stack.isEmpty() || stack.peek() != key) return false;
            stack.pop();
        }
        return stack.isEmpty();
    }
}
