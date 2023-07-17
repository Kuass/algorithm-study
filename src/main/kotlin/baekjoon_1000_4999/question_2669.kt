package baekjoon_1000_4999

fun main() = with(System.`in`.bufferedReader()) { // 직사각형 네개의 합집합의 면적 구하기
    val arr = Array(101) { BooleanArray(101) }
    var result = 0
    repeat(4) {
        val (x1, y1, x2, y2) = readLine().split(" ").map { it.toInt() }
        for (i in x1 until x2) {
            for (j in y1 until y2) {
                if (!arr[i][j]) {
                    arr[i][j] = true
                    result++
                }
            }
        }
    }
    print(result)
}