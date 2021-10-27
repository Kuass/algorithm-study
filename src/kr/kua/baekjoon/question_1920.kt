package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 수 찾기
    val list = mutableSetOf<Long>()
    val sb = StringBuilder()
    readLine(); readLine().split(" ").map { list.add(it.toLong()) }
    readLine(); readLine().split(" ").map { sb.appendLine(if (list.contains(it.toLong())) 1 else 0) }
    print(sb)
}