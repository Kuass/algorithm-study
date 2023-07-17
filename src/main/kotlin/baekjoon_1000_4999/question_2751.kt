package kr.kua.baekjoon

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // 수 정렬하기 2
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Int>()
    repeat(readLine().toInt()) { list.add(readLine().toInt()) }
    list.sorted().forEach { bw.write("$it\n") }
    bw.flush()
}