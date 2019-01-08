package solutions;

public class ClosestPalindrome {

    public static void test() {
        ClosestPalindrome sut = new ClosestPalindrome();
        String[] intputs = new String[]{ "123", "12345", "2334566", "1", "11", "1221"};
        for (String input: intputs) {
            System.out.println("Palindrome of " + input + " is: " + sut.nearestPalindromic(input));
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
        pals[3] = (long)Math.pow(10, n.length()) + 1;
        pals[4] = (long)Math.pow(10, n.length() -  1) - 1;

        long minDiff = Long.MAX_VALUE;
        long palindrome = 0L;
        for (long l: pals) {
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

    public long getPalindrome(long left, boolean even) {
        long res = left;
        if (!even) left = left / 10;
        while (left > 0) {
            res = res * 10 + left % 10;
            left /= 10;
        }
        return res;
    }
}
