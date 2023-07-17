package inflearn._푸샵맨.strings;

import java.util.Arrays;

public class plusOne {
    public static void main(String args[]) {
        int[] temp = new int[] { 1,2,3 };
        System.out.println(Arrays.toString(solve(temp)));
    }

    static int[] solve(int[] digits) {

        int n = digits.length; // 3

        for (int i = n-1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) return digits;
            digits[i] = 0;
        }

        int[] result = new int[n+1];
        result[0] = 1;

        return result;
    }
}
