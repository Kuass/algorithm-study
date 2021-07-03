package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2675 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var count = Integer.parseInt(br.readLine());

        for (var i = 0; i < count; i++) {
            var read = br.readLine().split(" ");
            var chars = read[1].toCharArray();
            for (var j = 0; j < read[1].length(); j++)
                for (var t = 0; t < Integer.parseInt(read[0]); t++) System.out.print(chars[j]);
            System.out.println();
        }
    }
}