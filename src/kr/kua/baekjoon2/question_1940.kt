package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 주몽
    val N = readLine().toInt()
    val M = readLine().toInt()
    val materials = readLine().split(' ').map { it.toInt() }
    var count = 0

    for (i in 0 until N) for (j in i + 1 until N) if (materials[i] + materials[j] == M) { count++; break }
    print(count)
}