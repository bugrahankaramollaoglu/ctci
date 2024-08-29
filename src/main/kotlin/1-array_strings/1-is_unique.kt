fun main(args: Array<String>) {
    println(IsUnique().isUnique1("abcdefga"))
    println(IsUnique().isUnique2("abcdefg"))
    println(IsUnique().isUnique3("abcdefga"))
}

class IsUnique {

    // o(n)
    fun isUnique1(str:String) : Boolean {
        val chars = mutableSetOf<Char>()

        for (ch in chars) {
            if (chars.contains(ch)) {
                return false;
            }
            chars.add(ch)
        }

        //or
        str.forEach { ch ->

            if (ch in chars) {
                return false;
            }
            chars.add(ch)
        }

        return true
    }

    // o(nlog(n))
    fun isUnique2(str:String) : Boolean {
        val charList: List<Char> = str.toList().sorted()

        for ((index, value) in charList.withIndex()) {
            if (index == charList.size - 1)
                return true
            else if (value == charList[index + 1])
                return false
        }
        return true
    }

    // o(n)
    fun isUnique3(str:String)  = str.length == str.toSet().size

}
