package baekjoon_10000_14999

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 바구니 뒤집기
    val (N, M) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(N + 1) { it }
    repeat(M) {
        var (i, j) = readLine().split(" ").map { it.toInt() }
        while(i < j) {
            val v = arr[i]
            arr[i++] = arr[j]
            arr[j--] = v
        }
    }

    print(arr.copyOfRange(1, arr.size).joinToString(" "))
}

fun main6() = with(System.`in`.bufferedReader()) { // 바구니 뒤집기
    val (N, M) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(N + 1) { it }
    repeat(M) {
        val stack = Stack<Int>()
        val (i, j) = readLine().split(" ").map { it.toInt() }
        for (m in i..j) stack.push(arr[m])
        for (m in i..j) arr[m] = stack.pop()
    }

    print(arr.copyOfRange(1, arr.size).joinToString(" "))
}