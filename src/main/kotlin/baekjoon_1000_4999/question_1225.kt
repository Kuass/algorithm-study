package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 이상한 곱셈
    val (A, B) = readLine().split(" ")
    print(A.fold(0L) { total, num -> total + B.sumOf { num.digitToInt() * it.digitToInt() } })
}

fun main7() = with(System.`in`.bufferedReader()) { // 이상한 곱셈
    val (A, B) = readLine().split(" ")
    print(A.toCharArray().sumOf { it.digitToInt() }.toLong() * B.toCharArray().sumOf { it.digitToInt() })
}