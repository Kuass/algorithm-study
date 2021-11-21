package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 플러그
    var (N, s) = arrayOf(readLine().toInt(), 0)
    repeat(N) { s += readLine().toInt() }
    print(s - (N - 1))
}