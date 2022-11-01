class Solution {
    public int[] findBall(int[][] grid) {
        int[] results = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            results[i] = dfs(grid, 0, i);
        }
    return results;
    }

    private int dfs(int[][] grid, int row, int column) {
        if (row == grid.length) return column;

        if ((grid[row][column] == 1 && (column == grid[0].length - 1 || grid[row][column + 1] == -1)) || grid[row][column] == -1 && (column == 0 || grid[row][column - 1] == 1))   return -1;

        if (grid[row][column] == 1)  return dfs(grid, row + 1, column + 1);
        else  return dfs(grid, row + 1, column - 1);
    }
}