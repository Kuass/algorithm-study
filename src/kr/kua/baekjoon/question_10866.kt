package kr.kua.baekjoon

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 덱
    val dq = ArrayDeque<Int>()
    repeat(readLine().toInt()) {
        val input = readLine()
        if(input.contains(" ")) {
            when(input.split(" ")[0]) {
                "push_front" -> dq.addLast(input.split(" ")[1].toInt())
                "push_back" -> dq.addFirst(input.split(" ")[1].toInt())
            }
        } else {
            println(when(input) {
                "pop_front" -> if(dq.isEmpty()) -1 else dq.pollLast()
                "pop_back" -> if(dq.isEmpty()) -1 else dq.pollFirst()
                "size" -> dq.size
                "empty" -> if(dq.isEmpty()) 1 else 0
                "front" -> if(dq.isEmpty()) -1 else dq.peekLast()
                "back" -> if(dq.isEmpty()) -1 else dq.peekFirst()
                else -> -1
            })
        }
    }
}