package solutions;

public class NearestPalindrome {

    public static void test() {
        NearestPalindrome sut = new NearestPalindrome();
        String[] samples = {
            "9999999",
            "1000000",
            "1234555",
            "1234321",
            "123321",
            "456789",
        };
        for (String sample : samples) {
            System.out.println("Next Palindrome for " + sample);
            System.out.println("Equals: " + sut.nearestPalindromic(sample) + " \n ------------ \n");
        }
    }

    public String nearestPalindromic(String n) {
        long curr = Long.parseLong(n);
        boolean even = n.length() % 2 == 0;
        int i = n.length() / 2;
        if (!even) i += 1;
        long left = Long.valueOf(n.substring(0, i));

        long[] pals = new long[5];
        pals[0] = getPalindrome(left, even);
        pals[1] = getPalindrome(left - 1, even);
        pals[2] = getPalindrome(left + 1, even);
        pals[3] = (long) Math.pow(10, n.length()) + 1;
        pals[4] = (long) Math.pow(10, n.length() - 1) - 1;

        long minDiff = Long.MAX_VALUE;
        long palindrome = 0L;
        for (long l : pals) {
            if (curr == l) continue;
            if (Math.abs(curr - l) < minDiff) {
                if (Math.abs(curr - l) < minDiff || (l < palindrome)) {
                    minDiff = Math.abs(curr - l);
                    palindrome = l;
                }
            } else if (Math.abs(curr - l) == minDiff) {
                palindrome = Math.min(palindrome, l);
            }
        }
        return String.valueOf(palindrome);
    }

    private long getPalindrome(long left, boolean even) {
        long res = left;
        if (!even) left = left / 10;
        while (left > 0) {
            res = res * 10 + left % 10;
            left /= 10;
        }
        return res;
    }
}
