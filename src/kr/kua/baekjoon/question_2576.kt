package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 홀수
    val list: ArrayList<Int> = ArrayList()
    for (i in 0..6) {
        val n = readLine().toInt()
        if (n % 2 == 1) list.add(n)
    }

    if (list.size == 0) print("-1")
    else {
        println(list.sumOf { it })
        println(list.minOrNull())
    }
}