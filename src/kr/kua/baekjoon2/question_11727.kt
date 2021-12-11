package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 2xn 타일링 2
    val N = readLine().toInt()
    val dp = IntArray(N + 2)
    dp[1] = 1;
    dp[2] = 3;

    for (i in 3..N) dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007
    print(dp[N] % 10007)
}