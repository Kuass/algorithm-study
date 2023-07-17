package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 미국 스타일
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        sb.appendLine(readLine().split(' ').let {
            when(it[1]) {
                "kg" -> "${String.format("%.4f", it[0].toDouble() * 2.2046)} lb"
                "l" -> "${String.format("%.4f", it[0].toDouble() * 0.2642)} g"
                "lb" -> "${String.format("%.4f", it[0].toDouble() * 0.4536)} kg"
                else -> "${String.format("%.4f", it[0].toDouble() * 3.7854)} l" // gallon
            }
        })
    }
    print(sb)
}