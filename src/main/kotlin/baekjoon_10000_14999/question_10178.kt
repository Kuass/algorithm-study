package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 할로윈의 사탕
    repeat(readLine().toInt()) {
        readLine().split(' ').map { it.toInt() }.let { println("You get ${it[0]/it[1]} piece(s) and your dad gets ${it[0]%it[1]} piece(s).") }
    }
}