package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 별 찍기 - 20
    val N = readLine().toInt()
    val sb = StringBuilder()
    repeat(N) {
        if (it % 2 == 1) repeat(N) { sb.append(" *") }
        else repeat(N) { sb.append("* ") }
        sb.appendLine()
    }
    print(sb)
}
