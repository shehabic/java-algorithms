package solutions;

import java.util.*;

public class QueensOnBoard {
    public static void main(String[] args) {
        QueensOnBoard sut = new QueensOnBoard();
        sut.solveNQueens(8);
    }

    public List<List<String>> solveNQueens(int n) {
        List<int[]> res = new ArrayList<>();
        dfs(0, n, new int[n], res);
        List<List<String>> ways = new ArrayList<>();
        for (int[] queenPos: res) {
            List<String> sol = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    sb.append(queenPos[j] == i ? "Q" : ".");
                }
                sol.add(sb.toString());
            }
            ways.add(sol);
        }
        return ways;
    }

    private void dfs(int row, int n, int[] cols, List<int[]> res) {
        if (row == n) {
            res.add(cols.clone());
        } else {
            for (int i = 0; i < n; i++)
                if (isValid(i, row, cols)) {
                    cols[row] = i;
                    dfs(row + 1, n, cols, res);
                }
        }
    }

    private boolean isValid(int col, int row, int[] cols) {
        for (int i = 0; i < row; i++) {
            if (cols[i] == col) return false;
            if (Math.abs(col - cols[i]) == row - i) return false;
        }
        return true;
    }

}
