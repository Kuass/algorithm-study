package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 영수증
    var total = readLine().toInt()
    repeat(9) { total -= readLine().toInt() }
    print(total)
}