package `1-array_strings`

fun main(args: Array<String>) {
    println(IsPalindrome().isPalindrome1("adadda"))
}

class IsPalindrome {

    // o(1)
    fun isPalindrome1(str:String): Boolean {
        return str == str.reversed()
    }
}