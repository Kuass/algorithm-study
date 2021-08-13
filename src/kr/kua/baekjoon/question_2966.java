package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_2966 { // 찍기
    static char[] Adrian = {'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C', 'B', 'A', 'B', 'C', 'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B', 'C', 'C', 'A', 'A', 'B', 'B'};

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var length = Integer.parseInt(br.readLine());
        var answer = br.readLine();

        var ABG = new int[3];
        var num = 0;
        for (var i = 0; i < length; i++) {
            if (num % 12 == 0) num = 0;
            if (answer.charAt(i) == Adrian[num]) ABG[0]++;
            if (answer.charAt(i) == Bruno[num]) ABG[1]++;
            if (answer.charAt(i) == Goran[num]) ABG[2]++;
            num++;
        }

        var max = Arrays.stream(ABG).max().orElse(0);
        System.out.println(max);
        for (var i = 0; i < 3; i++)
            if (ABG[i] == max)
                switch (i) {
                    case 0:
                        System.out.println("Adrian");
                        break;
                    case 1:
                        System.out.println("Bruno");
                        break;
                    case 2:
                        System.out.println("Goran");
                        break;
                }
    }
}