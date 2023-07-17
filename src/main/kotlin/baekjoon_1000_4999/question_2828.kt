package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 사과 담기 게임
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val J = readLine().toInt()

    var distance = 0
    var left = 1
    var right = M

    var now = readLine().toInt()
    if (now > M) {
        distance += now - M
        right = now
        left = now - (M - 1)
    }

    repeat(J - 1) {
        val next = readLine().toInt()
        if (next > now && next > right) {
            distance += next - right
            right = next
            left = next - (M - 1)
        } else if (next < now && next < left) {
            distance += left - next
            right = next + (M - 1)
            left = next
        }
        now = next
    }

    print(distance)
}