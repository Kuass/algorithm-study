package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class question_2164 { // 카드2
    public static void main(String[] args) throws IOException { // 덱
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());

        var deque = new ArrayDeque<>();
        while(N != 0)
            deque.offerFirst(N--);

        while(deque.size() > 1) {
            deque.removeFirst();
            deque.offerLast(deque.pollFirst());
        }

        System.out.print(deque.pollFirst());

        br.close();
    }

    public static void main_Queue(String[] args) throws IOException { // 큐
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());

        var queue = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            queue.offer(i);

        while(queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.print(queue.poll());

        br.close();
    }
}