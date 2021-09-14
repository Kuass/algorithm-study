package kr.kua.programmers

class question_12951 {
    fun question_12951() {
        println("3people unFollowed me - " + solution("3people unFollowed me"))
        println("for the last week - " + solution("for the last week"))
    }

    fun solution(s: String): String {
        val chars = s.toCharArray()
        var express = false
        chars.forEachIndexed { index, it ->
            if (it == ' ') {
                chars[index + 1] = chars[index + 1].uppercaseChar()
                express = true
            } else if (index == 0) chars[0] = chars[0].uppercaseChar()
            else if (express) express = false
            else chars[index] = chars[index].lowercaseChar()
        }

        return String(chars)
    }
}