package kr.kua.baekjoon

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 프린터 큐
    repeat(readLine().toInt()) {
        val (N, M) = readLine().split(" ").map { it.toInt() }

        val queue = LinkedList<Pair<Int, Int>>()
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        var count = 0

        val st = StringTokenizer(readLine())
        for(j in 0 until N) {
            val priority: Int = Integer.parseInt(st.nextToken())
            queue.offer(Pair(j, priority))
            pq.offer(priority)
        }
        while(!queue.isEmpty()) {
            val job = queue.poll()
            if(job.second == pq.peek()) {
                count++
                pq.poll()
                if(job.first == M) break
            } else queue.offer(job)
        }
        println(count)
    }
}