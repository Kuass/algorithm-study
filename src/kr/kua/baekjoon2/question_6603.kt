package kr.kua.baekjoon2

import java.util.*

private var k: Int = 0
private lateinit var arr: IntArray
private lateinit var skip: BooleanArray
private var sb: StringBuilder = StringBuilder()
fun main() { // 로또
    val sc = Scanner(System.`in`)
    while(true) {
        k = sc.nextInt()
        if (k == 0) break
        skip = BooleanArray(k)
        arr = IntArray(k)
        arr.forEachIndexed { idx, _ -> arr[idx] = sc.nextInt() }
        dfs(0,0)
        sb.appendLine()
    }
    print(sb)
}

fun dfs(n: Int, r: Int) {
    if (r == 6) {
        for (i in arr.indices) if (skip[i]) sb.append("${arr[i]} ")
        sb.appendLine()
    }
    for (i in n until arr.size) {
        skip[i] = true; dfs(i + 1, r + 1); skip[i] = false
    }
}