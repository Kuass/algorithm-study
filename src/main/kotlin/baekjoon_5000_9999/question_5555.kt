package kr.kua.baekjoon2.question_5555

fun main() = with(System.`in`.bufferedReader()) { // 반지
    val word = readLine()
    var count = 0
    repeat(readLine().toInt()) {
        var s = readLine()
        s += s
        if (s.contains(word)) count++
    }
    print(count)
}

// 시간초과 코드
fun main_timeout() = with(System.`in`.bufferedReader()) { // 반지
    val mainWord = readLine().toCharArray()
    var count = 0
    repeat(readLine().toInt()) {
        var wordIndex = 0
        var index = 0
        val words = readLine().toCharArray()
        while(true) {
            if (words[index] == mainWord[wordIndex]) wordIndex++
            else if (wordIndex != 0) wordIndex = 0

            if (wordIndex != 0 && index == 9) index = -1
            if (wordIndex == mainWord.size - 1) {
                count++
                break
            }

            if (++index == words.size) break
        }
    }
    print(count)
}