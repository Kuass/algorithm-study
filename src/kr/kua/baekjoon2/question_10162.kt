package kr.kua.baekjoon2.question_10162

fun main() { // 전자레인지
    var T = readLine()!!.toInt()
    if (T % 10 != 0) {
        print(-1)
        return
    }
    val A = T / 300
    T %= 300

    val B = T / 60
    T %= 60

    val C = T / 10
    print("$A $B $C")
}

fun main_back() { // 전자레인지
    var (A, B, C, T) = arrayOf(0, 0, 0, readLine()!!.toInt())
    while (T != 0) {
        if (T % 10 != 0) {
            print(-1)
            return
        } else if (T >= 300) {
            A++
            T -= 300
        } else if (T >= 60) {
            B++
            T -= 60
        } else if (T >= 10) {
            C++
            T -= 10
        }
    }
    print("$A $B $C")
}