package baekjoon_15000_19999

fun main() { // 정열적인 정렬
    readLine();print(readLine()!!.split(' ').map { it.toInt() }.sorted().joinToString(" "))
}