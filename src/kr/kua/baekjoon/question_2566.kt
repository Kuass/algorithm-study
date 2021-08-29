package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 최댓값
    val max = IntArray(3)
    for (i in 1..9) readLine().split(" ").mapIndexed { index, it ->
        val v = it.toInt()
        if (max[0] < v) {
            max[0] = v
            max[1] = i
            max[2] = index + 1
        }
    }
    print("${max[0]}\n${max[1]} ${max[2]}")
}
