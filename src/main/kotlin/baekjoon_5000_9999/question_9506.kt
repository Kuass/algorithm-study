package baekjoon_5000_9999

fun main() = with(System.`in`.bufferedReader()) { // 약수들의 합
    while(true) {
        val N = readLine().toInt()
        if(N == -1) break
        val list = mutableSetOf<Int>()
        var sum = 0

        for (i in 1..N/2) if(N % i == 0) { list.add(i); sum += i }

        if (sum != N) println("$N is NOT perfect.")
        else println("$N = ${list.joinToString(" + ")}")
    }
}