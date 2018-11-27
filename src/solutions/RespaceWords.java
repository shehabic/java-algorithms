package solutions;

import java.util.HashSet;
import java.util.Set;

public class RespaceWords {

    public static void test() {
        RespaceWords sut = new RespaceWords();
        Set<String> dict = new HashSet<String>() {{
            add("cats");
            add("cat");
            add("and");
            add("sand");
            add("dog");
            add("dogs");
            add("apple");
            add("apples");
        }};
        String s = "catsanddogs";
        System.out.println(sut.bestSplit(dict, s));
    }

    public static class ParseResult {
        public int invalid;
        public String parsed;

        public ParseResult(int inv, String p) {
            invalid = inv;
            parsed = p;
        }
    }

    public String bestSplit(Set<String> dict, String s) {
        ParseResult[] memo = new ParseResult[s.length()];
        ParseResult r = split(dict, s, 0, memo);
        return r == null ? null : r.parsed;
    }

    public ParseResult split(Set<String> dict, String s, int start, ParseResult[] memo) {
        if (start >= s.length()) {
            return new ParseResult(0, "");
        }
        if (memo[start] != null) {
            return memo[start];
        }

        int bestInvalid = Integer.MAX_VALUE;
        String bestParsing = null;

        String partial = "";
        int index = start;
        while (index < s.length()) {
            char c = s.charAt(index);
            partial += c;
            int invalid = dict.contains(partial) ? 0 : partial.length();
            if (invalid < bestInvalid) { // Short circuit
                /* Recurse, putting a space after this character. If this
                 * is better than the current best option, replace the best
                 * option. */
                ParseResult result = split(dict, s, index + 1, memo);
                if (invalid + result.invalid < bestInvalid) {
                    bestInvalid = invalid + result.invalid;
                    bestParsing = partial + " " + result.parsed;
                    if (bestInvalid == 0) break; // Short circuit
                }
            }

            index++;
        }
        memo[start] = new ParseResult(bestInvalid, bestParsing);
        return memo[start];
    }

}
