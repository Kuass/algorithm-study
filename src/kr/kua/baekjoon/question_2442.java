package kr.kua.baekjoon;

import java.util.Scanner;

public class question_2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.printf(getStackString(a - i - 1, " "));
            System.out.println(getStackString(i * 2 + 1, "*"));
        }
    }

    public static String getStackString(int count, String str) {
        StringBuilder sb = new StringBuilder();
        while(count-- > 0) sb.append(str);
        return sb.toString();
    }
}