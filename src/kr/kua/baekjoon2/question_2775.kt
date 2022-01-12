package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 부녀회장이 될테야
    val apart = Array(15) { IntArray(15) }
    val sb = StringBuilder()
    for (i in apart[0].indices) apart[0][i] = i
    repeat(readLine().toInt()) {
        val k = readLine().toInt()
        val n = readLine().toInt()
        if (apart[k][n] == 0)
            for(i in 1 .. k) for(j in 1 .. n) if (apart[i][j] == 0) {
                var sum = 0
                for (m in 1..n) {
                    sum += apart[i - 1][m]
                    apart[i][m] = sum
                }
            }
        sb.appendLine(apart[k][n])
    }
    print(sb)
}