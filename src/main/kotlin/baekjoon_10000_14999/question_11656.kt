package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 접미사 배열
    val set = mutableSetOf<String>()
    val str = readLine()
    repeat(str.length) { set.add(str.substring(it)) }
    val sb = StringBuilder()
    set.sorted().forEach { sb.appendLine(it) }
    print(sb)
}