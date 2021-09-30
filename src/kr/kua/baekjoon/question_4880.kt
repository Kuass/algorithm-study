package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 다음수
    while (true) {
        val (a1, a2, a3) = readLine().split(" ").map { it.toInt() }
        if (a1 == 0 && a2 == 0 && a3 == 0) break
        else if (a2 - a1 == a3 - a2) println("AP ${a3 + (a2 - a1)}")
        else println("GP ${a3 * (a3 / a2)}")
    }
}