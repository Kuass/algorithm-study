package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 주사위
    repeat(readLine().toInt()) { println("Case ${it + 1}: ${readLine().split(" ").map { it.toInt() }.sum()}") }
}