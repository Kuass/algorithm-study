package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 10부제
    val N = readLine()
    var sum = 0
    readLine().split(" ").forEach { if(N == it) sum++ }
    print(sum)
}