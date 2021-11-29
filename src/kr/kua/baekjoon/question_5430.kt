package kr.kua.baekjoon

import java.util.*
import kotlin.collections.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) { // AC
    val dq = ArrayDeque<Int>()
    val sb = StringBuilder()
    var st: StringTokenizer
    val T = readLine().toInt()

    repeat(T) { _ ->
        run block@{
            val p = readLine().toCharArray()
            val n = readLine().toInt()
            var r = false
            st = StringTokenizer(readLine(), "[],")
            repeat(n) { dq.add(st.nextToken().toInt()) }
            repeat(p.size) { i -> when (p[i]) {
                    'R' -> r = !r else -> {
                        if (dq.isEmpty()) { sb.appendLine("error"); return@block }
                        else if (r) dq.removeLast()
                        else dq.removeFirst()
                    }
                }
            }
            if (dq.isEmpty()) sb.appendLine("[]")
            else {
                sb.append("[").append(if (r) dq.removeLast() else dq.removeFirst())
                repeat(dq.size) { sb.append(",").append(if (r) dq.removeLast() else dq.removeFirst()) }
                sb.appendLine("]")
            }
        }
    }
    print(sb)
}