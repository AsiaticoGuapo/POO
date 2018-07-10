package main.utils
class Car(
        private val model: Int,
        private val color: String,
        var isTurnedOn: Boolean = false,
        private val numberOfDoors: Int = 2
) {
    fun turnOn() {
        isTurnedOn = true
    }

    fun turnOff() {
        isTurnedOn = false
    }

    override fun toString(): String {
        return """
            Car:
                Model: $model
                Color: $color
                Doors: $numberOfDoors
                Is turned On: $isTurnedOn
        """.trimIndent()
    }
}

