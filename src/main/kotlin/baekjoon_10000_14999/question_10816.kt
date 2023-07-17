package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 숫자 카드 2
    val map = HashMap<Int, Int>()
    readLine();readLine().split(" ").map { map.put(it.toInt(), map.getOrDefault(it.toInt(), 0) + 1) }
    val sb = StringBuilder()
    readLine();readLine().split(" ").map { sb.append("${map.getOrDefault(it.toInt(), 0)} ") }
    print(sb)
}