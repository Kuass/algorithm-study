package baekjoon_15000_19999

val INF = 1000000
var arr = LongArray(INF + 1)
fun main() = with(System.`in`.bufferedReader()) { // 약수의 합
    val sb = StringBuilder()
    var T = readLine().toInt()
    for (i in 1..INF) for (j in 1..INF / i) arr.set(i * j, arr.get(i * j) + i)
    for (i in 1..INF) arr[i] += arr[i - 1]
    while (T-- > 0) sb.appendLine(arr[readLine().toInt()])
    println(sb)
}