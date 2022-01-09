package kr.kua.baekjoon2.question_1535

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 안녕
    val N = readLine().toInt()
    val feels = Array(N + 1) { 0 to 0 }
    val a = StringTokenizer(readLine())
    val b = StringTokenizer(readLine())
    repeat(N) { feels[it + 1] = a.nextToken().toInt() to b.nextToken().toInt() }
    val dp = Array(N + 1) { IntArray(100) }
    for (i in 1..N) for (j in 99 downTo 1)
        dp[i][j] = if (feels[i].first <= j && dp[i - 1][j - feels[i].first] + feels[i].second > dp[i - 1][j])
            dp[i - 1][j - feels[i].first] + feels[i].second else dp[i - 1][j]
    print(dp[N][99])
}