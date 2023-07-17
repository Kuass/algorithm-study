package baekjoon_15000_19999

fun main() = with(System.`in`.bufferedReader()) { // 명장 남정훈
    var (L, R, A) = readLine().split(" ").map { it.toInt() }
    while (A-- != 0) if (L <= R) L++ else R++
    print(if(L < R) L * 2 else R * 2)
}