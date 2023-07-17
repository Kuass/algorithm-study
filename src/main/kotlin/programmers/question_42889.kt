package kr.kua.programmers

class question_42889 { // 실패율
    init {
        var stages = arrayOf(2, 1, 2, 6, 2, 4, 3, 3).toIntArray()
        println("5, [2, 1, 2, 6, 2, 4, 3, 3], [3, 4, 2, 1, 5] - " + solution(5, stages).joinToString())
        stages = arrayOf(4, 4, 4, 4, 4).toIntArray()
        println("4, [4, 4, 4, 4, 4], [4, 1, 2, 3] - " + solution(4, stages).joinToString())
    }

    data class Stage(val stageIndex: Int, val failureRate: Double)
    fun solution(N: Int, stages: IntArray): IntArray {
        val array = IntArray(N)
        val stageList = mutableListOf<Stage>()
        var denominator = stages.size

        for (i in 0 until N) array[i] = stages.count { it == i + 1 }

        array.forEachIndexed { index, value -> stageList.add(Stage(index + 1, (value.toDouble() / denominator)
            .takeIf { !it.isNaN() } ?: 0.0 )).apply { denominator -= value }
        }

        val result = IntArray(N)
        stageList.sortedByDescending { it.failureRate }
            .forEachIndexed { index, value -> result[index] = value.stageIndex }

        return result
    }
}

class question_42889_back {
    init {
        var stages = arrayOf(2, 1, 2, 6, 2, 4, 3, 3).toIntArray()
        println("5, [2, 1, 2, 6, 2, 4, 3, 3], [3, 4, 2, 1, 5] - " + solution(5, stages).joinToString())
        stages = arrayOf(4, 4, 4, 4, 4).toIntArray()
        println("4, [4, 4, 4, 4, 4], [4, 1, 2, 3] - " + solution(4, stages).joinToString())
    }

    fun solution(N: Int, _s: IntArray): IntArray {
        val tempResult = IntArray(N).toMutableList()
        val stages = _s.toMutableList()
        repeat(N) {
            val finds = mutableListOf<Int>()
            val denominator = stages.size
            while(true) {
                val index = stages.lastIndexOf(it+1)
                if (index == -1) break else { finds.add(index); stages.removeAt(index); }
            }

            if (finds.size != 0) tempResult[it] = (finds.size.toFloat() / denominator * 100).toInt()
        }

        val sortResult = tempResult.sortedDescending()
        val result = IntArray(N)
        repeat(N) {
            var index = tempResult.indexOf(sortResult[it])
            tempResult.removeAt(index)
            while(result.contains(index + 1)) index++
            result[it] = index + 1
        }

        return result
    }
}