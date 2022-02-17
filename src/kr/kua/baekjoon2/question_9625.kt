package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // BABBA
    var (A, B) = arrayOf(0, 1)
    repeat(readLine()!!.toInt() - 1) {
        val t = A
        A = B
        B += t
    }
    print("$A $B")
}