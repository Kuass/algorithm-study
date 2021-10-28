package kr.kua.inflearn._푸샵맨.array;

import java.util.Arrays;
import java.util.Stack;

public class maximumSubarray { // 서브어레이 최대값
    public static void main(String args[]) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(solve(nums));
    }

    static int solve(int[] nums) {
        // 1.
        int curMax = nums[0];
        int allMax = nums[0];

        // 2.
        for(int i = 1; i < nums.length; i++) {
            curMax = Math.max(nums[i], nums[i] + curMax);
            allMax = Math.max(allMax, curMax);
        }

        return allMax;
    }
}
