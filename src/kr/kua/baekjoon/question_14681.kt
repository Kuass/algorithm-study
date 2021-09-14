package kr.kua.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // 사분면 고르기
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (x, y) = arrayOf(readLine().toInt(), readLine().toInt())
    if (x > 0 && y > 0) bw.write("1") else if (x < 0 && y > 0) bw.write("2") else if (x < 0 && y < 0) bw.write("3") else if (x > 0 && y < 0) bw.write("4")
    bw.flush()
}