package baekjoon_15000_19999

import java.io.*
import java.util.*

// 왜틀리는지 모르겠음 (28%)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // 큐 2
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = ArrayDeque<Int>()
    repeat(readLine().toInt()) {
        val word = readLine()
        if (word[1] == 'u') stack.push(word.split(' ')[1].toInt())
        else bw.write(
            when (word) {
                "pop" -> if (stack.isEmpty()) -1 else stack.pop()
                "size" -> stack.size
                "front" -> if (stack.isEmpty()) -1 else stack.last
                "back" -> if (stack.isEmpty()) -1 else stack.first
                else -> if (stack.isEmpty()) 1 else 0
            }.toString() + "\n"
        )
    }
    bw.flush()
}