package kr.kua.baekjoon2.question_8595

fun main() = with(System.`in`.bufferedReader()) { // 콘테스트
    val arr = IntArray(10)
    repeat(10) { arr[it] = readLine().toInt() }
    print("${arr.sortedDescending().let { (it[0] + it[1] + it[2]) }} ")
    repeat(10) { arr[it] = readLine().toInt() }
    print(arr.sortedDescending().let { it[0] + it[1] + it[2] })
}