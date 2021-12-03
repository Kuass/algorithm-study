package kr.kua.baekjoon2

lateinit var gaps: IntArray
fun main() = with(System.`in`.bufferedReader()) { // 가로수
    val N = readLine().toInt()
    val trees = IntArray(N)
    gaps = IntArray(N - 1)
    repeat(N) {
        trees[it] = readLine().toInt()
        if (it != 0) gaps[it - 1] = trees[it] - trees[it - 1]
    }

    repeat(N - 2) { gaps[it + 1] = gcd(gaps[it], gaps[it + 1]) }
    print((trees[N - 1] - trees[0]) / gaps[gaps.size - 1] - (N - 1))
}

private fun gcd(c: Int, d: Int): Int {
    var a = c
    var b = d
    while (b > 0) {
        val t = a
        a = b
        b = t % b
    }
    return a
}