// 抽象父类可以只定义某些需要使用的方法，把不能实现的部分抽象成方法留给子类去实现
// 父类中的具体方法调用子类实现的抽象方法进行相关功能的实现，

// 抽象类作为多个子类的通用模板，子类在抽象类的基础上进行扩展、改造，但子类总体上大致保留抽象类的行为方式
// 是一种模板模式，避免了子类实现的随意性
class CarSpeedMeter(turnRate: Double, var radius: Double) : SpeedMeter(turnRate) {
    override fun getGirth(): Double {
        return 2 * Math.PI * radius
    }
}

fun main(args: Array<String>) {
    var s1: SpeedMeter = CarSpeedMeter(10.5, 0.5)
    println(s1.calSpeed())
}