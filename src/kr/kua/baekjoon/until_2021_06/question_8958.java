package kr.kua.baekjoon.until_2021_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_8958 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var count = Integer.parseInt(br.readLine());
        for (var i = 0; i < count; i++) {
            char[] chars = br.readLine().toCharArray();
            var score = 0;
            for (var j = 0; j < chars.length; j++)
                if (chars[j] == 'O') score += 1 + getReverseYesCount(chars, j);
            System.out.println(score);
        }
    }

    public static int getReverseYesCount(char[] chars, int index) {
        var score = 0;
        while(index > 0) if (chars[--index] != 'X') score++;
            else break;

        return score;
    }
}