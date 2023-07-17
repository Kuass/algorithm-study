package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 히스토그램
    repeat(readLine().toInt()) {
        repeat(readLine().toInt()) { print("=") }
        println()
    }
}