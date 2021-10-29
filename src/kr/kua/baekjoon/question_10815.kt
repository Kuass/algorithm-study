package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 숫자 카드
    readLine()
    val N = readLine().split(" ").map { it.toInt() }.toMutableSet()
    readLine()
    val sb = StringBuilder()
    readLine().split(" ").map { sb.append(if(N.contains(it.toInt())) "1 " else "0 ") }
    print(sb)
}