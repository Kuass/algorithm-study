package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // N번째 큰 수
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        sb.appendLine(readLine().split(' ').map { it.toInt() }.sorted().let { it[it.size - 3] })
    }
    print(sb)
}