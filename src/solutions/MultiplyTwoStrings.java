package solutions;

public class MultiplyTwoStrings {
    public String multiply(String num1, String num2) {
        char[] m = num1.toCharArray(), n = num2.toCharArray();
        int[] res = new int[m.length + n.length];
        for (int i = m.length - 1; i >= 0; i--) {
            for (int j = n.length - 1; j >= 0; j--) {
                int p1 = i + j, p2 = i + j + 1;
                int val = res[p2] + ((m[i] - '0') * (n[j] - '0'));
                res[p2] = val % 10;
                res[p1] = res[p1] + (val / 10);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num: res) {
            if (sb.length() > 0 || num > 0) sb.append(num);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}

