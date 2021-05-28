package kr.kua.baekjoon;

import java.util.Scanner;

public class question_10996 { // 별 찍기 - 21
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a * 2; i++) {
            for (int t = 0; t < a; t++)
                if ((i + t) % 2 == 0) System.out.printf("*");
                else System.out.printf(" ");
            System.out.println();
        }
    }
}