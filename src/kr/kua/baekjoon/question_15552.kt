package kr.kua.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // 빠른 A+B
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat (readLine().toInt()) { bw.write("${readLine().split(" ").sumOf { it.toInt() }}\n") }
    bw.flush()
}