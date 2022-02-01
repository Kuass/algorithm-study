package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // 비교 연산자
    var count = 1
    val sb = StringBuilder()
    while(true) {
        val s = readLine().split(' ')
        val a = s[0].toInt()
        val b = s[2].toInt()
        sb.appendLine("Case $count: ${when(s[1]) {
                    ">" -> if(a > b) "true" else "false"
                    ">=" -> if(a >= b) "true" else "false"
                    "<" -> if(a < b) "true" else "false"
                    "<=" -> if(a <= b) "true" else "false"
                    "==" -> if(a == b) "true" else "false"
                    "!=" -> if(a != b) "true" else "false"
                    else -> break
                }}")
        count++
    }
    print(sb)
}