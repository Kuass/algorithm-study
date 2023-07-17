package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 홀수일까 짝수일까
    repeat(readLine().toInt()) { println(if (readLine().let { it.substring(it.length - 2, it.length) }.toInt() % 2 == 1) "odd" else "even") }
}