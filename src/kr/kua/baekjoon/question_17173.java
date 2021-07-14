package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_17173 { // 배수들의 합
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var MK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var sum = 0;

        for (var i = MK[0]; i <= NM[0]; i++)
            for(var j = 0; j < NM[1]; j++)
                if (i%MK[j] == 0) {
                    sum += i;
                    break;
                }

        System.out.print(sum);
    }
}