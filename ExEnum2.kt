enum class Gender(val cnName: String) {
    MALE("男"), FEMALE("女");

    // define method
    fun info() {
        when (this) {
            MALE -> println("男儿当自强")
            FEMALE -> println("巾帼不让须眉")
        }
    }
}

fun main(args: Array<String>) {
    val g = Gender.valueOf("FEMALE")
    println("${g}代表${g.cnName}")
    g.info()
}