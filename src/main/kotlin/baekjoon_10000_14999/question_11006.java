package baekjoon_10000_14999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_11006 { // 남욱이의 닭장
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            var UT = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            var x = UT[1] * 2 - UT[0];
            System.out.printf("%d %d%n", x, UT[1] - x);
        }
    }
}