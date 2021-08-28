package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 서버
    val nT = readLine().split(" ").map{ it.toInt() }
    val S = IntArray(2) { 0 }
    run {
        readLine().split(" ").map{ it.toInt() }.forEach {
            if(S[0] + it <= nT[1]) {
                S[0] += it
                S[1]++
            } else return@run
        }
    }
    print(S[1])
}