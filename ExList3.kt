//List add, remove
fun main() {
    // make a mutable list
    var mutableList = mutableListOf("Kotlin", null, "Go")
    // insert a new element to index 2
    mutableList.add(2, "Java")
    println(mutableList)

    // delete element at index 1
    mutableList.removeAt(1)
    println(mutableList)

    // replace the element at index 1
    mutableList[1] = "Lua"
    println(mutableList)
    // clear
    mutableList.clear()
    println(mutableList.size)
}