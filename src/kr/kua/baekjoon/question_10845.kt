package kr.kua.baekjoon

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 큐
    val queue = LinkedList<Int>()
    repeat(readLine().toInt()) {
        val input = readLine()
        if(input.contains(" ")) {
            queue.push(input.split(" ")[1].toInt())
        } else {
            println(when(input) {
                "pop" -> if(queue.isEmpty()) -1 else queue.pollLast()
                "size" -> queue.size
                "empty" -> if(queue.isEmpty()) 1 else 0
                "front" -> if(queue.isEmpty()) -1 else queue.peekLast()
                "back" -> if(queue.isEmpty()) -1 else queue.peekFirst()
                else -> -1
            })
        }
    }
}