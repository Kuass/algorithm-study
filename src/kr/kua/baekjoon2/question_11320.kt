package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 삼각 무늬 - 1
    val T = readLine().toInt()
    repeat(T) {
        val (A, B) = readLine().split(" ").map { it.toInt() }
        val sub = A - B
        if (sub % B == 0) {
            println(Math.pow(sub / B + 1.0, 2.0).toInt())
        } else println(Math.pow(sub / B + 2.0, 2.0).toInt())
    }
}