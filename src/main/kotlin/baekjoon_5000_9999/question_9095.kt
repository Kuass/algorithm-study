package kr.kua.baekjoon2

var dp = IntArray(11)
fun main() = with(System.`in`.bufferedReader()) { // 1, 2, 3 더하기
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4..10) dp[i] = dp[i - 3] + dp[i - 2] + dp [i - 1]
    for (i in 0 until readLine().toInt()) println(dp[readLine().toInt()])
}