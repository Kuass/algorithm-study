package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 덩치
    val N = readLine().toInt()
    val rank = IntArray(N) { 0 }
    val users = Array(N) { IntArray(2) }
    repeat(N) { i -> users[i] = readLine().split(" ").map { it.toInt() }.toIntArray() }
    for (i in 0 until N) for (j in 0 until N)
        if (users[i][0] > users[j][0] && users[i][1] > users[j][1]) rank[j]++
    rank.forEach { print("${it + 1} ") }
}