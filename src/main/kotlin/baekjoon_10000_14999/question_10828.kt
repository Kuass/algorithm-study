package baekjoon_10000_14999

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) { // 스택
    val stack = Stack<Int>()
    repeat(readLine().toInt()) {
        val input = readLine()
        if(input.contains(" ")) {
            stack.push(input.split(" ")[1].toInt())
        } else {
            println(when(input) {
                "pop" -> if(stack.empty()) -1 else stack.pop()
                "size" -> stack.size
                "empty" -> if(stack.empty()) 1 else 0
                "top" -> if(stack.empty()) -1 else stack.peek()
                else -> -1
            })
        }
    }
}