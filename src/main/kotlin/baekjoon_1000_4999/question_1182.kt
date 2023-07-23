package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 부분수열의 합
    val (N, S) = readLine().split(" ").map { it.toInt() }
    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()

    var count = 0
    for (i in 1 until (1 shl N)) {
        var sum = 0
        for (j in 0 until N) if (i and (1 shl j) != 0) sum += arr[j]
        if (sum == S) count++
    }

    print(count)
}