package kr.kua.baekjoon.until_2021_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_1546 { // 평균
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var count = Integer.parseInt(br.readLine());
        var scores = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Arrays.sort(scores);

        var sum = 0.0;
        for (var i =  0; i < count; i++) sum += scores[i] / scores[count-1] * 100;

        System.out.print(sum / count);
        br.close();
    }
}