package `array_strings`

/* Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0. */

fun main(args: Array<String>) {
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 0, 7, 8),
        arrayOf(9, 10, 11, 12),
    )

    ZeroMatrix().zeroMatrix(matrix)
}

class ZeroMatrix {

    // o(mn)
    fun zeroMatrix(matrix: Array<Array<Int>>) {
        val m = matrix.size // Number of rows
        val n = matrix[0].size // Number of columns

        val rowsThatHaveZero = mutableSetOf<Int>()
        val columnsThatHaveZero = mutableSetOf<Int>()

        // First pass to find all rows and columns that contain a 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] == 0) {
                    rowsThatHaveZero.add(i)
                    columnsThatHaveZero.add(j)
                }
            }
        }

        // Set the identified rows to zero
        for (row in rowsThatHaveZero) {
            for (j in 0 until n) {
                matrix[row][j] = 0
            }
        }

        // Set the identified columns to zero
        for (col in columnsThatHaveZero) {
            for (i in 0 until m) {
                matrix[i][col] = 0
            }
        }

        printMatrix(matrix)
    }
}

fun printMatrix(matrix: Array<Array<Int>>) {
    val m = matrix.size // Number of rows
    val n = matrix[0].size // Number of columns
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${matrix[i][j]} ")
        }
        println() // Move to the next line after each row
    }
}
