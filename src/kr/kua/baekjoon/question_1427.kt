package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 소트인사이드
    print(readLine().toCharArray().map { it.digitToIntOrNull()?:0 }.sortedDescending().joinToString(""))
}
// OR print(readLine().toCharArray().map { it.code - 0x30 }.sortedDescending().joinToString(""))