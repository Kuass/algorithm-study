package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 더하기
    repeat(readLine().toInt()) { readLine(); println(readLine().split(" ").map { it.toInt() }.toMutableList().sum()) }
}