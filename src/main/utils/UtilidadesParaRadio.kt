package main.utils

class Radio (
        private val Brand: String,
        private val color: String,
        private val volume: 0,
        var isTurnedOn: Boolean = false,
) {

    fun turnOn() {
        isTurnedOn = true
    }

    fun turnOff() {
        isTurnedOn = false
    }

    override fun toString(): String {
        return """
            Radio:
                Color: $color
                Is turned On: $isTurnedOn
                Brand: $Brand
                volume: $volume
        """.trimIndent()
    }
}



