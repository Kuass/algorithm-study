package kr.kua.baekjoon2

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 균형잡힌 세상
    val sb = StringBuilder()
    main@while(true) {
        val stack = Stack<Char>()
        val chars = readLine().toCharArray()
        for (i in chars.indices) {
            val char = chars[i]
            if (i == 0 && char == '.')
                break@main
            if(char.code == 0x28 || char.code == 0x5B) stack.push(char)
            else if(char.code == 0x29)
                if (stack.empty() || stack.peek().code != 0x28) {
                    sb.appendLine("no")
                    continue@main
                } else stack.pop()
            else if(char.code == 0x5D)
                if (stack.empty() || stack.peek().code != 0x5B) {
                    sb.appendLine("no")
                    continue@main
                } else stack.pop()
        }
        sb.appendLine(if(stack.empty()) "yes" else "no")
    }
    print(sb)
}