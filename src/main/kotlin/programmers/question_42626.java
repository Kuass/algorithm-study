package programmers;

import java.util.PriorityQueue;

public class question_42626 { // 더 맵게
    public static void main(String[] args) {
        int result = solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println("result : " + result);
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) pq.add(i);

        var cnt = 0;
        while (pq.peek() < K) {
            if (pq.size() == 1) return -1;
            pq.add(pq.poll() + (pq.poll() * 2));
            cnt++;
        }

        return cnt;
    }
}

