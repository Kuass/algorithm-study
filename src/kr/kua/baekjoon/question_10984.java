package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_10984 { // 내 학점을 구해줘
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var T = Integer.parseInt(br.readLine());
        for (var i = 0; i < T; i++) {
            var N = Integer.parseInt(br.readLine());
            var subject = 0;
            var score = 0.0F;
            for (var j = 0; j < N; j++) {
                var CG = br.readLine().split(" ");
                var temp = Integer.parseInt(CG[0]);
                subject += temp;
                for (var x = 0; x < temp; x++)
                    score += Double.parseDouble(CG[1]);
            }

            System.out.printf("%d %.1f%n", subject, (double)score / subject);
        }
    }
}