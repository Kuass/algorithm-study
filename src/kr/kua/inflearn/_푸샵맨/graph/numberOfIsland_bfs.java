package kr.kua.inflearn._푸샵맨.graph;

import java.util.LinkedList;
import java.util.Queue;

public class numberOfIsland_bfs {
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
                    bfs(grid, i, j);
                }
            }
        }

        return count;
    }

    static void bfs(char[][] grid, int x, int y) {
        grid[x][y] = 'X'; // visited
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { x, y }); // 0,0

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] dir : dirs) {
                int x1 = cur[0] + dir[0];
                int y1 = cur[1] + dir[1];

                if (x1 >= 0 && y1 >= 0 && x1 < m && y1 < n && grid[x1][y1] == '1') {
                    grid[x1][y1] = 'X';
                    queue.offer(new int[] { x1, y1 });
                }
            }

        }
    }
}
