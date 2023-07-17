package inflearn._푸샵맨.sorting_searching;

import java.util.Arrays;

public class move_zeros {
    public static void main(String args[]) {

        int[] nums = { 0, 3, 2, 0, 8, 5 };

        System.out.println(Arrays.toString(solution1(nums)));

        System.out.println(Arrays.toString(solution2(nums)));
    }

    /// Output : 3 2 8 5 0 0
    static int[] solution1(int[] nums) {
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < n) {
            nums[index] = 0;
            index++;
        }

        return nums;
    }

    /// Output : 0 0 3 2 8 5
    static int[] solution2(int[] nums) {
        int n = nums.length;
        int index = n-1;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index--;
            }
        }

        while (index >= 0) {
            nums[index] = 0;
            index--;
        }

        return nums;
    }
}
