package kr.kua.baekjoon2.question_2468

var N = 0
lateinit var tempArea: Array<IntArray>
lateinit var visited: Array<BooleanArray>
var dirs = arrayOf(-1 to 0, 1 to 0, 0 to 1, 0 to -1)
fun main() = with(System.`in`.bufferedReader()) { // 안전 영역
    N = readLine().toInt()
    val area = Array(N) { IntArray(N) }
    repeat(N) { i -> area[i] = readLine().split(' ').map { it.toInt() }.toIntArray() }

    var max = 1
    for (i in 1..100) {
        tempArea = Array(N) { IntArray(N) }
        visited = Array(N) { BooleanArray(N) }
        var count = 0

        //돌면서 높이 이하면 0, 아니면 1로 tempArea 저장
        for (a in 0 until N) for (b in 0 until N)
            if (area[a][b] <= i) tempArea[a][b] = 0 else tempArea[a][b] = 1

        for (a in 0 until N) for (b in 0 until N) {
            if (tempArea[a][b] == 1 && !visited[a][b]) {
                dfs(a, b)
                count++
            }
        }
        max = Math.max(max, count)
    }

    print(max)
}

fun dfs(x: Int, y: Int) {
    visited[x][y] = true

    for (i in 0..3) {
        val nx = x + dirs[i].first
        val ny = y + dirs[i].second
        if (nx >= 0 && ny >= 0 && nx < N && ny < N && tempArea[nx][ny] == 1 && !visited[nx][ny]) dfs(nx, ny)
    }
}
