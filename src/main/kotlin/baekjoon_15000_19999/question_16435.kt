package baekjoon_15000_19999

fun main() = with(System.`in`.bufferedReader()) { // 스네이크버드
    var (N, L) = readLine().split(" ").map { it.toInt() }
    val h = readLine().split(" ").map { it.toInt() }.toMutableList()
    var i = -1
    while(++i < h.size) {
        if (h[i] <= L) {
            h.removeAt(i)
            L++
            i = -1
        }
    }
    print(L)
}