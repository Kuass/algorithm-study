package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_9498 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var score = Integer.parseInt(br.readLine());
        if (score > 89) System.out.print("A");
        else if (score > 79) System.out.print("B");
        else if (score > 69) System.out.print("C");
        else if (score > 59) System.out.print("D");
        else System.out.print("F");
    }
}