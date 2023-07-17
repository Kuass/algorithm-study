package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 상근이의 친구들
    while(true) {
        val case = readLine().split(" ").map { it.toInt() }
        if (case[0] + case[1] == 0) break
        println(case[0] + case[1])
    }
}