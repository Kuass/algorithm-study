package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 비슷한 단어
    val N = readLine().toInt()
    val arr = Array(N) { "" }
    var res = 0
    repeat(N) { arr[it] = readLine() }
    for (j in 1 until N) {
        var a = arr[0]
        var b = arr[j]
        if (a.length < b.length) {
            val temp = a
            a = b
            b = temp
        }

        val chars = b.toCharArray()
        var count = a.length
        a.forEach {
            for (i in chars.indices) if (it == chars[i]) {
                count--
                chars[i] = ' '
                break
            }
        }

        if (count <= 1) res++
    }
    println(res)
}