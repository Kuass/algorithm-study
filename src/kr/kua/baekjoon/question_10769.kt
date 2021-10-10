package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 행복한지 슬픈지
    val a = readLine().toCharArray()
    var (happy, sad, count) = arrayOf(0, 0, 0)
    for (i in 0 until a.count()) {
        if (a[i].code == 58 && a[i+1].code == 45) {
            when(a[i+2].code) {
                40 -> {
                    sad++
                    count++
                }
                41 -> {
                    happy++
                    count++
                }
            }
        }
    }
    if (count == 0) print("none")
    else if (happy == sad) print("unsure")
    else if (happy > sad) print("happy")
    else if (happy < sad) print("sad")
}