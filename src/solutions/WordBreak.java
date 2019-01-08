package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void test() {
        WordBreak sut = new WordBreak();
        long l = System.nanoTime() ;
        List<String> words = Arrays.asList("cats", "cat", "sand", "and", "dogs");
        String sample = "catsandog";
        sut.wordBreak(sample, words);
        System.out.println((System.nanoTime()) - l + "ms");
        System.out.println("------------------------");
        l = System.nanoTime();
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, new HashSet<String>(wordDict), 0, new Boolean[s.length()]);
    }

    public boolean wordBreak(String s, Set<String> dict, int start, Boolean[] mem) {
        if (start == s.length())return true;
        if (mem[start] != null)return mem[start];
        for (int end = start + 1; end <= s.length(); end++) {
            if (dict.contains(s.substring(start, end)) && wordBreak(s, dict, end, mem)) return mem[start] = true;
        }
        return mem[start] = false;
    }
}
