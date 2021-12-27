open class BaseClass1 {
    open var a: Int = 5
}

class SubClass2 : BaseClass1() {
    override var a: Int = 7

    fun accessOwner() {
        println(a)
    }

    fun accessBase() {
        println(super.a)
    }
}

fun main(args: Array<String>) {
    val sc = SubClass2()
    sc.accessOwner()
    sc.accessBase()
}