package kr.kua.baekjoon2

fun main() { // 2007년
    val lastMonths = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val weeks = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    var (month, day) = readLine()!!.split(' ').map { it.toInt() }
    for(i in 0..month - 2) day += lastMonths[i]
    print(weeks[day % 7])
}