package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 캥거루 세마리
    val (A, B, C) = readLine().split(' ').map { it.toInt() }
    print(if(B - A == 1 && C - B == 1) 0 else Math.abs((if(C - B > B - A) C else A) - B) - 1)
}