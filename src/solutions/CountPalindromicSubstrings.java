package solutions;

public class CountPalindromicSubstrings {

    public static void test() {
        CountPalindromicSubstrings sut = new CountPalindromicSubstrings();
        String[] strings = new String[] {
          "aaa",
          "abc",
          "abbo",
          "abbas",
          "monnom",
          "ocsubusco"
        };
        for (String str: strings) {
            System.out.println("Palindromes in " + str + " are in total: " + sut.countSubstrings(str));
        }
    }

    public int countSubstrings(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++) {
            total += countSubstrings(s, i, i);
            total+= countSubstrings(s, i, i + 1);
        }
        return total;
    }

    int countSubstrings(String s, int left, int right) {
        int total = 0;
        if (right >= s.length()) return total;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            total++;
        }
        return total;
    }
}
