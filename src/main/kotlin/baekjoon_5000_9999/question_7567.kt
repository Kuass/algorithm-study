package kr.kua.baekjoon2

fun main() { // 그릇
    var count = 10
    val chars = readLine()!!.toCharArray()
    for (i in 1 until chars.size) count += if(chars[i] == chars[i - 1]) 5 else 10
    print(count)
}