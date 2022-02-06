interface GenderDesc{
    fun info()
}
enum class Gender2(val cnName: String) : GenderDesc{
    MALE("男"), FEMALE("女");

    // override method
    override fun info() {
        when (this) {
            MALE -> println("男儿当自强2")
            FEMALE -> println("巾帼不让须眉2")
        }
    }
}

fun main(args: Array<String>) {
    val g = Gender2.valueOf("MALE")
    println("${g}代表${g.cnName}")
    g.info()
}