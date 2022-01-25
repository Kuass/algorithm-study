package kr.kua.baekjoon2.question_8595

fun main() = with(System.`in`.bufferedReader()) { // 히든 넘버
    readLine()
    var sum = 0L
    var str = "0"
    readLine().forEach {
        if (it.isDigit()) str += it
        else {
            sum += str.toInt()
            str = "0"
        }
    }
    if (str != "0") sum += str.toLong()
    print(sum)
}