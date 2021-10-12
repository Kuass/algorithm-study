package kr.kua.programmers

class question_81301 { // 숫자 문자열과 영단어
    init {
        println("one4seveneight, 1478 - " + solution("one4seveneight"));
        println("23four5six7, 234567 - " + solution("23four5six7"));
    }

    fun solution(s: String): Int {
        val list = mutableListOf<Int>()
        var str = s
        while(str.isNotBlank()) {
            if (str.substring(0, 1).toCharArray()[0].isDigit()) {
                list.add(str.substring(0, 1).toInt())
                str = str.substring(1)
            } else {
                val chars = str.toCharArray()
                when(chars[0]) {
                    'o' -> {
                        list.add(1)
                        3
                    }
                    'z' -> {
                        list.add(0)
                        4
                    }
                    't' -> {
                        when(chars[1]) {
                            'h' -> {
                                list.add(3)
                                5
                            }
                            'w' -> {
                                list.add(2)
                                3
                            }
                            else -> 0
                        }
                    }
                    'f' -> {
                        when(chars[1]) {
                            'o' -> {
                                list.add(4)
                                4
                            }
                            'i' -> {
                                list.add(5)
                                4
                            }
                            else -> 0
                        }
                    }
                    's' -> {
                        when(chars[1]) {
                            'i' -> {
                                list.add(6)
                                3
                            }
                            'e' -> {
                                list.add(7)
                                5
                            }
                            else -> 0
                        }
                    }
                    'e' -> {
                        list.add(8)
                        5
                    }
                    'n' -> {
                        list.add(9)
                        4
                    }
                    else -> 0
                }.let { str = str.substring(it) }
            }
        }

        return list.joinToString("").toInt()
    }
}