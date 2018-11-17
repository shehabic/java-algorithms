package solutions;

import java.util.ArrayList;
import java.util.List;

public class GenerateBraces {

    public static List<String> generateBrackets(int n) {
        return parents(n, n, new ArrayList<>(), "");
    }

    public static List<String> parents(int opensLeft, int closesLeft, List<String> sets, String str) {
        if (opensLeft == 0 && closesLeft == 0) {
            sets.add(str);
            return sets;
        }
        if (opensLeft < closesLeft) sets = parents(opensLeft, closesLeft -1, sets, str + ")");
        if (opensLeft > 0) sets = parents(opensLeft - 1, closesLeft, sets, str + "(");

        return sets;
    }

    public static void test() {
        int[] nums = new int[] {3, 2, 4};
        for (int n: nums) {
            System.out.println("Base n: " + n);
            List<String> variants = generateBrackets(n);
            for(String variant: variants) {
                System.out.println("\t\t- " + variant);
            }
        }
    }
}
