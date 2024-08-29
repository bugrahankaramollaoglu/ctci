package `1-array_strings`

import kotlin.math.abs

fun main(args: Array<String>) {
    println(OneAway().oneAway("asd", "asf"))  // Output: true (one deletion)
    println(OneAway().oneAway("pales", "pale")) // Output: true (one insertion)
    println(OneAway().oneAway("pale", "bale"))  // Output: true (one replacement)
    println(OneAway().oneAway("pale", "bake"))  // Output: false (more than one edit)
}

class OneAway {

    fun oneAway(str1:String,str2:String) : Boolean {

        if (str1 == str2)
            return true

        if (abs(str1.length-str2.length) > 1)
            return false

        var isDifferent = false

        if (str1.length == str2.length) {
            for (i in 0 until str2.length) {
                if (str1[i] != str2[i]){
                    if (isDifferent)
                        return false
                    isDifferent = true
                }
            }
        } else {
            val (shortOne, longOne) = if(str1.length < str2.length) str1 to str2 else str2 to str1
            var i=0
            var i2=0

            while (i2 < longOne.length && i < shortOne.length) {
                if (shortOne[i] != longOne[i2]){
                    if (isDifferent) return false
                    isDifferent = true
                    i2++
                } else {
                    i++
                    i2++
                }
            }
        }
        return true
    }
}