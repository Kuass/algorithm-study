package kr.kua.baekjoon.until_2021_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_10952 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            var AB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (AB[0] == 0 && AB[1] == 0) return;
            System.out.println(AB[0] + AB[1]);
        }
    }
}