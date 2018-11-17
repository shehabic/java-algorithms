package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LettersCombinationsOfPhoneNumber {
    private static Map<Character, String> map = new HashMap<>();

    static {
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        map.put('0', "");
    }

    public static void test() {
        LettersCombinationsOfPhoneNumber sut = new LettersCombinationsOfPhoneNumber();
        String[] phones = new String[] {
            "12336",
            "0983",
            "2535",
            "1234"
        };
        for(String phone: phones) {
            System.out.println("Combinations for phone: " + phone);
            List<String> results = sut.letterCombinations(phone);
            for (String result: results) {
                System.out.println("\t - " + result);
            }
            System.out.println("-----------------------");
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)return new ArrayList<>();
        List<String> results = new ArrayList<>();
        letterCombinationsGet(digits, results,  "");
        return results;
    }

    public void letterCombinationsGet(String digits, List<String> results, String str) {
        if (digits.length() == 0) {
            results.add(str);
            return;
        }
        char c = digits.charAt(0);
        if (!map.containsKey(c) || map.get(c).length() == 0) {
            letterCombinationsGet(digits.substring(1), results, str);
        } else {
            for (char letter : map.get(c).toCharArray()) {
                letterCombinationsGet(digits.substring(1), results, str + letter);
            }
        }
    }
}
