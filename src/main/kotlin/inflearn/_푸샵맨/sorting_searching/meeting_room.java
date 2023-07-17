package inflearn._푸샵맨.sorting_searching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class meeting_room {
    public static void main(String args[]) {
        int[][] temp = new int[][] { { 5, 10 }, { 16, 20 }, { 0, 30 } };
        System.out.println(solution1(temp));

        temp = new int[][] { { 7, 10 }, { 2, 4 } };
        System.out.println(solution1(temp));
    }

    ///
    static boolean solution1(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return true;

        // 1. sorting
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        //        (a, b) -> a[0] - b[0]

        // 2. for
        int end = intervals[0][1]; // 0, 30
        for (int i = 1; i < intervals.length; i++) {
            // 5, 10
            if (intervals[i][0] < end) return false;
            else end = intervals[i][1];
        }

        return true;
    }
}
