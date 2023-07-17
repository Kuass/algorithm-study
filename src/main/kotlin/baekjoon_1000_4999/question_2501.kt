package kr.kua.baekjoon2

fun main() { // 약수 구하기
    var (N, K) = readLine()!!.split(" ").map { it.toInt() }

    for (i in 1..N) {
        if (N % i == 0) K--
        if (K == 0) { print(i); break }
    }

    if (K != 0) print(0)
}