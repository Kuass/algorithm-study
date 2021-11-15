package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 지능형 기차 2
    var (cur, max) = arrayOf(0, 0)
    repeat(10) {
        readLine().split(" ").map { it.toInt() }.let { cur -= it[0]; cur += it[1] }
        if (cur > max) max = cur
    }
    print(max)
}