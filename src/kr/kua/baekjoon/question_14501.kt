package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 퇴사
    var (N, M) = arrayOf(readLine().toInt(), 0)
    val T = IntArray(N + 1)
    val P = IntArray(N + 1)
    val DP = IntArray(N + 1)

    for (i in 1..N) {
        readLine().split(" ").map { it.toInt() }.let { T[i] = it[0]; P[i] = it[1] }
        DP[i] = P[i]
    }

    for (i in 2..N) for (j in 1 until i) if (i - j >= T[j]) DP[i] = Math.max(P[i] + DP[j], DP[i])
    for (i in 1..N) if (i + T[i] <= N + 1 && M < DP[i]) M = DP[i]
    print(M)
}