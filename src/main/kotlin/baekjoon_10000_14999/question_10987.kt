package baekjoon_10000_14999

fun main() { // 모음의 개수
    var res = 0
    readLine()!!.toCharArray().forEach {
        when(it) {
            'a', 'e', 'i', 'o', 'u' -> res++
        }
    }
    print(res)
}