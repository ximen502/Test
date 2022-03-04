/**
 *
函数类型由函数的形参列表,->,返回值类型组成
如：
func foo(a:Int, name:String) -> String{

}
该函数的类型是(Int, String)->String
这种类型可以定义变量，修饰参数，修饰返回值类型
 */
fun pow(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

fun main(args: Array<String>) {
    var myFun: (Int, Int) -> Int

}
