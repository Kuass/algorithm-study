package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 10부제
    val N = readLine()
    var sum = 0
    readLine().split(" ").forEach { if(N == it) sum++ }
    print(sum)
}