package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 단어 나누기
    val str = readLine()
    val list = mutableListOf<String>()

    for (i in 1 .. str.length - 2) for (j in i + 1 until str.length)
        list.add(str.substring(0 until i).reversed() +
                    str.substring(i until j).reversed() +
                    str.substring(j).reversed())

    println(list.minOf { it })
}