package kr.kua.baekjoon2.question_5176

fun main() = with(System.`in`.bufferedReader()) { // 대회 자리
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        val (P, M) = readLine().split(' ').map { it.toInt() }
        val list = mutableSetOf<Int>()
        repeat(P) {
            val cur = readLine().toInt()
            if (cur <= M) list.add(cur)
        }
        sb.appendLine(P - list.size)
    }
    print(sb)
}