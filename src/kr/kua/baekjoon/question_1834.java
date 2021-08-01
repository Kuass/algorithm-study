package kr.kua.baekjoon;

import java.io.*;

public class question_1834 { // 나머지와 몫이 같은 수
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var N = Long.parseUnsignedLong(br.readLine());
        System.out.print((N - 1) * (N + 1 + (N + 1) * (N - 1)) / 2);
    }
}