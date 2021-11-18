package kr.kua.inflearn._푸샵맨.graph;

public class numberOfIsland_dfs {
    public static void main(String args[]) {
        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '1', '1', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };
        System.out.print(solve(grid));
    }

    static int m, n, count;
    static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
    public static int solve(char[][] grid) {
        m = grid.length; // 4
        n = grid[0].length; // 5

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') return;
        grid[i][j] = 'X';

        for (int[] dir : dirs) dfs(grid, i + dir[0], j + dir[1]);
    }
}
