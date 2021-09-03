package kr.kua.baekjoon

import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) { // 1로 만들기
    val N = readLine().toInt()
    val dp = IntArray(N + 1)
    for (i in 2..N) {
        dp[i] = dp[i - 1] + 1
        if (i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1)
        if (i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1)
    }
    println(dp[N])
}