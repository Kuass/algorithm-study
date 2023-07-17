package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 수 정렬하기
    val list = mutableListOf<Int>()
    repeat(readLine().toInt()) { list.add(readLine().toInt()) }
    list.sorted().forEach { println(it) }
}