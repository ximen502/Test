// 函数相当于返回了一个函数，这个函数持有一个list，这个list在函数多次调用引用的竟然还是同一个list
//而如果重新调用make...方法返回的函数，跟之前返回的函数所拥有的list就又不一样了。
fun makeList(ele: String): () -> List<String> {
    var list: MutableList<String> = mutableListOf()
    fun addElement(): List<String> {
        list.add(ele)
        return list
    }
    return ::addElement
}

fun main(args: Array<String>) {
    println("--------------add1 returned list------------------")
    val add1 = makeList("赵一伤")
    println(add1())
    println(add1())
    println("--------------add2 returned list------------------")
    val add2 = makeList("钱二败")
    println(add2())
    println(add2())

}