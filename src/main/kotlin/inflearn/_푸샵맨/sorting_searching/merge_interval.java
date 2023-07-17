package inflearn._푸샵맨.sorting_searching;

import java.util.*;

public class merge_interval {
    public static void main(String args[]) {
        int[][] temp = new int[][] { { 1, 4 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
        int[][] res = solution1(temp);
        for (int[] arr : res)
            System.out.println(Arrays.toString(arr));
    }

    ///
    static int[][] solution1(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        // 1. ds
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]); // ASC

        // 2. for while
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (end >= intervals[i][0]) {
                end = Math.max(end, intervals[i][1]);
            } else {
                result.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[] { start, end });

        return result.toArray(new int[result.size()][]);
    }
}
