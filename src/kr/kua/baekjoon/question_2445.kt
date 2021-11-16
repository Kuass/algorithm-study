package kr.kua.baekjoon

var N = 0
val sb = StringBuilder()
fun main() = with(System.`in`.bufferedReader()) { // 별 찍기 - 8
    N = readLine().toInt()
    for (i in 1..N) p(i)
    for (i in N - 1 downTo 1) p(i)
    print(sb)
}

fun p(i: Int) {
    repeat(i) { sb.append("*") }
    repeat(2 * (N - i)) { sb.append(" ") }
    repeat(i) { sb.append("*") }
    sb.appendLine()
}