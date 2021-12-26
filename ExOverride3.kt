open class Item2 {
    protected open var price: Double = 10.9
    open val name: String = ""
    open var validDays: Int = 0
}

class Book : Item2 {
    public override var price: Double
    override var name = "图书"
    override var validDays: Int = 2

    constructor() {
        price = 3.0
    }
}