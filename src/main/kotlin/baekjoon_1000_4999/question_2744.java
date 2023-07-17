package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2744 { // 대소문자 바꾸기
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = br.readLine().toCharArray();
        for (var i = 0; i < N.length; i++) N[i] += (N[i] > 0x60) ? -0x20 : 0x20;
        System.out.print(N);
    }
}