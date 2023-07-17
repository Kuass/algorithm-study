package inflearn._푸샵맨.graph;

public class maze_dfs {
    public static void main(String args[]) {
        int[][] maze = {
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,1,0},
                {1,1,0,1,1},
                {1,1,0,1,1},
                {0,0,0,0,0}
        };
        int[] start = { 0, 4 };
        int[] dest = { 4, 4 };
        maze_dfs a = new maze_dfs();
        System.out.println(a.solve(maze, start, dest));
    }

    int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    int m, n;
    public boolean solve(int[][] grid, int[] start, int[] dest) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return false;
        m = grid.length;
        n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        return dfs(grid, start, dest, visited);
    }

    public boolean dfs(int[][] grid, int[] start, int[] dest, boolean[][] visited) {
        if (start[0] < 0 || start[0] >= m || start[1] < 0 || start[1] >= n || visited[start[0]][start[1]]) {
            return false;
        }

        visited[start[0]][start[1]] = true;
        if (start[0] == dest[0] && start[1] == dest[1])
            return true;
        for (int[] dir : dirs) {
            int x = start[0]; // 0
            int y = start[1]; // 4

            while(x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 0) {
                x += dir[0]; // 0 1 2 3
                y += dir[1]; // 4 4 4 4 // 1,0
            }
            x -= dir[0];
            y -= dir[1];

            dfs(grid, new int[] {x, y}, dest, visited);
        }

        return false;
    }
}
