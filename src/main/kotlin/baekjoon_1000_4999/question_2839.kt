package kr.kua.baekjoon

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var sugar = nextInt()
    var count = 0

    while (true) {
        if (sugar % 5 == 0) {
            print("${sugar / 5 + count}")
            break
        } else if (sugar <= 0) {
            print(-1)
            break
        }

        sugar -= 3
        count++
    }
}