package kr.kua.inflearn._푸샵맨.array;

import java.util.Arrays;
import java.util.Stack;

public class dailyTemperature {
    public static void main(String args[]) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        System.out.println(Arrays.toString(solve_for(temperatures)));
        System.out.println(Arrays.toString(solve_stack(temperatures)));
    }

    // stack
    static int[] solve_stack(int[] temperatures) {
        // 1. ds
        int len = temperatures.length;
        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {

            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                result[index] = i - index; // 1 - 0
            }

            stack.push(i); // 0
        }

        return result;
    }

    // for
    static int[] solve_for(int[] temperatures) {
        // 1. ds
        int len = temperatures.length;
        int[] result = new int[len];
        int count = 0, j;

        // 2. for
        for (int i = 0; i < len; i++) {
            for (j = i + 1; j < len - 1; j++) {
                count++;
                if (temperatures[i] < temperatures[j]) break;
            }
            if (j == len) result[i] = 0;
            else result[i] = count;
            count = 0;
        }

        return result;
    }
}
