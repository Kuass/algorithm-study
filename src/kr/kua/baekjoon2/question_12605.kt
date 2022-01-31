package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 단어순서 뒤집기
    repeat(readLine().toInt()) { i ->
        val arr = readLine().split(" ").toTypedArray()
        var str = ""
        arr.reversed().forEach {
            str += "$it "
        }
        println("Case #${i + 1}: $str")
    }
}