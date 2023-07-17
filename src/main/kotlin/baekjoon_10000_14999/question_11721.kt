package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 열 개식 끊어 출력하기
    var a = 0
    val sb = StringBuilder()
    readLine().toCharArray().forEach { if(++a % 10 == 0) sb.appendLine(it) else sb.append(it) }
    print(sb)
}