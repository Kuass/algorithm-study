package baekjoon_10000_14999

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 좌표 정렬하기
    val N = readLine().toInt()
    val arr = Array(N) { IntArray(2) }
    repeat(N) { i -> readLine().split(" ").map { it.toInt() }.let { arr[i][0] = it[0]; arr[i][1] = it[1] } }
    Arrays.sort(arr) { a, b -> if (a[0] == b[0]) return@sort a[1] - b[1] else return@sort a[0] - b[0] }
    repeat(N) { println("${arr[it][0]} ${arr[it][1]}") }
}