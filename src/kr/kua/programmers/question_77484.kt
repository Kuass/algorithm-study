package kr.kua.programmers

class question_77484 { // 로또의 최고 순위와 최저 순위
    init {
        var lottos = arrayOf(44, 1, 0, 0, 31, 25).toIntArray()
        var win_nums = arrayOf(31, 10, 45, 1, 6, 19).toIntArray()
        println("[44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19], [3, 5] - " + solution(lottos, win_nums).joinToString())
        lottos = arrayOf(0, 0, 0, 0, 0, 0).toIntArray()
        win_nums = arrayOf(38, 19, 20, 40, 15, 25).toIntArray()
        println("[0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25], [1, 6] - " + solution(lottos, win_nums).joinToString())
    }

    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var (unknown, winNums) = arrayOf(0, 0)
        lottos.forEach { if (it == 0) unknown++ else if (win_nums.contains(it)) winNums++ }
        return intArrayOf(getLottoRank(winNums + unknown), getLottoRank(winNums))
    }

    private fun getLottoRank(num: Int): Int {
        return when(num) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}