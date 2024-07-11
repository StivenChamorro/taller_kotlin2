package org.example

fun main() {
    // convertir 27.0 grados Celsius a Fahrenheit
    printFinalTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = { celsius -> (9.0 / 5.0) * celsius + 32 }
    )

    // convertir 350.0 grados Kelvin a Celsius
    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = { kelvin -> kelvin - 273.15 }
    )

    // convertir 10.0 grados Fahrenheit a Kelvin
    printFinalTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = { fahrenheit -> (5.0 / 9.0) * (fahrenheit - 32) + 273.15 }
    )
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
      println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
