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
        // This map will not represent how many chars we have, but rather how many characters we need from the target.
        // As long as the number is > 0 it means we still need some.
        Map<Character, Integer> map = new HashMap<>();
        int required = t.length();
        // this will represent total found.
        int total = 0;
        // init with counts of each char in target
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int start = 0, end = 0, minLength = Integer.MAX_VALUE, minStart = 0;
        while (end < s.length()) {
            char cEnd = s.charAt(end);
            // if it's a char in the target, reduce the total of it until it goes below zero (zero here is good)
            if (map.getOrDefault(cEnd, 0) > 0) total++;
            // we keep reducing the count here anyway
            if (map.containsKey(cEnd)) map.put(cEnd, map.getOrDefault(cEnd, 0) - 1);
            // if total == 0, means we found all required target characters.
            while (total == required) {
                if (minLength > (end - start + 1)) {
                    minLength = end - start + 1;
                    minStart = start;
                }
                char cStart = s.charAt(start);
                // if it's one of the target characters, increase it again.
                if (map.containsKey(cStart)) map.put(cStart, map.getOrDefault(cStart, 0) + 1);
                // if the required number is more than 0, it means we're missing some occurrences, i.e. total is reduced.
                if (map.getOrDefault(cStart, 0) > 0) total--;
                start++;
            }
            end++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }


}
