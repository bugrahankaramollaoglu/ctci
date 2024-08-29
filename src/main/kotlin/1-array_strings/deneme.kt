package `1-array_strings`

fun main(args: Array<String>) {

    deneme("asd","1234")

}

fun deneme(s1:String, s2:String) {

    val (shorter, longer) = if (s1.length < s2.length) s1 to s2 else s2 to s1

    println("shorter: $shorter")
    println("longer: $longer")

}