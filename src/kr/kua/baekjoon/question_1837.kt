package kr.kua.baekjoon

val check = BooleanArray(1000001)
lateinit var chars: CharArray
fun main() = with(System.`in`.bufferedReader()) { // 암호제작
    for (x in 2..1000000) if (check[x]) continue
        else for (y in 2 * x..1000000 step (x)) check[y] = true
    val (P, K) = readLine().split(" ")
    chars = P.toCharArray()
    val ans = find(P.length, K.toInt())
    println(if(ans == -1) "GOOD" else "BAD $ans")
}

fun find(size: Int, K: Int): Int {
    for (x in 2 until K) if (!check[x] && divide(size, x)) return x
    return -1
}

fun divide(size: Int, x: Int): Boolean {
    var mid = 0
    for (i in 0 until size) {
        mid = mid * 10 + chars[i].code - '0'.code
        mid %= x
    }
    return mid == 0
}