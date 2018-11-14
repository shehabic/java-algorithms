package solutions;

import java.util.HashSet;
import java.util.Set;

public class Zerofy {
    private Set<Integer> zeroRows = new HashSet<>();
    private Set<Integer> zeroCols = new HashSet<>();

    public static void test() {
        solutions.Zerofy zerofy = new solutions.Zerofy();
        Integer[][] matrix = {
                {0, 1, 1, 1, 1, 2},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 2, 3, 4, 0},
                {1, 1, 1, 1, 1, 1}
        };
        printValues(matrix);
        zerofy.zerofy(matrix);
        printValues(matrix);
    }

    private static void printValues(Integer[][] matrix) {
        System.out.print("\nOutput:\n");
        for (Integer[] aMatrix : matrix) {
            for (Integer anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
            System.out.print("\n");
        }
    }

    public void zerofy(Integer[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == 0) {
                    zeroRows.add(r);
                    zeroCols.add(c);
                }
            }
        }
        for (int index: zeroCols) zerofyCol(index, matrix);
        for (int index: zeroRows) zerofyRow(index, matrix);

    }

    private void zerofyRow(int index, Integer[][] matrix) {
        for (int i = 0; i < matrix[index].length; i++) matrix[index][i] = 0;
    }

    private void zerofyCol(int index, Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) matrix[i][index] = 0;
    }
}
