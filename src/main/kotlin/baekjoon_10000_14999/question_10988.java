package baekjoon_10000_14999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_10988 { // 팰린드롬인지 확인하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var word = br.readLine().toCharArray();

        for (int i = 0; i < word.length / 2; i++)
            if (word[i] != word[word.length - (i + 1)]) {
                System.out.print("0");
                return;
            }

        System.out.print("1");
    }
}