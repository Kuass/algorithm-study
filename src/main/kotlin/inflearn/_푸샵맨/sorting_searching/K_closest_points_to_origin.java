package inflearn._푸샵맨.sorting_searching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class K_closest_points_to_origin {
    public static void main(String args[]) {
        int[][] temp = new int[][] { { 1, 3 }, { -2, 2 } };
        System.out.println(Arrays.deepToString(solution1(temp, 1)));
    }

    /// MinHeap
    static int[][] solution1(int[][] points, int k) {
        // 1. ds
        Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1])));
             // Same == new PriorityQueue<>((a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
        int[][] res = new int[k][2];

        // 2. for, while
        for (int[] p : points) pq.offer(p);

        int index = 0;
        while(index < k) {
            res[index] = pq.poll();
            index++;
        }

        return res;
    }

    /// MaxHeap
    static int[][] solution2(int[][] points, int k) {
        // 1. ds
        Queue<int[]> pq = new PriorityQueue<>((b, a) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
        int[][] res = new int[k][2];

        // 2. for, while
        for (int[] p : points) {
            pq.offer(p);
            if (pq.size() > k)
                pq.poll();
        }

        int index = 0;
        while(index < k) {
            res[index] = pq.poll();
            index++;
        }

        return res;
    }
}
