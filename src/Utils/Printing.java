package Utils;

public class Printing {
    public static <T> String printArray(String separator, T[] items) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            if (i > 0) result.append(separator);
            result.append(items[i]);
        }
        return result.toString();
    }

    public static String printArray(int[] items) {
        return printArray(",", items);
    }

    public static String printArray(String separator, int[] items) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            if (i > 0) result.append(separator);
            result.append(items[i]);
        }
        return result.toString();
    }

    public static String printArray(char[] items) {
        return printArray(",", items);
    }

    public static String printArray(String separator, char[] items) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            if (i > 0) result.append(separator);
            result.append(items[i]);
        }
        return result.toString();
    }
}
