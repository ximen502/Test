fun main(args: Array<String>) {
    var list = listOf(3, 5, 30, -25, 14)
    list.forEach(fun(n){
        println("元素依次为:${n}")
        //return用于返回此匿名函数
        return
    })

    list.forEach { n ->
        println("Lambda forEach 元素依次为:${n}")
        //return用于返回lambda表达式所在的函数
        return //所以一般lambda表达式不使用return
        //return@forEach
    }
}