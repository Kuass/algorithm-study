package baekjoon_10000_14999

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 큐
    val n = readLine().toInt()
    val queue = LinkedList<Int>()
    var last = 0

    for (i in 0 until n) {
        val command = readLine().split(" ")

        when (command[0]) {
            "push" -> {
                last = command[1].toInt()
                queue.add(command[1].toInt())
            }
            "pop" -> if (queue.isEmpty()) println(-1) else println(queue.poll())
            "size" -> println(queue.size)
            "empty" -> if (queue.isEmpty()) println(1) else println(0)
            "front" -> if (queue.isEmpty()) println(-1) else println(queue.peek())
            "back" -> if (queue.isEmpty()) println(-1) else println(last)
        }
    }
}