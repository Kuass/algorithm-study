package kr.kua.baekjoon.contest.제5회_천하제일_코딩대회.예선;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_C { // (중략)
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());
        var S = br.readLine();
        if (N < 25) {
            System.out.print(S);
        } else {
            var front = S.substring(0, 11);
            var center = S.substring(11, N - 11);
            var back = S.substring(N - 11, N);

            if (back.contains(center) || front.contains(center)) {
                System.out.print(front + "..." + back);
            } else {
                front = S.substring(0, 9);
                back = S.substring(N - 10, N);
                System.out.print(front + "......" + back);
            }
        }
    }
}
