//扩展函数的深入理解
open class Base5

class Sub5 : Base5()

fun Base5.foo() = println("Base扩展的foo方法")

fun Sub5.foo() = println("Sub扩展的foo方法")

fun invokeFoo(b: Base5) {
    b.foo()
}
//[成员方法执行动态解析，由运行时类型所决定]
//[扩展方法执行静态解析，由编译时类型所决定]
fun main(args: Array<String>) {
    invokeFoo(Sub5())
}
//输出结果如下
//Base扩展的foo方法