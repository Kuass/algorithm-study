package kr.kua.baekjoon2.question_14852

lateinit var d: Array<LongArray>
fun main() = with(System.`in`.bufferedReader()) { // 타일 채우기 3
    val N = readLine().toInt()
    d = Array(N + 2) { LongArray(2) }
    print(dp(N))
}

fun dp(x: Int): Long {
    d[0][0] = 0
    d[1][0] = 2
    d[2][0] = 7
    d[2][1] = 1
    for (i in 3..x) {
        d[i][1] = (d[i - 1][1] + d[i - 3][0]) % 1000000007
        d[i][0] = (3 * d[i - 2][0] + 2 * d[i -1][0] + 2 * d[i][1]) % 1000000007
    }
    return d[x][0];
}