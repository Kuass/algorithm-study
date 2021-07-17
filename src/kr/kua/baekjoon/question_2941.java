package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2941 { // 크로아티아 알파벳
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var S = br.readLine();
        var HR = new String[] { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for (String s : HR)
            if (S.contains(s)) S = S.replaceAll(s, " ");

        System.out.print(S.length());
    }
}