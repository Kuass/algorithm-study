package kr.kua.programmers

class question_42583 { // 다리를 지나는 트럭
    init {
        var truck_weights = arrayOf(7,4,5,6).toIntArray()
        println("2, 10, ${truck_weights.joinToString(", ")} - " + solution(2, 10, truck_weights))
        truck_weights = arrayOf(10).toIntArray()
        println("100, 100, ${truck_weights.joinToString(", ")} - " + solution(100, 100, truck_weights))
    }

    data class Truck(val weight: Int, var position: Int)
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var lateTime = 0
        val truckWeights = truck_weights.toMutableList()
        val trucks = mutableListOf<Truck>()
        while(true) {
            if (truckWeights.isEmpty() && trucks.isEmpty()) {
                break
            } else {
                if (truckWeights.isNotEmpty() && trucks.sumOf { it.weight } + truckWeights[0] < weight) {
                    // 올라갈 무게가 됨
                    trucks.add(Truck(truckWeights[0], 1))
                    truckWeights.removeAt(0)
                }

                for (i in trucks.size - 1 downTo 0) {
                    if (trucks[i].position > bridge_length) {
                        trucks.removeAt(i)
                    } else {
                        trucks[i].position++
                    }
                }

                if (trucks.isEmpty() && truckWeights.isNotEmpty()) {
                    trucks.add(Truck(truckWeights[0], 2))
                    truckWeights.removeAt(0)
                }

                lateTime++
            }
        }
        return lateTime
    }
}
//println("### 경과 시간[$lateTime] 건너는 트럭 [${trucks.joinToString(", ")}], 대기 트럭 [${truckWeights.joinToString(", ")}]")