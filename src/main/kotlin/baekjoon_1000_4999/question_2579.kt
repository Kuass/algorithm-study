package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 계단 오르기
    val N = readLine().toInt()
    val dp = IntArray(300)
    val arr = IntArray(300)
    repeat(N) { arr[it] = readLine().toInt() }
    dp[0] = arr[0]
    dp[1] = arr[0] + arr[1]
    dp[2] = Math.max(arr[0] + arr[2], arr[1] + arr[2])

    for (i in 3 until N) dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i])
    print(dp[N - 1])
}