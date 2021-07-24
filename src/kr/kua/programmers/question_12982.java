package kr.kua.programmers;

import java.util.Arrays;

public class question_12982 { // 예산
    public static void main(String[] args) {
        int result = solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println("result : " + result);
    }

    public static int solution(int[] d, int budget) {
        var i = 0;
        var sum = 0;
        Arrays.sort(d);
        while (i < d.length)
            if (budget < (d[i] + sum)) break;
            else sum += d[i++];

        return i;
    }
}

