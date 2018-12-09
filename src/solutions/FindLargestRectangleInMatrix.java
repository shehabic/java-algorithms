package solutions;

import Utils.Printing;

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
        int[] arr = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[j] = matrix[i][j] == 0 ? 0 : arr[j] + matrix[i][j];
            }
            result = Math.max(result, LargestRectInHistogram.findLargestRectInHistogram(arr));
        }
        return result;
    }
}
