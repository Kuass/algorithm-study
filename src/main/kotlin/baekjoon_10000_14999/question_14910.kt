package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 오르막
    var prev = Int.MIN_VALUE
    readLine().split(" ").map { it.toInt() }.forEach {
        if (it < prev) {
            print("Bad")
            return
        }
        prev = it
    }
    print("Good")
}