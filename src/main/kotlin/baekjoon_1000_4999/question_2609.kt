package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 최대공약수와 최소공배수
    val (A, B) = readLine().split(" ").map { it.toInt() }
    val gcd = gcd(A, B)
    println("$gcd ${A * B / gcd}")
}

fun gcd(a: Int, b: Int): Int {
    return if (a % b == 0) b else gcd(b, a % b)
}