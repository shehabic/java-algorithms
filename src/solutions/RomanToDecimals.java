package solutions;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimals {

    private static Map<Character, Integer> map = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static void test() {
        RomanToDecimals sut = new RomanToDecimals();
        String[] samples = new String[] {
            "III",
            "IV",
            "IX",
            "LVIII",
            "MCMXCIV"
        };
        for (String input: samples) {
            System.out.println("Roman: " + input +", Decimal: " + sut.romanToInt(input));
        }
    }


    public int romanToInt(String s) {
        int total = 0;
        if (s == null) return 0;
        int i = s.length() - 1;
        while (i >= 0) {
            char c = s.charAt(i);
            if (i < s.length() - 1 && map.get(c) < map.get(s.charAt(i + 1))) {
                total -= map.get(c);
            } else {
                total += map.get(c);
            }
            i--;
        }
        return total;
    }

}