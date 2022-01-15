package kr.kua.baekjoon2

fun main() = with(System.`in`.bufferedReader()) { // ROT13
    print(readLine().rot13())
}

fun String.rot13() = map {
    when {
        it.isUpperCase() -> { val x = it + 13; if (x > 'Z') x - 26 else x }
        it.isLowerCase() -> { val x = it + 13; if (x > 'z') x - 26 else x }
        else -> it
    } }.toCharArray()