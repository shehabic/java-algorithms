package solutions;

import Utils.Printing;

public class StringCreationFromInterleavingStrings {
    public static void main(String[] args) {
        String[][] samples = new String[][] {
            {"abc", "123", "ab12c3"},
            {"aceg", "xyz", "xyacgze"},
            {"abcdef", "abcdef", "abcdefabcdef"},
            {"abc", "def", "abcde"},
            {"abc", "def", "abdefc"},
        };
        StringCreationFromInterleavingStrings sut = new StringCreationFromInterleavingStrings();

        for (String[] words: samples) {
            System.out.println("\nWords: [" + Printing.printArray(", " , words) + "]");
            System.out.println("Is interleaving: " + (sut.isInterleave(words[0], words[1], words[2]) ? "Yes": "No"));
        }
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) return false;
        if (s1.length() == 0) return s2.equals(s3);
        if (s2.length() == 0) return s1.equals(s3);
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0];
        }
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = s2.charAt(i - 1) == s3.charAt(i - 1) && dp[0][i - 1];
        }
        for (int row = 1; row < dp.length; row++) {
            for (int col = 1; col < dp[row].length; col++) {
                int k = row + col - 1;
                if (s1.charAt(row - 1) == s3.charAt(k)) {
                    dp[row][col] = dp[row - 1][col];
                }
                if (s2.charAt(col - 1) == s3.charAt(k)) {
                    dp[row][col] = dp[row][col] || dp[row][col - 1];
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
