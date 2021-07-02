package kr.kua.baekjoon.until_2021_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2739 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());

        for (var i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", N, i, N*i);
        }
    }
}