package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 초콜릿 자르기
    print(readLine().split(" ").let { it[0].toInt() * it[1].toInt() - 1 })
}