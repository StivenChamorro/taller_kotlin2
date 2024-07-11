package org.example

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Imprimir el nombre y la edad
        println("Name: $name")
        println("Age: $age")

        // Imprimir el hobby
        if (hobby != null) {
            print("Likes to $hobby. ")
        } else {
          println("no hobbies")
        }

        // Imprimir los detalles del referrer
        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }
    }
}