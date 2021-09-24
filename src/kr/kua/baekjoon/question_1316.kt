package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 그룹 단위 체커
    var C = 0
    repeat(readLine().toInt()) {
        var curIndex = '@'
        var isFail = false
        val arr = IntArray(26) { 0 }
        readLine().toCharArray().forEach {
            val i = it - 0x61
            if (curIndex - 0x61 == i) arr[i.code]++ else {
                // 새로 시작되는 단어
                if (arr[i.code] == 0) {
                    arr[i.code]++
                    curIndex = it
                } else isFail = true
            }
        }
        if (!isFail) C++
    }
    print(C)
}