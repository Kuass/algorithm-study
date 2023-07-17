package kr.kua.baekjoon

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 에디터
    val lStack = Stack<Char>()
    val rStack = Stack<Char>()

    readLine().forEach { lStack.push(it) }

    repeat(readLine().toInt()) {
        val word = readLine()

        when(word[0]) {
            'P' -> lStack.push(word[2])
            'L' -> if (lStack.isNotEmpty()) rStack.push(lStack.pop())
            'B' -> if (lStack.isNotEmpty()) lStack.pop()
            'D' -> if (rStack.isNotEmpty()) lStack.push(rStack.pop())
        }
    }

    print(lStack.toCharArray() + rStack.toCharArray().reversed())
}

// 시간초과..
//fun main() = with(System.`in`.bufferedReader()) { // 에디터
//    val queue = LinkedList<Char>()
//    readLine().forEach { queue.add(it) }
//
//    val iter = queue.listIterator()
//    while (iter.hasNext()) { iter.next() }
//
//    repeat(readLine().toInt()) {
//        val word = readLine()
//        when (word[0]) {
//            'L' -> if (iter.hasPrevious()) iter.previous()
//            'D' -> if (iter.hasNext()) iter.next()
//            'B' -> if (iter.hasPrevious()) {
//                iter.previous()
//                iter.remove()
//            }
//            'P' -> iter.add(word[2])
//        }
//    }
//
//    queue.forEach { print(it) }
//}