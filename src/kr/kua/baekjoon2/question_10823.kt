package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 더하기 2
    val sb = StringBuilder()
    while (true) {
        val input = readLine()
        if (input.isNullOrBlank()) break
        sb.append(input)
    }
    print(sb.split(',').sumOf { it.toInt() })
}
