package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 탄산 음료
    val N = readLine().split(" ").map { it.toInt() }
    val S = arrayOf(N[0] + N[1], 0)
    while (true) {
        if (S[0] < N[2]) break;
        S[1] += S[0] / N[2];
        S[0] = S[0] % N[2] + S[0] / N[2];
    }

    print(S[1])
}