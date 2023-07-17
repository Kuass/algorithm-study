package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // TGN
    for (i in 1..Integer.parseInt(readLine())) {
        val R = readLine().split(" ").map { it.toInt() }
        val RE = R[1] - R[0]
        if (RE == R[2]) println("does not matter")
        else if (RE > R[2]) println("advertise")
        else if (RE < R[2]) println("do not advertise")
    }
}