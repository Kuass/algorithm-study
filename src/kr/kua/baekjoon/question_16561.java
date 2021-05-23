package kr.kua.baekjoon;

import java.util.Scanner;

public class question_16561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        int sum = 1;
        int count = 2;
        for(int i = 9; i < a; i += 3) {
            sum += count;
            count += 1;
        }

        System.out.println(sum);
    }
}