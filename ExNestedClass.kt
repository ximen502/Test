import xu.test

// 嵌套类不能访问外部类的其他成员，只能访问另一个嵌套类
class ExNestedClass {
    var prop1 = 5
    fun test() {
        println("外部类的test方法")
    }
    //没有inner修饰符，是嵌套类（相当于Java的静态内部类）
    class Nested {
        fun accessOutMember() {
            val a = A()
//            println(prop1)
            test()
        }
    }

    class A
}