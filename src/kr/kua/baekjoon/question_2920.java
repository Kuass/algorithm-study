package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_2920 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        var isAscending = true;
        for (var i = 0; i < 8; i++)
            if (i == 0) {
                // 맨 처음
                if (N[0] == 8) isAscending = false;
                else if (N[0] != 1) {
                    System.out.print("mixed");
                    return;
                }
            } else {
                if (isAscending) {
                    if (N[i] != (i + 1)) {
                        System.out.print("mixed");
                        return;
                    }
                } else if (N[i] != 8 - i) {
                    System.out.print("mixed");
                    return;
                }
            }
        if (isAscending) System.out.print("ascending");
        else System.out.print("descending");
    }
}