package kr.kua.baekjoon

import kotlin.math.abs
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) { // 터렛
    val N = readLine().toInt()
    var (x1, x2, y1, y2) = arrayOf(0, 0, 0, 0)
    var (r1, r2) = arrayOf(0, 0)

    for (i in 1..N) {
        readLine().split(" ").forEachIndexed { index, it ->
            when (index) {
                0 -> x1 = it.toInt()
                1 -> y1 = it.toInt()
                2 -> r1 = it.toInt()
                3 -> x2 = it.toInt()
                4 -> y2 = it.toInt()
                5 -> r2 = it.toInt()
            }
        }

        if (r1 < r2) {
            val xt = x2
            val yt = y2
            val rt = r2
            x2 = x1
            y2 = y1
            r2 = r1
            x1 = xt
            y1 = yt
            r1 = rt
        }

        val calc = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)
        var calcT: Int
        if (calc < r1 * r1) {
            calcT = (r1 - r2) * (r1 - r2)
            if (calc == calcT) {
                if (calc == 0) println(-1) else println(1)
            } else if (calc > calcT) println(2) else println(0)
        } else if (calc == r1 * r1) {
            println(2)
        } else {
            calcT = (r1 + r2) * (r1 + r2)
            if (calc == calcT) println(1) else if (calc < calcT) println(2) else println(0)
        }
    }
}

fun main2() = with(System.`in`.bufferedReader()) { // 터렛
    // 예제만 맞음
    val N = readLine().toInt()
    var (x1, x2, y1, y2) = arrayOf(0, 0, 0, 0)
    var (r1, r2) = arrayOf(0, 0)

    for (i in 1..N) {
        var count = 0

        readLine().split(" ").forEachIndexed { i, it ->
            when (i) {
                0 -> x1 = it.toInt()
                1 -> y1 = it.toInt()
                2 -> r1 = it.toInt()
                3 -> x2 = it.toInt()
                4 -> y2 = it.toInt()
                5 -> r2 = it.toInt()
            }
        }

        val d = sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)).toDouble()).toInt()

        count = if ((x1 == x2) && (y1 == y2)) {
            if (r1 == r2) -1 else 0
        } else
            if ((d > r1 + r2) || (d < abs(r1 - r2))) 0 else if ((d == (r1 + r2)) || (d == abs(r1 - r2))) 1 else 2

        println(count)
    }
}