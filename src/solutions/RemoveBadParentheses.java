package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveBadParentheses {

    public static void test() {
        RemoveBadParentheses sut = new RemoveBadParentheses();
        String[] inputs = new String[] {
            ")(",
            "(a)())()",
            "()())()",
        };
        for (String input: inputs) {
            System.out.println("Input: " + input);
            List<String> outputs = sut.removeInvalidParentheses(input);
            for (String output: outputs) {
                System.out.println("Output: " + output);
            }
            System.out.println("-----------------------------");
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        char[] left = new char[]{'(', '{', '['};
        char[] right = new char[]{')', '}', ']'};
        List<String> results = new ArrayList<>();
        results.add(fix(s, left, right).toString());
        String result2 = fix(new StringBuilder(s).reverse().toString(), right, left).reverse().toString();
        if (!results.get(0).equals(result2)) {
            results.add(result2);
        }
        return results;
    }

    private StringBuilder fix(String s, char[] open, char[] close) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        char key;
        for (char c: s.toCharArray()) {
            if (c == open[0] || c == open[1] || c == open[2]) {
                stack.add(c);
                result.append(c);
                continue;
            }
            if (c == close[0]) key = open[0];
            else if (c == close[1]) key = open[1];
            else if (c == close[2]) key = open[2];
            else {
                result.append(c);
                continue;
            }
            if (!stack.isEmpty() && stack.peek() == key) {
                stack.pop();
                result.append(c);
            }
        }
        while (!stack.isEmpty()) {
            char remove = stack.pop();
            for (int i = result.length() - 1; i >= 0; i--) {
                if (result.charAt(i) == remove) {
                    result.deleteCharAt(i);
                    break;
                }
            }
        }

        return result;
    }
}
