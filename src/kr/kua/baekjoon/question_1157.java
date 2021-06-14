package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_1157 { // 단어 공부
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var words = br.readLine().toUpperCase().split("");
        var counts = new int[26];
        for (String word : words) counts[word.charAt(0) - 65]++;

        int max = -1;
        var isDuplicate = false;
        for (var i = 0; i < counts.length; i++)
            if (counts[i] != 0)
                if (max == -1) {
                    max = (byte) i;
                    isDuplicate = false;
                } else if (counts[i] >= counts[max]) {
                    if (counts[i] == counts[max]) isDuplicate = true;
                    else {
                        max = (byte) i;
                        isDuplicate = false;
                    }
                }

        if (isDuplicate) System.out.print("?");
        else System.out.print(new String(new byte[] { (byte) (max + 65)}));
        br.close();
    }
}