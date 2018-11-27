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
        sut.wordBreak2(sample, words);
        System.out.println((System.nanoTime()) - l + "ms");
        System.out.println("------------------------");
        l = System.nanoTime();
        sut.wordBreak3(sample, words);
        System.out.println((System.nanoTime()) - l + "ms");
        System.out.println("------------------------");
        l = System.nanoTime();
        sut.wordBreak4(sample, words);
        System.out.println((System.nanoTime()) - l + "ms");

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public boolean wordBreak2(String s, List<String> wordDict) {
        return word_Break(s, new HashSet(wordDict), 0);
    }
    public boolean word_Break(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && word_Break(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }


    public boolean wordBreak3(String s, List<String> wordDict) {
        return word_Break(s, new HashSet(wordDict), 0, new Boolean[s.length()]);
    }
    public boolean word_Break(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && word_Break(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }


    public boolean wordBreak4(String s, List<String> wordDict) {
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
