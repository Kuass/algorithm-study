package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 중복 빼고 정렬하기
    val set = mutableSetOf<Int>()
    readLine();readLine().split(" ").map { set.add(it.toInt()) }
    print(set.sorted().joinToString(" "))
}