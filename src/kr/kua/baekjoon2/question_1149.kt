package kr.kua.baekjoon2

import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) { // RGB거리
    val N = readLine().toInt()
    val rgb = Array(N + 1) { Triple(0, 0, 0) }
    for (i in 0 until N) rgb[i] = readLine().split(' ').map { it.toInt() }.let { Triple(it[0], it[1], it[2]) }
    val dp = Array(N + 1) { Triple(0, 0, 0) }
    dp[0] = rgb[0]
    for (i in 1 until N)
        dp[i] = Triple(rgb[i].first + min(dp[i - 1].second, dp[i - 1].third),
            rgb[i].second + min(dp[i - 1].first, dp[i - 1].third),
            rgb[i].third + min(dp[i - 1].first, dp[i - 1].second))
    print("${dp[N - 1].toList().minOfOrNull { it }}")
}