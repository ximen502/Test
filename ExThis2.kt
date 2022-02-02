class A {
    //隐式标签@A
    inner class B {
        //隐式标签@B
        //为Int扩展foo
        fun Int.foo() {//隐式标签@foo
            val a = this@A
            val b = this@B
            val c = this
            val c1 = this@foo//与c代表的对象相同

            println(a)
            println(b)
            println(c)
            println(c1)

            //为String扩展funLit
           val funLit = lambda@ fun String.() {
                val d = this//代表该函数所属对象，String
                val d1 = this@lambda
                println(d)
                println(d1)
            }

            "fkit".funLit()

            //直接定义一个lambda表达式，没有接收者
            val funLit2 = {
                val e = this
                val e1 = this@foo
                println("foo()方法中的lambda表达式的this：${e}")
                println("e1's this :${e1}")
            }

            funLit2()
        }

        fun testB() {
            2.foo()
        }

    }

    fun testA() {
        var bObj = B()
        println("程序创建的B对象${bObj}")
        bObj.testB()
    }
}

fun main(args: Array<String>) {
    var aObj = A()
    println("程序创建的A对象:${aObj}")
    aObj.testA()
}