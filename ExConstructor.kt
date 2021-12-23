class People(name: String) {
    init {
        var a = 6
        if (a > 4) {
            println("People init block, a is greater than 4")
        }
        println("People init block")
        println("name param is :${name}")
    }

    init {
        println("people 2nd init block")
    }
}

fun main(args: Array<String>) {
    People("赵一伤")
}