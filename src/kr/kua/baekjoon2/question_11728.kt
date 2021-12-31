package kr.kua.baekjoon2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // 배열 합치기
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    var token = StringTokenizer(readLine())
    val N = token.nextToken().toInt()
    val M = token.nextToken().toInt()

    val list = mutableListOf<Int>()
    token = StringTokenizer(readLine())
    while(token.hasMoreTokens()) list.add(token.nextToken().toInt())

    token = StringTokenizer(readLine())
    while(token.hasMoreTokens()) list.add(token.nextToken().toInt())

    writer.write(list.sorted().joinToString(" "))
    writer.close()
    close()
}