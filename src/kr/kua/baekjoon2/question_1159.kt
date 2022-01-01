package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 농구 경기
    val arr = IntArray(26)
    val sb = StringBuilder()
    repeat(readLine().toInt()) { arr[readLine()[0].code - 0x61]++ }
    arr.forEachIndexed { index, i -> if (i >= 5) sb.append((index + 0x61).toChar()) }
    print(if (sb.toString().isEmpty()) "PREDAJA" else sb)

}