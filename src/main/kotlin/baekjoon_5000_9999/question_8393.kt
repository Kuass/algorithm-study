package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 합
    var (n, r) = arrayOf(readLine().toInt(), 0)
    while(n != 0) r += n--
    print(r)
}