package com.jordanmarques.piggybankserver.core.event

sealed class Event(type: String, tag: Tag) {
    data class Debit(val number: Double, val tag: Tag): Event("DEBIT", tag)
    data class Credit(val number: Double, val tag: Tag): Event("CREDIT", tag)
}
