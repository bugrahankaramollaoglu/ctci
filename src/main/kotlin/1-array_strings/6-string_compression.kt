package `1-array_strings`

fun main(args: Array<String>) {
    println(StringCompression().stringCompression1("aaaabbbbcccccccc"))
}

class StringCompression {

    // o(n)
    fun stringCompression1(str: String): String {

        val compressedStrMap = str.groupingBy { it }.eachCount()
        val compressedStr = compressedStrMap.entries.joinToString(separator = "") {
            "${it.key}${it.value}"
        }

        return if (compressedStr.length < str.length) compressedStr else str

    }

}