package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 팩토리얼
    print(Loop(readLine().toInt()))
}

fun Loop(N: Int): Int = if (N == 0) 1 else N * Loop(N - 1)

fun main222() = with(System.`in`.bufferedReader()) { // 팩토리얼
    var res = 1
    repeat(readLine().toInt()) { res *= it + 1 }
    print(res)
}