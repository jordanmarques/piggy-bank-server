package com.jordanmarques.piggybankserver.core.evolution

import com.jordanmarques.piggybankserver.core.event.Event
import com.jordanmarques.piggybankserver.core.state.State

fun evolve(state: State, event: Event): State =
    when(event) {
        is Event.Credit -> evolveStateOnCreditEvent(state, event)
        is Event.Debit -> evolveStateOnDebitEvent(state, event)
    }


fun evolveStateOnDebitEvent(state: State, debitEvent: Event.Debit): State =
        State(balance = state.balance - debitEvent.number)


fun evolveStateOnCreditEvent(state: State, creditEvent: Event.Credit): State =
        State(balance = state.balance + creditEvent.number)
