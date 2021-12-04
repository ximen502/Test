fun main() {
    loopTraversal()
}

//循环遍历练习
private fun loopTraversal() {
    //var list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val list = listOf("赵一伤", "钱二败", "孙三毁", "李四摧", "周五输", "吴六破", "郑七灭", "王八衰")
    for (item in list) {
        println(item)
    }

    for (index in list.indices) {
        //println("hero at $index is ${list.get(index)}")
        println("hero at $index is ${list[index]}")
    }

    for ((item, index) in list.withIndex()){
        println("神箭八雄hero at $index is $item")
    }

    var index = 0
    while (index < list.size) {
        println("while hero at $index is ${list[index]}")
        index++
    }
}