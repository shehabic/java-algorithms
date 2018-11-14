package solutions;

public class ClosesPalindrome {

    public static void test() {
        String[] intputs = new String[]{ "123", "12345", "2334566", "1", "11", "1221"};
        for (String input: intputs) {
            System.out.println("Palindrome of " + input + " is: " + nearestPalindromic(input));
        }
    }

    public static String nearestPalindromic(String n) {
        if (isPalindrome(n)) {
            return closesPalindrome(n);
        }
        char[] chars = n.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            chars[r] = chars[l];
            r--;
            l++;
        }
        return String.valueOf(chars);
    }

    private static String closesPalindrome(String n) {
        int l = Math.max(0, (n.length() / 2)  -1);
        int r = (n.length() / 2);
        int num = n.charAt(l) - '0';
        num += num > 0 ? -1 : 1;
        char[] chars = n.toCharArray();
        chars[l] = chars[r] = (char)(num + '0');

        return String.valueOf(chars);
    }

    public static boolean isPalindrome(String n) {
        char[] chars = n.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            if (chars[r] != chars[l])return false;
            r--;
            l++;
        }
        return true;
    }
}
