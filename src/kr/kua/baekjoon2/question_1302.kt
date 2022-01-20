package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 베스트셀러
     val map = mutableMapOf<String, Int>()
    repeat(readLine().toInt()) {
        val book = readLine()
        map[book] = (map[book] ?: 0) + 1
    }
    print(map.toSortedMap().maxByOrNull { it.value }!!.key)
}