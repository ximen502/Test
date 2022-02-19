import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// 委托工厂
// >operator fun provideDelegate(thisRef: Any?, prop: KProperty<*>)
// 如果方法返回ReadOnlyProperty，则可作为只读属性的委托对象；
// 如果方法返回ReadWriteProperty，则可作为读写属性的委托对象。
class MyTarget {
    var name: String by PropertyChecker()
}

class PropertyChecker() {
    operator fun provideDelegate(
        thisRef: MyTarget,
        prop: KProperty<*>
    ): ReadWriteProperty<MyTarget, String> {
        checkProperty(thisRef = thisRef, prop.name)
        return MyDelegation3()
    }

    private fun checkProperty(thisRef: MyTarget, name: String) {
        println("---------检查属性-------")
    }
}

class MyDelegation3 : ReadWriteProperty<MyTarget, String> {

    private var _backValue = "默认的值default value"

    override operator fun getValue(thisRef: MyTarget, property: KProperty<*>): String {
        println("${thisRef}'s ${property.name} property execute getter method")
        return _backValue
    }

    override operator fun setValue(thisRef: MyTarget, property: KProperty<*>, value: String) {
        println("${thisRef}'s ${property.name} property execute setter method, param value is:${value}")
        _backValue = value
    }

}

fun main(args: Array<String>) {
    val mt = MyTarget()
    println(mt.name)
    mt.name = "Crazy coder"
    println(mt.name)
}