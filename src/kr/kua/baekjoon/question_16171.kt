package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 나는 친구가 적다 (Small)
    val S = readLine().replace("[0-9]".toRegex(), "")
    print(if(S.contains(readLine())) 1 else 0)
}