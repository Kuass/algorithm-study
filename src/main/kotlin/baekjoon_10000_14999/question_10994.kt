package baekjoon_10000_14999

lateinit var star: Array<BooleanArray>
fun main() { // 별 찍기 - 19
    val N = readLine()!!.toInt()
    val size = 4 * N - 3
    star = Array(size) { BooleanArray(size) }

    val sb = StringBuilder()
    star(0, 0, N)
    for (i in 0 until size) {
        for (j in 0 until size) sb.append(if (star[i][j]) "*" else " ")
        sb.appendLine()
    }
    println(sb)
}


fun star(row: Int, col: Int, N: Int) {
    if (N == 0) return
    val size = 4 * N - 3
    val lastRow = row + size - 1
    val lastCol = col + size - 1
    for (i in 0 until size) {
        //맨 위, 맨 아래 별 찍기
        star[row][col + i] = true
        star[lastRow][col + i] = true
        //양 쪽 기둥 별 찍기
        star[row + i][col] = true
        star[row + i][lastCol] = true
    }
    star(row + 2, col + 2, N - 1)
}

// 5
// 9
// 13