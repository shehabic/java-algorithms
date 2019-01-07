package solutions;

import Utils.Printing;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {

    public static void test() {
        char[][] samples = new char[][]{
            {'A', 'A', 'A', 'B', 'B', 'B', 'B', 'C'},
            {'A', 'A', 'A', 'A', 'B', 'B', 'C'},
            {'A', 'A', 'A'},
            {'A', 'B', 'C', 'A', 'B', 'C'}
        };
        TaskScheduler sut = new TaskScheduler();
        int[] k = new int[]{3, 3, 2, 3};
        for (int i = 0; i < samples.length; i++) {
            System.out.println("For Sample: " + Printing.printArray(",", samples[i]) + "] ");
            System.out.println("For K = " + k[i]);
            System.out.println("Result is: " + sut.leastInterval(samples[i], k[i]));
        }
    }

    public int leastInterval(char[] tasks, int n) {
        int intervals = 0;
        int[] map = new int[26];
        for (char c : tasks) map[c - 'A']++;
        PriorityQueue<Integer> prio = new PriorityQueue<>(26);
        for (int num : map) if (num > 0) prio.add(num);
        while (!prio.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int i = 0;
            while (i <= n) {
                if (!prio.isEmpty()) {
                    if (prio.peek() > 1) {
                        temp.add(prio.poll() - 1);
                    } else {
                        prio.poll();
                    }
                }
                intervals++;
                if (prio.isEmpty() && temp.isEmpty()) break;
                i++;
            }
            prio.addAll(temp);
        }

        return intervals;
    }
}
