package solutions;

public class NumToEnglishBlind {
    public static void test() {
        NumToEnglishBlind numToEnglishBlind = new NumToEnglishBlind();
        int[] nums = new int[] {
            123445454,
            100000,
            234234,
            49860,
            93,
            0,
            -1233044,
            -1
        };

        for (int num: nums) {
            System.out.println("Num: " + num + " in English is: " + numToEnglishBlind.numberToWords(num));
        }
    }

    private final String HUNDRED = "Hundred";
    private final String[] tens = new String[]{
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private final String[] small = new String[]{
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
        "Eighteen", "Nineteen"
    };
    private final String[] big = new String[]{"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        if (num < 0) return "Negative " + numberToWords(-1 * num);
        StringBuilder sb = new StringBuilder();
        int remaining = num;
        int part = 0;
        while (num > 0) {
            remaining = num % 1000;
            sb.insert(0, makeWords(remaining, big[part]));
            num /= 1000;
            part++;
        }

        return sb.toString().trim();
    }

    private String makeWords(int num, String suffix) {
        if (num == 0) return "";
        StringBuilder sb = new StringBuilder();
        int hundreds = num / 100;
        if (hundreds > 0) {
            sb.append(small[hundreds]);
            sb.append(" ");
            sb.append(HUNDRED);
        }
        int rem = num % 100;
        if (rem < 20) {
            if (rem > 0) {
                sb.append(" ");
                sb.append(small[rem]);
            }
        } else {
            int tensNum = rem / 10;
            sb.append(" ");
            sb.append(tens[tensNum]);
            int units = rem % 10;
            if (units > 0) {
                sb.append(" ");
                sb.append(small[units]);
            }
        }
        sb.append(" ");
        sb.append(suffix);
        return sb.toString().trim() + " ";
    }
}
