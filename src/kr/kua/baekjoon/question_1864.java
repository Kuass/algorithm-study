package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_1864 { // 나머지와 몫이 같은 수
    public static char[] octopus = new char[] { '-', '\\', '(', '@', '?', '>', '&', '%', '/' };
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            var W = br.readLine().toCharArray();
            if (W[0] == '#') break;

            var result = 00;
            for (var i = 0; i < W.length; i++)
                for (var j = 0; j < octopus.length; j++)
                    if (W[i] == octopus[j]) {
                        if (j == 8) result += -1 * Math.pow(8, W.length - 1 - i);
                        else result += j * Math.pow(8, W.length - 1 - i);
                    }

            System.out.println(result);
        }
    }
}