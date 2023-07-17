package inflearn._푸샵맨.array;

import java.util.*;

public class missingRanges {
    public static void main(String args[]) { // 누락범위
        int[] nums = { 2, 3, 5, 50, 75 };
        System.out.println(solve(nums, 0, 99));
    }

    static List<String> solve(int[] nums, int lower, int upper) {
        // 1.
        List<String> result = new ArrayList<String>();

        // 2-1.
        if (lower < nums[0]) {
            result.add(makeRange(lower, nums[0] - 1)); // 0 -> 1
        }

        // 2-2.
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1] && nums[i] + 1 < nums[i + 1]) {
                // 6 -> 49
                result.add(makeRange(nums[i] + 1, nums[i + 1] - 1));
            }
        }

        // 2-3.
        if (upper > nums[nums.length - 1]) {
            result.add(makeRange(nums[nums.length - 1] + 1, upper)); // 76 -> 99
        }

        return result;
    }

    static String makeRange(int low, int high) {
        return low == high ? String.valueOf(low) : (low + "->" + high);
    }
}
