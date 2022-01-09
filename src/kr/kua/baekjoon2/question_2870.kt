package kr.kua.baekjoon2

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) { // 수학숙제
    val list = mutableListOf<BigInteger>()
    repeat(readLine().toInt()) {
        val str = readLine()
        // readLine().split(Regex("[^0-9]+"))
        // split 에 정규식을 넣을 수 있었다..!

        var startIndex = 0
        var startDigit = false
        for (i in 0..str.length) {
            if (str.length == i) {
                if (startDigit) list.add(str.substring(startIndex, i).toBigInteger())
                break
            }
            if (str[i].isDigit()) {
                if (!startDigit) startIndex = i
                startDigit = true
            } else  if (startDigit) {
                startDigit = false
                list.add(str.substring(startIndex, i).toBigInteger())
            }
        }
    }

    val sb = StringBuilder()
    list.sort()
    list.forEach { sb.appendLine(it) }
    print(sb)
}