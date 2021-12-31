package kr.kua.baekjoon2.question_4659

fun main() = with(System.`in`.bufferedReader()) { // 비밀번호 발음하기
    while(true) {
        val chars = readLine().toCharArray()
        if (chars.size == 3 && chars[0] == 'e' && chars[2] == 'd') break

        var can = true
        var lastChar = '1'
        var consonant = 0
        var vowel = 0
        var hasVowel = false
        for (i in chars.indices) {
            if (isVowel(chars[i])) {
                hasVowel = true
                vowel++
                consonant = 0
            } else {
                consonant++
                vowel = 0
            }

            if (lastChar != 'e' && lastChar != 'o' && lastChar == chars[i]) {
                can = false
                break
            }
            if (consonant >= 3 || vowel >= 3) {
                can = false
                break
            }
            lastChar = chars[i]
        }

        println("<${chars.joinToString("")}> is ${if (!hasVowel || !can) "not " else ""}acceptable.")
    }
}

// 왜 틀리는지 모르겠음
fun main2() = with(System.`in`.bufferedReader()) { // 비밀번호 발음하기
    while(true) {
        val chars = readLine().toCharArray()
        if (chars.size == 3 && chars[0] == 'e' && chars[2] == 'd') break
        var vowel = 0
        var accept = true
        for (i in chars.indices) {
            if (i != 0 && chars[i] == chars[i - 1] && chars[i] != 'e' && chars[i] != 'o') {
                // 2회 동일 문자 확인, ee 와 oo 는 제외
                accept = false
                break
            }
            if (i > 2 &&
                    ((isVowel(chars[i]) && isVowel(chars[i-1]) && isVowel(chars[i-2]))
                    || (!isVowel(chars[i]) && !isVowel(chars[i-1]) && !isVowel(chars[i-2])))) {
                // 모음이 3회 연속되거나 자음이 연속 3회 반복될 때
                accept = false
                break
            }
            if (isVowel(chars[i])) vowel++
        }

        if ((chars.size == 3 && // eee, ooo 와 같은 입력 예외 처리
                ((isVowel(chars[0]) && isVowel(chars[1]) && isVowel(chars[2])) || (!isVowel(chars[0]) && !isVowel(chars[1]) && !isVowel(chars[2]))))
                || vowel == 0 || !accept)
            println("<${chars.joinToString("")}> is not acceptable.") // 모음이 하나라도 포함되어 있지 않을 경우
        else println("<${chars.joinToString("")}> is acceptable.")
    }
}

val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
fun isVowel(char: Char): Boolean = vowels.contains(char)
