package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // Yangjojang of The Year
    repeat(readLine().toInt()) { _ ->
        val map = mutableMapOf<String, Int>()
        repeat(readLine().toInt()) { _ -> readLine().split(" ").let { map[it[0]] = it[1].toInt() } }
        println(map.maxByOrNull { it.value }?.key)
    }
}