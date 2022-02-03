//在外部类以外使用内部类
class Out {

    inner class In(msg: String) {
        init {
            println(msg)
        }
    }

}

fun main(args: Array<String>) {
    //var oi:Out.In = Out().In("Test information")
    /*
    等同于如下代码
     */
    var oi: Out.In
    val ot = Out()
    oi = ot.In("Test Information")

}