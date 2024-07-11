package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages > 99) {
        println("Your phone is blowing up! You have 99+ notifications.")
    } else {
        println("You have $numberOfMessages notifications.")
    }

}

