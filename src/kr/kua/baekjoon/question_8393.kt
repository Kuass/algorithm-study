package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 합
    var (n, r) = arrayOf(readLine().toInt(), 0)
    while(n != 0) r += n--
    print(r)
}