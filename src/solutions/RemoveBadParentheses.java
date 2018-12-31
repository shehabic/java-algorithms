package solutions;

import java.util.*;

public class RemoveBadParentheses {

    public static void test() {
        RemoveBadParentheses sut = new RemoveBadParentheses();
        String[] inputs = new String[]{
            ")(",
            "(a)())()",
            "()())()",
        };
        for (String input : inputs) {
            System.out.println("Input: " + input);
            List<String> outputs = sut.removeInvalidParentheses(input);
            for (String output : outputs) {
                System.out.println("Output: " + output);
            }
            System.out.println("-----------------------------");
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        Set<String> set = new HashSet<>();
        int left = 0, right = 0;
        for (char c: s.toCharArray()) {
            if (c != '(' && c != ')') continue;
            if (c == '(') left++;
            else if (left > 0) left--;
            else right++;
        }
        remove(s, 0, 0, 0, left, right, new StringBuilder(), set);

        return new ArrayList<>(set);
    }

    private void remove(String s, int i, int countL, int countR, int remL, int remR, StringBuilder sb, Set<String> set) {
        if (i == s.length()) {
            if (remL == remR && remL == 0) {
                set.add(sb.toString());
            }
            return;
        }
        char c = s.charAt(i);
        if (c == '(' && remL > 0) {
            remove(s, i + 1, countL, countR, remL - 1, remR, sb, set);
        } else if (c == ')' && remR > 0) {
            remove(s, i + 1, countL, countR, remL, remR - 1, sb, set);
        }
        sb.append(c);
        if (c != '(' && c != ')') {
            remove(s, i + 1, countL, countR, remL, remR, sb, set);
        } else if (c == '(') {
            remove(s, i + 1, countL + 1, countR, remL, remR, sb, set);
        } else if (countL > countR) {
            remove(s, i + 1, countL, countR + 1, remL, remR, sb, set);
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}
