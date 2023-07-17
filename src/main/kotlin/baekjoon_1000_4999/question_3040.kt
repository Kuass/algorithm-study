package kr.kua.baekjoon

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 백설 공주와 일곱 난쟁이
    val num = IntArray(9) { readLine().toInt() }
    val sum = num.sum()

    for (i in 0..8) for (j in i + 1..8)
        if (sum - num[i] - num[j] == 100)
            for (t in 0..8)
                if (t == i || t == j) continue;
                else println(num[t])
}