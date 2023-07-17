package kr.kua.baekjoon2.question_9996

fun main() = with(System.`in`.bufferedReader()) { // 한국이 그리울 땐 서버에 접속하지
    val N = readLine().toInt()
    val pattern = readLine().split("*")
    val sb = StringBuilder()
    repeat(N) {
        val file = readLine()
        if (pattern[0].length + pattern[1].length > file.length) println("NE")
        else {
            val front = file.substring(0, pattern[0].length)
            val back = file.substring(file.length - pattern[1].length, file.length)
            sb.appendLine(if (front == pattern[0] && back == pattern[1]) "DA" else "NE")
        }
    }
    print(sb)
}

fun main2() = with(System.`in`.bufferedReader()) { // 한국이 그리울 땐 서버에 접속하지
    val N = readLine().toInt()
    val pattern = readLine().split("*")
    val regex = Regex("${pattern[0]}*${pattern[1]}")
    val sb = StringBuilder()
    repeat(N) { sb.appendLine(if (regex.containsMatchIn(readLine())) "DA" else "NE") }
    print(sb)
}
