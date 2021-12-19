package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 대표값
    val arr = Array(101) { 0 to 0 }
    var sum = 0
    repeat(10) {
        val N = readLine().toInt()
        sum += N
        arr[N / 10] = arr[N / 10].first + 1 to N
    }
    print("${sum / 10}\n${arr.maxByOrNull { it.first }!!.second}")
}