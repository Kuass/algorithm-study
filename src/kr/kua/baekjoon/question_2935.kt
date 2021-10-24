package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 소음
    val A = readLine().toBigInteger()
    print(if(readLine() == "+") A + readLine().toBigInteger() else A * readLine().toBigInteger())
}