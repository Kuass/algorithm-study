package kr.kua.baekjoon2

private var inspectCount = 0
fun main() = with(System.`in`.bufferedReader()) { // 바이러스
    val N = readLine().toInt()
    val dp = Array(N + 1) { IntArray(N + 1) }
    val ck = BooleanArray(N + 1)
    repeat(readLine().toInt()) { readLine().split(' ').map { it.toInt() }.let { dp[it[0]][it[1]] = 1; dp[it[1]][it[0]] = 1 } }
    dfs(dp, ck, 1)
    print(inspectCount - 1)
}

fun dfs(dp: Array<IntArray>, ck: BooleanArray, index: Int) {
    ck[index] = true
    inspectCount++
    for (i in 0 until dp[index].size) if (dp[index][i] == 1 && !ck[i]) dfs(dp, ck, i)
}