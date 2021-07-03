package kr.kua.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class question_1018 {
    static int row, column;
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
        sc.close();

        char[][][] Cur_ArrChar = new char[row * column / 2][8][8];
        int x = 0, y = 0, count = 0;
        while (true) {
            if (x + 7 == column) {
                x = 0;
                y++;
                if (y + 7 == row) {
                    break;
                }
            }
            for (int i = y, n = 0; i < y + 8; i++, n++) {
                for (int j = x, t = 0; j < x + 8; j++, t++) {
                    Cur_ArrChar[count][n][t] = Total_ArrChar[i][j];
                }
            }
            x++;
            count++;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (count != 0) {
            int wrong_place = 0;
            boolean isWhite = Cur_ArrChar[count - 1][0][0] == 'W';
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    char chr = Cur_ArrChar[count - 1][i][j];
                    if (((i % 2) + j) % 2 == 1) {
                        if (isWhite && chr == 'W') {
                            wrong_place++;
                        } else if (!isWhite && chr == 'B') {
                            wrong_place++;
                        }
                    } else if (((i % 2) + j) % 2 == 0) {
                        if (isWhite && chr == 'B') {
                            wrong_place++;
                        } else if (!isWhite && chr == 'W') {
                            wrong_place++;
                        }
                    }
                }
            }
            arrayList.add(wrong_place);
            count--;
        }

        System.out.println(Collections.min(arrayList));
    }
}

