package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_1371 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        var cnt = new int[26];
        while(!(str = br.readLine()).isEmpty()) {
            var words = str.toCharArray();
            for (char word : words) {
                if (word == 0x20) continue;
                cnt[word - 0x61]++;
            }
        }

        int max = 0;
        for (var i = 0; i < 26; i++) max = Math.max(max, cnt[i]);

        for (var i = 0; i < 26; i++)
            if (cnt[i] == max) System.out.print((char)(0x61 + i));
    }
}