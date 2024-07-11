package org.example
open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = true) : Phone(isScreenLightOn) {
    // Sobrescribir el método switchOn
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        } else {
            println("Can't switch on the screen while the phone is folded.")
        }
    }

    // Método para plegar el teléfono
    fun fold() {
        isFolded = true
        isScreenLightOn = false // Apagar la pantalla al plegar el teléfono
    }

    // Método para desplegar el teléfono
    fun unfold() {
        isFolded = false
    }
}

fun main() {
    val myPhone = FoldablePhone()

    myPhone.checkPhoneScreenLight() // The phone screen's light is off.
    myPhone.switchOn() // Can't switch on the screen while the phone is folded.
    myPhone.unfold()
    myPhone.switchOn() // Enciende la pantalla
    myPhone.checkPhoneScreenLight() // The phone screen's light is on.
    myPhone.fold()
    //myPhone.checkPhoneScreenLig
}
