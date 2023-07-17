package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 주차의 신
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        println(readLine().split(" ").map { it.toInt() }.toIntArray().sorted().let { (it[n - 1] - it[0]) * 2 })
    }
}