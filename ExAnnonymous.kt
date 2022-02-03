//kotlin抛弃了函数式接口，如果对象是函数式接口的实例，则可使用接口类型前缀的Lambda创建它。
fun main(args: Array<String>) {
    var t = Runnable {
        for (i in 0..100) {
            println("${Thread.currentThread().name},i: $i")
        }
    }

    Thread(t).start()

    for (i in 0..100) {
        println("${Thread.currentThread().name},i: $i")
    }
}