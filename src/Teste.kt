fun main() {
    val numbers = intArrayOf(2, 8, 4, -3, 7)
    val size = numbers.size.plus(-1)
    minSumOrderAsc(numbers, size)
    maxSumOrderDesc(numbers, size)
}

private fun minSumOrderAsc(numbers: IntArray, size: Int) {
    numbers.sort()
    var minSum = 0
    for (i in 0 until numbers.size - 1) {
        minSum += numbers[i]
    }
    println(minSum)
}

private fun maxSumOrderDesc(numbers: IntArray, size: Int) {
    numbers.sortDescending()
    var maxSum = 0
    for (i in 0 until size) {
        maxSum += numbers[i]
    }
    println(maxSum)
}
