package solutions;

import java.util.Stack;

public class CanWeRemoveOneCharToMakeItPalindrome {

    public static void test() {
        CanWeRemoveOneCharToMakeItPalindrome sut = new CanWeRemoveOneCharToMakeItPalindrome();
        String[] samples = new String[]{
            "aba",
            "abca",
            "abcba",
            "acbba",
            "abcbda",
            "abbcca",
            "",
            "a",
            "dd",
            "ebcbbececabbacecbbcbe"
        };
        for (String s : samples) {
            System.out.println(
                "String: " + s + (sut.validPalindrome(s) ? " [IS] " : " IS NOT ") + " Palindrome");
        }
    }

//    [0 , 1, 2]; // 3 -> 1;
//    [0, 1, 2, 3] // 4 -> 2;

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        if (s.length() < 3) return true;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left, right - 1)
                    || isPalindrome(s, left + 1, right);
            }
            left++;
            right--;
        }
        return true;
    }
}
