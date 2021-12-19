//component方法与解构
//一个对象的N个属性，解构给N个变量
//语法：var (name,age)=user
//类型根据对象的属性类型推断

class Hero(name: String, weapon: String, age: Int) {
    var name = name
    var weapon = weapon
    var age = age

    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): String {
        return this.weapon
    }

    //定义operator修饰的componentN方法，用于解构
    operator fun component3(): Int {
        return this.age
    }
}

fun main(args: Array<String>) {
    var hero = Hero("赵一伤", "弓箭", 40)
    var (name, weapon: String) = hero
    println(name)
    println(weapon)

    var (name2, weapon2, age) = hero
    println(name2)
    println(weapon2)
    println(age)

    // 下划线只是起一个占位的作用
    var (name3, _, age2) = hero
    println(name3)
    println(age2)
}
/*
for((key, value) in map){
    // 是这个原理
}
*/