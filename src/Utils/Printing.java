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
}
