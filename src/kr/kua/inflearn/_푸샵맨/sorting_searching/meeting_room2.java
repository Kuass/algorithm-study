package kr.kua.inflearn._푸샵맨.sorting_searching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class meeting_room2 {
    public static void main(String args[]) {
        int[][] temp = new int[][] { { 5, 10 }, { 16, 20 }, { 0, 30 } };
        System.out.println(solution1(temp));

        temp = new int[][] { { 7, 10 }, { 2, 4 } };
        System.out.println(solution1(temp));
    }

    ///
    static int solution1(int[][] intervals) {
        // 1
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]); // ASC
        Queue<int[]> q = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        // 2. for pq
        for (int[] arr : intervals) {
            if (q.isEmpty()) q.offer(arr);
            else {
                if (q.peek()[1] <= arr[0]) {
                    q.poll();
                }
                q.offer(arr);
            }
        }

        return q.size();
    }
}
