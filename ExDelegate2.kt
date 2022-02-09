import kotlin.reflect.KProperty

class PropertyDelegation {
    var name: String by MyDelegation()
}

class MyDelegation {

    private var _backValue = "default value"

    operator fun getValue(thisRef: PropertyDelegation, property: KProperty<*>): String {
        println("${thisRef}'s ${property.name} property execute getter method")
        return _backValue
    }

    operator fun setValue(thisRef: PropertyDelegation, property: KProperty<*>, newValue: String) {
        println("${thisRef}'s ${property.name} property execute setter method, param value is:${newValue}")
        _backValue = newValue
    }

}

fun main(args: Array<String>) {
    val pd = PropertyDelegation()
    println(pd.name)
    pd.name = "CrazyKing"
    println(pd.name)
}