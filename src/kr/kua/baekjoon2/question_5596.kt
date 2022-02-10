package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 시험 점수
    print(arrayOf(readLine().split(' ').sumOf { it.toInt() }, readLine().split(' ').sumOf { it.toInt() }).maxOrNull())
}