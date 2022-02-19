import kotlin.reflect.KProperty

//局部变量委托
class LocalDelegate {
    private var _backValue = "默认值"
    operator fun getValue(thisRef:Nothing?, property: KProperty<*>): String {
        println("${thisRef} 's ${property.name} execute getter method")
        return _backValue
    }

    operator fun setValue(thisRef:Nothing?, property: KProperty<*>, newValue: String) {
        println("${thisRef} 's ${property.name} execute setter method, in param value is $newValue")
        _backValue = newValue
    }
}

fun main(args: Array<String>) {
    var name: String by LocalDelegate()
    println(name)
    name = "心的值"
    println(name)
}