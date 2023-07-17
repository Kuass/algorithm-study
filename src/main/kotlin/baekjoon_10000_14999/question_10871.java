package baekjoon_10000_14999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_10871 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var NX = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var sb = new StringBuilder();
        for (var i : A) if (i < NX[1]) sb.append(i).append(" ");
        System.out.print(sb);
    }
}