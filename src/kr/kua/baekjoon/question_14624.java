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
            System.out.println(getStackString(a, "*"));
            int c = Math.round(a / 2) + 1;
            for (int i = 0; i < c; i++) {
                if (i == 0) System.out.println(getStackString(a / 2, " ") + "*");
                else {
                    int center = (i == 1) ? i : i * 2 - 1;
                    System.out.println(getStackString(a / 2 - i, " ") + "*" + getStackString(center, " ") + "*" );
                }
            }
        }
    }

    public static String getStackString(int count, String str) {
        StringBuilder sb = new StringBuilder();
        while(count-- != 0) sb.append(str);
        return sb.toString();
    }
}

