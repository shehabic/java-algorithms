package solutions;

public class Playground {

    public static void test() {
        System.out.println("12345 ---- > " + getPalindrome("12345"));
        System.out.println("699996 ---- > " + getPalindrome("699996"));
    }

    private static String getPalindrome(String val) {
        boolean even = val.length() % 2 == 0;
        long num = Long.parseLong(val.substring(0, (even ? 0 : 1) + val.length() / 2));
        long res = 0;
        res = num;
        if (!even) num /= 10;
        while (num > 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return String.valueOf(res);
    }
}
