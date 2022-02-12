val lazyProp: String by lazy {
    println("first visit executed code block")
    "crazy programmer"
}

fun main(args: Array<String>) {
    // visit lazyProp twice
    println(lazyProp)
    println(lazyProp)
}