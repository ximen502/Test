// List 集合操作方法
//t(),indexOf(),lastIndexOf(),subList()
fun main() {
    // 创建不可变集合
    var list = listOf("Java", "Kotlin", null, "Go")
    for (i in list.indices) {
        // [i] is equivalent to get(i)
        println(list[i])
    }

    // get element 's position
    println(list.indexOf("Kotlin"))

    // get subList
    println(list.subList(1, 3))
}