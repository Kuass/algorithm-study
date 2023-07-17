package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2747 { // 피보나치 수
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(br.readLine());
        var F = new int[] { 0, 1, 1 };

        for (var i = 1; i < n; i++) {
            F[2] = F[0] + F[1];
            F[0] = F[1];
            F[1] = F[2];
        }

        System.out.print(F[2]);
    }
}