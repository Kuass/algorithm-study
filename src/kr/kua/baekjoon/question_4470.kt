package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 줄번호
    var N = readLine().toInt()
    for (i in 1..N) println("${i}. ${readLine()}")
}