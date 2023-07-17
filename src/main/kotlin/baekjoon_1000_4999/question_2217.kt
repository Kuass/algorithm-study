package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 로프
    val arr = IntArray(readLine().toInt())
    for (i in arr.indices) arr[i] = readLine().toInt()
    arr.sort()

    var max = 0L
    for (i in arr.size - 1 downTo 0) {
        arr[i] *= arr.size - i
        if (max < arr[i]) max = arr[i].toLong()
    }

    print(max)
}