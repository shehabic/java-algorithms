package solutions;

public class NumberToString {
    private static String[] thousands = new String[]{"", "thousand", "million", "billion", "trillion"};
    private static String[] units = new String[]{
        "", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
        "sixteen", "seventeen", "eighteen", "nineteen"
    };
    private static String[] tens = new String[]{
        "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    private static final String hundred = "hundred";

    public static String numToEnglish(int number) {
        if (number < 0) return "Negative " + numToEnglish(-1 * number);
        if (number == 0) return "Zero";

        return translateNum(number);
    }

    public static void test() {
        int[] sample = new int[] {1234555, 293948484, 4949, 339, 0, 100,200, 4400, -12335623};
        for (int item: sample) {
            System.out.println("-> " + String.valueOf(item) + " is: " + numToEnglish(item));
        }
    }

    private static String translateNum(int number) {
        int num = number;
        StringBuilder builder = new StringBuilder();
        int part = 0;
        while (num > 0) {
            int currentPart = num - ((num / 1000) * 1000);
            builder.insert(0, partToEnglish(currentPart, thousands[part]));
            part++;
            num /= 1000;
        }

        return builder.toString().trim();
    }

    private static String partToEnglish(int currentPart, String thousandsName) {
        if (currentPart == 0)return " ";

        String tensString = "";
        String unitsString;
        int remaining;
        int numHundreds = currentPart / 100;
        remaining = currentPart % 100;
        String hundredsString = numHundreds > 0 ? units[numHundreds] + " " + hundred : "";
        int numTens;
        if (remaining >= 20) {
            numTens = remaining / 10;
            remaining = remaining % 10;
            tensString = tens[numTens];
            unitsString = units[remaining];
        } else {
            unitsString = units[remaining];
        }

        return hundredsString + " " + tensString + " " + unitsString + " " + thousandsName + " ";
    }
}
