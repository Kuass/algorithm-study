package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 별 찍기 - 6
    val sb = StringBuilder()
    val N = readLine().toInt()
    for (i in N downTo 0) {
        repeat(N - i) { sb.append(" ") }
        repeat(i * 2 - 1) { sb.append("*") }
        sb.appendLine()
    }
    print(sb)
}