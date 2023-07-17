package inflearn._푸샵맨.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String args[]) {
        int[] nums = { 2, 8, 11, 14 };
        int target = 19;
        System.out.println(Arrays.toString(solve_for(nums, target)));
        System.out.println(Arrays.toString(solve(nums, target)));
    }

    /// O(n^2)
    static int[] solve_for(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) for (int j = i + 1; j < len; j++) if (target == nums[i] + nums[j]) return new int[]{ i+1, j+1 };
        return new int[] { 0, 0 };
    }

    /// O(n)
    static int[] solve(int[] nums, int target) {
        // 1. ds
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        // 2. for
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                result[0] = val + 1;
                result[1] = i + 1;
            } else {
                map.put(target - nums[i], i);
            }
        }

        return result;
    }
}
