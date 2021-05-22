package kr.kua.baekjoon;

import java.util.Scanner;

public class question_14624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if (a % 2 == 0) {
            System.out.println("I LOVE CBNU");
        } else {
            for (int i = 0; i < a; i++) System.out.printf("*");
            System.out.printf("\n");
            int c = Math.round(a / 2) + 1;
            for (int i = 0; i < c; i++) {
                if (i == 0) System.out.println(getSpace(a / 2) + "*");
                else {
                    int center = (i == 1) ? i : i * 2 - 1;
                    System.out.println(getSpace(a / 2 - i) + "*" + getSpace(center) + "*" );
                }
            }
        }
    }

    public static String getSpace(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append(" ");
        return sb.toString();
    }
}

