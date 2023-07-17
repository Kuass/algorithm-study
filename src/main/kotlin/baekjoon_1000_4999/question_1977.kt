package kr.kua.baekjoon

import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) { // 완전제곱수
    val (M, N) = arrayOf(readLine().toInt(), readLine().toInt())
    var (min, sum) = arrayOf(ceil(sqrt(M.toDouble())).toInt(), 0)
    for (i in min..floor(sqrt(N.toDouble())).toInt()) sum += i.toDouble().pow(2.0).toInt()
    if (sum == 0) print(-1) else print("$sum\n${min.toDouble().pow(2.0).toInt()}")
}