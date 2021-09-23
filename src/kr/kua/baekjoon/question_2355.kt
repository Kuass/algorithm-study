package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 시그마
    val (A, B) = readLine().split(" ").map { it.toLong() }
    print((A + B) * (Math.abs(B - A) + 1) / 2)
}