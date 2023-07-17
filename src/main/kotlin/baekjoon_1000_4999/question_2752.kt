package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 세수정렬
    print(readLine().split(" ").map { it.toInt() }.sorted().joinToString(" "))
}