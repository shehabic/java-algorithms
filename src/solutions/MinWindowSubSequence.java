package solutions;

public class MinWindowSubSequence {
    public String minWindow(String S, String T) {
        String window = "";
        int j = 0, min = S.length() + 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == T.charAt(j)) {
                j++;
                if (j == T.length()) {
                    int end = i + 1;
                    j--;
                    while (j >= 0) {
                        if (S.charAt(i) == T.charAt(j)) j--;
                        i--;
                    }
                    j++;
                    i++;
                    if (end - i < min) {
                        min = end - i;
                        window = S.substring(i, end);
                    }
                }
            }
        }
        return window;
    }
}
