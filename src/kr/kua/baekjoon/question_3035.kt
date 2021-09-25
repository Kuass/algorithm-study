package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 스캐너
    val N = readLine().split(" ").map { it.toInt() }
    repeat(N[0]) {
        val s = readLine().map{ it.toString().repeat(N[3]) }.joinToString("")
        repeat(N[2]) { println(s) }
    }
}

fun main4() = with(System.`in`.bufferedReader()) { // 스캐너
    val N = readLine().split(" ").map { it.toInt() }
    val array = Array(N[0]) { CharArray(N[1]) }
    repeat(N[0]) { array[it] = readLine().toCharArray() }

    for (columnIndex in 1..N[0]) repeat(N[2]) {
        for (rowIndex in 1..N[1]) repeat(N[3]) { print(array[columnIndex - 1][rowIndex - 1]) }
        print("\n")
    }
}