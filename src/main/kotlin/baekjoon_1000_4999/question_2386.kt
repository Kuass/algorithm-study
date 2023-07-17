package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 도비의 영어 공부
    var N = readLine()
    while (N != "#") {
        var W = '0'
        var C = 0
        N.toCharArray().forEachIndexed { index, it ->
            if (index == 0) W = it.lowercaseChar() else if (it.lowercaseChar() == W) C++
        }
        println("${W} ${C}")
        N = readLine()
    }
}