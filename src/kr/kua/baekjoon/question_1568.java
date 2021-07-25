package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_1568 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());

        var bird = 1;
        var count = 0;
        while (N > 0) {
            if (N < bird) bird = 1;
            N -= bird++;
            count++;
        }

        System.out.print(count);
    }
}