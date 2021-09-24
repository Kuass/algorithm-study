package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 큰 수 A+B
    print(readLine().split(" ").map { it.toBigDecimal() }.let { it[0] + it[1] })
}