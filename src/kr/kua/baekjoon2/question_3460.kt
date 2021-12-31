package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 이진수
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        val s = readLine().toUInt().toString(2)
        for (i in s.length - 1 downTo 0) if(s[i] == '1') sb.append("${s.length - 1 - i} ")
        sb.appendLine()
    }
    print(sb)
}