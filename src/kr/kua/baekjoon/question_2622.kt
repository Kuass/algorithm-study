package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 삼각형만들기
    var (N, cnt) = arrayOf(readLine().toInt(), 0)
    for (i in 1 until N) for (j in i until N) {
        val t = N - (i + j)
        if (t < j) break else if (t < j + i) cnt++
    }
    print(cnt)
}