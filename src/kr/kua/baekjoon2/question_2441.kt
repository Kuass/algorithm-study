package kr.kua.baekjoon2

fun main() { // 별 찍기 - 4
    val N = readLine()!!.toInt()
    repeat(N) {
        repeat(it) { print(" ") }
        repeat(N - it) { print("*") }
        println()
    }
}