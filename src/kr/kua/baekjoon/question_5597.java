package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_5597 { // 과제 안 내신 분..?
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var S = new int[30];

        for (var i = 0; i < 28; i++) S[Integer.parseInt(br.readLine()) - 1]++;
        for (var i = 0; i < 30; i++) if (S[i] == 0) System.out.println(i + 1);
    }
}