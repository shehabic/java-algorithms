package solutions;

import Utils.Printing;

import java.util.Stack;

public class LargestRectInHistogram {

    public static void test() {
        int[][] histograms = new int[][]{
            {0, 1, 2, 3, 1, 2, 1, 1, 0},
            {1, 2, 2, 3, 8, 3, 2, 1},
            {1, 3, 0, 1, 2, 2, 2, 4}
        };
        for (int[] histogram : histograms) {
            System.out.println("Given histogram: [" + Printing.printArray(",", histogram) + "]");
            System.out.println("Largest rectangle is of size: " + findLargestRectInHistogram(histogram) + " \n");
        }
    }

    public static int findLargestRectInHistogram(int[] hist) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < hist.length) {
            if (stack.isEmpty() || hist[stack.peek()] <= hist[i]) {
                stack.add(i++);
            } else {
                int top = stack.pop();
                int area = hist[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                if (res < area) res = area;
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = hist[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            if (res < area) res = area;
        }

        return res;
    }
}
