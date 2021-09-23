package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 주사위 게임
    var (N, max) = arrayOf(readLine().toInt(), 0)

    repeat(N) {
        val dice = readLine().split(" ").map { it.toInt() }
        val sum = if (dice[0] == dice[1] && dice[1] == dice[2]) 10000 + dice[0] * 1000
        else if (dice[0] == dice[1] || dice[0] == dice[2]) 1000 + dice[0] * 100
        else if (dice[1] == dice[2]) 1000 + dice[1] * 100
        else Math.max(dice[0], Math.max(dice[1], dice[2])) * 100
        max = if (max < sum) sum else max
    }
    print(max)
}