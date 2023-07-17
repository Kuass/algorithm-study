package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 소수 찾기
    var count = readLine().toInt();
    readLine().split(" ").map { it.toInt() }.forEach {
        if (it == 1) count-- else for (i in 2 until it) if (it % i == 0) { count--; break }
    }
    print(count)
}