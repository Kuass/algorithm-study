package kr.kua.baekjoon;

import java.util.Scanner;

public class question_2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = a; i > 0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int t = i; t > 0; t--) sb.append("*");
            System.out.println(sb);
        }
    }
}