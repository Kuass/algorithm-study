package kr.kua.baekjoon.until_2021_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_1152 { // 단어의 개수
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var words = Arrays.stream(br.readLine().split(" ")).filter(a -> !a.isBlank());
        System.out.print(words.count());
        br.close();
    }
}