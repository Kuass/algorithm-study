package baekjoon_10000_14999

fun main() { // 덧셈과 곱셈
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    var sum = 1L
    for (i in a..b) {
        sum *= calc(i)
        sum %= 14579
    }
    print(if (a < b && b >= 1 && b <= 1000) sum else 0)
}

fun calc(num: Int): Int {
    var sum = 0
    for (i in 1..num) sum += i
    return sum
}