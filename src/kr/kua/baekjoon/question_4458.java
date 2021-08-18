package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class question_4458 { // 첫 글자를 대문자로
    public static void main(String[] args) throws IOException, ParseException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());

        for (var i = 0; i < N; i++) {
            var str = br.readLine();
            System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
        }
     }
}