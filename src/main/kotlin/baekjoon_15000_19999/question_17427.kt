package baekjoon_15000_19999

fun main() = with(System.`in`.bufferedReader()) { // 약수의 합 2
    val N = readLine().toInt()
    var ans = 0L
    for (i in 1 .. N) ans += (N / i) * i
    print(ans)
}