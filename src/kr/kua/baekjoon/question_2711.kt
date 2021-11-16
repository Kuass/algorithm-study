package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 오타맨 고창영
    repeat(readLine().toInt()) {
        readLine().split(" ").let {
            println("${it[1].substring(0, it[0].toInt() - 1)}${it[1].substring(it[0].toInt(), it[1].length)}")
        }
    }
}