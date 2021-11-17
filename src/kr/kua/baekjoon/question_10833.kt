package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 사과
    var total = 0
    repeat(readLine().toInt()) {
        readLine().split(" ").map { it.toInt() }.let {
            if (it[0] > it[1]) total += it[1]
            else {
                var (future, index) = arrayOf(it[0] * 2, 2)
                while(future <= it[1]) future = it[0] * ++index
                total += it[1] - (it[0] * --index)
            }
        }
    }
    print(total)
}