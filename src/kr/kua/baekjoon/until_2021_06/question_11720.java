package kr.kua.baekjoon.until_2021_06;

import java.util.Scanner;

public class question_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        int r = 0;
        for (int i = 0; i < a; i++) {
            r += Character.getNumericValue(b.charAt(i));
        }

        System.out.println(r);
    }
}

