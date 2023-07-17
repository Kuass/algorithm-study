package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 가위 바위 보?
    repeat(readLine().toInt()) { _ ->
        var (n, win1, win2) = arrayOf(readLine().toInt(), 0, 0)
        repeat(n) {
            val draw = readLine().split(" ")
            when (draw[0]) {
                "R" -> when(draw[1]) {
                    "P" -> win2++
                    "S" -> win1++
                }
                "P" -> when(draw[1]) {
                    "R" -> win1++
                    "S" -> win2++
                }
                "S" -> when(draw[1]) {
                    "R" -> win2++
                    "P" -> win1++
                }
            }
        }
        println(when {
            win1 > win2 -> "Player 1"
            win1 < win2 -> "Player 2"
            else -> "TIE"
        })
    }
}

fun main5() = with(System.`in`.bufferedReader()) { repeat(readLine().toInt()) {
    val r = (1..readLine().toInt()).sumOf { 0 + when(readLine().let { it[0].code-it[2].code }) { 0->0;3,-1,-2->1;else->-1 } }
    print(when{ r>0->"Player 1";r<0->"Player 2";else->"TIE" })
}}