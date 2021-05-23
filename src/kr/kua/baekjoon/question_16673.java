package kr.kua.baekjoon;

import java.util.Scanner;

public class question_16673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();

        System.out.print(K*C*(C+1)/2 + P*C*(C+1)*(2*C+1)/6);
    }
}