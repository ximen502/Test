import kotlin.properties.Delegates

var vetoableProp: Int by Delegates.vetoable(20) {
    prop, old, new ->
    println("${prop} 's ${old} changed to ${new}")
    new > old
}

fun main(args: Array<String>) {
    // will not trigger property listener
    println(vetoableProp)
    // new value smaller than old value , lambda return false ,set new value failed
    vetoableProp = 15
    println(vetoableProp)
    // new value greater than old value , lambda return true ,set new value success
    vetoableProp = 50
    println(vetoableProp)
}