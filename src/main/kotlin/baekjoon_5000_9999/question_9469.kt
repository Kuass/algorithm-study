package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 폰 노이만
    repeat(readLine().toInt()) {
        println(readLine().split(" ").map { it.toDouble() }
            .let { "${it[0].toInt()} ${java.text.DecimalFormat("#.000000").format(it[1] / (it[2] + it[3]) * it[4])}" })
    }
}