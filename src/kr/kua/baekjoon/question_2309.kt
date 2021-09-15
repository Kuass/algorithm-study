package kr.kua.baekjoon

fun main() = with(System.`in`.bufferedReader()) { // 일곱 난쟁이
    val dwarf = IntArray(9)
    repeat(9) { dwarf[it] = readLine().toInt() }

    dwarf.sort()

    val sum = dwarf.sum()
    for (i in 0..8) for (j in i + 1..8) if (sum - dwarf[i] - dwarf[j] == 100) {
        for (k in 0..8) {
            if (i == k || j == k) continue
            println(dwarf[k])
        }
        return
    }
}