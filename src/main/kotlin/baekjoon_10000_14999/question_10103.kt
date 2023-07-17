package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 좋은 구간
    var (p1, p2, n) = arrayOf(100, 100, readLine().toInt())
    repeat(n) {
        readLine().split(' ').map { it.toInt() }.let {
            if (it[0] != it[1]) {
                if (it[0] < it[1]) p1 -= it[1]
                else p2 -= it[0]
            }
        }
    }
    print("$p1\n$p2")
}