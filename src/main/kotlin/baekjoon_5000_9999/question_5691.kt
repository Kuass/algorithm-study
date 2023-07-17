package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 평균 중앙값 문제
    while(true) {
        val (A, B) = readLine().split(" ").map { it.toInt() }
        if (A == 0 && B == 0) break
        println(2 * A - B)
    }
}