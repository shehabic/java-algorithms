package solutions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithTwoDistincts {

    public static void test() {
        LongestSubstringWithTwoDistincts sut = new LongestSubstringWithTwoDistincts();
        String[] samples = new String[]{
            "abcabcabcabc",
            "abc",
            "abbbcc",
            "aaa",
            "",
            "b",
            "ab"
        };
        StringBuilder sb = new StringBuilder();
        for (String sample: samples) {
            System.out.println("Longest window in " + sample + " : " + sut.lengthOfLongestSubstringTwoDistinct(sample));
        }
    }

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null) return 0;
        if (s.length() <= 2) return s.length();
        int i = 0, j = 1;
        Map<Character, Integer> window = new HashMap<>();
        int max = 1;
        window.put(s.charAt(0), 1);
        while (i < s.length() && j < s.length()) {
            while (window.size() <= 2 && j < s.length()) {
                add(window, s.charAt(j));
                if (window.size() <= 2) max = Math.max(max, j - i + 1);
                j++;
            }
            while (window.size() > 2 && i < j) {
                remove(window, s.charAt(i));
                i++;
            }
        }
        return max;
    }

    private void add(Map<Character, Integer> window, char c) {
        window.put(c, window.getOrDefault(c, 0) + 1);
    }

    private void remove(Map<Character, Integer> window, char c) {
        if (window.getOrDefault(c, 1) <= 1) {
            window.remove(c);
        } else {
            window.put(c, window.get(c) - 1);
        }
    }
}
