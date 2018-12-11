package solutions;

import java.util.HashSet;
import java.util.Set;

public class NextClosesTimeSlot {

    public static void test() {
        NextClosesTimeSlot sut = new NextClosesTimeSlot();
        String[] inputs = {
            "23:59",
            "20:44",
            "13:05",
            "09:18",
            "22:22",
            "00:00",
            "00:01",
        };
        for (String input : inputs) {
            System.out.println("Next after " + input + " is " + sut.nextClosestTime(input));
        }
    }

    public String nextClosestTime(String time) {
        int start = 600 * (time.charAt(0) - '0')
            + 60 * (time.charAt(1) - '0')
            + 10 * (time.charAt(3) - '0')
            + (time.charAt(4) - '0');
        if (start == 0) return "00:00";
        int result = 24 * 60 + start;
        Set<Integer> hashSet = new HashSet<>();
        for (char c : time.toCharArray()) if (c != ':') hashSet.add(c - '0');

        for (int h1 : hashSet) {
            if (h1 > 2) continue;
            for (int h2 : hashSet) {
                if ((h1 * 10 + h2) > 23) continue;
                for (int m1 : hashSet) {
                    if (m1 > 5) continue;
                    for (int m2 : hashSet) {
                        if (m1 * 10 + m2 > 59) continue;
                        int current = 60 * (h1 * 10 + h2) + (m1 * 10 + m2);
                        if (current == start) continue;
                        if (current < start) current += 60 * 24;
                        if (current < result) result = current;
                    }
                }
            }
        }

        if (result > 24 * 60) result -= 24 * 60;

        return String.format("%02d:%02d", result / 60, result % 60);
    }
}
