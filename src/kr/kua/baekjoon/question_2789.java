package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2789 { // 유학 금지
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        var univ = "CAMBRIDGE".toCharArray();
        var input = br.readLine().toCharArray();
        for(char word : input) {
            var bool = true;
            for(char block : univ) {
                if (block == word) {
                    bool = false;
                    break;
                }
            }
            if (bool) System.out.print(word);
        }

    }
}