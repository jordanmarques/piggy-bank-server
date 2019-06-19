package com.jordanmarques.piggybankserver.core.decision

import com.jordanmarques.piggybankserver.core.event.Event
import com.jordanmarques.piggybankserver.core.event.Event.Debit
import com.jordanmarques.piggybankserver.core.event.Tag.*
import com.jordanmarques.piggybankserver.core.command.Command

fun decide(command: Command): Event =
    when(command) {
        is Command.Debit -> emitDebitEvent(command.number)
        is Command.Credit -> emitCreditEvent(command.number)
    }

fun emitDebitEvent(number: Double) = Debit(number, BUISNESS)
fun emitCreditEvent(number: Double) = Event.Credit(number, BUISNESS)

