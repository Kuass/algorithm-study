package kr.kua.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { // 막대기
    var (X, stick, count) = arrayOf(readLine().toInt(), 64, 0)

    while (X > 0) {
        if (stick > X) stick /= 2
        else {
            count++
            X -= stick
        }
    }

    print(count)
}

/*
 while 문을 돌리지 않고
 Integer.toBinaryString(X).count { it == '1'}
 한줄로 결과물 도출 가능...
 */