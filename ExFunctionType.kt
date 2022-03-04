/**
 *
函数类型由函数的形参列表,->,返回值类型组成
如：
func foo(a:Int, name:String) -> String{

}
该函数的类型是(Int, String)->String
这种类型可以定义变量，修饰参数，修饰返回值类型

当直接访问一个函数的引用，需要zai函数名前添加2个冒号，而且不能再后面添加圆括号，
添加圆括号就变成了调用函数，而不是访问函数引用
 */
fun pow(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

fun area(width: Int, height: Int): Int {
    return width * height
}

fun main(args: Array<String>) {
    var myFun: (Int, Int) -> Int
    var test: (String)

    myFun = ::pow

    println(myFun(2, 3))

    myFun = ::area

    println(myFun(4, 5))

}
