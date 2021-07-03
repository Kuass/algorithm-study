package baekjoon

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var a = nextInt()
    var b = nextInt()

    print(loop(a) / (loop(b) * loop(a-b)))
}

fun loop(x: Int): Int {
    var r = 1;
    for (i in x downTo 1) r *= i
    return r
}