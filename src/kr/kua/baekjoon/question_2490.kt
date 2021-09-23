package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 윷놀이
    repeat(3) {
        var front = 0
        readLine().split(" ").map { if (it == "0") front++ }

        when (front) {
            1 -> println("A")
            2 -> println("B")
            3 -> println("C")
            4 -> println("D")
            0 -> println("E")
        }
    }
}

fun main3() = with(System.`in`.bufferedReader()) { // 윷놀이
    repeat(3) {
        val yut = readLine().split(" ").map { it.toInt() }.groupingBy { it }.eachCount()
        val keyList = yut.toList()
        if (yut.size == 2) {
            val front = if (keyList[0].first == 0) keyList[0].second else keyList[1].second
            val back = if (keyList[0].first == 1) keyList[0].second else keyList[1].second
            when {
                front == 1 && back == 3 -> println("A") // 도
                front == 2 && back == 2 -> println("B") // 개
                front == 3 && back == 1 -> println("C") // 걸
            }
        } else if (keyList[0].first != 0) println("E") // 모
        else println("D") // 윷
    }
}