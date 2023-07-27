package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 스타트와 링크
    val n = readLine().toInt()
    val arr = Array(n) { IntArray(n) }
    val visited = BooleanArray(n)
    var min = Int.MAX_VALUE

    for (i in 0 until n) {
        arr[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    fun dfs(start: Int, depth: Int) {
        if (depth == n / 2) {
            var startTeam = 0
            var linkTeam = 0

            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (visited[i] && visited[j]) {
                        startTeam += arr[i][j]
                    } else if (!visited[i] && !visited[j]) {
                        linkTeam += arr[i][j]
                    }
                }
            }

            min = Math.min(min, Math.abs(startTeam - linkTeam))
            return
        }

        for (i in start until n) {
            if (!visited[i]) {
                visited[i] = true
                dfs(i + 1, depth + 1)
                visited[i] = false
            }
        }
    }

    dfs(0, 0)
    print(min)
}