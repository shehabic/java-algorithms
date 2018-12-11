package solutions;

public class ReformatLicenceKey {

    public static void test() {
        ReformatLicenceKey sut = new ReformatLicenceKey();
        String[] keys = new String[]{
            "5F3Z-2e-9-w",
            "5F3Z-2e-9-w",
            "5F3Z-2e-9-w",
            "5F3Z-2esd-9sdds-wdsds",
        };
        int[] k = {3, 5, 2, 1};
        for (int i = 0; i < keys.length; i++) {
            System.out.println("\n\nKey :" + keys[i] + " group size " + k[i]);
            System.out.println("Formatted: " + sut.licenseKeyFormatting(keys[i], k[i]));
            System.out.println("Formatted2: " + sut.licenseKeyFormatting2(keys[i], k[i]));
        }
    }

    public String licenseKeyFormatting(String S, int K) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (count > 0 && count % K == 0 && result.charAt(0) != '-') {
                result.insert(0, "-");
            }
            if (S.charAt(i) != '-') {
                result.insert(0, S.substring(i, i + 1).toUpperCase());
                count++;
            }
        }
        if (count > 0 && result.charAt(0) == '-') result.deleteCharAt(0);

        return result.toString();
    }

    public String licenseKeyFormatting2(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) != '-')
                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
        return sb.reverse().toString().toUpperCase();
    }
}
