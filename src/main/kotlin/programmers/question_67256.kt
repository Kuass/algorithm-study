package kr.kua.programmers

import java.awt.Point
import kotlin.math.abs

class question_67256 { // 키패드 누르기
    init {
        var numbers = arrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5).toIntArray()
        var hand = "right"
        println("[${numbers.joinToString()}], $hand, LRLLLRLLRRL - ${solution(numbers, hand)}")
        numbers = arrayOf(7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2).toIntArray()
        hand = "left"
        println("[${numbers.joinToString()}], $hand, LRLLRRLLLRR - ${solution(numbers, hand)}")
        numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).toIntArray()
        hand = "right"
        println("[${numbers.joinToString()}], $hand, LLRLLRLLRL - ${solution(numbers, hand)}")
    }

    fun solution(numbers: IntArray, hand: String): String {
        var left = Point(3, 0)
        var right = Point(3, 2)
        val numPoint = Array(11) { Point(0, 0) }
        val isLeft = hand == "left"

        for (i in 0..2) for (j in 0..2) numPoint[i * 3 + j + 1] = Point(i, j)
        numPoint[0] = Point(3, 1)

        val sb = StringBuilder()
        for (i in numbers) {
            val target = numPoint[i]
            if (i == 1 || i == 4 || i == 7) {
                sb.append("L")
                left = target
            } else if (i == 3 || i == 6 || i == 9) {
                sb.append("R")
                right = target
            } else {
                val leftDis = abs(target.x - left.x) + abs(target.y - left.y)
                val rightDis = abs(target.x - right.x) + abs(target.y - right.y)
                if (leftDis > rightDis) {
                    sb.append("R")
                    right = target
                } else if (leftDis < rightDis) {
                    sb.append("L")
                    left = target
                } else {
                    if (isLeft) {
                        sb.append("L")
                        left = target
                    } else {
                        sb.append("R")
                        right = target
                    }
                }
            }
        }

        return sb.toString()
    }
}