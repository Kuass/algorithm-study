package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 팬그램
    while(true) {
        val input = readLine()
        if (input == "*") break
        val arr = IntArray(26) { 0 }
        input.toCharArray().forEach { if (it in 'a'..'z') arr[it - 'a']++ }
        if (arr.contains(0)) println("N")
        else println("Y")
    }
}