package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class question_1577 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var val = new int[10];

        for (int i = 0; i < 3; i++) val[i] = Integer.parseInt(br.readLine());
        var str = String.valueOf(val[0] * val[1] * val[2]);

        Arrays.fill(val, 0);
        IntStream.range(0, str.length()).forEach(i -> {
            var cur = str.charAt(i);
            val[cur - 0x30]++;
        });

        for (int i : val) System.out.println(i);
    }
}