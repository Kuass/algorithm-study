package kr.kua.baekjoon2

fun main() { // 쉽게 푸는 문제
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    var index = 0
    var sum = 0
    for (i in 1..B) repeat(i) {
        if (index + 1 in A..B) sum += i
        if (index++ >= B) {
            print(sum)
            return
        }
    }
    print(sum)
}