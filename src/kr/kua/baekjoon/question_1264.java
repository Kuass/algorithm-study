package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_1264 { // 모음의 개수
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            var chars = br.readLine().toLowerCase().toCharArray();
            if (chars[0] == 0x23) break;
            int count = 0;
            for (char text : chars)
                switch (text) {
                    case 0x61:
                    case 0x65:
                    case 0x69:
                    case 0x6F:
                    case 0x75:
                        count++;
                        break;
                }

            System.out.println(count);
        }
    }
}