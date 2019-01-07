package solutions;

public class MinWindowSubSequence {
    public String minWindow(String S, String T) {
        String window = "";
        int tIndex = 0, min = S.length() + 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == T.charAt(tIndex)) {
                tIndex++;
                if (tIndex == T.length()) {
                    int end = i + 1;
                    tIndex--;
                    while (tIndex >= 0) {
                        if (S.charAt(i) == T.charAt(tIndex)) tIndex--;
                        i--;
                    }
                    tIndex++;
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
