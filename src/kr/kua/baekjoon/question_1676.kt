package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 팩토리얼 0의 개수
    val N = readLine().toInt()
    print(N / 5 + N / 25 + N / 125)
}