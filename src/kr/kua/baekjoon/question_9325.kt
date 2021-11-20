package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 얼마?
    repeat(readLine().toInt()) {
        var r = readLine().toInt()
        repeat(readLine().toInt()) { readLine().split(" ").map { it.toInt() }.let { r += (it[0] * it[1]) } }
        println(r)
    }
}