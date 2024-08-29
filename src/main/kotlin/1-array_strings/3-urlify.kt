package `1-array_strings`

fun main(args: Array<String>) {
    println(Urlify().urlify1("bugra kara molla"))
}

class Urlify {

    // o(n)
    fun urlify1(str:String) : String {

        val newStr = StringBuilder()

        for (i in 0 until str.length) {
            if (str[i] == ' ') {
                newStr.append("%20")
            } else {
                newStr.append(str[i])
            }
        }

        return newStr.toString()
    }
}