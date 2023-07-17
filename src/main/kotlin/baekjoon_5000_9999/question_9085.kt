package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 더하기
    repeat(readLine().toInt()) { readLine(); println(readLine().split(" ").map { it.toInt() }.toMutableList().sum()) }
}