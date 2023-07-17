package inflearn._푸샵맨.array;

public class TrappingRainWater { // 빗물담기
    public static void main(String args[]) {
        int[] nums = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(solve2(nums));
    }

    static int solve(int[] heights) {
        int result = 0;

        // 1. leftMax[]
        int len = heights.length; // 12
        int[] lefts = new int[len];
        int[] rights = new int[len];

        int max = heights[0];
        lefts[0] = heights[0];

        for (int i = 0; i < len; i++) {
            if (heights[i] < max) {
                lefts[i] = max;
            } else {
                lefts[i] = heights[i];
                max = heights[i];
            }
        }

        // 2. rightMax[]
        max = heights[len - 1];
        rights[len - 1] = heights[len - 1];

        for (int i = len - 2; i >= 0; i--) {
            if (heights[i] < max) {
                rights[i] = max;
            } else {
                rights[i] = heights[i];
                max = heights[i];
            }
        }

        // 3. min()-height
        for (int i = 0; i < len; i++) {
            result += Math.min(lefts[i], rights[i]) - heights[i];
        }

        return result;
    }

    static int solve2(int[] heights) {
        int result = 0;
        int n = heights.length;

        for (int i = 1; i < n - 1; i++) {
            int maxLeft = 0, maxRight = 0;
            for (int j = i; j >= 0; j--) maxLeft = Math.max(maxLeft, heights[j]);
            for (int j = i; j < n; j++) maxRight = Math.max(maxRight, heights[j]);
            result += Math.min(maxLeft, maxRight) - heights[i];
        }

        return result;
    }
}
