package kr.kua.baekjoon2.question_9375

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // 패션왕 신해빈
    val sb = StringBuilder()
    repeat(readLine().toInt()) { _ ->
        val map = HashMap<String, Int>()

        repeat (readLine().toInt()) {
            val st = StringTokenizer(readLine(), " ");
            st.nextToken()

            val kind = st.nextToken()
            map[kind] = if (map.containsKey(kind)) map[kind]!! + 1 else 1
        }

        var result = 1
        map.values.forEach { result *= (it + 1); }

        sb.appendLine(result - 1)
    }

    print(sb);
}