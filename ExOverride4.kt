open class Foo {
    open fun test() {
        println("Foo's test method")
    }

    fun foo() {
        println("foo()")
    }
}
/*
java中的interface是不允许有具体方法的，除非是default方法，就这貌似从jdk8开始支持的。
可是kotlin中的接口interface竟然可以有具体方法，那它和java的default方法是一回事儿吗？
再次被kotlin的语法刷新了编码三观。
* */
interface Bar {
    fun test() {
        println("Bar's test method")
    }

    fun bar() {
        println("bar()")
    }
}

class Wow : Foo(), Bar {
    override fun test() {
        super<Foo>.test()
        super<Bar>.test()
    }
}

fun main(args: Array<String>) {
    var w = Wow()
    w.test()
}