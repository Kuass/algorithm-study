package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_4999 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = br.readLine(); // 재환
        var nd = br.readLine(); // 의사
        if (st.length() >= nd.length()) System.out.print("go");
        else System.out.print("no");
    }
}