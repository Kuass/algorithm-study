package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 약수
    var min = Integer.MAX_VALUE
    var max = Integer.MIN_VALUE
    readLine(); readLine().split(" ").map { it.toInt() }.forEach {
        if (it > max) max = it
        if (it < min) min = it
    }
    print(max * min)
}