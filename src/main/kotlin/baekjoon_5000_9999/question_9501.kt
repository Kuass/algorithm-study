package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 꿍의 우주여행
    repeat(readLine().toInt()) { _ ->
        var count = 0
        val (N, Dis) = readLine().split(" ").map { it.toInt() }
        val ships = Array(N) { DoubleArray(3) }
        repeat(N) {
            ships[it] = readLine().split(" ").map { v -> v.toDouble() }.toDoubleArray()
            if (ships[it][1] / ships[it][2] * ships[it][0] >= Dis) count++
        }
        println(count)
    }
}