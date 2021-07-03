package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_15829 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var L = Integer.parseInt(br.readLine());
        var H = br.readLine().toCharArray();

        var result = 0L;
        for (var i = 0; i < L; i++) result += (long) (H[i] - 96) * Math.pow(31, i);

        System.out.print(result);
    }
}