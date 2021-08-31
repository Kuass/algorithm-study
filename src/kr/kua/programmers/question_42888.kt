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