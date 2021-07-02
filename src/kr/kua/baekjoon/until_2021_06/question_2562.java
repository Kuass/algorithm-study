package kr.kua.baekjoon.until_2021_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2562 { // 최댓값
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var v = new int[2][9];
        for (int i = 0; i < 9; i++) {
            v[0][i] = Integer.parseInt(br.readLine());
            if (v[1][0] < v[0][i]) {
                v[1][0] = v[0][i];
                v[1][1] = i;
            }
        }
        System.out.println(v[1][0]);
        System.out.println(v[1][1] + 1);
    }
}