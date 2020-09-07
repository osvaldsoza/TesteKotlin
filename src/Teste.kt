fun main() {
    val numbers = intArrayOf(2, 8, 4, -3, 7)
    val size = numbers.size.plus(-1)
    minSumOrderAsc(numbers, size)
    maxSumOrderDesc(numbers, size)
}

private fun minSumOrderAsc(numbers: IntArray, size: Int) {
    numbers.sort()
    var minSum = 0
    minSum = sum(size, minSum, numbers)
    println(minSum)
}

private fun maxSumOrderDesc(numbers: IntArray, size: Int) {
    numbers.sortDescending()
    var maxSum = 0
    maxSum = sum(size, maxSum, numbers)
    println(maxSum)
}

private fun sum(size: Int, sum: Int, numbers: IntArray): Int {
    var sum = sum
    for (i in 0 until size) {
        sum += numbers[i]
    }
    return sum
}
