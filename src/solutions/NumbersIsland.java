package solutions;

public class NumbersIsland {

    public static void test() {
        NumbersIsland numIsland = new NumbersIsland();

        char[][] input = new char[4][];
        input[0] = "11000".toCharArray();
        input[1] = "11000".toCharArray();
        input[2] = "00100".toCharArray();
        input[3] = "00011".toCharArray();
        int total = numIsland.numIslands(input);
        System.out.println("Total is: " + total);
    }

    public int numIslands(char[][] grid) {
        if (grid.length == 0)return 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return _numIslands(grid, visited);
    }

    private int _numIslands(char[][] grid, boolean[][] visited) {
        int total = 0;
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (canVisit(i, j, grid, visited) && grid[i][j] == '1') {
                    total++;
                    visitAllAdjacent(i, j, grid, visited);
                }
            }
        }
        return total;
    }

    private boolean canVisit(int i, int j, char[][] grid, boolean[][] visited) {
        return (i >= 0 && j >= 0 && i < grid.length && j < grid[i].length && !visited[i][j]);
    }

    private void visitAllAdjacent(int i, int j, char[][] grid, boolean[][] visited) {
        visited[i][j] = true;
        for (int x = i - 1; x <= i +1; x++) {
            for (int y = j - 1; y <= j+1; y++) {
                if ((x == i || y == j) && canVisit(x, y, grid, visited)) {
                    visited[x][y] = true;
                    if (grid[x][y] == '1') {
                        visitAllAdjacent(x, y, grid, visited);
                    }
                }
            }
        }
    }
}
