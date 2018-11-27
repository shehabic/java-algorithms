package solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinWindow {

    public static void test() {
        MinWindow sut = new MinWindow();
        String res = sut.minWindow("bdab", "ab");
        System.out.println("Result:" + res);
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        String window = "";
        int minWindow = Integer.MAX_VALUE;
        Map<Character, Integer> incl = new HashMap<>();
        Set<Character> chars = new HashSet<>();
        for (char c: t.toCharArray()) {
            chars.add(c);
        }
        int start = 0, end;
        while (start < s.length()) {
            char c = s.charAt(start);
            if (chars.contains(c)) {
                incl.put(c, 1);
                break;
            }
            start++;
        }
        end = start + 1;
        int maxStart = s.length() - t.length() - 1;
        boolean ended = incl.size() < chars.size() && end >= s.length();
        while (!ended) {
            while (end <= s.length() && incl.size() < chars.size()) {
                char c = s.charAt(end - 1);
                if (chars.contains(c)) incl.put(c, incl.getOrDefault(c, 0) + 1);
                end++;
            }
            if (incl.size() == chars.size()) {
                String current = s.substring(start, end);
                if (current.length() < minWindow) {
                    window = current;
                    minWindow = current.length();
                }
            }
            while (start < maxStart && incl.size() == chars.size()) {
                start++;
                char c = s.charAt(start - 1);
                if (chars.contains(c)) {
                    if (incl.get(c) == 1) {
                        incl.remove(c);
                    } else {
                        incl.put(c, incl.get(c) - 1);
                    }
                }
            }
            if (incl.size() == chars.size()) {
                String current = s.substring(start, end);
                if (current.length() < minWindow) {
                    window = current;
                    minWindow = current.length();
                }
            }
            ended = (end >= s.length() && incl.size() < chars.size()) || (start >= maxStart);
        }

        return window;
    }

}
