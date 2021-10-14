package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 개표
    readLine()
    var v = 0
    readLine().toCharArray().forEach { if(it == 'A') v++ else v-- }
    print(when {
        v > 0 -> "A"
        v < 0 -> "B"
        else -> "Tie"
    })
}