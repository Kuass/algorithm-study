package inflearn._푸샵맨.queueAndStack;

import java.util.*;

public class baseballGame {
    public static void main(String args[]) {
        String[] strs = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        baseballGame a = new baseballGame();
        System.out.println(a.solve(strs));
    }

    public int solve(String[] strs) {
        // 1.
        Stack<Integer> stack = new Stack<>();

        // 2.
        for (String op : strs) {
            switch(op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y);
                    stack.push(x);
                    stack.push(x + y);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
