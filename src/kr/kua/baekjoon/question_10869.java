package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_10869 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(N[0] + N[1]);
        System.out.println(N[0] - N[1]);
        System.out.println(N[0] * N[1]);
        System.out.println(N[0] / N[1]);
        System.out.println(N[0] % N[1]);
    }
}