package kr.kua.baekjoon

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // A+B - 7
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for (i in 1..readLine().toInt()) { bw.write("Case #${i}: ${readLine().split(" ").sumOf { it.toInt() }}\n") }
    bw.flush()
}