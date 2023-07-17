package baekjoon_10000_14999

fun main() = with(System.`in`.bufferedReader()) { // !밀비 급일
    val sb = StringBuilder()
    while(true) {
        val str = readLine().toCharArray()
        if(str.size == 3 && str[0] == 'E' && str[2] == 'D') break
        for(i in str.size - 1 downTo 0) sb.append(str[i])
        sb.appendLine()
    }
    print(sb)
}