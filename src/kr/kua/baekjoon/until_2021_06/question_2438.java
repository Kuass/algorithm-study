package kr.kua.baekjoon.until_2021_06;

import java.util.Scanner;

public class question_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            StringBuilder sb = new StringBuilder();
            for (int t = 0; t <= i; t++) sb.append("*");
            System.out.println(sb);
        }
    }
}