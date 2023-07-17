package kr.kua.baekjoon2

var sum = 0
var min = -1
fun main() = with(System.`in`.bufferedReader()) { // 소수
    loop@for (i in readLine().toInt()..readLine().toInt()) {
        if (i <= 1) continue
        for (j in 2 until i) if (i % j == 0) continue@loop
        set(i)
    }
    println(if(sum == 0) "-1" else "$sum\n$min")
}

fun set(int: Int) {
    sum += int
    if (min == -1) min = int
}