package kr.kua.baekjoon

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    nextLine()
    val r = nextLine().split(" ").map { it.toInt() }
    print("${r.minOrNull()} ${r.maxOrNull()}")
}

fun resolve2() = with(Scanner(System.`in`)) {
    nextLine()
    val r = nextLine().split(" ").map { it.toInt() }.toTypedArray().toList().sorted()
    print("${r[0]} ${r[r.size-1]}")
}

fun resolve1() = with(Scanner(System.`in`)) {
    nextLine()
    val r = nextLine().split(" ").map { it.toInt() }.toTypedArray().toList()
    print("${r.minOrNull()} ${r.maxOrNull()}")
}