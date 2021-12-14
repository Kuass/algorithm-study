package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 히스토그램
    repeat(readLine().toInt()) {
        repeat(readLine().toInt()) { print("=") }
        println()
    }
}