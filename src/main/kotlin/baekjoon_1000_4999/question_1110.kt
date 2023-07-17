package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 더하기 사이클
    var N = readLine().toCharArray()
    if (N.size == 1) N = charArrayOf('0', N[0])
    var T = N
    var C = 0
    while(true) {
        val r = (T[0].code + T[1].code - 0x60).toString().toCharArray()
        T = charArrayOf(T[1], r[r.size - 1])
        C++
        if (N.contentEquals(T)) break
    }
    print(C)
}