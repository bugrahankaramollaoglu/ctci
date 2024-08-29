package `1-array_strings`

fun main() {
    println(IsPermutation().isPermutation1("asd","das"))
    println(IsPermutation().isPermutation2("asd","dads"))
}

class IsPermutation{

    // sorting string takes O(nLog(n)) time
    fun isPermutation1(str1:String,str2:String):Boolean{

        if (str1.length != str2.length)
            return false

        val str1_sorted : List<Char> = str1.toList().sorted()
        val str2_sorted : List<Char> = str2.toList().sorted()

        return str1_sorted == str2_sorted

    }

    // o(n)
    fun isPermutation2(str1:String,str2:String):Boolean{

       val freq_map_s1 = str1.groupingBy { it }.eachCount()
       val freq_map_s2 = str2.groupingBy { it }.eachCount()

        return freq_map_s1 == freq_map_s2

    }

}

