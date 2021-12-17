package kr.kua.baekjoon2

fun main() { // 주디와 당근농장
    val (N, R, C) = readLine()!!.split(' ').map { it.toInt() }
    val match = if((R + C) % 2 == 0) 0 else 1 // R 과 C 를 더한 값이 0으로 나누어 떨어진다면 짝수, 아니면 홀수
    val sb = StringBuilder()
    for (i in 1..N) {
        for (j in 1..N) {
            if ((i + j) % 2 == match) sb.append('v')
            else sb.append('.')
        }
        sb.appendLine()
    }
    print(sb)
}