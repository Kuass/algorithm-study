package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 괄호
    repeat(readLine().toInt()) {
        val vps = readLine().toCharArray().toMutableList()
        var bol = false
        var i = 0
        while(vps.isNotEmpty()) {
            if (i >= vps.size) {
                i = -1
                break
            } else if (bol) {
                if (vps[i].code == 41) {
                    bol = false
                    vps.removeAt(i)
                    i = 0
                } else i++
            } else {
                if (vps[i].code != 40) {
                    i = -1
                    break
                } else {
                    bol = true
                    vps.removeAt(i)
                    if (vps.size == 0) {
                        i = -1
                        break
                    }
                }
            }
        }
        println(if (i == -1) "NO" else "YES")
    }
}