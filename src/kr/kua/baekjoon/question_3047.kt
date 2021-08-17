package kr.kua.baekjoon

import java.util.*

fun main() = with(Scanner(System.`in`)) { // ABC
    var T = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var A = readLine()

    if (A != null) {
        for (i in A) {
            when (i) {
                'A' -> print("${T[0]} ")
                'B' -> print("${T[1]} ")
                'C' -> print("${T[2]} ")
            }
        }
    }
}