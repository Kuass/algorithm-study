package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 배수 찾기
    val n = readLine().toInt()
    while (true) {
        val i = readLine().toInt()
        if (i == 0) break
        else if (i % n == 0) println("$i is a multiple of $n.")
        else println("$i is NOT a multiple of $n.")
    }
}