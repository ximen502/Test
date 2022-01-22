abstract class SpeedMeter(var turnRate: Double) {
    abstract fun getGirth(): Double

    fun calSpeed(): Double {
        return getGirth() * turnRate
    }
}