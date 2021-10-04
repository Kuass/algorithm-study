package kr.kua.baekjoon

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) { // 고급 수학
    repeat(readLine().toInt()) { it ->
        println("Scenario #${it+1}")
        val math = readLine().split(" ").map { i -> i.toDouble().pow(2) }
        println("${if(math[2] == math[0] + math[1]) "yes" else "no"}\n")
    }
}