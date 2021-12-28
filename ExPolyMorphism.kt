open class BaseClass2 {
    open var book = 6
    fun base() {
        println("parent class's normal method")
    }

    open fun test() {
        println("parent class's override method")
    }
}

class SubClass3 : BaseClass2() {
    override var book = 60
    override fun test() {
        println("child class override parent's method")
    }

    fun sub() {
        println("child class's normal method")
    }
}

fun main(args: Array<String>) {
    var bc: BaseClass2 = BaseClass2()
    println(bc.book)
    bc.base()
    bc.test()

    var sc: SubClass3 = SubClass3()
    println(sc.book)
    sc.base()
    sc.test()
//相同类型的变量，调用同一个方法时呈现出多种不同自类的行为特征，这就是多态。
    println("......................")
    var polyMorphic: BaseClass2 = SubClass3()
    println(polyMorphic.book)
    polyMorphic.base()
    polyMorphic.test()
//    polyMorphic.sub()
}