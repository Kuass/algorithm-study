package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class question_3052 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var hs = new HashSet<Integer>();
        for (var i = 0; i < 10; i++) hs.add(Integer.parseInt(br.readLine()) % 42);
        System.out.print(hs.size());
    }
}