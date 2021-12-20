package kr.kua.baekjoon2

fun main() { // 정열적인 정렬
    readLine();print(readLine()!!.split(' ').map { it.toInt() }.sorted().joinToString(" "))
}