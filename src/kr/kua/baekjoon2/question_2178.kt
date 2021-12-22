package kr.kua.baekjoon2.question_2178

import java.util.*

var n = 0
var m = 0
var count = 0
val dirs = arrayOf(-1 to 0, 1 to 0, 0 to 1, 0 to -1)
lateinit var maze: Array<IntArray>
lateinit var visited: Array<BooleanArray>
fun main() = with(System.`in`.bufferedReader()) { // 미로 탐색
    readLine().split(" ").map { it.toInt() }.let { n = it[0]; m = it[1] }
    maze = Array(n) { IntArray(m) }
    visited = Array(n) { BooleanArray(m) }
    repeat(n) { i -> maze[i] = readLine().map { it.code - 0x30 }.toIntArray() }

    bfs(0, 0)
    print(maze[n - 1][m - 1])
}

fun bfs(x: Int, y: Int) {
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(x to y)

    while (!queue.isEmpty()) {
        val pair = queue.poll()

        for (i in 0 until 4) {
            val nX = pair.first + dirs[i].first
            val nY = pair.second + dirs[i].second

            if (nX < 0 || nY < 0 || nX >= m || nY >= n || visited[nY][nX] || maze[nY][nX] == 0) continue
            queue.add(nX to nY)
            maze[nY][nX] = maze[pair.second][pair.first] + 1
            visited[nY][nX] = true
        }
    }
}