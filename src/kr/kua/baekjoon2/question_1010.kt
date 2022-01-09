package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 다리 놓기
    var T = readLine().toInt()
    val dp = Array(31) { LongArray(31) }
    for(i in 1 .. 30){
        dp[i][1] = i.toLong()
        for(j in 2 until i) dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        dp[i][i]=1
    }

    val sb = StringBuilder()
    while(T-->0){
        val (r, n) = readLine().split(' ').map{ it.toInt() }
        sb.appendLine("${dp[n][r]}")
    }

    print(sb)
}