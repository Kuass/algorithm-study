package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 손익분기점
    print(readLine().split(" ").map { it.toInt() }
        .let {
            if (it[1] >= it[2]) -1
            else it[0] / (it[2] - it[1]) + 1
        })
}