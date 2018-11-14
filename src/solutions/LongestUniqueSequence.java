package solutions;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSequence {
    public static void test() {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int current = 0;
        Set<Character> seq = new HashSet<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!seq.contains(c)) {
                current++;
                seq.add(c);
            } else {
                longest = Math.max(current, longest);
                while(s.charAt(start) != c) {
                    seq.remove(s.charAt(start));
                    start++;
                    current--;
                }
                start++;
            }
        }
        return Math.max(longest, current);
    }
}
