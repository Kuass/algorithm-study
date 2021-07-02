package kr.kua.baekjoon.until_2021_06;

import java.util.Scanner;
import java.util.Stack;

public class question_2523 { // 별 찍기 - 13
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < a; i++) {
            StringBuilder sb = new StringBuilder();
            for (int t = 0; t <= i; t++) sb.append("*");
            stack.add(sb.toString());
            System.out.println(stack.peek());
        }
        while(stack.size() != 1) {
            stack.pop();
            System.out.println(stack.peek());
        }
    }
}