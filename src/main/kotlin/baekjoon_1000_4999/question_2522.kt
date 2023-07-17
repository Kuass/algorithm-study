package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 별 찍기 - 12
    val N = readLine().toInt()
    val sb = StringBuilder()
    for(i in 1..N * 2) {
        if (i == N) repeat(N) { sb.append("*") }
        else if (i > N) {
            val v = i - N
            repeat(v) { sb.append(" ") }
            repeat(N - v) { sb.append("*") }
        } else {
            repeat(N - i) { sb.append(" ") }
            repeat(i) { sb.append("*") }
        }
        sb.appendLine()
    }
    print(sb)
}