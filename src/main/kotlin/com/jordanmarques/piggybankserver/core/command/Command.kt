package com.jordanmarques.piggybankserver.core.command

sealed class Command(val type: String) {
    data class Debit(val number: Double): Command("DEBIT")
    data class Credit(val number: Double): Command("CREDIT")
}
