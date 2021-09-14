package kr.kua.baekjoon

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // 곱셈
    val N = arrayOf(readLine().toInt(), readLine().toInt())
    val M = arrayOf(N[1] % 10* N[0], N[1] / 10 % 10* N[0], N[1] / 100 % 10* N[0])
    print("${M[0]}\n${M[1]}\n${M[2]}\n${M[0] + (M[1] * 10) + (M[2] * 100)}")
}