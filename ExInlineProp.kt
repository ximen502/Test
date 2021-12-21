// 属性也可用inline修饰，相当于修饰了属性的set,get方法，
// 也可以仅仅修饰set或get方法。
class product{
    val proName:String
        inline get()="九阳真经"
    inline var author:String
}
