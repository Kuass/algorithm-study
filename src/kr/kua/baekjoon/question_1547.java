package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_1547 { // 공
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var M = Integer.parseInt(br.readLine());

        var curCup = 0x01;
        for (var i = 0; i < M; i++) {
            var XY = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (XY[0] == curCup) curCup = XY[1];
            else if (XY[1] == curCup) curCup = XY[0];
        }

        System.out.print(curCup);
    }
}