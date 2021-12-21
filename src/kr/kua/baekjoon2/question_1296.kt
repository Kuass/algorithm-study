package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 팀 이름 정하기
    val yeonDoo = readLine()
    val N = readLine().toInt()
    var (max, index) = IntArray(2)
    val names = Array(N) { "" }
    repeat(N) { names[it] = readLine() }
    names.sort()
    repeat(N) { i ->
        var (L, O, V, E) = IntArray(4)
        (yeonDoo + names[i]).forEach {
            when(it) {
                'L' -> L++
                'O' -> O++
                'V' -> V++
                'E' -> E++
            }
        }

        val ans = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100
        if (max < ans) {
            max = ans
            index = i
        }
    }
    print(names[index])
}