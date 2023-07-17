package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 소인수분해
    var N = readLine().toInt()
    val sb = StringBuilder()
    for (i in 2..Math.sqrt(N.toDouble()).toInt()) {
        while (N % i == 0) {
            sb.appendLine(i)
            N /= i
        }
    }

    if (N != 1) sb.appendLine(N)
    print(sb)
}