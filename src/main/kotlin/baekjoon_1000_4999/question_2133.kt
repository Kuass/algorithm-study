package kr.kua.baekjoon2

lateinit var d: IntArray
fun main() = with(System.`in`.bufferedReader()) { // 타일 채우기
    val N = readLine().toInt()
    d = IntArray(N + 2)
    print(dp(N))
}

fun dp(x: Int): Int {
    if (x == 0) return 1
    else if (x == 1)  return 0
    else if (x == 2) return 3
    if (d[x] != 0) return d[x]
    var res = 3 * dp(x - 2)
    for (i in 4..x step(2)) res += 2 * dp(x - i)
    d[x] = res
    return res
}