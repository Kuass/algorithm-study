package kr.kua.baekjoon;

import java.util.Scanner;

public class question_10992 { // 별 찍기 - 17
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.printf(getStackSpace(a - i - 1, " "));
            if (i == 0) System.out.println("*");
            else if (i == a - 1) System.out.println(getStackSpace(i * 2 + 1, "*"));
            else System.out.println("*" + getStackSpace(i * 2 - 1, " ") + "*");
        }
    }

    public static String getStackSpace(int count, String str) {
        StringBuilder sb = new StringBuilder();
        while(count-- > 0) sb.append(str);
        return sb.toString();
    }
}