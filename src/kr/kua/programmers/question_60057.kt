package kr.kua.programmers

import java.util.*

class question_60057 {
    fun question_60057() {
//        println("aabbaccc | " + solution("aabbaccc"))
//        println("ababcdcdababcdcd | " + solution("ababcdcdababcdcd"))
//        println("abcabcdede | " + solution("abcabcdede"))
//        println("abcabcabcabcdededededede | " + solution("abcabcabcabcdededededede"))
//        println("xababcdcdababcdcd | " + solution("xababcdcdababcdcd"))
        println("a*10 | " + solution("a".repeat(10)))
        println("a*100 | " + solution("a".repeat(100)))
        println("a*1000 | " + solution("a".repeat(1000)))
        println("a*1000 | " + solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
    }

    fun solution(s: String): Int {
        var level = 1
        val size = s.length
        var min = s.length

        while (level <= size) {
            var str = s.substring(0, level)
            var isChange = false
            val sb = StringBuilder()
            var cnt = 2
            var temp = ""

            var j = level
            while (j + level <= size) {
                val sub = s.substring(j, j + level)
                if (str == sub) {
                    isChange = true
                    temp = cnt.toString() + str
                    cnt++
                } else {
                    sb.append(if(isChange) temp else str)
                    isChange = false
                    str = sub
                    cnt = 2
                    temp = ""

                }
                j += level
            }
            sb.append(if(temp.isEmpty()) s.substring(j-level, size) else temp + s.substring(j,size))
            println(sb)
            min = minOf(min, sb.length)
            level++
        }
        return min
    }
}

class question_60057_back {
    fun question_60057() {
//        println("aabbaccc | " + solution("aabbaccc"))
//        println("ababcdcdababcdcd | " + solution("ababcdcdababcdcd"))
//        println("abcabcdede | " + solution("abcabcdede"))
//        println("abcabcabcabcdededededede | " + solution("abcabcabcabcdededededede"))
//        println("xababcdcdababcdcd | " + solution("xababcdcdababcdcd"))
        println("a*10 | " + solution("a".repeat(10)))
        println("a*100 | " + solution("a".repeat(100)))
        println("a*1000 | " + solution("a".repeat(1000)))
        println("a*1000 | " + solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
    }

    fun solution(s: String): Int { // case 2번 20번 에러!!! https://programmers.co.kr/questions/8103
        val len = s.length
        var min = Int.MAX_VALUE
        for (i in 1..len) {
            val stack = Stack<String>()
            var count = 0
            s.chunked(i).forEach {
                if (stack.empty()) stack.push(it)
                else {
                    if (stack.peek() == it) count++
                    else if (count != 0) {
                        stack.push(count.toString())
                        stack.push(it)
                        count = 0
                    } else stack.push(it)
                }
            }
            if (count != 0) stack.push(count.toString())

            var n = 0
            while(stack.isNotEmpty()) n += stack.pop().length
            if (min > n) min = n
        }

        return min
    }
}