package `1-array_strings`

/* öncelikle kotlinde matrix nası tanımlanır
*
* val matrix = arrayOf(
*   arrayOf(1,2,3)
*   arrayOf(4,5,6)
*   arrayOf(7,8,9)
* )
*
* */

fun main(args: Array<String>) {

    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9),
    )

    RotateMatrix().rotateMatrix1(matrix)

}

class RotateMatrix {

    // o(n^2)
    fun rotateMatrix1(matrix: Array<Array<Int>>) {
        val n = matrix.size


        // step1 - transpose matrix (satır->sütun)
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = tmp
            }
        }

        // step2 - reverse rows (satırlari ters çevir)
        for (i in 0 until n) {
            for (j in 0 until n / 2) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[i][n - 1 - j]
                matrix[i][n - 1 - j] = tmp
            }
        }

        for (row in matrix) {
            println(row.joinToString(" "))
        }
    }
}