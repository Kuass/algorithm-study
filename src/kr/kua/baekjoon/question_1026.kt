package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 보물
    readLine()
    val A = readLine().split(" ").map { it.toInt() }.toIntArray()
    val B = readLine().split(" ").map { it.toInt() }.toMutableList()
    var S = 0

    val sortA = A.sorted()
    val rankB = IntArray(A.size)
    B.sortedDescending().forEachIndexed { index, i ->
        val idx = B.indexOf(i)
        rankB[index] = B[idx]
        B.removeAt(idx)
    }
    sortA.forEachIndexed { index, i -> S += i * rankB[index] }

    print(S)
}