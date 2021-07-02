package kr.kua.baekjoon.until_2021_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2439 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            System.out.print(getStackString(count - i, " ") + getStackString(i, "*"));
            System.out.print("\n");
        }
    }

    public static String getStackString(int count, String str) {
        StringBuilder sb = new StringBuilder();
        while(count-- > 0) sb.append(str);
        return sb.toString();
    }
}