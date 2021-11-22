package kr.kua.baekjoon

val dirs = arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
var m = 0
var n = 0
var t = 0
fun main() = with(System.`in`.bufferedReader()) { // 단지번호붙이기
    m = readLine().toInt()
    n = m
    val grid: Array<CharArray> = Array(m) { CharArray(n) }
    repeat(m) { grid[it] = readLine().toCharArray() }
    val list = mutableListOf<Int>()
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (grid[i][j] == '1') {
                t = 0
                dfs(grid, i, j)
                list.add(t)
            }
        }
    }

    println(list.count())
    list.sorted().forEach { println(it) }
}

fun dfs(grid: Array<CharArray>, i: Int, j: Int) {
    if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') return
    t++
    grid[i][j] = 'X'
    for (dir in dirs) dfs(grid, i + dir[0], j + dir[1])
}