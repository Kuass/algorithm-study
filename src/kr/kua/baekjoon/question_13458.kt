package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 시험 감독
    readLine()
    val A = readLine().split(" ").map { it.toInt() }.toIntArray()
    val (B, C) = readLine().split(" ").map { it.toInt() }.toIntArray()
    var count = A.count().toLong()
    for (remain in A.map { it - B }) if (remain > 0) count += Math.ceil(remain.toDouble() / C).toLong()
    print(count)
}

//  시간초과
//    A.forEach {
//        var (i, c) = arrayOf(it, 0)
//        while (i > 0) i -= if (c++ == 0) {
//            count++; B
//        } else {
//            count++; C
//        }
//    }