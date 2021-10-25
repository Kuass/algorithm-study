package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 세 수
    print(readLine().split(" ").map { it.toInt() }.sorted()[1])
}