package baekjoon_10000_14999

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // A+B - 8
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for (i in 1..readLine().toInt()) {
        val AB = readLine().split(" ").map { it.toInt() }
        bw.write("Case #${i}: ${AB[0]} + ${AB[1]} = ${AB[0] + AB[1]}\n")
    }
    bw.flush()
}