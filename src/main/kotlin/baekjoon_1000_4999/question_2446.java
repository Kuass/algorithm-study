package baekjoon_1000_4999;

import java.util.Scanner;
import java.util.Stack;

public class question_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < a; i++) {
            stack.add(getStackString(i, " ") + getStackString((a - i) * 2 -1, "*"));
            System.out.println(stack.peek());
        }
        while(stack.size() != 1) {
            stack.pop();
            System.out.println(stack.peek());
        }
    }

    public static String getStackString(int count, String str) {
        StringBuilder sb = new StringBuilder();
        while(count-- > 0) sb.append(str);
        return sb.toString();
    }
}