package kr.kua.baekjoon

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // 나머지
    val N = readLine().split(" ").map { it.toInt() }
    print("${(N[0]+N[1])%N[2]}\n${((N[0]%N[2])+(N[1]%N[2]))%N[2]}\n${(N[0]*N[1])%N[2]}\n${((N[0]%N[2])*(N[1]%N[2]))%N[2]}")
}