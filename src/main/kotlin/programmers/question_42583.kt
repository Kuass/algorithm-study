package kr.kua.programmers

import java.util.*

class question_42583 { // 다리를 지나는 트럭
    init {
        var truck_weights = arrayOf(7,4,5,6).toIntArray()
        println("2, 10, [${truck_weights.joinToString(", ")}] - " + solution(2, 10, truck_weights)) // 8
        truck_weights = arrayOf(10).toIntArray()
        println("100, 100, ${truck_weights.joinToString(", ")} - " + solution(100, 100, truck_weights)) // 101
        truck_weights = arrayOf(10,10,10,10,10,10,10,10,10,10).toIntArray()
        println("100, 100, ${truck_weights.joinToString(", ")} - " + solution(100, 100, truck_weights)) // 110
        truck_weights = arrayOf(1,1,1,1).toIntArray()
        println("4, 2, [${truck_weights.joinToString(", ")}] - " + solution(4, 2, truck_weights)) // 10
        truck_weights = arrayOf(1,1,1).toIntArray()
        println("3, 3, [${truck_weights.joinToString(", ")}] - " + solution(3, 3, truck_weights)) // 6
        truck_weights = arrayOf(1,1,1).toIntArray()
        println("3, 1, [${truck_weights.joinToString(", ")}] - " + solution(3, 1, truck_weights)) // 10
        truck_weights = arrayOf(1,1,1,1,1,2,2).toIntArray()
        println("5, 5, [${truck_weights.joinToString(", ")}] - " + solution(5, 5, truck_weights)) // 14
    }

    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var lateTime = 0
        val bridgeQueue = LinkedList(List(bridge_length) { 0 })
        val waitQueue = LinkedList(truck_weights.asList())

        while(bridgeQueue.isNotEmpty()){
            lateTime++
            bridgeQueue.poll()
            if(waitQueue.isNotEmpty())
                if (bridgeQueue.sum() <= weight - waitQueue.peek()) bridgeQueue.add(waitQueue.poll()) // 견딜수 있는 무게를 초과하지 않는다면 큐에 삽입
                else bridgeQueue.add(0)
        }

        return lateTime
    }

    data class Truck(val weight: Int, var position: Int)

    fun solution_back2(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var (lateTime, curWeight, truckIndex, passedTruckCount) = IntArray(4)
        val truckQueue = LinkedList<Truck>()


        while (passedTruckCount < truck_weights.size) {

            for (truck in truckQueue) truck.position++

            if (truckQueue.count() > 0 && truckQueue.peek().position == bridge_length) {
                curWeight -= truckQueue.peek().weight
                passedTruckCount++
                truckQueue.remove()
            }

            if (truckIndex < truck_weights.size && curWeight + truck_weights[truckIndex] <= weight) {
                curWeight += truck_weights[truckIndex]
                truckQueue.add(Truck(truck_weights[truckIndex], 0))
                truckIndex++
            }

            lateTime++
        }

        return lateTime
    }
    fun solution_back(bridge_length: Int, weight: Int, truck_weights: IntArray): Int { // 이건 정확성 29점
        var lateTime = 0
        val truckWeights = truck_weights.toMutableList()
        val trucks = mutableListOf<Truck>()
        while(true) {
            if (truckWeights.isEmpty() && trucks.isEmpty()) {
                break
            } else {
                var sumOf = 0
                trucks.forEach { sumOf += it.weight }
                if (truckWeights.isNotEmpty() && sumOf + truckWeights[0] <= weight) {
                    // if (truckWeights.isNotEmpty() && trucks.sumOf { it.weight } + truckWeights[0] <= weight) {
                    // 로 위 두줄 생략 가능(컴파일러 구버전으로 sumOf 를 지원하지 않음)
                    trucks.add(Truck(truckWeights[0], 1))
                    truckWeights.removeAt(0)
                }

                for (i in trucks.size - 1 downTo 0) if (trucks[i].position > bridge_length) trucks.removeAt(i) else trucks[i].position++

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