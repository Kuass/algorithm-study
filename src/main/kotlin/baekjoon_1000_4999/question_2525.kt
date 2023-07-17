package kr.kua.baekjoon2

fun main() { // 오븐 시계
    var (A, B) = readLine()!!.split(" ").map { it.toInt() }
    var C = readLine()!!.toInt()

    while(C != 0) {
        val remain = 60 - B
        val minus = if(C >= remain) remain else C
        C -= minus
        B += minus
        if (B >= 60) {
            A++
            B = 0
        }
        if (A >= 24) A = 0
    }

    print("$A $B")
}