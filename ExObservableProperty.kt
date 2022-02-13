import kotlin.properties.Delegates

var observableProp: String by Delegates.observable("default value") { prop, old, new ->
    println("${prop} 's ${old} changed to ${new}")
}

fun main(args: Array<String>) {
    // will not trigger property listener
    println(observableProp)
    // will trigger property listener
    observableProp = "crazy programmer"
    println(observableProp)
}