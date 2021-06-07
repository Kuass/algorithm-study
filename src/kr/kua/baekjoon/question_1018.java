package kr.kua.baekjoon;

import java.util.Scanner;

public class question_1018 {
    static int row, column, count;
    static char[][] Total_ArrChar;
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        row = Integer.parseInt(str[0]);
        column = Integer.parseInt(str[1]);

        Total_ArrChar = new char[row][column];
        for (var i = 0; i < row; i++) {
            char[] chs = sc.nextLine().toCharArray();
            System.arraycopy(chs, 0, Total_ArrChar[i], 0, column);
        }

        char[][][] Cur_ArrChar = new char[((row*column)-(8*8))/2][8][8];
        count = 0;
        for (var i = 0; i + 7 < row; i++) {
            for (var j = 0; j + 7 < column; j++) {
                for (var t = 0; t < 8; t++) {
                    Cur_ArrChar[count][j][t] = Total_ArrChar[i][j + t];
                }
            }
            count++;
        }
        sc.close();
    }
}

