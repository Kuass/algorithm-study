package baekjoon_10000_14999

fun main() { // 거스름돈
    var n = readLine()!!.toInt()
    var count = 0
    while(true) {
        if (n >= 5) {
            n -= 5
            count++
        } else break
    }

    if (n % 2 == 1) {
        n += 5
        count--
    }

    count += n / 2
    print(count)
}