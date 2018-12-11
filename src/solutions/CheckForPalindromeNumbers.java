package solutions;

import java.util.Stack;

public class CheckForPalindromeNumbers {

    public static void test() {
        CheckForPalindromeNumbers sut = new CheckForPalindromeNumbers();
        int[] numbers = {
            123,
            12221,
            121,
            10,
            304403,
            30403
        };
        for (int num : numbers) {
            System.out.println("number: " + num + " is " + (sut.isPalindrome(num) ? "" : "NOT") + " Palindrome\n\n");

        }
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10)return true;
        if (x % 10 == 0) return false;
        int inverted = 0;
        while (x > inverted) {
            inverted = (inverted * 10) + x % 10;
            x /= 10;
            if (inverted == x || inverted == x / 10) return true;
        }

        return false;
    }
}
