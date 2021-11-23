package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 소수 구하기
    val (M, N) = readLine().split(" ").map { it.toInt() }
    val prime = BooleanArray(N + 1)
    for (i in 2..N) {
        if (prime[i]) continue
        if (i >= M) println(i)
        for (j in i + i..N step(i)) prime[j] = true
    }
}