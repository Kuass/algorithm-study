package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 오르막
    var prev = Int.MIN_VALUE
    readLine().split(" ").map { it.toInt() }.forEach {
        if (it < prev) {
            print("Bad")
            return
        }
        prev = it
    }
    print("Good")
}