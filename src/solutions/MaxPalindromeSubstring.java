package solutions;

public class MaxPalindromeSubstring {

    public static void test() {
        MaxPalindromeSubstring sut = new MaxPalindromeSubstring();
        String[] samples = {
//            "122345654221",
            "abba",
            "aba",
            "abac",
            "abbacaaca",
            "monomamon",
            "",
            null,
            "n",
            "na"
        };
        for (String str: samples) {
            System.out.println("Max substr. palindrome in " + str + " is " + sut.longestPalindrome(str));
        }
    }


    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int start = 0, end = 0;
        int l1, l2, len;
        for (int i = 0; i < s.length(); i++) {
            l1 = maxPalindromeSubstring(s, i, i);
            l2 = maxPalindromeSubstring(s, i, i + 1);
            len = Math.max(l1, l2);
            if (len > end - start - 1) {
                start = i - (len - 1) / 2;
                end = i + (len / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    private int maxPalindromeSubstring(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
