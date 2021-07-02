package kr.kua.baekjoon.until_2021_06;

import java.io.*;

public class question_1259 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        var line = br.readLine();
        while (!line.equals("0")) {
            var result = false;
            for (var i = 0; i < line.length() / 2; i++)
                if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                    result = true;
                    break;
                }

            if (result) System.out.println("no");
            else System.out.println("yes");

            line = br.readLine();
        }
    }
}