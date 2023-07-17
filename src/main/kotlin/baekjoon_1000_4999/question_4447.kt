package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 좋은놈 나쁜놈
    repeat(readLine().toInt()) {
        var count = 0
        val hero = readLine()
        hero.toCharArray().forEach {
            when (it.lowercaseChar()) {
                'g' -> count++
                'b' -> count--
            }
        }
        println("$hero is ${when {
            count == 0 -> "NEUTRAL"
            count > 0 -> "GOOD"
            else -> "A BADDY"
        }}")
    }
}