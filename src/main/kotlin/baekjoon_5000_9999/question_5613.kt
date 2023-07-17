package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 계산기 프로그램
    var S = Integer.parseInt(readLine())
    while(true) {
        when(readLine()) {
            "+" -> S += Integer.parseInt(readLine())
            "-" -> S -= Integer.parseInt(readLine())
            "*" -> S *= Integer.parseInt(readLine())
            "/" -> S /= Integer.parseInt(readLine())
            "=" -> break
        }
    }

    print(S)
}