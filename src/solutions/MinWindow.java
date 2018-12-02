package solutions;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {

    public static void test() {
        MinWindow sut = new MinWindow();
        String res = sut.minWindow("ADOBECODEBANC", "ABC");
        System.out.println("Result:" + res);
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length() || t.length() == 0) return "";
        Map<Character, Integer> map = new HashMap<>();
        int remainning = t.length();
        // collect all pattern characters with their frequency
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int start = 0, end = 0, minLength = Integer.MAX_VALUE, minStart = 0;
        while (end < s.length()) {
            char cEnd = s.charAt(end);
            // if the character at the end is part of the patter
            if (map.getOrDefault(cEnd, 0) > 0) remainning--;
            // reduce the number of chars found by one.
            if (map.containsKey(cEnd)) map.put(cEnd, map.get(cEnd) - 1);

            while (remainning == 0) {
                if (minLength > (end - start + 1)) {
                    minLength = end - start + 1;
                    minStart = start;
                }
                char cStart = s.charAt(start);
                if (map.containsKey(cStart)) {
                    map.put(cStart, map.get(cStart) + 1);
                    if (map.get(cStart) > 0) remainning++;
                }
                start++;
            }
            end++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

}
