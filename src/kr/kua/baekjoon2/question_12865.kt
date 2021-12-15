package kr.kua.baekjoon2.question_14865

fun main() = with(System.`in`.bufferedReader()) { // 평범한 배낭
    val (N, K) = readLine().split(" ").map { it.toInt() }
    val obj = Array(N) { 0 to 0 }
    repeat(N) { i -> obj[i] = readLine().split(" ").let { it[0].toInt() to it[1].toInt() } }
    for (i in 0 until obj.count()) {
        for (j in 0 until obj.count()) {
            if (i == j) continue
            if ()
        }
    }
}