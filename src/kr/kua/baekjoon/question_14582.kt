package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 오늘도 졌다
    val teamA = readLine().split(" ").map { it.toInt() }
    val teamB = readLine().split(" ").map { it.toInt() }
    var (scoreA, scoreB) = IntArray(2)

    for (i in 0 until 9) {
        scoreA += teamA[i]
        if (scoreA > scoreB) {
            print("Yes")
            return
        }

        scoreB += teamB[i]
    }
    print("No")
}