interface Product {
    fun getProduceTime(): Int
}

const val MAX_CACHE_LINE = 10

class Printer : Outputable, Product {
    private val printData = Array<String>(MAX_CACHE_LINE) { "" }
    private var dataNum = 0
    override val brand: String = "HP"

    override var category: String = "输出外设"

    override fun out() {
        while (dataNum > 0) {
            println("打印机打印：" + printData[0])
            System.arraycopy(printData, 1, printData, 0, --dataNum)
        }
    }

    override fun getData(msg: String) {
        if (dataNum >= MAX_CACHE_LINE) {
            println("输出队列已满，添加失败")
        } else {
            printData[dataNum++] = msg
        }
    }

    override fun getProduceTime(): Int {
        return 45
    }
}

fun main(args: Array<String>) {
    var o: Outputable = Printer()
    o.getData("轻量级Java EE")
    o.getData("疯狂Java讲义")
    o.out()
    o.getData("降龙十八掌")
    o.getData("六脉神剑")
    o.out()

    o.print("赵一伤", "钱二败", "孙三毁")
    o.test()

    val p: Product = Printer()
    println(p.getProduceTime())
    val obj: Any = p
}