package kr.kua.baekjoon2

fun main() { // 돌 게임
    print(if((readLine()!!.toInt()) % 2 == 1) "SK" else "CY")
}