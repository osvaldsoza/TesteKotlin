object Teste {
    @JvmStatic
    fun main(args: Array<String>) {
        val numbers = intArrayOf(2, 8, 4, -3, 7)
        orderAsc(numbers)
        orderDesc(numbers)
    }

    private fun orderAsc(numbers: IntArray) {
        var aux: Int
        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                if (numbers[i] > numbers[j]) {
                    aux = numbers[i]
                    numbers[i] = numbers[j]
                    numbers[j] = aux
                }
            }
        }
        var sumAsc = 0
        for (i in 0 until numbers.size - 1) {
            sumAsc += numbers[i]
        }
        println(sumAsc)
    }

    private fun orderDesc(numbers: IntArray) {
        var aux: Int
        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                if (numbers[i] < numbers[j]) {
                    aux = numbers[i]
                    numbers[i] = numbers[j]
                    numbers[j] = aux
                }
            }
        }
        var sumDesc = 0
        for (i in 0 until numbers.size - 1) {
            sumDesc += numbers[i]
        }
        println(sumDesc)
    }
}