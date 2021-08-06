package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_1018 {
    static int[][] board;
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        board = new int[NM[0]][NM[1]];

        for (int i = 0; i < NM[0]; i++) {
            var str = br.readLine();
            for (int j = 0; j < NM[1]; j++) {
                if (str.charAt(j) == 'W') board[i][j] = 1;
                else board[i][j] = 0;
            }
        }

        for (int i = 0; i < NM[0] - 7; i++)
            for (int j = 0; j < NM[1] - 7; j++) search(i, j);

        System.out.println(result);
    }

    static void search(int x, int y) {
        var color = board[x][y];
        var count = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != color) count++;

                if (color == 0) color = 1;
                else if (color == 1) color = 0;
            }
            if (color == 0) color = 1;
            else if (color == 1) color = 0;
        }

        count = Math.min(count, 64 - count);
        result = Math.min(result, count);
    }
}

