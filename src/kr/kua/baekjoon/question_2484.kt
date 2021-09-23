package kr.kua.baekjoon

/*
    LinkedHashMap
    first : value
    second : count
 */

fun main() = with(System.`in`.bufferedReader()) { // 주사위 네개
    var (N, max) = arrayOf(readLine().toInt(), 0)

    repeat(N) {
        val dice = readLine().split(" ").map { it.toInt() }.groupingBy { it }.eachCount()
        val res: Int = when (dice.size) {
            1 -> 50000 + dice.keys.toList()[0] * 5000
            2 -> {
                val keyList = dice.toList()
                when {
                    keyList[0].second < keyList[1].second -> 10_000 + keyList[1].first * 1_000
                    keyList[0].second > keyList[1].second -> 10_000 + keyList[0].first * 1_000
                    else -> 2_000 + keyList[0].first * 500 + keyList[1].first * 500
                }
            }
            3 -> 1000 + dice.filter { it.value == 2 }.toList()[0].first * 100
            else -> dice.maxByOrNull { it.key }!!.key * 100
        }
        if (res > max) max = res
    }
    print(max)
}