package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_11104 { // Fridge of Your Dreams
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());

        for (var i = 0; i < N; i++) System.out.println(Integer.parseInt(br.readLine(), 2));
    }
}