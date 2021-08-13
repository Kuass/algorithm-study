package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_3004 { // 체스판 조각
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());
        var row = N / 2;
        var col = N - row;
        System.out.print((row + 1) * (col + 1));
    }
}