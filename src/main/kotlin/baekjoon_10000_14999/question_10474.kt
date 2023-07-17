package kr.kua.baekjoon3

fun main() = with(System.`in`.bufferedReader()) { // 분수좋아해?
    while(true) {
        val (A, B) = kotlin.io.readLine()!!.split(" ").map { it.toInt() }
        if (A == 0 && B == 0) break else println("${A / B} ${A % B} / $B")
    }
}