fun main() {
    var list1 = listOf("Java", "Kotlin", null, "Go")
    println(list1)
    var list2 = listOfNotNull("Java", "Kotlin", null, "Go")
    println(list2)
    var mutableList = mutableListOf("Java", "Kotlin", null, "Go")
    println(mutableList)

    // immutable list
    println("listOf返回对象的实际类型是:${list1.javaClass}")
    println("listOfNotNull返回对象的实际类型是:${list2.javaClass}")
    println("mutableList返回对象的实际类型是:${mutableList.javaClass}")

    var arrayList = arrayListOf("Java", "Kotlin", null, "Go")
    println(arrayList)

}