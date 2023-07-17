package kr.kua.baekjoon2.question_2979

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 트럭 주차
    val (A, B, C) = readLine().split(' ').map { it.toInt() }
    var sum = 0
    val arr = IntArray(100)
    val minHeap = PriorityQueue<Int>()
    val maxHeap = PriorityQueue<Int>(compareByDescending{it})
    repeat(3) { readLine().split(' ').map { it.toInt() }.let {
        for(i in it[0] until it[1]) arr[i]++
        minHeap.add(it[0])
        maxHeap.add(it[1])
    }}
    for (i in minHeap.peek() until maxHeap.peek()) {
        sum += when(arr[i]) {
            1 -> A * arr[i]
            2 -> B * arr[i]
            else -> C * arr[i]
        }
    }
    print(sum)
}