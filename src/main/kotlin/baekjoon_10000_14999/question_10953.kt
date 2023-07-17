package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // A+B - 6
    val sb = StringBuilder()
    repeat(readLine().toInt()) { sb.appendLine(readLine().split(',').sumOf { it.toInt() }) }
    print(sb)
}