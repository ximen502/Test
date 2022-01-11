// 如果一个类包含了具有相同签名的成员方法和扩展方法，当程序调用这个方法时，系统总是会执行成员方法，而不会执行扩展方法。
class ExtensionAndMember {
    fun foo() = println("成员方法")
}

fun ExtensionAndMember.foo() = println("扩展方法")

fun main(args: Array<String>) {
    var ea = ExtensionAndMember()
    ea.foo()
}