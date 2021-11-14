package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 점수계산
    var (recent, total) = arrayOf(0, 0)
    readLine(); readLine().split(" ").map { if (it == "1") total += ++recent else recent = 0 }
    print(total)
}