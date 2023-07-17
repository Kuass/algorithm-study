package baekjoon_10000_14999

fun main() { // 알파벳 개수
    val arr = IntArray(26)
    readLine()!!.forEach { arr[it.code - 0x61]++ }
    print(arr.joinToString(" "))
}