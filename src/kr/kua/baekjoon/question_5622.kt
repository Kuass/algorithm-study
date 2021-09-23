package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 다이얼
    val dial = intArrayOf(3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10)
    print(readLine().fold(0) { total, next -> dial[next.code - 65] + total })
}