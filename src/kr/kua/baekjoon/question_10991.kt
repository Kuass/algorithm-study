package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 별 찍기 - 16
    val N = readLine().toInt()
    val sb = StringBuilder()
    for (i in 1..N) {
        repeat(N - i) { sb.append(" ") }
        sb.append("*")
        if (i != 1) repeat(i - 1) { sb.append(" *") }
        sb.appendLine()
    }
    print(sb)
}