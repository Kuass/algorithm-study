package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 스택 수열
    val stack = arrayListOf<Int>()
    val sb = StringBuilder()

    var count = 0
    repeat(readLine().toInt()) {
        val n = readLine().toInt()

        if (count < n) {
            for (j in count + 1..n) {
                stack.add(j)
                sb.appendLine("+")
            }
            count = n
        } else if (stack[stack.size - 1] != n) {
            println("NO")
            return
        }

        stack.removeAt(stack.size - 1)
        sb.appendLine("-")
    }

    print(sb)
}