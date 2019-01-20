package solutions;

import Utils.Printing;

import java.util.Deque;
import java.util.LinkedList;

public class FindLargestRectangleInMatrix {
    public static void test() {
        FindLargestRectangleInMatrix sut = new FindLargestRectangleInMatrix();
        int[][][] matrices = {
            {
                {0, 1, 0, 1, 1, 1},
                {0, 0, 1, 1, 1, 0},
                {1, 1, 1, 0, 1, 1},
                {0, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 0},
            }
        };
        for (int[][] matrix : matrices) {
            System.out.println("Matrix:");
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("[" + Printing.printArray(",", matrix[j]) + "]");
            }
            System.out.println("Largest rectangle would be of size: " + sut.maximalRectangle(matrix));
        }
    }

    public int maximalRectangle(int[][] matrix) {
        if (matrix == null || matrix.length == 0)return 0;
        int result = 0;
        int[] histo = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                histo[j] = matrix[i][j] == 0 ? 0 : histo[j] + matrix[i][j];
            }
            result = Math.max(result, maximalRectangleInHistogram(histo));
        }
        return result;
    }

    public int maximalRectangleInHistogram(int[] hist) {
        int maxArea = 0;
        int topVal = 0;
        int area = 0;
        int i = 0;
        Deque<Integer> stack = new LinkedList<>();
        while (i < hist.length) {
            if (stack.isEmpty() || hist[i] >= hist[stack.peek()]) {
                stack.push(i++);
            } else {
                topVal = hist[stack.pop()];
                area = topVal * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            topVal = hist[stack.pop()];
            area = topVal * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
