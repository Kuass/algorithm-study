package kr.kua.programmers


class question_92334 {
    init {
        var id_list = arrayOf("muzi", "frodo", "apeach", "neo")
        var report = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi")
        var k = 2
        println(solution(id_list, report, k).joinToString(","))
        id_list = arrayOf("con", "ryan")
        report = arrayOf("ryan con", "ryan con", "ryan con", "ryan con")
        k = 3
        println(solution(id_list, report, k).joinToString(","))
    }

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val n = id_list.size
        val result = IntArray(n)

        val sets = Array<HashSet<Int>>(n) { HashSet() }
        val map = mutableMapOf<String, Int>()
        repeat(n) { map[id_list[it]] = it }
        report.forEach { s -> s.split(' ').let { sets[map[it[1]]!!].add(map[it[0]]!!) } }
        repeat(n) { if (sets[it].size >= k) for (x in sets[it]) result[x]++}

        return result
    }

    fun solution_back(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val result = IntArray(id_list.size)
        val blockUser = IntArray(id_list.size)
        val history = mutableListOf<Pair<String, String>>()
        report.forEach {
            val (user, target) = it.split(' ')
            if (!history.contains(user to target)) {
                history.add(user to target)
                val index = id_list.indexOf(target)
                blockUser[index]++
            }
        }

        val isBlocked = BooleanArray(id_list.size)
        blockUser.forEachIndexed { index, i -> if (i >= k) isBlocked[index] = true}

        history.forEach {
            if (isBlocked[id_list.indexOf(it.second)]) result[id_list.indexOf(it.first)]++
        }

        return result
    }
}