//数据类和返回多个值得函数
data class Result(
    val result: Int,
    val status: String
)

fun factorial(n: Int): Result {
    if (n == 1) {
        return Result(1, "success")
    } else if (n > 1) {
        return Result(factorial(n - 1).result * n, "success")
    } else {
        return Result(-1, "the param must > 0")
    }
}

fun main(args: Array<String>) {
    var (rt, status) = factorial(5)
    println(rt)
    println(status)

    //不关心的变量可以用_占位符号代替
    var (_, status2) = factorial(-5)
    println(status2)

    //系统为数据类生成的copy方法，可用于复制对象
    var result = Result(2, "unknown result")
    var oldRt = result.copy()
    println(oldRt)
}
/*
Kotlin标准库提供了Pair,Triple两个数据类，正如他们的名字所暗示的
Pair可以包含2个任意类型的属性；Triple可以包含3个。快速开发可以考虑
直接使用这两个数据类
*/

/*
    在lambda表达式中使用解构
Lambda表达式的参数可以是支持解构的类型（如Pair或Map.Entry等）
e.g.

```
map.mapValues{entry -> "${entry.value}!"}
//entry解构成(key,value)
map.mapValues{(key, value) -> "$value!"}
```
{a -> ...} // one param
{a,b -> ...} // two params
{(a,b) -> ...} // 一个解构对
{(a,b),c -> ..} // 一个解构对和第三个参数

在lambda表达式中多个参数是不需要使用圆括号的，如果使用了圆括号，那就是使用了解构。

如果解构的参数中有一个组件未使用，那么可以将其替换为下划线，避免编造名称
map.mapValues{ (_, value) -> "$value!}

*/