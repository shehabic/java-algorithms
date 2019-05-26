package solutions;

public class Playground {


    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("12345 ---- > " + getPalindrome("12345"));
        System.out.println("699996 ---- > " + getPalindrome("699996"));
    }

    private static String getPalindrome(String val) {
        return val + new StringBuilder(val).reverse().toString();
    }
}
