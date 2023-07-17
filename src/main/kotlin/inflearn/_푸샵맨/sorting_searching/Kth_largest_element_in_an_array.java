package inflearn._푸샵맨.sorting_searching;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kth_largest_element_in_an_array {
    public static void main(String args[]) {

        int[] nums = { 2, 3, 1, 5, 6, 4 };

        System.out.println(solution1(nums, 2));

        System.out.println(solution2(nums, 2));
    }

    /// Sort 방식
    static int solution1(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }

    /// PriorityQueue(MinHeap) 방식
    static int solution2(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(); // ASC MinHeap

        for (int i : nums) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
