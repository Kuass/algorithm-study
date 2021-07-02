package kr.kua.baekjoon.until_2021_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_1436 { // 영화감독 숌
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());

        var id = 666;
        var count = 0;
        while(true)
            if(String.valueOf(id++).contains("666") && ++count == N) {
                System.out.println(id - 1);
                break;
            }

        br.close();
    }
}