package kr.kua.programmers

class question_42888 {
    fun question_42888() {
        val temp = arrayOf("Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan")
        println("temp - ")
        println(solution(temp))
    }

    fun solution(record: Array<String>): Array<String> {
        val map = mutableMapOf<String, String>()

        record.forEach {
            val action = it.split(" ")
            when (action[0]) {
                "Enter" -> map.put(action[1], action[2])
                "Change" -> map[action[1]] = action[2]
            }
        }

        val dialog = record.map {
            val action = it.split(" ")
            when (action[0]) {
                "Enter" -> "${map[action[1]]}님이 들어왔습니다."
                "Leave" -> "${map[action[1]]}님이 나갔습니다."
                else -> ""
            }
        }.filter { it != "" }.toTypedArray()

        return dialog
    }
}

class question_42888_back {
    fun question_42888() {
        val temp = arrayOf("Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan")
        println("temp - ")
        println(solution(temp))
    }

    fun solution(record: Array<String>): Array<String> {
        val users = mutableListOf<User>()
        val entrys = mutableListOf<Entry>()
        record.forEach {
            val info = it.split(" ")

            var isValid = false
            users.forEach {
                if (it.id == info[1]) {
                    isValid = true
                    return@forEach
                }
            }

            if (!isValid) users.add(User(info[1], info[2]))

            when (info[0]) {
                "Change" -> {
                    var idx = -1
                    users.forEachIndexed { index, it ->
                        if (it.id == info[1]) {
                            idx = index
                            return@forEachIndexed
                        }
                    }
                    users[idx].name = info[2]
                }
                else -> entrys.add(Entry(info[1], info[0] == "Enter"))
            }
        }

        val result = Array(entrys.size) { "" }
        entrys.forEachIndexed { index, it ->
            var idx = -1
            users.forEachIndexed { index2, it2 ->
                if (it.id == it2.id) {
                    idx = index2
                    return@forEachIndexed
                }
            }
            result[index] = users[idx].name + if(it.isEnter) "님이 들어왔습니다." else "님이 나갔습니다."
        }

        return result
    }

    data class User(val id: String, var name: String)
    data class Entry(val id: String, val isEnter: Boolean)
}