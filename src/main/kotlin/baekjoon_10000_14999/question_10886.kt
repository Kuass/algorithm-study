package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // 0 = not cute / 1 = cute
    var jh = 0
    repeat(readLine().toInt()) {
        when(readLine().toInt()) {
            0 -> jh--
            else -> jh++
        }
    }
    print(if(jh > 0) "Junhee is cute!" else "Junhee is not cute!")
}